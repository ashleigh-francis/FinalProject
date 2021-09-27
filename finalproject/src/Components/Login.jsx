import {useState} from 'react';
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';

const Login = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const printValues = e => {
        e.preventDefault();
        console.log(username,password);
    };

    return (
        <>
            <form action = "/Search">

                <h1>Welcome to the Citizen search database</h1>
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
                {/* <input type="password"
                name="password" */}
                <input type="password" 
                // className="form-control" 
                placeholder="Enter password"
                value={password}
                onInput={e => setPassword(e.target.value)}/>
            <br/>
            <br/>
            <Button type = "submit">Submit</Button>
            </form>
        </>
        
    );
}

export default Login;