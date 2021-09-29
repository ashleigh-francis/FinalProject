import axios from 'axios';
import { useEffect, useState } from 'react';
import Citizen from './Citizen';
import Financial from './Financial';


const FinContainer = ({Financials}) => {

  return (
    <>
      <h2><b>Financial Results</b></h2>
      <br/>
      <br/>
      {Financials.map((Fincitizen ) => <Financial key={`${Fincitizen.bank}:${Fincitizen.accountNumber} `} Fincitizen = {Fincitizen}/>) }
    </>
  );
};


export default FinContainer;