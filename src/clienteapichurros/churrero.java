/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteapichurros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author exkapp
 */

public class churrero {
    
    private String id_churrero;
    
    private String nombre;
    
    private String edad;

    public String getId_churrero() {
        return id_churrero;
    }

    public void setId_churrero(String id_churrero) {
        this.id_churrero = id_churrero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
}
