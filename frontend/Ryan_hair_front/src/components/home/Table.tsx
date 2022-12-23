import React, { useEffect, useState } from "react";

export default function Table() {


    return (
        <div id="table" className='table'>

            <h3>Horaires d'ouverture</h3>

            <table>
                <tbody>
                    <tr>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td className={"jour"}>Lundi</td>
                        <th className={"heure"}>fermé</th>
                    </tr>
                    <tr>
                        <td className={"jour"}>Mardi</td>
                        <th className={"heure"}>9:30 - 18:00</th>
                    </tr>
                    <tr>
                        <td className={"jour"}>Mercredi</td>
                        <th className={"heure"}>9:30 - 18:00</th>
                    </tr>
                    <tr>
                        <td className={"jour"}>Jeudi</td>
                        <th className={"heure"}> 9:30 - 18:00</th>
                    </tr>
                    <tr>
                        <td className={"jour"}>Vendredi</td>
                        <th className={"heure"}> 9:30 - 18:00</th>
                    </tr>
                    <tr>
                        <td className={"jour"}>Samedi</td>
                        <th className={"heure"}> 9:30 - 18:00</th>
                    </tr>
                    <tr>
                        <td className={"jour"}>Dimanche</td>
                        <th className={"heure"}> fermé</th>
                    </tr>
                </tbody>
            </table>

        </div>
    );
}