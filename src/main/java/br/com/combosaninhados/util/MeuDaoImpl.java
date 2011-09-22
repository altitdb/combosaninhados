/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combosaninhados.util;

import br.com.combosaninhados.modelo.Cidade;
import br.com.combosaninhados.modelo.Estado;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author altitdb
 */
public class MeuDaoImpl implements MeuDao {

    @Override
    public Cidade getByIdCidade(Long id) {
        return (Cidade) HibernateUtility.getSession().get(Cidade.class, id);
    }

    @Override
    public Estado getByIdEstado(Long id) {
        return (Estado) HibernateUtility.getSession().get(Estado.class, id);
    }

    @Override
    public List<Estado> consultaTodosEstados() {
        Criteria crit = HibernateUtility.getSession().createCriteria(Estado.class);
        return crit.list();
    }

    @Override
    public List<Cidade> consultaCidades(Estado estado) {
        Criteria crit = HibernateUtility.getSession().createCriteria(Cidade.class);
        crit.add(Restrictions.eq("estado", estado));
        return crit.list();
    }
}
