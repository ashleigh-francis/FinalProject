
import Mobile from './mobile';


const MobContainer = ({calls}) => {

  return (
    <>
      <h2><b>Mobile Record Results</b></h2>
      <br/>
      <br/>
      {calls.map((Mobcitizen ) => <Mobile key={`${Mobcitizen.network}:${Mobcitizen.longitude} `} Mobcitizen = {Mobcitizen}/>) }
    </>
  );
};


export default MobContainer;