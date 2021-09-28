import Text_Hider from "./Text_Hider";
import { useState, useEffect } from "react";
import axios from "axios";
import Financial from "./Financial";
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';
import Card from 'react-bootstrap/Card';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import React, { Table } from 'react-bootstrap';
import CardGroup from 'react-bootstrap/CardGroup';


const Output = () => {

    const maxLength = 25
    const financialText = "Click to view information."
    const phoneText = "Click to view information."
    const vehicleText = "Click to view information."
    const forenames = "Joe"
    const surname = "Bloggs"
    const homeAddress = "1 Street Lane"
    const dateOfBirth = "01/01/1990"
    const placeOfBirth = "Manchester"
    const sex = "Male"
    const citizenName = "Joe Bloggs"

    const [Financials, setFinancials] = useState([]);
    const [error, setError] = useState('');

    useEffect(() => {
        axios
            .get('https://raw.githubusercontent.com/ashleigh-francis/Mock-Data/main/exampledata.json')
            .then(({ data }) => setFinancials(data))
            .catch((err) => setError(err.message));
    }, []);

    const financialsRec = (e) => {
        return (
            <>
                {Financials.map(({
                    forenames, surname, dateOfBirth
                }) => <Financial key={`${forenames}${surname} : ${dateOfBirth}`} forenames={forenames} surname={surname} dateOfBirth={dateOfBirth} />)}
            </>
        );
    }
    return (
        <>
            <Table >
                <thead>
                    <tr>
                        <th colSpan="3"><h1><b>Currently showing information for {citizenName} </b></h1> <Card text="dark">
                            <Card.Header><h4>Biographical Information</h4></Card.Header>
                            <Card.Body>
                                <Card.Title></Card.Title>
                                <Card.Text>
                                    <h5><b>Name: {forenames} {surname}</b></h5>
                                    <h5>Home Address: {homeAddress}</h5>
                                    <h5>Date of Birth: {dateOfBirth}</h5>
                                    <h5>Place of Birth: {placeOfBirth}</h5>
                                    <h5>Sex: {sex}</h5>
                                </Card.Text>
                            </Card.Body>
                        </Card> </th>

                    </tr>
                </thead>
                <tbody>


                    <tr>
                        <td>
                            <Card text="dark">
                                <Card.Header><b>Financial Records</b></Card.Header>
                                <Card.Body>
                                    <Card.Text>
                                        <Text_Hider text={financialText} maxLength={maxLength} />
                                    </Card.Text>
                                </Card.Body>
                            </Card>
                        </td>
                        <td>
                            <Card text="dark">
                                <Card.Header><b>Phone Records</b></Card.Header>
                                <Card.Body>
                                    <Card.Text>
                                        <Text_Hider text={phoneText} maxLength={maxLength} />
                                    </Card.Text>
                                </Card.Body>
                            </Card>
                        </td>
                        <td>
                            <Card text="dark">
                                <Card.Header><b>Vehicle Records</b></Card.Header>
                                <Card.Body>
                                    <Card.Text>
                                        <Text_Hider text={vehicleText} maxLength={maxLength} />
                                    </Card.Text>
                                </Card.Body>
                            </Card>
                        </td>
                    </tr>
                </tbody>
            </Table>
        </>
    )
}

export default Output;