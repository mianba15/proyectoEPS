/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eps.app.facade;

import com.eps.app.modelo.NivelAtencion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class NivelAtencionFacade extends AbstractFacade<NivelAtencion> {

    @PersistenceContext(unitName = "com_EPS-App_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NivelAtencionFacade() {
        super(NivelAtencion.class);
    }
    
}