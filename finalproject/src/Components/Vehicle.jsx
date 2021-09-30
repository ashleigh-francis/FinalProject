
import Card from 'react-bootstrap/Card';

const Vehicle = ({
    Vehcitizen
}) => {
 
    const { driverLicenceID, vehicleRegistrationNo, make, model, colour, anprPointId, timestamp, streetName, latitude, longitude } = Vehcitizen;
    
    return (
        <>
       
        <Card Text="dark">
                <Card.Header><b>Vehicle Records</b></Card.Header>
                <Card.Body>
            <Card.Text> Driver Licence: {driverLicenceID}</Card.Text>
            <Card.Text> Vehicle Registration: {vehicleRegistrationNo}</Card.Text>
            <Card.Text> Make: {make}</Card.Text>
            <Card.Text> Model: {model}</Card.Text>
            <Card.Text> Colour: {colour}</Card.Text>
            <Card.Text> ANPR Point: {anprPointId}</Card.Text>
            <Card.Text> Timestamp: {timestamp}</Card.Text>
            <Card.Text> Street Name: {streetName}</Card.Text>
            <Card.Text> Latitude: {latitude}</Card.Text>
            <Card.Text> Longitude: {longitude}</Card.Text>
            
            </Card.Body>
            </Card>
        </>
    );
}
export default Vehicle;