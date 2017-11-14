/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bean;

import cl.pojos.Categoria;
import cl.pojos.Ciudad;
import cl.pojos.Clinicas;
import cl.services.CiudadFacade;
import cl.services.CiudadFacadeLocal;
import cl.services.ClinicasFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Yi
 */
@Named(value = "clinicasBean")
@RequestScoped
public class ClinicasBean {

    @EJB
    private CiudadFacadeLocal ciudadFacade;

    @EJB
    private ClinicasFacadeLocal clinicasFacade;
    
    private String nombreClinica;
    private String ubicacionClinica;
    private Ciudad ciudad;
    
    
    public ClinicasBean() {
        ciudad= new Ciudad();
        
    }
    public List<Clinicas> getClinicas(){
        return clinicasFacade.findAll();
    }
    public String crearClinicas(){
        Clinicas objClinica = new Clinicas();
        objClinica.setNombreClinica(nombreClinica);
        objClinica.setUbicacionClinica(ubicacionClinica);
        objClinica.setCodigoCiudad(ciudadFacade.find(ciudad.getCodigoCiudad()));
        clinicasFacade.create(objClinica);
        return "clinicas";
    }
    
}
