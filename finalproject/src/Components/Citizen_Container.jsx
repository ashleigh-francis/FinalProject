import axios from 'axios';
import { useEffect, useState } from 'react';
import Citizen from './Citizen';


const CitizenContainer = ({data}) => {

  return (
    <>
      <h2><b>Search Results</b></h2>
      <br/>
      <br/>
      { data.map(({
        forenames, surname, dateOfBirth
      }) => <Citizen key={`${forenames}${surname} : ${dateOfBirth}`} forenames={forenames} surname={surname} dateOfBirth={dateOfBirth}/>) }
    </>
  );
};


export default CitizenContainer;