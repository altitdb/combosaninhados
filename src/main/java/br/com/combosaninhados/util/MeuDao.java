/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combosaninhados.util;

import br.com.combosaninhados.modelo.Cidade;
import br.com.combosaninhados.modelo.Estado;
import java.util.List;

/**
 *
 * @author altitdb
 */
public interface MeuDao {
    
    public List<Estado> consultaTodosEstados();
    
    public List<Cidade> consultaCidades(Estado estado);
    
    public Cidade getByIdCidade(Long id);
    
    public Estado getByIdEstado(Long id);
}
