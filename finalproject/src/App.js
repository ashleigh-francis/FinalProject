import './App.css';
import Login from './Components/Login';
import Search from './Components/Search';
import  {useState} from 'react';
import Output from './Components/Output';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Link, Route } from 'react-router-dom';
import CitizenContainer from './Components/Citizen_Container';
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {

  const [data, setData] = useState([]);

  return (
    <div className="App">
      <Router>
        <Route exact path="/">
          <Login />
        </Route>
        <Route path="/Search">
          <Search setData={setData}/>
        </Route>
        <Route path="/Output">
          <Output />
        </Route>
        <Route path="/CitizenCon">
          <CitizenContainer data={data}/>
        </Route>
      </Router>
    </div>
  );
}

export default App;
