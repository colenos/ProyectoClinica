/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.services;

import cl.pojos.Clinicas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Yi
 */
@Stateless
public class ClinicasFacade extends AbstractFacade<Clinicas> implements ClinicasFacadeLocal {

    @PersistenceContext(unitName = "ProyectoClinica-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClinicasFacade() {
        super(Clinicas.class);
    }
    
}
