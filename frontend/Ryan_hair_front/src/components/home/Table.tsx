import React, { useEffect, useState } from "react";
import axios from 'axios';

export default function Table() {

    let API_URL;

    const [indexAPI, setIndexAPI] = useState(0);
    const [tableau, setTableau] = useState([]);

    const currentHour = new Date().getHours();
    console.log(currentHour)

    const curentMinutes = new Date().getMinutes();
    console.log(curentMinutes)

    useEffect(() => {
        API_URL =
            ""

    }, [indexAPI]);


    return (
        <div id="table" className='table'>



        </div>
    );
}