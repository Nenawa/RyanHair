import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App'
import './index.css'
import AdminRdv from "./pages/Admin-rdv";
import {createBrowserRouter, RouterProvider} from "react-router-dom";
import Navbar from './components/Navbar';

const router = createBrowserRouter([
    
    {
        path: "/",
        element:<Navbar />   

    },
    {
        path: "rendezvous",
        //element: 
    },
    {
        path:"admin",
        children:
        [{
            path: "rdv",
            element:<AdminRdv />
        }]
    }
])

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
    <React.StrictMode>
        <RouterProvider router={router} />
    </React.StrictMode>
)
