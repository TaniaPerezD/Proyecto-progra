/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Venta {
    public String codigo;
    public int cantidad;
    public String nombreProducto;
    public int stockActua;
    public int stockMin;
    public double precioUnitario;
    
     //Constructores
    public Venta(String codigo,int cantidad){
        this.codigo = codigo;
        this.cantidad = cantidad;
    }
    
   
    
    //Getter y Setter

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

    public int getStockActua() {
        return stockActua;
    }

    public void setStockActua(int stockActua) {
        this.stockActua = stockActua;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
    //Funcion para verificar producto
    public void buscar(String codigo_barra) {
        String query = "SELECT * FROM PRODUCTO WHERE codigo_barra = ? AND stock_actual > stock_minimo AND stock_minimo < ?";
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if (connection != null) {
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
                pst = connection.prepareStatement(query);
                pst.setString(1, codigo);
                pst.setInt(2, cantidad);
                
                rs = pst.executeQuery();

                if (rs.next()) {
                    // Leer los valores de las columnas que necesitamos
                    nombreProducto = rs.getString("nombre_producto");
                    stockActua = rs.getInt("stock_actual");
                    stockMin = rs.getInt("stock_minimo");
                    precioUnitario = rs.getDouble("precio_unitario");
                    
                    System.out.println("Producto encontrado: " + nombreProducto);
                    System.out.println("Stock actual: " + stockActua);
                    System.out.println("Stock mínimo: " + stockMin);
                    System.out.println("Precio Unitario: " + precioUnitario);
                    

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
    
    
    