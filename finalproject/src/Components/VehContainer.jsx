import Vehicle from "./Vehicle";
import { useHistory } from "react-router";
import Button from '@restart/ui/esm/Button';

const VehContainer = ({ vehicles }) => {
  const history = useHistory();

  const changePage = (e) => {
    e.preventDefault();
    history.push('/Output');
  }
  return (
    <>
      <h2><b>Vehicles Info Results</b></h2>
      <br />
      <form onSubmit={changePage}>
        <Button variant="danger" type="onClick">Back</Button>
      </form>
      <br />
      {vehicles.map((Vehcitizen) => <Vehicle key={`${Vehcitizen.id}:${Vehcitizen.vehicleRegistrationNo} `} Vehcitizen={Vehcitizen} />)}
    </>
  );
};

export default VehContainer;