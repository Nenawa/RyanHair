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
            "https://data.toulouse-metropole.fr/api/records/1.0/search/?dataset=agenda-des-manifestations-culturelles-so-toulouse&q=&rows=50&start=" +
            indexAPI +
            "&facet=date_debut&facet=date_fin&facet=categorie_de_la_manifestation&facet=theme_de_la_manifestation&refine.date_debut=" +
            currentYear +
            "-" +
            currentMonth +
            "&refine.date_fin=" +
            currentYearAfter30Days +
            "-" +
            currentMonthAfter30days;
        axios.get(API_URL).then((res) => {
            const occurrence = res.data;
            setOccurrences(occurrence);
        });
    }, [indexAPI]);


    return (
        <div id="table" className='table'>



        </div>
    );
}