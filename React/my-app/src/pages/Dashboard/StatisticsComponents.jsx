import React from "react";

const StatisticsComponents = ({props}) => {
    let componentName = props.name;
    return (
        <div style={{
            margin:'5px',
            backgroundColor: 'orange'
        }}>
            {componentName}
            <div
            style={{
                display: 'flex',
                flexDirection: 'row',
                alignItems: 'center',
                justifyContent: 'center',
                borderRadius: '4px',
                border: 'solid',
                borderTop: '5px solid #000',
                // width:'100%',
                // height:'100%'
            }}>
                {/* <ReactEcharts>
                </ReactEcharts> */}

                {/* <ReactEcharts>
                    
                </ReactEcharts> */}

                hello world
            </div>
        </div>
    )
}
export default StatisticsComponents;