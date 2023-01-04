import axios from "axios";
import {useEffect, useState} from "react";

function Prestation(){
    const [resp, setRes] = useState([]);
    function getData() {

        axios
            .get(
                `http://localhost:8080/api/haircuts`
            )
            .then((res) => {
                setRes(res.data);
                console.log(res.data);
            });

    }

    useEffect(() => {
        getData();
    }, []);
    return (
        <table>
            <thead>

            </thead>
            <tbody>
            {
                resp?.map((d)=>(
                    <tr key={d.id}>
                        <td>{d.status}</td>
                        <td>{d.description}</td>
                        <td><input type="radio" id={d.id} name="haircuts" value={d.id}/></td>
                    </tr>
                ))
            }
            </tbody>
        </table>

    )
}
export default Prestation;