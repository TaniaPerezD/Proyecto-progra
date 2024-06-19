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
    public int idProducto;
    public String codigo;
    public int cantidad;
    public String nombreProducto;
    public String descripcion;
    public double precioCompra;

    public ProductoDaoOfi(int idProducto, String codigo, int cantidad, String nombreProducto, String descripcion, double precioCompra) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
    }
    
    
    
    public ProductoDaoOfi(){
        
    }

    

    public ProductoDaoOfi(String codigo, int cantidad) {
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    
    
    //funcion para buscar
    public Producto todosLosDatos(String codigo) throws SQLException {
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
    
    public void buscar(String codigo_barra) {
        String query = "SELECT id_producto,nombre,descripcion,precio_compra FROM PRODUCTO WHERE codigo_barra = ? AND estado = ?";
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if (connection != null) {
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
                pst = connection.prepareStatement(query);
                pst.setString(1, codigo_barra);
                pst.setString(2, "Activo");
                
                rs = pst.executeQuery();

                if (rs.next()) {
                    // Leer los valores de las columnas que necesitamos
                    
                    idProducto = rs.getInt("id_producto");
                    nombreProducto = rs.getString("nombre_producto");
                    descripcion = rs.getString("descripcion");
                    precioCompra = rs.getDouble("precio_compra");
                    

                } else {
                    System.out.println("No se encontró ningún producto con el código de barras especificado o no cumple con las condiciones.");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
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

}