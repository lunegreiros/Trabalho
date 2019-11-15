/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import POJOS.Palavra;
import crud.factory.DAOAbstractFactory;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author luneg
 */
public class consultarPalavraActionForm extends org.apache.struts.action.ActionForm {
    
    private Integer id;
    private String palavra;
    private Set expressoes = new HashSet(0);
    
    public consultarPalavraActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    /*
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getName() == null || getName().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
    */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public Set getExpressoes() {
        return expressoes;
    }

    public void setExpressoes(Set expressoes) {
        this.expressoes = expressoes;
    }
    public List<Palavra> getPalavras() throws Exception {
        return DAOAbstractFactory.
                createFactory(DAOAbstractFactory.HIBERNATE).
                createPalavraDAO().
                retrieveAll();
    }
}
