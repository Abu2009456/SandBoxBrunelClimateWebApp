import React,{useState} from 'react';
import './App.css';
import {Container, Row, Col} from "react-bootstrap"
import Navigation from "./components/ClimateNavigation"


import UserList from "./components/ClimateUsers"
import Register from "./components/Register"
import Home from "./pages/Home"


import {AuthContext} from "./context/auth"
import {BrowserRouter as Router, Switch,Route} from "react-router-dom"
import PrivateRoute from "./PrivateRoute"


function App(props) {
const existingTokens = JSON.parse(localStorage.getItem("tokens"));
const [authTokens,setAuthTokens]=useState(existingTokens);
const setTokens = (data) => {
localStorage.setItem("tokens",JSON.stringify(data));
setAuthTokens(data);
}
const marginTop={
marginTop:"20px"
};
  return (
   <AuthContext.Provider value={{authTokens, setAuthTokens:setTokens}}>
    <Router>
        <Navigation />
        <Container>
        <Row>
        <Col lg={12} style={marginTop}>
<Switch>

<Route path="/add" exact component={Register}/>
<Route path="/list" exact component={UserList}/>

<Route exact path="/home" exact component={Home}/>

</Switch>
</Col>
        </Row>
        </Container>
       
</Router>
</AuthContext.Provider>
  );
}
export default App;