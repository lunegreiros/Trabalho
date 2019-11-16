/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import Bean.consultarPalavraActionForm;
import Bean.excluirPalavraActionForm;
import POJOS.Palavra;
import crud.dao.HibernatePalavraDAO;
import crud.factory.DAOAbstractFactory;
import crud.factory.HibernateDAOFactory;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author luneg
 */
public class excluirPalavraAction extends org.apache.struts.action.Action {

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
        
        excluirPalavraActionForm formbean = (excluirPalavraActionForm) form;
        Palavra palavra = DAOAbstractFactory.createFactory(DAOAbstractFactory.HIBERNATE).createPalavraDAO().retrieveById(formbean.getId());
        DAOAbstractFactory.createFactory(DAOAbstractFactory.HIBERNATE).createExpressaoDAO().removerExpressoes(palavra);
        //DAOAbstractFactory.createFactory(DAOAbstractFactory.HIBERNATE).createPalavraDAO().delete(palavra);
        return mapping.findForward(SUCCESS);
    }
}
