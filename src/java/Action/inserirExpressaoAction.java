/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import Bean.inserirExpressaoActionForm;
import Bean.listarPalavraExpressaoActionForm;
import POJOS.Expressao;
import POJOS.Palavra;
import Util.HibernateUtil;
import crud.factory.DAOAbstractFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luneg
 */
public class inserirExpressaoAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        inserirExpressaoActionForm formbean = (inserirExpressaoActionForm) form;
        Palavra palavra = DAOAbstractFactory.createFactory(DAOAbstractFactory.HIBERNATE).createPalavraDAO().retrieveById(formbean.getId());
        formbean.setStringPalavra(palavra.getPalavra());
        Expressao expressao = new Expressao(palavra, formbean.getExpressao());
        DAOAbstractFactory.createFactory(DAOAbstractFactory.HIBERNATE).createExpressaoDAO().create(expressao);
        return mapping.findForward(SUCCESS);
    }
}
