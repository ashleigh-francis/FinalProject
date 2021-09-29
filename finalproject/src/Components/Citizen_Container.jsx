import axios from 'axios';
import { useEffect, useState } from 'react';
import Citizen from './Citizen';
import { useHistory } from "react-router";
import Button from '@restart/ui/esm/Button';

const CitizenContainer = ({data ,setCurrentCitizen}) => {
  const history = useHistory();

  const changePage = (e) => {
    e.preventDefault();
    history.push('/Search');
  }
  return (
    <>
      <h2><b>Search Results</b></h2>
      <br/>
      <form onSubmit={changePage}>
        <Button variant="danger" type="onClick">Back To Search</Button>
      </form>
      <br/>
      { data.map((citizen ) => <Citizen key={`${citizen.forenames} :${citizen.surname}`} citizen = {citizen} setCurrentCitizen={setCurrentCitizen}/>) }
    </>
  );
};


export default CitizenContainer;