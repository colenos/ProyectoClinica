/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.showcase.view.data.gmap;
 
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
  
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@ManagedBean
@ViewScoped


public class InfoWindowView implements Serializable{
    private MapModel advancedModel;
  
    private Marker marker;
  
    @PostConstruct
    public void init() {
        advancedModel = new DefaultMapModel();
          
        //Shared coordinates
        LatLng coord1 = new LatLng(-33.0450793, -71.6135662); //Clinica valparaiso
        LatLng coord2 = new LatLng(-33.0099725, -71.5518737); //clinica ciudad del mar
        LatLng coord3 = new LatLng(-32.98391,   -71.5352708); //clinica reñaca
        LatLng coord4 = new LatLng(-33.0290696, -71.5413754); //hospital clinico viña del mar
        LatLng coord5 = new LatLng(-33.0487878, -71.4382946); // clinica los carrera
        LatLng coord6 = new LatLng(-33.0400173, -71.3784117); //clinica villa alemana
          
        //Icons and Data
        advancedModel.addOverlay(new Marker(coord1, "Clínica Valparaíso", "cvalpo.jpg", "http://maps.google.com/mapfiles/ms/micons/blue-dot.png"));
        advancedModel.addOverlay(new Marker(coord2, "Clínica Ciudad del Mar", "ccdelmar.jpg","http://maps.google.com/mapfiles/ms/micons/blue-dot.png"));
        advancedModel.addOverlay(new Marker(coord3, "Clínica Reñaca", "crenaca.jpg", "http://maps.google.com/mapfiles/ms/micons/blue-dot.png"));
        advancedModel.addOverlay(new Marker(coord4, "Hospital Clínico de Viña del Mar", "hclinico.jpg", "http://maps.google.com/mapfiles/ms/micons/blue-dot.png"));
        advancedModel.addOverlay(new Marker(coord5, "Clínica Los Carrera", "closcarrera.jpg", "http://maps.google.com/mapfiles/ms/micons/blue-dot.png"));
        advancedModel.addOverlay(new Marker(coord6, "Clínica Villa Alemana", "cvillaalemana.jpg", "http://maps.google.com/mapfiles/ms/micons/blue-dot.png"));
    }
  
    public MapModel getAdvancedModel() {
        return advancedModel;
    }
      
    public void onMarkerSelect(OverlaySelectEvent event) {
        marker = (Marker) event.getOverlay();
    }
      
    public Marker getMarker() {
        return marker;
    }
}
