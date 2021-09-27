import Output from "./Output";
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';

const Citizen = ({
    forenames, surname, dateOfBirth
}) => {


    return (
        <>
            <h3>{forenames} {surname}</h3>
            <p>Date of Birth: {dateOfBirth}</p>
            <form action="/Output">
                <Button type="onClick">Info</Button>
            </form>
            <br />
            <br />
        </>
    );
}
export default Citizen;