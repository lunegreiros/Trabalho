/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import POJOS.Expressao;
import POJOS.Palavra;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface ExpressaoDAO {

    public void create(Expressao expressao) throws Exception;

    public List<Expressao> retrieveAll() throws Exception;

    public List<Expressao> retrieveById(int idPalavra) throws Exception;

    public void update(Expressao expressao) throws Exception;

    public void delete(Expressao expressao) throws Exception;
    
    public void removerExpressoes(Palavra palavra) throws Exception;
}
