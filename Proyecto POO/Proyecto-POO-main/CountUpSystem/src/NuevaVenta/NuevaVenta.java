package NuevaVenta;

import java.io.Serializable;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 */

public class NuevaVenta implements Serializable{
    
    String codigo, descripcion, mercancia;
    int cantidad;
    double precio;

    public NuevaVenta() {
    }

    public NuevaVenta(String codigo, String descripcion, String mercancia, int cantidad, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.mercancia = mercancia;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMercancia() {
        return mercancia;
    }
    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}