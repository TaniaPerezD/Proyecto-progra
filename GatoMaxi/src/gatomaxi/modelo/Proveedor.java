/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Proveedor implements Abm{
    public int idProveedor;
    public String nombre;
    public String direccion;
    public int telefono;
    public String email;
    public String tipoPersona;
    public String razonSocial;
    public String cedula;
    public double calificacion;
    
    //constructores
    public Proveedor(){
        
    }

    public Proveedor(int idProveedor, String nombre, String direccion, int telefono, String email, String tipoPersona, String razonSocial, String cedula, double calificacion) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.tipoPersona = tipoPersona;
        this.razonSocial = razonSocial;
        this.cedula = cedula;
        this.calificacion = calificacion;
    }
    
    //Getter y Setter

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    // METODOS
    //Funcion para insertar productos en la base de datos
    public void altas() { 
        ResultSet rs = null;
        String sql = "INSERT INTO PROVEEDOR (nombre,direccion,telefono,email,tipo_persona,razon_social,cedula_ruc,calificacion) VALUES (?,?,?,?,?,?,?,?);";
        
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if(connection != null){
            try {
                PreparedStatement pst = connection.prepareStatement(sql);

                pst.setString(1, nombre);
                pst.setString(2, direccion);
                pst.setInt(3, telefono);
                pst.setString(4, email);
                pst.setString(5, tipoPersona);
                pst.setString(6, razonSocial);
                pst.setString(7, cedula); 
                pst.setDouble(8, calificacion);

                rs = pst.executeQuery();
                rs.close();
                pst.close(); 
                
            } catch (Exception ex) {
                 ex.printStackTrace();
            } finally {
            try {
                if (conn != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                }
            }
        }  
    }
    
    //Funcion para modificaciones
    public void modificaciones(){
        //Aqui ponen el codigo de modificaciones
        
        
    }
    
    //Funcion para eliminar productos
    public void bajas(){
        //Aqui ponen el codigo de modificaciones
        
        
    }
            
}
