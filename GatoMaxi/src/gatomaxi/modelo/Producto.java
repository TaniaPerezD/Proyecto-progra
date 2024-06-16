/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gatomaxi.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


public class Producto {
    static Connection conn = null;
    private int idProducto;
    private String codigoBarra;
    public String nombre;
    public String descripcion;
    public double precioCompra;
    public double precioVenta;
    public int stockMinimo;
    public int stockMaximo;
    public int stockActual;
    public String imagen;
    public Date fechaCaducidad;
    public Date fechaIngreso;
    public String marca;
    public String industria;
    public String area;
    public String estanteria;
    public String almacen;
    public int idSubcategoria;

    //Constructores
    public Producto(){
        
    }

    public Producto(int idProducto, String codigoBarra, String nombre, String descripcion, double precioCompra, double precioVenta, int stockMinimo, int stockMaximo, int stockActual, String imagen, Date fechaCaducidad, Date fechaIngreso, String marca, String industria, String area, String estanteria, String almacen, int idSubcategoria) {
        this.idProducto = idProducto;
        this.codigoBarra = codigoBarra;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
        this.stockActual = stockActual;
        this.imagen = imagen;
        this.fechaCaducidad = fechaCaducidad;
        this.fechaIngreso = fechaIngreso;
        this.marca = marca;
        this.industria = industria;
        this.area = area;
        this.estanteria = estanteria;
        this.almacen = almacen;
        this.idSubcategoria = idSubcategoria;
    }

    
    //Getter y Setter

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        Producto.conn = conn;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(String estanteria) {
        this.estanteria = estanteria;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }
    
    
    // METODOS
    
    public static String verificarRol(String usuario, String contrasenia) {
    String rol = null;
    String sql = "SELECT rol FROM empleado WHERE usuario = ? AND contrasenia = ?";
    
    ConeBD conn = new ConeBD();
    Connection connection = conn.conectar();
    
    if(connection != null){
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setString(1, usuario);
            pst.setString(2, contrasenia);
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                rol = rs.getString("rol");
            }
            
            rs.close();
            pst.close(); 
        } catch (Exception ex) {
             ex.printStackTrace();
        }
        
        
    } else{
         System.out.println("No se pudo establecer la conexión");
    }
    
    
    return rol;
}

    //Funcion para insertar productos en la base de datos
    public void inserProducto() {
        //PreparedStatement stmt1 = null;
        //int id = 0; 
        ResultSet rs = null;
        String sql = "INSERT INTO producto (codigo_barra,nombre,descripcion,precio_compra,precio_venta,stock_minimo,stock_maximo,stock_actual,imagen,fecha_caducidad,fecha_ingreso,marca,industria,area,estanteria,almacen   ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW(), ?, ?, ?, ?, ?);";
        
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if(connection != null){
            try {
                PreparedStatement pst = connection.prepareStatement(sql);

                pst.setString(1, codigoBarra);
                pst.setString(2, nombre);
                pst.setString(3, descripcion);
                pst.setDouble(4, precioCompra);
                pst.setDouble(5, precioVenta);
                pst.setInt(6, stockMinimo);
                pst.setInt(7, stockMaximo);
                pst.setInt(8, stockActual);
                pst.setString(9, imagen);
                pst.setDate(10, new java.sql.Date(fechaCaducidad.getTime())); // Convierte java.util.Date a java.sql.Date
                pst.setString(11, marca);
                pst.setString(12, industria);
                pst.setString(13, area);
                pst.setString(14, estanteria);
                pst.setString(15, almacen);

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
}
