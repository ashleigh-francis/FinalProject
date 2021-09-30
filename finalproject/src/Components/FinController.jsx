
import Financial from './Financial';
import { useHistory } from "react-router";
import Button from '@restart/ui/esm/Button';

const FinContainer = ({Financials}) => {
    const history = useHistory();
    
    const changePage = (e) => {
        e.preventDefault();
        history.push('/Output');
    }
  return (
    <>
      <h2><b>Financial Results</b></h2>
      <br/>
      <form onSubmit={changePage}>
                <Button variant="danger" type="onClick">Back</Button>
            </form>
      <br/>
      {Financials.map((Fincitizen ) => <Financial key={`${Fincitizen.bank}:${Fincitizen.accountNumber} `} Fincitizen = {Fincitizen}/>) }
    </>
  );
};


export default FinContainer;