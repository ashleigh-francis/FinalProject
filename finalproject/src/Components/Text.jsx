import LessText from './LessText';

function Text() {
    const maxLength=10
    const text = "Test Test Test "
    return (
    <>
        <h1>Hidden Text!</h1>
        <LessText text={text} maxLength={maxLength}/>
    </>
    );
}

export default Text;