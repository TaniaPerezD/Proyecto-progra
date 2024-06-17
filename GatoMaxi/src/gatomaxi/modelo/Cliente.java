/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cliente implements Abm{
    public int idCliente;
    public String nombre;
    public String apellidos;
    public String cedula;
    public int telefono;
    public String email;
    public String tipoPersona;
    public String razonSocial;
    
    //Constructores
    public Cliente(){
        
    }

    public Cliente(int idCliente, String nombre, String apellidos, String cedula, int telefono, String email, String tipoPersona, String razonSocial) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
        this.tipoPersona = tipoPersona;
        this.razonSocial = razonSocial;
    }
    
    //Getter y Setter

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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
    
    // METODOS
    //Funcion para insertar clientes en la base de datos
    public void altas() { 
        ResultSet rs = null;
        String sql = "INSERT INTO CLIENTE (nombre,apellidos,cedula_ruc,telefono,email,tipo_persona,razon_social) VALUES (?,?,?,?,?,?,?);";
        
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if(connection != null){
            try {
                PreparedStatement pst = connection.prepareStatement(sql);

                pst.setString(1, nombre);
                pst.setString(2, apellidos);
                pst.setString(3, cedula);
                pst.setInt(4, telefono);
                pst.setString(5, email);
                pst.setString(6, tipoPersona);
                pst.setString(7, razonSocial);               

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

    public void modificaciones(int idCliente,String nombre,String apellidos,String cedula,int telefono,String email,String tipoPersona,String razonSocial){
        //Aqui ponen el codigo de modificaciones
        String id = String.valueOf(idCliente);
        ResultSet rs = null;
        String sql = "UPDATE CLIENTE SET(nombre = ?, apellidos = ?, nit = ?, telefono = ?, email = ?, tipo_persona = ? ,razon_social = ?) WHERE id_cliente = "+id+" ;";
        
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if(connection != null){
            try {
                PreparedStatement pst = connection.prepareStatement(sql);

                pst.setString(1, nombre);
                pst.setString(2, apellidos);
                pst.setString(3, cedula);
                pst.setInt(4, telefono);
                pst.setString(5, email);
                pst.setString(6, tipoPersona);
                pst.setString(7, razonSocial);               

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
    
    //Funcion para eliminar productos
    public void bajas(int id, String nuevo){
        
    String query = "UPDATE cliente SET estado = ? WHERE id = ?";
    ConeBD conn = new ConeBD();
    Connection connection = conn.conectar();

    if (connection != null) {
        try {
            PreparedStatement pst = connection.prepareStatement(query);

            pst.setString(1, nuevo);
            pst.setInt(2, id);

            int bandera = pst.executeUpdate();

            if (bandera != 0) {
                System.out.println("El estado se cambió con éxito");
            }

            pst.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   }
}
