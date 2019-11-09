/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.factory;

import crud.dao.PalavraDAO;

/**
 *
 * @author aluno
 */
public abstract class DAOAbstractFactory {
    public static final int JDBC = 1;
    public static final int HIBERNATE = 2;
    
    public abstract PalavraDAO createPalavraDAO();
    
    public static DAOAbstractFactory createFactory(int tipo) {
        switch(tipo) {
            //case JDBC: return new JDBCDAOFactory();
            case HIBERNATE: return new HibernateDAOFactory();
        }
        return null;
    }
    
}
