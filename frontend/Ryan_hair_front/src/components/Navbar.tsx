import { Link } from "react-router-dom";

export default function Navbar() {
    return (
        <>
        
            <ul className="navigation">
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
                <li>
                    <Link to="/admin" >administration</Link>
                </li>
            </ul>
        </>
    );
}