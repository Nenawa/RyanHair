import { Link } from "react-router-dom";
import './Navbar.css'

export default function Navbar() {
    return (
        <>
            <div className="navbar flex">
                <img className="navbar-logo" src="src/assets/images/logo.png" alt="logo Ryan Hair" />
                <ul className="navbar-list flex ">
                    <li>
                        <Link to="/" >accueil</Link>
                    </li>
                    <li>
                        <Link to="/" >homme</Link>
                    </li>
                    <li>
                        <Link to="/" >femme</Link>
                    </li>
                    <li>
                        <Link to="/rendezvous" >rendez-vous</Link>
                    </li>
                </ul>
                <div>
                
                        <Link to="/admin" >administration</Link>
                  
                </div>
            </div>
        </>
    );
}