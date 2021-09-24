import {useState} from 'react';

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
            <label> Username:</label>
                <input name="username"
                type="text"
                value={username}
                onInput={e => setUsername(e.target.value)}/>

            <label> Password: </label>
                <input type="password"
                name="password"
                value={password}
                onInput={e => setPassword(e.target.value)}/>
            <br/>
            <button type = "submit">Submit</button>
            </form>
        </>
    );
}

export default Login;