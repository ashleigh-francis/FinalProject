import { useState } from "react";
import axios from "axios";

const Search = () => {

    const [forenames, setForenames] = useState('');
    const [surname, setSurname] = useState('');
    const [data, setData] = useState("");

    const makeRequest = (e) => {
        axios.get('https://raw.githubusercontent.com/ashleigh-francis/Mock-Data/main/exampledata.json')
            .then(response => {
                console.log(response.json);
                setData(response.data);
            });
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
            <form action= {makeRequest} >

                <h1>Please enter the search fields</h1>
                <br />
                <br />


                <label> Forenames: </label>
                <input name="forenames"
                    type="text"
                    value={forenames}
                    onInput={e => setForenames(e.target.value)}
                />

                <label> Surname: </label>
                <input type="surname"
                    name="surname"
                    value={surname}
                    onInput={e => setSurname(e.target.value)}
                />
                <br />
                <br />
                <button>Search</button>
            </form>
        </>
    );
}  
export default Search;