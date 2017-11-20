/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.showcase.view.data.gmap;
 
import cl.bean.CategoriaBean;

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
        
        advancedModel.addOverlay(new Marker(coord1, "Clínica Valparaíso, Brasil 2350, Valparaíso", "cvalpo.jpg", "http://maps.google.com/mapfiles/ms/micons/blue-dot.png","www.clinicavalparaiso.cl"));
        advancedModel.addOverlay(new Marker(coord2, "Clínica Ciudad del Mar, 13 Nte. 635, Viña del Mar", "ccdelmar.jpg","http://maps.google.com/mapfiles/ms/micons/pink-dot.png","2"));
        advancedModel.addOverlay(new Marker(coord3, "Clínica Reñaca, Anabaena 336, Viña del Mar", "crenaca.jpg", "http://maps.google.com/mapfiles/ms/micons/yellow-dot.png","3"));
        advancedModel.addOverlay(new Marker(coord4, "Hospital Clínico de Viña del Mar, Limache 1741, Viña del Mar", "hclinico.jpg", "http://maps.google.com/mapfiles/ms/micons/green-dot.png","4"));
        advancedModel.addOverlay(new Marker(coord5, "Clínica Los Carrera, Caupolicán 958, Quilpué", "closcarrera.jpg", "http://maps.google.com/mapfiles/ms/micons/orange-dot.png","5"));
        advancedModel.addOverlay(new Marker(coord6, "Clínica Villa Alemana, Avenida Valparaíso 1209, Villa Alemana", "cvillaalemana.jpg", "http://maps.google.com/mapfiles/ms/micons/red-dot.png","6"));
        
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
