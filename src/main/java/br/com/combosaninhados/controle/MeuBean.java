/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combosaninhados.controle;

import br.com.combosaninhados.modelo.Cidade;
import br.com.combosaninhados.modelo.Estado;
import br.com.combosaninhados.util.MeuDao;
import br.com.combosaninhados.util.MeuDaoImpl;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author altitdb
 */
@ManagedBean
@ViewScoped
public class MeuBean implements Serializable {
    
    private final MeuDao dao = new MeuDaoImpl();
    private List<Estado> estados;
    private List<Cidade> cidades;
    private Cidade cidade;
    private Estado estado;
    
    public MeuBean() {
        
    }
    
    @PostConstruct
    public void init() {
        estados = dao.consultaTodosEstados();
    }
    
    public void listaCidades(AjaxBehaviorEvent event) {
        cidades = dao.consultaCidades(estado);
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
    
}