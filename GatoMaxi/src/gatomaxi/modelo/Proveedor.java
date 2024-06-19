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
    public String razonSocial;
    public String cedula;
    public String estado;
    
    //Constructores
    public Proveedor(){
        
    }

    public Proveedor(int idProveedor, String nombre, String direccion, int telefono, String email, String razonSocial, String cedula, String estado) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.cedula = cedula;
        this.estado = estado;
    }
    ////

    public Proveedor(int idProveedor, String nombre, String direccion, int telefono, String email, String razonSocial, String cedula) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.cedula = cedula;
    }
    ///

    public Proveedor(String nombre, String direccion, int telefono, String email, String razonSocial, String cedula, String estado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.cedula = cedula;
        this.estado = estado;
    }
    
    //Getter y setter'
    ///

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    // METODOS
    //Funcion para insertar productos en la base de datos
    public void altas() { 
        
        String sql = "INSERT INTO PROVEEDOR (nombre,direccion,telefono,email,razon_social,cedula_ruc,estado) VALUES (?,?,?,?,?,?,?);";
        
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if(connection != null){
            try {
                PreparedStatement pst = connection.prepareStatement(sql);

                pst.setString(1, nombre);
                pst.setString(2, direccion);
                pst.setInt(3, telefono);
                pst.setString(4, email);
                pst.setString(5, razonSocial);
                pst.setString(6, cedula); 
                pst.setString(7, estado);
                
                int affectedRows = pst.executeUpdate();
                if (affectedRows > 0) {
                    System.out.println("Proveedor insertado correctamente.");
                } else {
                    System.out.println("Proveedor pudo insertar el empleado.");
                }

                
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
    public void modificaciones(Proveedor proveedor) {
    // Aquí ponen el código de modificaciones
    
    String sql = "UPDATE PROVEEDOR SET nombre=?, direccion=?, telefono=?, email=?, razon_social=?, cedula_ruc=? WHERE id_proveedor=?";
    
    ConeBD conn = new ConeBD();
    Connection connection = conn.conectar();

    if (connection != null) {
        PreparedStatement pst = null;
        try {
            pst = connection.prepareStatement(sql);

            pst.setString(1, proveedor.getNombre());
            pst.setString(2, proveedor.getDireccion());
            pst.setInt(3, proveedor.getTelefono());
            pst.setString(4, proveedor.getEmail());
            pst.setString(5, proveedor.getRazonSocial());
            pst.setString(6, proveedor.getCedula()); 
            pst.setInt(7, proveedor.getIdProveedor());

            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Proveedor actualizado correctamente. ID: " + proveedor.getIdProveedor());
            } else {
                System.out.println("No se pudo actualizar el proveedor. ID: " + proveedor.getIdProveedor());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (connection != null) {
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
        
    String query = "UPDATE proveedor SET estado = ? WHERE id_proveedor = ?";
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
    ///TABLAS
    public Object[] paraLaTabla(int numFilas){
        return new Object[]{false,idProveedor,this,direccion,telefono,email,razonSocial,cedula,estado};
    }
    //

    @Override
    public String toString() {
        return nombre;
    }
    
            
}
