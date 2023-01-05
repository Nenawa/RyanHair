import './Map.css';
import { LatLngExpression } from "leaflet";
import { MapContainer, TileLayer, Marker, Popup} from "react-leaflet";
import 'leaflet/dist/leaflet.css';




export default function Map() {

  const defaultPosition: LatLngExpression = [43.45295, 5.86080]; // Saint maximin position

  return (
    <div id="map__container">
      <MapContainer
        center={defaultPosition}
        zoom={16}
      >
        <TileLayer
          attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
          url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
        />
        <Marker position={defaultPosition} >
            <Popup>
              <span>Comme sur un nuage <br /> Viens tresser la magie dans tes cheveux !</span>
            </Popup>
          </Marker>

      </MapContainer>
    </div>
  );
}