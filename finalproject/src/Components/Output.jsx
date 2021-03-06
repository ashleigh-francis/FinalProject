
import { useState} from "react";
import axios from "axios";
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';
import Card from 'react-bootstrap/Card';
import React from 'react-bootstrap';
import { useHistory } from "react-router";


const Output = ({ currentCitizen: { forenames, surname, dateOfBirth, homeAddress, sex, placeOfBirth }, setFinancials, setCalls, setVehicles }) => {

    const [error, setError] = useState('');
    const history = useHistory();


    const changePage = (e) => {
        e.preventDefault();
        history.push('/Search');
    }

    const financialsRec = (e) => {
        e.preventDefault();
        axios
            .post('http://localhost:5000/getFinancialRecords', { forenames, surname, dateOfBirth })
            .then(({ data }) => {
                setFinancials(data);
                history.push('/FinancialRecords');
            })
            .catch((err) => setError(err.message));
    }
    const mobileRec = (e) => {
        e.preventDefault();
        axios
            .post('http://localhost:5000/getMobileRecords', { forenames, surname, dateOfBirth })
            .then(({ data }) => {
                setCalls(data);
                history.push('/PhoneRecords');
                
            })
            .catch((err) => setError(err.message));
    }
    const vehicleRec = (e) => {
        e.preventDefault();
        axios
            .post('http://localhost:5000/getVehicleInfo', { forenames, surname, dateOfBirth })
            .then(({ data }) => {
                setVehicles(data);
                history.push('/VehicleRecords');
            })
            .catch((err) => setError(err.message));
    }
    return (
        <>
            <Card text="dark">
                <Card.Header>
                    <h4>Biographical Information</h4>
                    <form onSubmit={changePage}>
                        <Button variant="danger" type="onClick">Back To Search</Button>
                    </form>
                </Card.Header>
                <Card.Body>
                    <Card.Text><b>Name: {forenames} {surname}</b> </Card.Text>
                    <Card.Text>Home Address: {homeAddress} </Card.Text>
                    <Card.Text>Date of Birth: {dateOfBirth} </Card.Text>
                    <Card.Text>Place of Birth: {placeOfBirth} </Card.Text>
                    <Card.Text>Sex: {sex} </Card.Text>
                </Card.Body>
            </Card>
            <Card text="dark">
                <Card.Header><b>Financial Records</b></Card.Header>
                <Card.Body>
                    <form onSubmit={financialsRec}>
                        <Button variant="danger" type="onClick" >Financial Records</Button>
                    </form>
                </Card.Body>
            </Card>
            <Card text="dark">
                <Card.Header><b>Phone Records</b></Card.Header>
                <Card.Body>
                    <form onSubmit={mobileRec}>
                        <Button variant="danger" type="onClick" >Phone Records</Button>
                    </form>
                </Card.Body>
            </Card>
            <Card text="dark">
                <Card.Header><b>Vehicle Records</b></Card.Header>
                <Card.Body>

                    <form onSubmit={vehicleRec}>
                        <Button variant="danger" type="onClick" >Vehicle Records</Button>
                    </form>

                </Card.Body>
            </Card>
        </>
    )
}

export default Output;