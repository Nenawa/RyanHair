import React, { useEffect, useState } from "react";

export default function Table() {

    return (
        <div id="table" className='table'>

            <h3>Horaires d'ouverture</h3>

            <table>
                <tbody>
                    <tr>
                        <td className={"jour"}>Lundi</td>
                        <td className={"heure"}>fermé</td>
                    </tr>
                    <tr>
                        <td className={"jour"}>Mardi</td>
                        <td className={"heure"}>9:30 - 18:00</td>
                    </tr>
                    <tr>
                        <td className={"jour"}>Mercredi</td>
                        <td className={"heure"}>9:30 - 18:00</td>
                    </tr>
                    <tr>
                        <td className={"jour"}>Jeudi</td>
                        <td className={"heure"}> 9:30 - 18:00</td>
                    </tr>
                    <tr>
                        <td className={"jour"}>Vendredi</td>
                        <td className={"heure"}> 9:30 - 18:00</td>
                    </tr>
                    <tr>
                        <td className={"jour"}>Samedi</td>
                        <td className={"heure"}> 9:30 - 18:00</td>
                    </tr>
                    <tr>
                        <td className={"jour"}>Dimanche</td>
                        <td className={"heure"}> fermé</td>
                    </tr>
                </tbody>
            </table>

        </div>
    );
}