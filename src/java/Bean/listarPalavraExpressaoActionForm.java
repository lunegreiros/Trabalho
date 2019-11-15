/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import POJOS.Expressao;
import POJOS.Palavra;
import crud.factory.DAOAbstractFactory;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author luneg
 */
public class listarPalavraExpressaoActionForm extends org.apache.struts.action.ActionForm {
    
    private Integer idPalavra;
    private String stringPalavra;
    private Set expressoes = new HashSet(0);
    
    private Integer idExpressao;
    private Integer palavra_id;
    private Palavra objPalavra;
    private String expressao;
  
    public listarPalavraExpressaoActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Integer getIdPalavra() {
        return idPalavra;
    }

    public void setIdPalavra(Integer idPalavra) {
        this.idPalavra = idPalavra;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idPalavra = 0;
        stringPalavra = "";
        expressao = "";
        idExpressao = 0;
        palavra_id=0;
        objPalavra=null;
    }

    public void setStringPalavra(String stringPalavra) {
        this.stringPalavra = stringPalavra;
    }

    public void setExpressoes(Set expressoes) {
        this.expressoes = expressoes;
    }

    public Integer getIdExpressao() {
        return idExpressao;
    }

    public void setIdExpressao(Integer idExpressao) {
        this.idExpressao = idExpressao;
    }

    public Integer getPalavra_id() {
        return palavra_id;
    }

    public void setPalavra_id(Integer palavra_id) {
        this.palavra_id = palavra_id;
    }

    public Palavra getObjPalavra() {
        return objPalavra;
    }

    public void setObjPalavra(Palavra objPalavra) {
        this.objPalavra = objPalavra;
    }

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }
    
    public List<Expressao> getExpressoes() throws Exception {
        return DAOAbstractFactory.
                createFactory(DAOAbstractFactory.HIBERNATE).
                createExpressaoDAO().
                retrieveById(idPalavra);
    }

    public String getStringPalavra() {
        return stringPalavra;
    }
    
}
