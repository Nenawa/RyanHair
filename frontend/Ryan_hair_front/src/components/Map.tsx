import './Map.css'
import React, { useEffect, useState } from "react";
import { LatLngExpression } from "leaflet";
import { MapContainer, TileLayer, Marker, Tooltip, Polyline } from "react-leaflet";

export default function Map() {

    const defaultPosition: LatLngExpression = [43.45295, 5.86080]; // Saint maximin position

  return (
    <div className="map__container">
      <MapContainer
        center={defaultPosition}
        zoom={13}
      >
        <TileLayer
          attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
          url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
        />
      </MapContainer>
      </div>
  );
}