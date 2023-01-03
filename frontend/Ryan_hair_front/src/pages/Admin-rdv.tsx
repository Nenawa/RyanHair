import axios from "axios";
import {MouseEventHandler, useEffect, useState} from "react";

function AdminRdv(){
    const [resp, setRes] = useState([]);
    function deleteAppmt(e: any): void{
        console.log(e.target.attributes['datakey'].value)
        let rowid:number = e.target.attributes['datakey'].value;
        axios.delete(`http://localhost:8080/api/appointments/${rowid}`)
            .then(function (response) {
                console.log(response);
            })
            .catch(function (error) {
                console.log(error);
            });

    }
    function getData() {
        axios
            .get(
                `http://localhost:8080/api/appointments`
            )
            .then((res) => {
                setRes(res.data);
                console.log(res.data);
            });

    }
    useEffect(() => {
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
                <th>Suprimmer</th>
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
                        <td><button datakey={d.id} onClick={deleteAppmt}>Supprimer</button></td>
                    </tr>
                ))
            }
            </tbody>
        </table>

        <button >Ajouter un rendez-vous</button>

    )
}
export default AdminRdv;