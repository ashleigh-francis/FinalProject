import Card from 'react-bootstrap/Card';

const Financial = ({
    Fincitizen
}) => {
    const { transactionType, accountNumber, bank, cardNumber, sortCode, timestamp, streetName, postcode, latitude, longitude, amount, payeeAccount, vendor, type } = Fincitizen;

    return (
        <>
         <Card Text="dark">
                <Card.Header><b>Financial Records</b></Card.Header>
                <Card.Body>
                <Card.Text>Transaction Type: {transactionType} </Card.Text>
                <Card.Text>Date of Birth: {bank} </Card.Text>
             <Card.Text> Amount: {amount} </Card.Text>
             <Card.Text> Card Number: {cardNumber} </Card.Text>
             <Card.Text> Account Number: {accountNumber} </Card.Text>
             <Card.Text> Sort Code: {sortCode} </Card.Text>
             <Card.Text> Timestamp: {timestamp} </Card.Text>
             <Card.Text> Vendor: {vendor} </Card.Text>
             <Card.Text> Street Name: {streetName} </Card.Text>
             <Card.Text> Postcode: {postcode} </Card.Text>
             <Card.Text> Latitude: {latitude} </Card.Text>
             <Card.Text> Longitude: {longitude} </Card.Text>
             <Card.Text> Payee Account: {payeeAccount} </Card.Text>
             <Card.Text> Type: {type} </Card.Text>
            </Card.Body>
            </Card>
        </>
    );
}
export default Financial;