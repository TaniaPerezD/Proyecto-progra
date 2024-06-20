/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
public class ProductosDao {
     ConeBD conn = new ConeBD();
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     
    //Funcion para insertar productos en la base de datos
    public boolean registrar(Producto pro) {
        String sql = "INSERT INTO PRODUCTO (codigo_barra,nombre,descripcion,precio_compra,precio_venta,descuento,stock_minimo,stock_maximo,stock_actual,imagen,fecha_caducidad,fecha_ingreso,marca,industria,area,estanteria,almacen,estado,id_subcategoria) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, NOW(), ?, ?, ?, ?, ?,?,?)";
        
       
        Connection connection = conn.conectar();

        if(connection != null){
            try {
                pst = connection.prepareStatement(sql);

                pst.setString(1, pro.getCodigoBarra());
                pst.setString(2, pro.getNombre());
                pst.setString(3, pro.getDescripcion());
                pst.setDouble(4, pro.getPrecioCompra());
                pst.setDouble(5, pro.getPrecioVenta());
                pst.setDouble(6, pro.getDescuento());
                pst.setInt(7, pro.getStockMinimo());
                pst.setInt(8, pro.getStockMaximo());
                pst.setInt(9, pro.getStockActual());
                pst.setString(10, pro.getImagen());
                pst.setDate(11, new java.sql.Date(pro.getFechaCaducidad().getTime())); 
                pst.setString(12, pro.getMarca());
                pst.setString(13, pro.getIndustria());
                pst.setString(14, pro.getArea());
                pst.setString(15, pro.getEstanteria());
                pst.setString(16, pro.getAlmacen());
                pst.setString(17, pro.getEstado());
                pst.setInt(18, pro.getIdSubcategoria());
                

                pst.execute();
                //pst.close(); 
                return true;
            //} catch (Exception ex) {
                 //ex.printStackTrace();
            //} //finally {
            //try {
                //if (conn != null) {
                    //connection.close();
                //}
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
            //}
        }  
        return false;
    }

    /*public List listaProducto(String valor){
        List<Producto> listaProd = new ArrayList();
        String sql = "SELECT * FROM PRODUCTO ORDER BY estado ASC ";
        String buscar = "SELECT * FROM PRODUCTO WHERE codigo_barra LIKE '%" + valor + "%' OR nombre LIKE '%" + valor + "%' ";
        try {
           Connection connection = conn.conectar();
           if(valor.equalsIgnoreCase("")){
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
           }else{
               pst = con.prepareStatement(buscar);
               rs = pst.executeQuery();
           }
           
           while(rs.next()){
              Producto produc = new Producto();
              produc.setIdProducto(rs.getInt("id_producto"));
              produc.setCodigoBarra(rs.getString("codigo_barra"));
              produc.setNombre(rs.getString("nombre"));
              produc.setCodigoBarra(rs.getString("descripcion"));
              produc.setCodigoBarra(rs.getString("precio_compra"));
              produc.setCodigoBarra(rs.getString("precio_venta"));
              produc.setNombre(rs.getString("descuento"));
              produc.setCodigoBarra(rs.getString("stock_minimo"));
              produc.setCodigoBarra(rs.getString("stock_maximo"));
              produc.setCodigoBarra(rs.getString("stock_actual"));
              produc.setCodigoBarra(rs.getString("imagen"));
              produc.setCodigoBarra(rs.getString("fecha_caducidad"));
              produc.setCodigoBarra(rs.getString("fecha_ingreso"));
              produc.setCodigoBarra(rs.getString("marca"));
              produc.setCodigoBarra(rs.getString("industria"));
              produc.setCodigoBarra(rs.getString("area"));
              produc.setCodigoBarra(rs.getString("marca"));
              produc.setCodigoBarra(rs.getString("industria"));
              produc.setCodigoBarra(rs.getString("area"));
              listaProd.add(produc);
           }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listaProd;
    }*/
    
    //Metodo para buscar
    public Producto buscar(String codigo){
        Producto produc = new Producto();
        String sql = "SELECT * FROM PRODUCTO WHERE codigo_barra = "+codigo;
        try{
            con = conn.conectar();
            pst =con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                produc.setIdProducto(rs.getInt(1));
                produc.setCodigoBarra(rs.getString("codigo_barra"));
                produc.setNombre(rs.getString("nombre"));
                produc.setCodigoBarra(rs.getString("descripcion"));
                produc.setCodigoBarra(rs.getString("precio_compra"));
                produc.setCodigoBarra(rs.getString("precio_venta"));
                produc.setNombre(rs.getString("descuento"));
                produc.setCodigoBarra(rs.getString("stock_minimo"));
                produc.setCodigoBarra(rs.getString("stock_maximo"));
                produc.setCodigoBarra(rs.getString("stock_actual"));
                produc.setCodigoBarra(rs.getString("imagen"));
                produc.setCodigoBarra(rs.getString("fecha_caducidad"));
                produc.setCodigoBarra(rs.getString("fecha_ingreso"));
                produc.setCodigoBarra(rs.getString("marca"));
                produc.setCodigoBarra(rs.getString("industria"));
                produc.setCodigoBarra(rs.getString("area"));
                produc.setCodigoBarra(rs.getString("marca"));
                produc.setCodigoBarra(rs.getString("industria"));
                produc.setCodigoBarra(rs.getString("area"));
               
            }
        }catch(Exception e){
            
        }
        return produc;
    }
}
    
    

