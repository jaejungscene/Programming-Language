import * as echarts from 'echarts';
import { useEffect, useRef, useState } from 'react';
import InfiniteScroll from 'react-infinite-scroll-component';

const ChartTest01 = () => {
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
            data: ['B zone', 'A zone'],
            nameTextStyle: {
                color: '#000',
                fontSize: 30,
                fontWeight: 'bold'
            }
        }],
        series: [
            {
                name: '차압',
                type: 'bar',
                stack: 'total',
                label: {
                show: true
                },
                emphasis: {
                focus: 'series'
                },
                data: [0, 3]
            },
            {
                name: '헤파필터',
                type: 'bar',
                stack: 'total',
                label: {
                show: true
                },
                emphasis: {
                focus: 'series'
                },
                data: [8, 0]
            },
            {
                name: '모터',
                type: 'bar',
                stack: 'total',
                label: {
                show: true
                },
                emphasis: {
                focus: 'series'
                },
                data: [1, 2]
            }
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
export default ChartTest01;
