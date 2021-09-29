import Vehicle from "./Vehicle";


const VehContainer = ({vehicles}) => {

  return (
    <>
      <h2><b>Vehicles Info Results</b></h2>
      <br/>
      <br/>
      {vehicles.map((Vehcitizen ) => <Vehicle key={`${Vehcitizen.id}:${Vehcitizen.vehicleRegistrationNo} `} Vehcitizen = {Vehcitizen}/>) }
    </>
  );
};

export default VehContainer;