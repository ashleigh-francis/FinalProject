import './App.css';
import Login from './Components/Login';
import Search from './Components/Search';
import Output from './Components/Output';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Link, Route } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      <Router>
        <Route exact path="/">
          <Login />
        </Route>
        <Route path="/Search">
          <Search />
        </Route>
        <Route path="/Output">
          <Output />
        </Route>
      </Router>
    </div>
  );
}

export default App;
