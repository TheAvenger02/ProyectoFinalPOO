package Clientes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 */

public class Clientes implements Serializable{
    
    private String RFC, nombre, telefono, direccion;

    public Clientes() {
    }

    public Clientes(String RFC, String nombre, String telefono, String direccion) {
        this.RFC = RFC;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Clientes(ArrayList<Clientes> listaCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getRFC() {
        return RFC;
    }
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}