import { Col, Container, Row } from 'react-bootstrap';
import DetailedAlarmList from './DetailedAlarmList';
import DryerStatusBoard from './DryerStatusBoard';
import StatisticsComponents from './StatisticsComponents';
import './index.css';

const DashboardPage = () => {

    return (
        // <div style={{
        //     display: 'flex',
        //     flexDirection: 'row',
        //     alignItems: 'center',
        //     justifyContent: 'center',
        //     width:'100%',
        //     height:'100%'
        // }}>
        <div style={{
            width:'100%',
            height:'100%'
        }}>
            <StatisticsComponents props={{name:'부품별 알람'}}/>
            <StatisticsComponents props={{name:'모델별 알람'}}/>
            <DryerStatusBoard/>
            <DetailedAlarmList/>
        </div>
    )
}
export default DashboardPage;