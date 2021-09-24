import Text_Hider from "./Text_Hider";

const Output = () => {

    const maxLength=10
    const financialText = "This is an example of the Financial Records"
    const phoneText = "This is an example of the Phone Records"
    const vehicleText = "This is an example of the Vehicle Records"
    const forenames = "Joe"
    const surname = "Bloggs"
    const homeAddress = "1 Street Lane"
    const dateOfBirth = "01/01/1990"
    const placeOfBirth = "Manchester"
    const sex = "Male"
    const passport = "5455752157"



    return (
        <>
            <h1>You have selected [Citizen]</h1>

            <h2>Biographical Information</h2>
                <h3>Name: {forenames} {surname}</h3>
                <p>Home Address: {homeAddress}</p>
                <p>Date of Birth: {dateOfBirth}</p>
                <p>Place of Birth: {placeOfBirth}</p>
                <p>Sex: {sex}</p>
                <p>Passport: {passport}</p>


            <h2>Financial Records</h2>
            <Text_Hider text={financialText} maxLength={maxLength} />

            <h2>Phone Records</h2>
            <Text_Hider text={phoneText} maxLength={maxLength} />

            <h2>Vehicle Records</h2>
            <Text_Hider text={vehicleText} maxLength={maxLength} />
        </>
    )
}

export default Output;