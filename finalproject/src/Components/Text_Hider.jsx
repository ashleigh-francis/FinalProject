import { useState } from 'react';
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';

const Text_Hider = ({text,maxLength}) => {
    const [hidden, setHidden] = useState(true);

    if(text.length <=maxLength){
        return <span>{text}</span>
    }

    return ( 
        <span>
            {hidden ? `${text.substr(0,maxLength).trim()}...` : text}
            <br/>
            <br/>

            {hidden ? (
                <Button variant="outline-danger" onClick={() => setHidden(false)}> Read More</Button>
            ) : (
                <Button variant="outline-danger" onClick={() => setHidden(true)}> Read Less</Button>
            )}
            <br/>
            <br/>
        </span>
    );
}

export default Text_Hider;