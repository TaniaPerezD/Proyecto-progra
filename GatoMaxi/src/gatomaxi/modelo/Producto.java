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


public class Producto implements Abm{
    //static Connection conn = null;
    private int idProducto;
    private String codigoBarra;
    public String nombre;
    public String descripcion;
    public double precioCompra;
    public double precioVenta;
    public double descuento;
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
    public String estado;
    public int idSubcategoria;

    //Constructores
    public Producto(){
        
    }

    public Producto(int idProducto, String codigoBarra, String nombre, String descripcion, double precioCompra, double precioVenta, double descuento, int stockMinimo, int stockMaximo, int stockActual, String imagen, Date fechaCaducidad, Date fechaIngreso, String marca, String industria, String area, String estanteria, String almacen, String estado,int idSubcategoria) {
        this.idProducto = idProducto;
        this.codigoBarra = codigoBarra;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.descuento = descuento;
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
        this.estado = estado;
        this.idSubcategoria = idSubcategoria;
    }
    //constructo de sobrecarga

    public Producto(int idProducto, String nombre, String descripcion, double precioCompra) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
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

    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
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

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    // METODOS
    //Funcion para insertar productos en la base de datos
    public void altas() {
        //PreparedStatement stmt1 = null;
        //int id = 0; 
        ResultSet rs = null;
        String sql = "INSERT INTO PRODUCTO (codigo_barra,nombre,descripcion,precio_compra,precio_venta,descuento,stock_minimo,stock_maximo,stock_actual,imagen,fecha_caducidad,fecha_ingreso,marca,industria,area,estanteria,almacen,estado,id_subcategoria) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, NOW(), ?, ?, ?, ?, ?,?,?);";
        
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
                pst.setDouble(6, descuento);
                pst.setInt(7, stockMinimo);
                pst.setInt(8, stockMaximo);
                pst.setInt(9, stockActual);
                pst.setString(10, imagen);
                pst.setDate(11, new java.sql.Date(fechaCaducidad.getTime())); // Convierte java.util.Date a java.sql.Date
                pst.setString(12, marca);
                pst.setString(13, industria);
                pst.setString(14, area);
                pst.setString(15, estanteria);
                pst.setString(16, almacen);
                pst.setString(17, estado);
                pst.setInt(18, idSubcategoria);
                

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
    public void modificaciones(int idProducto,double precioCompra,double precioVenta,int stockActual,String imagen,Date fechaCaducidad,Date fechaIngreso,String marca,String industria,String area,String estanteria,String almacen){
        //Aqui ponen el codigo de modificaciones
        String idCambio = String.valueOf(idProducto);
        ResultSet rs = null;
        String sql = "UPDATE PRODUCTO ( precio_compra = ? ,precio_venta = ?,stock_actual = ?,fecha_caducidad=?,fecha_ingreso= NOW(),marca=?,industria=?,area=?,estanteria=?,almacen=?) WHERE id = "+idCambio+";";
        
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if(connection != null){
            try {
                PreparedStatement pst = connection.prepareStatement(sql);

                pst.setDouble(1, precioCompra);
                pst.setDouble(2, precioVenta);
                pst.setInt(3, stockActual);
                pst.setDate(4, new java.sql.Date(fechaCaducidad.getTime())); // Convierte java.util.Date a java.sql.Date
                pst.setString(5, marca);
                pst.setString(6, industria);
                pst.setString(7, area);
                pst.setString(8, estanteria);
                pst.setString(9, almacen);
                    

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
   
    //Funcion para eliminar productos
    public void bajas(int id, String nuevo){
        
    String query = "UPDATE producto SET estado = ? WHERE id = ?";
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
