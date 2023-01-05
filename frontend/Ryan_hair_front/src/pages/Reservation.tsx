import React, { useEffect, useState } from "react";
import Formulaire_donnee from "../components/reservation/Formulaire_donnee";
import '../components/reservation/reservation.css'
export default function Reservation() {

    return (
        <div id="home" className='home'>

            <>
                <Formulaire_donnee />
            </>

        </div>
    );
}
