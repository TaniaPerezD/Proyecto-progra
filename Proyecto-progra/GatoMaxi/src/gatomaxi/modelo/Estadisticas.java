/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public class Estadisticas {
    public int idProducto;
    public int cantidad;
    public String nombreProducto;
    public Estadisticas(){
        
    }

    public Estadisticas(int idProducto, int cantidad, String nombre) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.nombreProducto = nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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
    
    
    
    
    public void buscar(String id) throws SQLException {
        
        String query = "SELECT id_producto, SUM(cantidad) as cantidad_vendida FROM detalle_factura GROUP BY id_prodcuto";
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();
         PreparedStatement pstProducto = null;
         ResultSet rsProducto = null;
        //System.out.println("CODIGO: "+codigo);
        
        if (connection != null) {
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
                pst = connection.prepareStatement(query);
                
                 rs = pst.executeQuery();
                 // Utilizamos un HashMap para almacenar los resultados
                    Map<Integer, Integer> contadorPorId = new HashMap<>();
                
                  // Iteramos sobre los resultados y almacenamos en el HashMap
                while (rs.next()) {
                    idProducto = rs.getInt("id_producto");
                    cantidad = rs.getInt("cantidad");
                    contadorPorId.put(idProducto, cantidad);
                }

                // Consulta para obtener el nombre del producto desde producto
                String queryProducto = "SELECT  nombre FROM producto WHERE id_producto IN (" +
                                        "SELECT DISTINCT id_producto FROM detalle_factura)";
                pstProducto = connection.prepareStatement(queryProducto);
                rsProducto = pstProducto.executeQuery();

                // Utilizamos un HashMap para almacenar los resultados (id_producto -> nombre del producto)
                Map<String, Integer> nombreProductoPorId = new HashMap<>();

                // Iteramos sobre los resultados de producto y almacenamos en el HashMap
                while (rsProducto.next()) {
                    idProducto = rsProducto.getInt("id_producto");
                    nombreProducto = rsProducto.getString("nombre");
                    nombreProductoPorId.put(nombreProducto,cantidad);
                }

                

            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (pst != null) pst.close();
                    if (rs != null) rs.close();
                    if (rsProducto != null) rsProducto.close();
                    if (pstProducto != null) pstProducto.close();
                    if (connection != null) connection.close();
                    
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
   
}
