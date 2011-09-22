/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combosaninhados.converter;

import br.com.combosaninhados.modelo.Estado;
import br.com.combosaninhados.util.MeuDao;
import br.com.combosaninhados.util.MeuDaoImpl;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author altitdb
 */
@FacesConverter(value = "converterEstado")
public class ConverterEstado implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null && !value.equals("")) {
            MeuDao dao = new MeuDaoImpl();
            return dao.getByIdEstado(Long.valueOf(value));
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Estado) {
            Estado estado = (Estado) value;
            return String.valueOf(estado.getIdEstado());
        }
        return "";
    }
}
