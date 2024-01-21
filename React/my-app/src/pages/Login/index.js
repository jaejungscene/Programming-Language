import { useState } from "react"
import { useNavigate } from "react-router-dom"
import "./index.css"
import { Button, ConfigProvider } from "antd"
import cipicture from "../../assets/CI.jpg"
import namepicture from "../../assets/hanwha-momentum.jpg"
import { Box, TextField } from "@mui/material"
// import { withStyles } from "@mui/material/styles"

const Login = (props) => {
    const [id, setId] = useState("")
    const [password, setPassword] = useState("")
    const [emailError, setEmailError] = useState("")
    const [passwordError, setPasswordError] = useState("")
    const [num, setNum] = useState(0);
    
    const navigate = useNavigate();
        
    const onButtonClick = () => {
        setNum(num+1);
        // You'll update this function later...
    }
    const handleSubmit = (event) => {
        event.preventDefault();
        const data = new FormData(event.currentTarget);
        console.log({
            id: data.get('id'),
            password: data.get('password'),
        });
        console.log(data.get('id')==='1234');
        console.log(data.get('id')!=='1234');
        if(data.get('id') !== '1234'){
            alert("id or password doesn\'t valid");
        } else {
            navigate('/')
        }
    }

    return(
    <div className="bgContainer">
        <div className={"mainContainer"}>
            <img src={cipicture} style={{width: '80px', margin:'5px'}}/>
            <img src={namepicture} style={{width: '400px', margin:'5px'}}/>
            <div className={"titleContainer"}>
                HIFAC&nbsp;&nbsp;&nbsp;PMS
            </div>
            {/* <form onSubmit={(e)=>{console.log(e);}} > */}

            <Box component="form" onSubmit={handleSubmit} noValidate sx={{ mt: 1 }}>
                <TextField
                className="inputBox"
                margin="normal"
                required
                id="email"
                label="ID"
                name="id"
                autoComplete="id"
                autoFocus
                />
                <TextField
                className="inputBox"
                margin="normal"
                required
                name="password"
                label="Password"
                type="password"
                id="password"
                autoComplete="current-password"
                />

                {/* <br />
                <input
                    type="id"
                    value={id}
                    placeholder="아이디"
                    onChange={ev => setId(ev.target.value)}
                    className={"inputBox"}
                />
                <br />
                <input
                    type="password"
                    value={password}
                    placeholder="비밀번호"
                    onChange={ev => setPassword(ev.target.value)}
                    className={"inputBox"} />
                <br /> */}

                <button type="submit"
                className="inputButton">
                    로그인
                </button>
            </Box>
            {/* </form> */}
            
        </div>
    </div>
    )
}

export default Login