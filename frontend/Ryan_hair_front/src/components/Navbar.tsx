import { Link } from "react-router-dom";
import './Navbar.css'

export default function Navbar() {

      return (
        <>
            <div className="navbar flex">
                <Link to={'/'}><img  className="navbar-logo" src="src/assets/images/logo.png" alt="logo Ryan Hair" />
                </Link>
                <div className="navbar-background">
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

                    <div className="admin">
                        <Link to="/admin" ><img src="src/assets/images/admin.png" alt="icone admin" /></Link>
                    </div>
                </div>
            </div>
        </>
    );
}