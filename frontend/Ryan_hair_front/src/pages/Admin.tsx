import {Link} from "react-router-dom";
function Admin(){
    return(
        <ul>
            <li><Link to="/admin/rdv">Gestion des rendez-vous</Link> </li>
            <li><Link to="/admin/absences">Gestion des Absences</Link> </li>
        </ul>

    )
}

export default Admin