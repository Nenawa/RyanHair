import React, { useEffect, useState } from "react";
import '../components/home/home.css'

import Presentation from "../components/home/Presentation";
import Map from "../components/home/Map";
import Table from "../components/home/Table";
import Navbar from "../components/Navbar";

export default function Home() {

    return (
        <div id="home" className='home'>

            <>
                <Navbar />
                <Presentation />
                <Map />
                <Table />
            </>

        </div>
    );
}
