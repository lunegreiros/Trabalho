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
   
     private Integer idExpressao;
     private Integer idPalavra;
     private Palavra palavra;
     private String expressao;
     private String stringPalavra;
     

    public Integer getIdExpressao() {
        return idExpressao;
    }

    public void setIdExpressao(Integer idExpressao) {
        this.idExpressao = idExpressao;
    }

    public Integer getIdPalavra() {
        return idPalavra;
    }

    public void setIdPalavra(Integer idPalavra) {
        this.idPalavra = idPalavra;
    }
     
     
    public inserirExpressaoActionForm(int id, Palavra palavra, String expressao) {
       this.idExpressao=id;
       this.palavra = palavra;
       this.expressao = expressao;
       this.idPalavra = palavra.getId();
    }
   
    public Integer getId() {
        return this.idExpressao;
    }
    
    public void setId(Integer id) {
        this.idExpressao = id;
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

    public String getStringPalavra() {
        return stringPalavra;
    }

    public void setStringPalavra(String stringPalavra) {
        this.stringPalavra = stringPalavra;
    }
}
