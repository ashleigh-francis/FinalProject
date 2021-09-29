import axios from 'axios';
import { useEffect, useState } from 'react';
import Citizen from './Citizen';


const CitizenContainer = ({data ,setCurrentCitizen}) => {

  return (
    <>
      <h2><b>Search Results</b></h2>
      <br/>
      <br/>
      { data.map((citizen ) => <Citizen key={`${citizen.forenames} :${citizen.surname}`} citizen = {citizen} setCurrentCitizen={setCurrentCitizen}/>) }
    </>
  );
};


export default CitizenContainer;