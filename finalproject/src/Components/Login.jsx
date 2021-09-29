import {useState} from 'react';
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';
import axios from "axios";
import { useHistory } from "react-router";

const Login = () => {
    const [username, setUsername] = useState('');
    const [passwrd, setPassword] = useState('');
    const [data, setData] = useState([]);
    const [error, setError] = useState('');
    const history = useHistory();

    const MakeRequest = (e) => {
        e.preventDefault();
        axios
            .post('http://localhost:5000/getUsers',{username,passwrd})
            .then(({ data }) => {
                setData(data);
                if (data.length === 1){
                    history.push('/Search');
                }
                else{
                    history.push('/');  
                }
            })
            .catch((err) => setError(err.message));

    }

    return (
        <>
            <form onSubmit={MakeRequest}>

                <h1><b>Welcome to the Citizen Database</b></h1>
                <br/>
                <br/>
            <label>Username:</label> 
            <br/>
                <input name="username"
                type="text"
                placeholder="Enter username"
                value={username}
                onInput={e => setUsername(e.target.value)}/>

            <br/>
            <br/>
            <label>Password:</label>
            <br/>
                <input 
                type="password" 
                placeholder="Enter password"
                value={passwrd}
                onInput={e => setPassword(e.target.value)}/>
            <br/>
            <br/>
            <Button variant="danger"type = "submit">Login</Button>
            </form>
        </>
        
    );
}

export default Login;