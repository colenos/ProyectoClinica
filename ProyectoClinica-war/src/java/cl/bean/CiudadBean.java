/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bean;

import cl.pojos.Ciudad;
import cl.services.CiudadFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Yi
 */
@Named(value = "ciudadBean")
@RequestScoped
public class CiudadBean {

    @EJB
    private CiudadFacadeLocal ciudadFacade;

    private String nombreCiudad;
    
    public CiudadBean() {
    }
    public List<Ciudad> getCiudad(){
        return ciudadFacade.findAll();
    }
    public String crearCiudad(){
        Ciudad c = new Ciudad();
        c.setNombreCiudad(nombreCiudad);
        ciudadFacade.create(c);
        return "ciudad";
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    
    
}
