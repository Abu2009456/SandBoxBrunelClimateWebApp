import React from "react"
import {Navbar,Nav} from "react-bootstrap"
import {Link} from "react-router-dom"

class ClimateNavigation extends React.Component{
render(){
return(
<Navbar  bg="yellow" variant="yellow">
<Link to={""} className="navbar-brand">
</Link>
<Nav className="mr-auto">
       <Link to={"add"} className="nav-link"> Sign Up</Link>
       <Link to={"list"} className="nav-link">ClimateApp Users</Link>
     
      
       <Link to={"home"} className="nav-link">Home</Link>
      
    </Nav>
</Navbar>
)
}
}
export default ClimateNavigation