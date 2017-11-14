/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.services;

import cl.pojos.Clinicas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Yi
 */
@Local
public interface ClinicasFacadeLocal {

    void create(Clinicas clinicas);

    void edit(Clinicas clinicas);

    void remove(Clinicas clinicas);

    Clinicas find(Object id);

    List<Clinicas> findAll();

    List<Clinicas> findRange(int[] range);

    int count();
    
}
