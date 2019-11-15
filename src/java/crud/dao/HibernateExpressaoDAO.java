/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import POJOS.Expressao;
import POJOS.Palavra;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import crud.dao.ExpressaoDAO;

/**
 *
 * @author aluno
 */
public class HibernateExpressaoDAO implements ExpressaoDAO {

    public void create(Expressao expressao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(expressao);
        session.flush();
        transaction.commit();
        session.close();
    }


    public List<Expressao> retrieveAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Expressao> expressoes = session.createQuery("from Expressao").list();
        session.flush();
        session.close();
        return expressoes;
    }

    public List<Expressao> retrieveById(int idPalavra) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List <Expressao> expressoes
                = (List <Expressao>) session.createQuery("from Expressao where palavra_id =" + idPalavra).list();
        session.flush();
        session.close();
        return expressoes;
    }

    public void delete(Expressao expressao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(expressao);
        session.flush();
        transaction.commit();
        session.close();
    }

    public void update(Expressao expressao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(expressao);
        session.flush();
        transaction.commit();
        session.close();
    }

}
