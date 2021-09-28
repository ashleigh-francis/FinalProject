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
import React from 'react-bootstrap';
import CardGroup from 'react-bootstrap/CardGroup';


const Output = () => {

    const maxLength = 10
    const financialText = "This is an example of the Financial Records"
    const phoneText = "This is an example of the Phone Records"
    const vehicleText = "This is an example of the Vehicle Records"
    const forenames = "Joe"
    const surname = "Bloggs"
    const homeAddress = "1 Street Lane"
    const dateOfBirth = "01/01/1990"
    const placeOfBirth = "Manchester"
    const sex = "Male"

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
            <h1>You have selected [Citizen]</h1>

            <Card className="text-center" style={{width:'18rem'}}>
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
                <Card.Footer className="text-muted"></Card.Footer>
            </Card>
            <br />

            <Container>
                <CardGroup>
                    <Card border="dark">
                        <Card.Header><b>Financial Records</b></Card.Header>
                        <Card.Body>
                            <Card.Title></Card.Title>
                            <Card.Text>
                                <Text_Hider text={financialText} maxLength={maxLength} />
                            </Card.Text>
                        </Card.Body>
                    </Card>
                    <br />
                   

                    <Card border="dark">
                        <Card.Header><b>Phone Records</b></Card.Header>
                        <Card.Body>
                            <Card.Title></Card.Title>
                            <Card.Text>
                                <Text_Hider text={phoneText} maxLength={maxLength} />
                            </Card.Text>
                        </Card.Body>
                    </Card>
                    <br />

                    <Card border="dark">
                        <Card.Header><b>Vehicle Records</b></Card.Header>
                        <Card.Body>
                            <Card.Title></Card.Title>
                            <Card.Text>
                                <Text_Hider text={vehicleText} maxLength={maxLength} />
                            </Card.Text>
                        </Card.Body>
                    </Card>
                </CardGroup>
            </Container>
            <br />
        </>
    )
}

export default Output;