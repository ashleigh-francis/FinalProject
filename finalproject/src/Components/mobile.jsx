import Card from 'react-bootstrap/Card';

const Mobile = ({
    Mobcitizen
}) => {
    const { phoneNumber, network, timestamp, receiverMSISDN, longitude, latitude } = Mobcitizen;

    return (
        <>
            <Card Text="dark">
                <Card.Header><b>Phone Records</b></Card.Header>
                <Card.Body>
                    <Card.Text>Phone Number: {phoneNumber} </Card.Text>
                    <Card.Text>Network: {network} </Card.Text>
                    <Card.Text>Timestamp: {timestamp} </Card.Text>
                    <Card.Text>Receiver MSISDN: {receiverMSISDN} </Card.Text>
                    <Card.Text>Longitude: {longitude} </Card.Text>
                    <Card.Text>Latitude: {latitude} </Card.Text>
                </Card.Body>
            </Card>
        </>
    );
}
export default Mobile;