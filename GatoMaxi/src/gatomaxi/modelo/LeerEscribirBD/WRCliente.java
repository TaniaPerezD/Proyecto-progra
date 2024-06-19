/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo.LeerEscribirBD;

import gatomaxi.modelo.Cliente;
import gatomaxi.modelo.ConeBD;
import gatomaxi.modelo.Empleado;

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
public class WRCliente {
    
     public List<Cliente> todoParaTabla() throws SQLException {
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet r = null;
        List<Cliente> lista = new ArrayList<>();
        
        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();
            String query = "SELECT * FROM cliente";
            pr = conn.prepareStatement(query);
            r = pr.executeQuery();
            
            while (r.next()) {
                int id = r.getInt("id_cliente");
                String nit = r.getString("nit");
                int telefono = r.getInt("telefono");
                String correo  = r.getString("email");
                String razon = r.getString("razon_social");
                String estado = r.getString("estado");

                lista.add(new Cliente(id, nit, telefono, correo, razon, estado));
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
    

/////
public List<Cliente> Buscar(String b) throws SQLException {
    Connection conn = null;
    PreparedStatement pr = null;
    ResultSet r = null;
    List<Cliente> lista = new ArrayList<>();
    
    try {
        ConeBD c = new ConeBD();
        conn = c.conectar();
        String query = "SELECT * "
                     + "FROM cliente "
                     + "WHERE nit ILIKE ? "
                     + "OR razon_social ILIKE ?";
        
        pr = conn.prepareStatement(query);
        pr.setString(1, "%" + b + "%");
        pr.setString(2, "%" + b + "%");
        r = pr.executeQuery();
        
        while (r.next()) {
            int id = r.getInt("id_cliente");
                String nit = r.getString("nit");
                int telefono = r.getInt("telefono");
                String correo  = r.getString("email");
                String razon = r.getString("razon_social");
                String estado = r.getString("estado");

                lista.add(new Cliente(id, nit, telefono, correo, razon, estado));
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
//
 public Cliente todosLosDatos(int i) throws SQLException {
    Connection conn = null;
    PreparedStatement pr = null;
    ResultSet r = null;
    Cliente datos = null; 
    
    try {
        ConeBD c = new ConeBD();
        conn = c.conectar();
        String query = "SELECT * FROM cliente WHERE id_cliente = ?";
        pr = conn.prepareStatement(query);
        pr.setInt(1, i);  
        r = pr.executeQuery();
        
        if (r.next()) {
            int id = r.getInt("id_cliente");
            String nit = r.getString("nit");
            int telefono = r.getInt("telefono");
            String correo = r.getString("email");
            String razon = r.getString("razon_social");
            
            
            datos = new Cliente(id, nit, telefono, correo, razon);
        } else {
            
            datos = new Cliente(); 
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
