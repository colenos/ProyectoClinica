/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.services;

import cl.pojos.Categoria;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Yi
 */
@Stateless
public class CategoriaFacade extends AbstractFacade<Categoria> implements CategoriaFacadeLocal {

    @PersistenceContext(unitName = "ProyectoClinica-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriaFacade() {
        super(Categoria.class);
    }
    
}
