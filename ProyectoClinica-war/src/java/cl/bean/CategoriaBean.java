/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bean;

import cl.pojos.Categoria;
import cl.pojos.Clinicas;
import cl.services.CategoriaFacadeLocal;
import cl.services.ClinicasFacade;
import cl.services.ClinicasFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Yi
 */
@Named(value = "categoriaBean")
@RequestScoped
public class CategoriaBean {

    @EJB
    private ClinicasFacadeLocal clinicasFacade;

    @EJB
    private CategoriaFacadeLocal categoriaFacade;

    private int c1;
    private int c2;
    private int c3;
    private int c4;
    private int c5;
    private Clinicas clinicas;
    
    public static String categoriasClinicaValpo(){
        Categoria mostrar = new Categoria();
        String m= null;
        
            
            m = "Categoría C1 = " +mostrar.getC1() + "Codigo = " +mostrar.getCodigoClinica().toString();
        
        return m;
    }
    public CategoriaBean() {
        clinicas = new Clinicas();
    }
    public List<Categoria> getCategoria(){
        return categoriaFacade.findAll();
    }
    
    public Categoria buscarClinica(int codigo){
        return categoriaFacade.find(codigo);
    }
    public String crearCategoria(){
        Categoria c = new Categoria();
        c.setC1(c1);
        c.setC2(c2);
        c.setC3(c3);
        c.setC4(c4);
        c.setC5(c5);
        c.setCodigoClinica(clinicasFacade.find(clinicas.getCodigoClinica()));
        categoriaFacade.create(c);
        
        return "categoria";
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public int getC3() {
        return c3;
    }

    public void setC3(int c3) {
        this.c3 = c3;
    }

    public int getC4() {
        return c4;
    }

    public void setC4(int c4) {
        this.c4 = c4;
    }

    public int getC5() {
        return c5;
    }

    public void setC5(int c5) {
        this.c5 = c5;
    }

    public Clinicas getClinicas() {
        return clinicas;
    }

    public void setClinicas(Clinicas clinicas) {
        this.clinicas = clinicas;
    }

    
}
