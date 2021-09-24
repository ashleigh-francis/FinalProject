
const Citizen = ({
    forenames, surname, dateOfBirth
}) => (
    <>
        <h3>{forenames} {surname}</h3>
        <p>Date of Birth: {dateOfBirth}</p>

    </>
);

export default Citizen;