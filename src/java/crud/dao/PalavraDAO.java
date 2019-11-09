/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import POJOS.Palavra;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface PalavraDAO {

    public void create(Palavra palavra) throws Exception;

    public List<Palavra> retrieveAll() throws Exception;

    public Palavra retrieveById(int idPalavra) throws Exception;

    public void update(Palavra palavra) throws Exception;

    public void delete(Palavra palavra) throws Exception;
}
