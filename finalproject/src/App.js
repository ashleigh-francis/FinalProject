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
import Financial from './Components/Financial';
import FinContainer from './Components/FinController';
import MobContainer from './Components/MobContainer';
import VehContainer from './Components/VehContainer';

function App() {

  const [data, setData] = useState([]);
  const [currentCitizen, setCurrentCitizen] = useState({});
  const [Financials, setFinancials] = useState([]);
  const [calls, setCalls] = useState([]);
  const [vehicles, setVehicles] = useState([]);

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
          <Output currentCitizen={currentCitizen} setFinancials={setFinancials} setCalls={setCalls} setVehicles={setVehicles}  
          />
        </Route>
        <Route path="/CitizenCon">
          <CitizenContainer data={data} setCurrentCitizen={setCurrentCitizen} />
        </Route>
        <Route path="/FinancialRecords">
          <FinContainer Financials={Financials} />
        </Route>
        <Route path="/MobileRecords">
          <MobContainer calls={calls} />
        </Route>
        <Route path="/VehicleRecords">
          <VehContainer vehicles={vehicles} />
        </Route>
      </Router>
    </div>
  );
}

export default App;
