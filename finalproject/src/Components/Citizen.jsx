import Output from "./Output";

const Citizen = ({
    forenames, surname, dateOfBirth
}) => {


return(
    <>
        <h3>{forenames} {surname}</h3>
        <p>Date of Birth: {dateOfBirth}</p>
        <form action="/Output">
            <button >Info</button>
        </form>
    </>
);
}
export default Citizen;