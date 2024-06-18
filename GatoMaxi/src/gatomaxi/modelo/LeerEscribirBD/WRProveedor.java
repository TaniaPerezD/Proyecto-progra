/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo.LeerEscribirBD;

import gatomaxi.modelo.Cliente;
import gatomaxi.modelo.ConeBD;
import gatomaxi.modelo.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pdmor
 */
public class WRProveedor {
    public List<Proveedor> todoParaTabla() throws SQLException {
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet r = null;
        List<Proveedor> lista = new ArrayList<>();
        
        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();
            String query = "SELECT * FROM proveedor";
            pr = conn.prepareStatement(query);
            r = pr.executeQuery();
            
            while (r.next()) {
                int id = r.getInt("id_proveedor");
                String nombre = r.getString("nombre");
                String direccion= r.getString("direccion");
                int telefono   = r.getInt("telefono");
                String correo = r.getString("email");
                String razonSocial = r.getString("razon_social");
                String nit = r.getString("cedula_ruc");
                String estado = r.getString("estado");

                lista.add(new Proveedor(id, nombre, direccion, telefono, correo, razonSocial, nit, estado));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pr != null) {
                try {
                    pr.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return lista;
    }
    

//////
public List<Proveedor> Buscar(String b) throws SQLException {
    Connection conn = null;
    PreparedStatement pr = null;
    ResultSet r = null;
    List<Proveedor> lista = new ArrayList<>();
    
    try {
        ConeBD c = new ConeBD();
        conn = c.conectar();
        String query = "SELECT * "
                     + "FROM proveedor "
                     + "WHERE nombre ILIKE ? "
                     + "OR razon_social ILIKE ?";
        
        pr = conn.prepareStatement(query);
        pr.setString(1, "%" + b + "%");
        pr.setString(2, "%" + b + "%");
        r = pr.executeQuery();
        
        while (r.next()) {
                int id = r.getInt("id_proveedor");
                String nombre = r.getString("nombre");
                String direccion= r.getString("direccion");
                int telefono   = r.getInt("telefono");
                String correo = r.getString("email");
                String razonSocial = r.getString("razon_social");
                String nit = r.getString("cedula_ruc");
                String estado = r.getString("estado");

                lista.add(new Proveedor(id, nombre, direccion, telefono, correo, razonSocial, nit, estado));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pr != null) {
                try {
                    pr.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return lista;
    }
///////

    public Proveedor todosLosDatos(int i) throws SQLException {
    Connection conn = null;
    PreparedStatement pr = null;
    ResultSet r = null;
    Proveedor datos = null; 
    
    try {
        ConeBD c = new ConeBD();
        conn = c.conectar();
        String query = "SELECT * FROM proveedor WHERE id_proveedor = ?";
        pr = conn.prepareStatement(query);
        pr.setInt(1, i); 
        r = pr.executeQuery();
        
        if (r.next()) {
                int id = r.getInt("id_proveedor");
                String nombre = r.getString("nombre");
                String direccion= r.getString("direccion");
                int telefono   = r.getInt("telefono");
                String correo = r.getString("email");
                String razonSocial = r.getString("razon_social");
                String nit = r.getString("cedula_ruc");
                String estado = r.getString("estado");
                ////
                datos = new Proveedor(id, nombre, direccion, telefono, correo, razonSocial, nit, estado);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw e;
    } finally {
        if (r != null) {
            try {
                r.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pr != null) {
            try {
                pr.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    return datos;
}
    
    
}    