/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import Bean.consultarPalavraActionForm;
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
public class consultarPalavraAction extends org.apache.struts.action.Action {

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
        
        consultarPalavraActionForm formbean = (consultarPalavraActionForm) form;
        List<Palavra> palavras = new ArrayList();
        palavras = DAOAbstractFactory.createFactory(DAOAbstractFactory.HIBERNATE).createPalavraDAO().retrieveAll();
        return mapping.findForward(SUCCESS);
    }
}
