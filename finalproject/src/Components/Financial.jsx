const Financial = ({
    Fincitizen
}) => {
    const { transactionType, accountNumber, bank, cardNumber, sortCode, timeStamp, streetName, postcode, latitude, longitude, amount, payeeAccount, vendor, type } = Fincitizen;

    return (
        <>
            <p>Transaction Type: {transactionType}</p>
            <p>Date of Birth: {bank}</p>
            <p> Amount: {amount}</p>
            <p> Card Number: {cardNumber}</p>
            <p> Account Number: {accountNumber}</p>
            <p> Sort Code: {sortCode}</p>
            <p> Timestamp: {timeStamp}</p>
            <p> Vendor: {vendor}</p>
            <p> Street Name: {streetName}</p>
            <p> Postcode: {postcode}</p>
            <p> Latitude: {latitude}</p>
            <p> Longitude: {longitude}</p>
            <p> Payee Account: {payeeAccount}</p>
            <p> Type: {type}</p>

        </>
    );
}
export default Financial;