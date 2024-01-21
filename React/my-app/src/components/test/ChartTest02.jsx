import * as echarts from 'echarts';
import { useEffect, useRef, useState } from 'react';
import InfiniteScroll from 'react-infinite-scroll-component';

const ChartTest02 = () => {
    const chartRef = useRef(null);
    const [options, setOptions] = useState({
        textStyle: {
            fontSize: 20,
            fontWeight: 'bold'
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                // Use axis to trigger tooltip
                type: 'shadow' // 'shadow' as default; can also be 'line' or 'shadow'
            }
        },
        legend: {},
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: {
            type: 'value'
        },
        yAxis: [{
            type: 'category',
            data: ['모터', '헤파필터', '차압'],
            nameTextStyle: {
                color: '#000',
                fontSize: 30,
                fontWeight: 'bold'
            }
        }],
        series: [
            {
                name: 'A zone',
                type: 'bar',
                stack: 'total',
                label: {
                show: true
                },
                emphasis: {
                focus: 'series'
                },
                data: [3, 0, 2],
                itemStyle:{
                    color: '#00001',
                }
            },
            {
                name: 'B zone',
                type: 'bar',
                stack: 'total',
                label: {
                show: true
                },
                emphasis: {
                focus: 'series'
                },
                data: [0, 8, 1],
                itemStyle:{
                    color: '#626A0E',
                }
            },
        ]
    });
      
    useEffect(() => {
        if (chartRef.current) {
            const chart = echarts.init(chartRef.current);
            chart.setOption(options);
        }
    }, [options, chartRef]);

    return (
        <>
            <div
                ref={chartRef}
                style={{
                    width: "100%",
                    height: "300%",
                    marginTop: "100px"
                }}
            />
        </>
        
    )
    // option && myChart.setOption(option);   
}
export default ChartTest02;
