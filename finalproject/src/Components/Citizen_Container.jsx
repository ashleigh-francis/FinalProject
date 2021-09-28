import axios from 'axios';
import { useEffect, useState } from 'react';
import Citizen from './Citizen';


const CitizenContainer = () => {
  const [Citizens, setCitizens] = useState([]);
  const [error, setError] = useState('');

  useEffect(() => {
    axios
      .get('https://raw.githubusercontent.com/ashleigh-francis/Mock-Data/main/exampledata.json')
      .then(({ data }) => setCitizens(data))
      .catch((err) => setError(err.message));
  }, []);
  console.log(Citizens);

  return (
    <>
      <h2><b>Search Results</b></h2>
      <br/>
      <br/>
      {error && (
      <p>
        Error:
        {error}
      </p>
      )}
      { Citizens.map(({
        forenames, surname, dateOfBirth
      }) => <Citizen key={`${forenames}${surname} : ${dateOfBirth}`} forenames={forenames} surname={surname} dateOfBirth={dateOfBirth}/>) }
    </>
  );
};

export default CitizenContainer;