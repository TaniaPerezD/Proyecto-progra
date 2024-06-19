/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

/**
 *
 * @author usuario
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Compra {
    private int id_compra;
    private int id_proveedor;
    private Date fecha;
    
    
    
	public Compra(int id_compra, int id_proveedor, Date fecha) {
		this.id_compra = id_compra;
		this.id_proveedor = id_proveedor;
		this.fecha = fecha;
	}
	public int getId_compra() {
		return id_compra;
	}
	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
        
    
    
}
