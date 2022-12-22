import axios from "axios";
import {useEffect, useState} from "react";

function AdminRdv(){
    const [resp, setRes] = useState([]);
    function getData() {
        axios
            .get(
                `http://localhost:8080/api/appointments`
            )
            .then((res) => {
                setRes(res.data);
                console.log(res.data);
            });

    }  useEffect(() => {
        getData();
    }, []);

    return(
        <table>
            <thead>
            <tr>
                <th>#</th>
                <th>Nom</th>
                <th>Prenom</th>
                <th>Date</th>
                <th>Coupe</th>
            </tr>
            </thead>
            <tbody>
            {
                resp?.map((d)=>(
                    <tr key={d.id}>
                        <td>{d.id}</td>
                        <td>{d.lastName}</td>
                        <td>{d.firstName}</td>
                        <td>{d.timeSlot.slotStart}</td>
                        <td>{d.haircut.status}</td>
                    </tr>
                ))
            }
            </tbody>
        </table>

    )
}
export default AdminRdv;