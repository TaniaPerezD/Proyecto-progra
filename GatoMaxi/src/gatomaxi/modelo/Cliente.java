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
    public String nit;
    public int telefono;
    public String email;
    public String razonSocial;
    public String estado;
    
    //Constructores
    public Cliente(){
        
    }

    public Cliente(int idCliente, String nit, int telefono, String email, String razonSocial, String estado) {
        this.idCliente = idCliente;
        this.nit = nit;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.estado = estado;
    }
    public int getIdCliente() { 
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getEstado() {
        return estado;
    }

    //Getter y setter
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // METODOS
    //Funcion para insertar clientes en la base de datos
    public void altas() { 
        ResultSet rs = null;
        String sql = "INSERT INTO CLIENTE (nit,telefono,email,razon_social,estado) VALUES (?,?,?,?,?);";
        
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if(connection != null){
            try {
                PreparedStatement pst = connection.prepareStatement(sql);

                pst.setString(1, nit);
                pst.setInt(2, telefono);
                pst.setString(3, email);
                pst.setString(4, razonSocial);
                pst.setString(5, estado);
                
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
