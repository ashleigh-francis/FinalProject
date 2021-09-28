import { useState, useEffect } from "react";
import axios from "axios";
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';

const Search = () => {


    const [forenames, setForenames] = useState('');
    const [surname, setSurname] = useState('');
    const [dateOfBirth, setdateOfBirth] = useState('');
    const [data, setData] = useState("");
    const [error, setError] = useState('');

    const MakeRequest = (e) => {
        e.preventDefault();

        console.log("hello");
        axios
            .get('https://raw.githubusercontent.com/ashleigh-francis/Mock-Data/main/exampledata.json')
            .then(({ data }) => setData(data))
            .catch((err) => setError(err.message));
        //  useEffect(() => {
        //         axios
        //           .get('https://raw.githubusercontent.com/ashleigh-francis/Mock-Data/main/exampledata.json')
        //           .then(({ data }) => setData(data))
        //           .catch((err) => setError(err.message));
        //       }, []); 
        console.log(data);
        console.log(error);
    }
    const Overview = ({ forenames, surname, dateOfBirth }) => {
        return (
            <>
                <h2>{forenames}{surname}</h2>
                <p>Date of Birth: {dateOfBirth}</p>
            </>
        );

    }
    return (
        <>
            <form action="/CitizenCon">
                {/* onSubmit={MakeRequest} */}
                <h1>Please Enter the Search Fields</h1>
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
                <input name="dateOfBirth"
                    type="text"
                    placeholder="Enter date of birth"
                    value={dateOfBirth}
                    onInput={e => setdateOfBirth(e.target.value)}
                />
                <br />
                <br />
                <Button type="submit">Search</Button>
            </form>
        </>
    );
}
export default Search;