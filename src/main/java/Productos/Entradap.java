/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

/**
 *
 * @author DELL
 */
public class Entradap {
    //entrada
    private String  id;
    private String  fecha;
    private Double  total;
    private String  idStatus;
    //Det Entrada
    private String  id_Det;
    private String  id_rel;
    private Double  Costo;
    private  int    Cantidad;
    private String  id_Det_producto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(String idStatus) {
        this.idStatus = idStatus;
    }

    public String getId_Det() {
        return id_Det;
    }

    public void setId_Det(String id_Det) {
        this.id_Det = id_Det;
    }

    public String getId_rel() {
        return id_rel;
    }

    public void setId_rel(String id_rel) {
        this.id_rel = id_rel;
    }

    public Double getCosto() {
        return Costo;
    }

    public void setCosto(Double Costo) {
        this.Costo = Costo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getId_Det_producto() {
        return id_Det_producto;
    }

    public void setId_Det_producto(String id_Det_producto) {
        this.id_Det_producto = id_Det_producto;
    }

}
