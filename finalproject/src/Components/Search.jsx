import { useState, useEffect } from "react";
import axios from "axios";

const Search = () => {

    
    const [forenames, setForenames] = useState('');
    const [surname, setSurname] = useState('');
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