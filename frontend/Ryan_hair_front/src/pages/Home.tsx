import React, { useEffect, useState } from "react";
import '../components/home/home.css'

import Presentation from "../components/home/Presentation";
import Map from "../components/home/Map";
import Table from "../components/home/Table";

export default function Home() {

    return (
        <div id="home" className='home'>

            <>
                <Presentation />
                <Map />
                <Table />
            </>

        </div>
    );
}
