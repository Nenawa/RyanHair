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
            <th>
                <td>#</td>
                <td>Nom</td>
                <td>Prenom</td>
                <td>Date</td>
            </th>
            {
                resp?.map((d)=>(
                    <tr>
                        <td>d.id</td>
                        <td>d.lastName</td>
                        <td>d.firstName</td>
                        <td>d.timeSlot.slotStart</td>
                    </tr>
                ))
            }

        </table>

    )
}