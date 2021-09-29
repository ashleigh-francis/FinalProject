
import Mobile from './mobile';
import { useHistory } from "react-router";
import Button from '@restart/ui/esm/Button';

const MobContainer = ({ calls }) => {
  const history = useHistory();

  const changePage = (e) => {
    e.preventDefault();
    history.push('/Output');
  }
  return (
    <>
      <h2><b>Phone Record Results</b></h2>
      <br />
      <form onSubmit={changePage}>
        <Button variant="danger" type="onClick">Back</Button>
      </form>
      <br />
      {calls.map((Mobcitizen) => <Mobile key={`${Mobcitizen.network}:${Mobcitizen.longitude} `} Mobcitizen={Mobcitizen} />)}
    </>
  );
};


export default MobContainer;