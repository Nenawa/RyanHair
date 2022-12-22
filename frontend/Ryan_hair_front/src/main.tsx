import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App'
import './index.css'
import Home from "./pages/Home";
import {createBrowserRouter, Link, RouterProvider} from "react-router-dom";
import AdminRdv from "./pages/Admin-rdv";

const router = createBrowserRouter([
    {
        path: "/",
        element : <Home />
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
