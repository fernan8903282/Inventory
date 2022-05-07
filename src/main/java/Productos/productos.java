/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;


/**
 *
 * @author DELL
 */
public class productos {
    private String id;
    private String nombre;
    private Double precio;
    private String stock;
    private String tipo;
    private byte[] imagen;
    private int idStatus_producto;    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double modelo) {
        this.precio = modelo;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    public int getIdStatus_producto() {
        return idStatus_producto;
    }

    public void setIdStatus_producto(int idStatus_producto) {
        this.idStatus_producto = idStatus_producto;
    }
}
