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
import crud.factory.DAOAbstractFactory;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.hibernate.Query;

/**
 *
 * @author aluno
 */
public class HibernateExpressaoDAO implements ExpressaoDAO {

    Statement statement;
    
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

    public void removerExpressoes(Palavra palavra) throws Exception{
        Palavra palavra2 = DAOAbstractFactory.createFactory(DAOAbstractFactory.HIBERNATE).createPalavraDAO().retrieveById(palavra.getId());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        session.delete(palavra2);
                session.flush();
        transaction.commit();
        session.close();
        
        
        //List <Expressao> expressoes = new ArrayList();
        //Host hd = new Host();
//        try {
//                    
//                    
//                
//                String HQL = "DELETE FROM Expressao WHERE id=" + palavra.getId();
//                Query result = session.createQuery(HQL);
//                while(result.iterate().hasNext()){
//                    
//                    Expressao expressao = (Expressao) result.list().get(0);
//                    session.delete(expressao);
//                }
                
                /*
                int id = palavra.getId();
                ResultSet result = statement.executeQuery("     SELECT * FROM expressao WHERE palavra_id = " + id +"    ");
                result.next();
                int expressaoId = result.getInt("id");
                Expressao expressao = (Expressao) DAOAbstractFactory.createFactory(DAOAbstractFactory.HIBERNATE).createExpressaoDAO().retrieveById(expressaoId);
                session.delete(expressao);
*/
                //SQLQuery = "DELETE FROM expressao WHERE id = " + expressaoId;
                //expressoes = result.ge
                //session.delete(result);
                //deletar todas as expressoes com 'expressaoId'
                
//        } catch (Exception e) {
//            //JOptionPane.showMessageDialog(this, e.getMessage(), "Erro em excluir", JOptionPane.ERROR_MESSAGE);
//            System.out.println("Erro ao excluir expressões");
//        }

    }
}
