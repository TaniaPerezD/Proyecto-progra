/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

/**
 *
 * @author ADRIANA
 */
public class DetalleFactura {
    public int idDetalleFactura;
    public String numAutorizacion;
    public int cantidad;
    public int idProducto;
    public String codigoBarra;
    
    //Constructores
    public DetalleFactura(){
        
    }
     public DetalleFactura(int idDetalleFactura, String numAutorizacion, int cantidad, int idProducto, String codigoBarra) {
        this.idDetalleFactura = idDetalleFactura;
        this.numAutorizacion = numAutorizacion;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
        this.codigoBarra = codigoBarra;
    }
    //Getter y Setter

    public int getIdDetalleFactura() {
        return idDetalleFactura;
    }

    public void setIdDetalleFactura(int idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public String getNumAutorizacion() {
        return numAutorizacion;
    }

    public void setNumAutorizacion(String numAutorizacion) {
        this.numAutorizacion = numAutorizacion;
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

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    
}
