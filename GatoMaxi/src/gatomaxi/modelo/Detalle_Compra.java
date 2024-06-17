/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

/**
 *
 * @author usuario
 */
public class Detalle_Compra {
    private int idDetalleCompra; // id_Detalle_Compra
    private int cantidad;
    private int idProducto;
    private int id_compra;
    private String codigo_barra;
    
    //constructores
    public Detalle_Compra(){
        
    }

    public Detalle_Compra(int idDetalleCompra, int cantidad, int idProducto, int id_compra, String codigo_barra) {
        this.idDetalleCompra = idDetalleCompra;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
        this.id_compra = id_compra;
        this.codigo_barra = codigo_barra;
    }
    
    //Getter y Setter

    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getCodigo_barra() {
        return codigo_barra;
    }

    public void setCodigo_barra(String codigo_barra) {
        this.codigo_barra = codigo_barra;
    }
    

}

