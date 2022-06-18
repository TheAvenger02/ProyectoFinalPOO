package Proveedores;

import java.io.Serializable;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 */

public class Proveedores implements Serializable{
    private String nombre, telefono, direccion, tipoProd;

    public Proveedores() {
    }

    public Proveedores(String nombre, String telefono, String direccion, String tipoProd) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoProd = tipoProd;
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

    public String getTipoProd() {
        return tipoProd;
    }
    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }
}