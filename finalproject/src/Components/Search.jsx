import { useState } from "react";
import axios from "axios";
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';
import { useHistory } from "react-router";

const Search = ({setData}) => {


    const [forenames, setForenames] = useState('');
    const [surname, setSurname] = useState('');
    const [dateOfBirth, setdateOfBirth] = useState('');
    const [error, setError] = useState('');
    const history = useHistory();
    
    const MakeRequest = (e) => {
        e.preventDefault();
        
        console.log("hello");
        axios
            .post('http://localhost:5000/getCitizenInfo',{forenames,surname,dateOfBirth})
            .then(({ data }) => {
                setData(data);
                history.push('/CitizenCon');
            })
            .catch((err) => setError(err.message));

    }
    return (
        <>
            <form onSubmit={MakeRequest}>
                <h1><b>Please Enter the Search Fields</b></h1>
                <br />
                <br />


                <label> Forenames: </label>
                <br />
                <input name="forenames"
                    type="text"
                    placeholder="Enter forenames"
                    value={forenames}
                    onInput={e => setForenames(e.target.value)}
                />
                <br />
                <br />
                <label> Surname: </label>
                <br/>
                <input type="surname"
                    placeholder="Enter surname"
                    name="surname"
                    value={surname}
                    onInput={e => setSurname(e.target.value)}
                />
                <br />
                <br />
                <label> Date of Birth: </label>
                <br />
                <input  name="dateOfBirth"
                    type="text"
                    placeholder="Enter date of birth"
                    value={dateOfBirth}
                    onInput={e => setdateOfBirth(e.target.value)}
                />
                <br />
                <br />
                <Button variant="danger" type="submit" >Search</Button>
            </form>
        </>
    );
}
export default Search;