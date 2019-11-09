/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import POJOS.Palavra;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author luneg
 */
public class inserirExpressaoActionForm extends org.apache.struts.action.ActionForm {
   
     private Integer id;
     private Palavra palavra;
     private String expressao;
     
    public inserirExpressaoActionForm(int id, Palavra palavra, String expressao) {
       this.id=id;
       this.palavra = palavra;
       this.expressao = expressao;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Palavra getPalavra() {
        return this.palavra;
    }
    
    public void setPalavra(Palavra palavra) {
        this.palavra = palavra;
    }
    public String getExpressao() {
        return this.expressao;
    }
    
    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

    public inserirExpressaoActionForm() {
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
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getExpressao()== null || getExpressao().length() < 1) {
            errors.add("expressao", new ActionMessage("error.expressao.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
