import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App'
import {createBrowserRouter, Link, Outlet, RouterProvider} from "react-router-dom";

import './index.css'
import '../src/components/Navbar.css'
import '../src/components/home/home.css'
import '../src/components/reservation/reservation.css'

import Navbar from './components/Navbar';
import Home from "./pages/Home";
import AdminRdv from "./pages/Admin-rdv";
import Reservation from "./pages/Reservation";
/*
const router = createBrowserRouter([

    {
        path: "/",
        element : <Home />
    },
    {
        path: "rendezvous",
        element: <Reservation />
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
 */


const HeaderLayout = () => (
    <>
        <header>
            <Navbar />
        </header>
        <Outlet />
    </>
);

const router = createBrowserRouter([
    {
        element: <HeaderLayout />,
        children: [
            {
                path: "/",
                element: <Home />,
            },
            {
                path: "/rendezvous",
                element: <Reservation />
            },
            {
                path:"admin",
                children:
                    [{
                        path: "rdv",
                        element:<AdminRdv />
                    }]
            }
        ]

    }
])

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
    <React.StrictMode>
        <RouterProvider router={router} />
    </React.StrictMode>
)
