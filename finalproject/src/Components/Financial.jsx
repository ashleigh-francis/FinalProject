const Financial= ({
    forenames, surname, dateOfBirth
}) => {


return(
    <>
        <h3>{forenames} {surname}</h3>
        <p>Date of Birth: {dateOfBirth}</p>
    </>
);
}
export default Financial;