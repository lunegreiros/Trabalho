/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import POJOS.Expressao;
import POJOS.Palavra;
import Util.HibernateUtil;
import crud.factory.DAOAbstractFactory;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class HibernatePalavraDAO implements PalavraDAO {
    
    Statement statement;
    ResultSet result;
    

    public void create(Palavra palavra) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(palavra);
        session.flush();
        transaction.commit();
        session.close();
    }

    public List<Palavra> retrieveAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Palavra> palavras = session.createQuery("from Palavra").list();
        session.flush();
        session.close();
        return palavras;
    }

    public Palavra retrieveById(int idPalavra) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Palavra palavra
                = (Palavra) session.createQuery("from Palavra where id =" + idPalavra).uniqueResult();
        session.flush();
        session.close();
        return palavra;
    }

    public void delete(Palavra palavra) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(palavra);
        session.flush();
        transaction.commit();
        session.close();
    }

    public void removerPalavra(Palavra palavra) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        session.delete(palavra);
        session.flush();
        transaction.commit();
        session.close();
    }

    public void update(Palavra palavra) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(palavra);
        session.flush();
        transaction.commit();
        session.close();
    }

}
