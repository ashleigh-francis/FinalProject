const Vehicle = ({
    Vehcitizen
}) => {
    const { driverLicenceID, vehicleRegistrationNo, make, model, colour, anprPointId, timestamp, streetName, latitude, longitude } = Vehcitizen;

    return (
        <>
            <p> Driver Licence: {driverLicenceID}</p>
            <p> Vehicle Registration: {vehicleRegistrationNo}</p>
            <p> Make: {make}</p>
            <p> Model: {model}</p>
            <p> Colour: {colour}</p>
            <p> ANPR Point: {anprPointId}</p>
            <p> Timestamp: {timestamp}</p>
            <p> Street Name: {streetName}</p>
            <p> Latitude: {latitude}</p>
            <p> Longitude: {longitude}</p>
        </>
    );
}
export default Vehicle;