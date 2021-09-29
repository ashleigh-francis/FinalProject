
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';
import { useHistory } from "react-router";

const Citizen = ({
    citizen,setCurrentCitizen
}) => {
    const history = useHistory();
    const {forenames, surname, dateOfBirth} = citizen;
    const changePage = (e) => {
        e.preventDefault();
        setCurrentCitizen(citizen);
        history.push('/Output');
    
        }
    return (
        <>
            <h3>{forenames} {surname}</h3>
            <p>Date of Birth: {dateOfBirth}</p>
            <form onSubmit={changePage}>
                <Button variant="danger" type="onClick">Information</Button>
            </form>
            <br />
            <br />
        </>
    );
}
export default Citizen;