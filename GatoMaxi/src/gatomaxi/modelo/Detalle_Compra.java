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
    private int id; // id_Detalle_Compra
	private int id_compra;
	private String codigo_barra;
	private int cantidad;
	
	public Detalle_Compra(int id, int id_compra, String codigo_barra, int cantidad) {
		this.id = id;
		this.id_compra = id_compra;
		this.codigo_barra = codigo_barra;
		this.cantidad = cantidad;
	}
	public int getId_detalle_compra() {
		return id;
	}
	public void setId_detalle_compra(int id) {
		this.id = id;
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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}

