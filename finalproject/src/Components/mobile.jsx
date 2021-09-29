const Mobile= ({
    Mobcitizen
}) => {
    const { phoneNumber, network, timestamp, receiverMSISDN, longitude, latitude } = Mobcitizen;

return(
    <>
     <p>Phone Number: {phoneNumber}</p>
     <p>Network: {network}</p>
     <p>Timestamp: {timestamp}</p>
     <p>Receiver MSISDN: {receiverMSISDN}</p>
     <p>Longitude: {longitude}</p>
     <p>Latitude: {latitude}</p>
    </>
);
}
export default Mobile;