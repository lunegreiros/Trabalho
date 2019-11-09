/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.factory;

import crud.dao.HibernatePalavraDAO;
import crud.dao.PalavraDAO;

/**
 *
 * @author aluno
 */
public class HibernateDAOFactory extends DAOAbstractFactory {

    @Override
    public PalavraDAO createPalavraDAO() {
        return new HibernatePalavraDAO();
    }    
}
