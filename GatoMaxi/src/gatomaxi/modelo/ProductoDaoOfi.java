/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;
import gatomaxi.modelo.ConeBD;
import gatomaxi.modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class ProductoDaoOfi {
    /*public List<Producto> todoParaTabla() throws SQLException {
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet r = null;
        List<Producto> lista = new ArrayList<>();
        
        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();
            String query = "SELECT id_empleado, nombre, ap_paterno, rol, email, usuario, contrasenia, estado FROM empleado";
            pr = conn.prepareStatement(query);
            r = pr.executeQuery();
            
            while (r.next()) {
                int id = r.getInt("id_empleado");
                String nom = r.getString("nombre");
                String ap = r.getString("ap_paterno");
                String rol = r.getString("rol");
                String correo = r.getString("email");
                String usu = r.getString("usuario");
                String contra = r.getString("contrasenia");
                String estado = r.getString("estado");

                lista.add(new Empleado(id, nom, ap, correo, contra, rol, usu, estado));
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
    
    public List<Empleado> Buscar(String b) throws SQLException {
    Connection conn = null;
    PreparedStatement pr = null;
    ResultSet r = null;
    List<Empleado> lista = new ArrayList<>();
    
    try {
        ConeBD c = new ConeBD();
        conn = c.conectar();
        String query = "SELECT id_empleado, nombre, ap_paterno, rol, email, usuario, contrasenia, estado "
                     + "FROM empleado "
                     + "WHERE nombre ILIKE ? "
                     + "OR estado ILIKE ?";
        
        pr = conn.prepareStatement(query);
        pr.setString(1, "%" + b + "%");
        pr.setString(2, "%" + b + "%");
        r = pr.executeQuery();
        
        while (r.next()) {
            int id = r.getInt("id_empleado");
            String nom = r.getString("nombre");
            String ap = r.getString("ap_paterno");
            String rol = r.getString("rol");
            String correo = r.getString("email");
            String usu = r.getString("usuario");
            String contra = r.getString("contrasenia");
            String estado = r.getString("estado");

            lista.add(new Empleado(id, nom, ap, correo, contra, rol, usu, estado));
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
}*/
    public Producto todosLosDatos(String codigo) throws SQLException{
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet r = null;
        Producto prod = new Producto();
        
        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();
            String query = "SELECT id_producto,nombre,descripcion,precio_compra FROM producto WHERE codigo_barra = ?";
            pr = conn.prepareStatement(query);
            pr.setString(1, codigo); 
            r = pr.executeQuery();
            
            while (r.next()) {
                int i = r.getInt("id_producto");
                String nom = r.getString("nombre");
                String descr = r.getString("descripcion");
                Double precio = r.getDouble("precio_compra");

                prod = new Producto(i,nom,descr,precio) ;
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
        
        return prod;
        
    }

}