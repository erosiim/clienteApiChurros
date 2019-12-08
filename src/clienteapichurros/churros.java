package clienteapichurros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author exkapp
 */

public class churros {
    private String id_churro;
    private String tipo;
    private String precio;

    public String getId_churro() {
        return id_churro;
    }

    public void setId_churro(String id_churro) {
        this.id_churro = id_churro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
}
