/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

public class Promociones {
    public int idPromociones;
    public double descuento;
    public String fechaInicio;
    public String fechaFin;
    public int idProducto;
    public String codigoBarra;
    
    //Constructor
    public Promociones(){
        
    }

    public Promociones(int idPromociones, double descuento, String fechaInicio, String fechaFin, int idProducto, String codigoBarra) {
        this.idPromociones = idPromociones;
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idProducto = idProducto;
        this.codigoBarra = codigoBarra;
    }
    
    //Getter y Setter

    public int getIdPromociones() {
        return idPromociones;
    }

    public void setIdPromociones(int idPromociones) {
        this.idPromociones = idPromociones;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
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
