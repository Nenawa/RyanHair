import React, { useEffect, useState } from "react";
import PhoneInput from 'react-phone-input-2'
import 'react-phone-input-2/lib/style.css'

export default function Formulaire_donnee() {

    const [emailError, setEmailError] = useState('');
    const [telephoneError, setTelephoneError] = useState('');
    const [prenomError, setPrenomError] = useState('');
    const [nomError, setNomError] = useState('');
    const [descriptionError, setDescriptiionError] = useState('');

    const onSubmit = (e: any) => {
        e.preventDefault()
        const fromData = new FormData(e.target);

        fetch("http://localhost:8080/api/appointments", {
            method: "POST",
            headers: {
                Accept: "application/json",
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                email: fromData.get('email'),
                telephone: fromData.get('telephone'),
                prenom: fromData.get('prenom'),
                nom: fromData.get('nom'),
                description: fromData.get('description')
            }),
        })
            .then((response) => response.json())
            .then((data) => {
                if (data.fieldErrors) {
                    data.fieldErrors.forEach((fieldError: { field: string; message: React.SetStateAction<string>; }) => {
                        if (fieldError.field === 'email') {
                            setEmailError(fieldError.message);
                        }
                        if (fieldError.field === 'telephone') {
                            setTelephoneError(fieldError.message);
                        }
                        if (fieldError.field === 'prenom') {
                            setPrenomError(fieldError.message);
                        }
                        if (fieldError.field === 'nom') {
                            setNomError(fieldError.message);
                        }
                        if (fieldError.field === 'description') {
                            setDescriptiionError(fieldError.message);
                        }
                    });
                } else {
                    alert('Votre rendez-vous est enregistré')
                }
            })
            .catch((err) => err);
    }

    return (
        <div id="formulaire_donnee" className='formulaire_donnee'>

            <>
                <h3>3. Prendre rendez-vous</h3>

                <PhoneInput
                    country={'fr'}
                    value={telephoneError}
                    onChange={setTelephoneError}
                />

                <input className="email" type="email" placeholder="Email" name="email"/>
                {
                    emailError ? {emailError} : ''
                }

                <input className="nom" type="text" placeholder="Nom" name="nom"/>
                {
                    nomError ? {nomError} : ''
                }

                <input className="prenom" type="text" placeholder="Prenom" name="prenom"/>
                {
                    prenomError ? {prenomError} : ''
                }

                <input className="description" type="text" placeholder="Description" name="description"/>
                {
                    descriptionError ? {descriptionError} : ''
                }

                <form id="stripe-login" method="POST" onSubmit={() => onsubmit}></form>
            </>

        </div>
    );

}

