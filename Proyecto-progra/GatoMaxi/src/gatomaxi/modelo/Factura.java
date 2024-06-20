/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

/**
 *
 * @author usuario
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
public class Factura {
	private int num_autorizacion; //este es el id de la clase
	private int llave_dosificacion;
        private Date fecha_emision;
        private LocalTime hora_emision;
        private int num_factura;
        private int id_empleado;
	private int id_cliente;
	
	
	//Constructores
        public Factura(){
            
        }

        public Factura(int num_autorizacion, int llave_dosificacion, Date fecha_emision, LocalTime hora_emision, int num_factura, int id_empleado, int id_cliente) {
            this.num_autorizacion = num_autorizacion;
            this.llave_dosificacion = llave_dosificacion;
            this.fecha_emision = fecha_emision;
            this.hora_emision = hora_emision;
            this.num_factura = num_factura;
            this.id_empleado = id_empleado;
            this.id_cliente = id_cliente;
        }
        
        //Getter y setter

    public int getNum_autorizacion() {
        return num_autorizacion;
    }

    public void setNum_autorizacion(int num_autorizacion) {
        this.num_autorizacion = num_autorizacion;
    }

    public int getLlave_dosificacion() {
        return llave_dosificacion;
    }

    public void setLlave_dosificacion(int llave_dosificacion) {
        this.llave_dosificacion = llave_dosificacion;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public LocalTime getHora_emision() {
        return hora_emision;
    }

    public void setHora_emision(LocalTime hora_emision) {
        this.hora_emision = hora_emision;
    }

    public int getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(int num_factura) {
        this.num_factura = num_factura;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    ////Para las tablas
    public List<Object[]> cargarDatos() {
        List<Object[]> facturaDetalles = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;

        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();
            
            String query = "SELECT f.num_autorizacion, f.fecha_emision, f.hora_emision, c.razon_social AS cliente, " +
                       "e.nombre AS empleado, p.nombre AS producto, df.cantidad, " +
                       "((df.cantidad * p.precio_venta) - (p.descuento * 0.01 * df.cantidad * p.precio_venta)) AS total " +
                       "FROM FACTURA f " +
                       "JOIN CLIENTE c ON f.id_cliente = c.id_cliente " +
                       "JOIN EMPLEADO e ON f.id_empleado = e.id_empleado " +
                       "JOIN DETALLE_FACTURA df ON f.num_autorizacion = df.num_autorizacion " +
                       "JOIN PRODUCTO p ON df.id_producto = p.id_producto " +
                       "ORDER BY f.fecha_emision, f.hora_emision";

            pr = conn.prepareStatement(query);
            rs = pr.executeQuery();

            while (rs.next()) {
                while (rs.next()) {
                Object[] detalle = new Object[8]; // Incrementar el tamaño del arreglo a 8 para incluir fecha y hora
                detalle[0] = rs.getString("num_autorizacion");
                detalle[1] = rs.getDate("fecha_emision");
                detalle[2] = rs.getTime("hora_emision");
                detalle[3] = rs.getString("cliente");
                detalle[4] = rs.getString("empleado");
                detalle[5] = rs.getString("producto");
                detalle[6] = rs.getInt("cantidad");
                detalle[7] = rs.getDouble("total");
                facturaDetalles.add(detalle);
            }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pr != null) pr.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return facturaDetalles;
    }
    ///
    
        public List<Object[]> buscar(String a) {
         List<Object[]> data = new ArrayList<>();
         Connection conn = null;
         PreparedStatement pr = null;
         ResultSet r = null;

         try {
             ConeBD c = new ConeBD();
             conn = c.conectar();

             // Consulta SQL inicial
             String query = "SELECT f.num_autorizacion, f.fecha_emision, f.hora_emision, c.razon_social AS cliente, " +
                        "e.nombre AS empleado, p.nombre AS producto, df.cantidad, " +
                        "((df.cantidad * p.precio_venta) - (p.descuento * 0.01 * df.cantidad * p.precio_venta)) AS total " +
                        "FROM FACTURA f " +
                        "JOIN CLIENTE c ON f.id_cliente = c.id_cliente " +
                        "JOIN EMPLEADO e ON f.id_empleado = e.id_empleado " +
                        "JOIN DETALLE_FACTURA df ON f.num_autorizacion = df.num_autorizacion " +
                        "JOIN PRODUCTO p ON df.id_producto = p.id_producto";

             // Condición de búsqueda dinámica
             if (a != null && !a.isEmpty()) {
                 query += " WHERE f.num_autorizacion LIKE ? OR e.nombre LIKE ?";
             }

             // Ordenar por fecha y hora de emisión
             query += " ORDER BY f.fecha_emision, f.hora_emision";

             pr = conn.prepareStatement(query);

             // Establecer parámetros de búsqueda si hay filtro
             if (a != null && !a.isEmpty()) {
                 pr.setString(1, "%" + a + "%");
                 pr.setString(2, "%" + a + "%");
             }

             r = pr.executeQuery();

             // Procesar resultados y agregarlos a la lista de datos
             while (r.next()) {
                 data.add(new Object[]{
                     r.getString("num_autorizacion"),
                     r.getDate("fecha_emision"),
                     r.getTime("hora_emision"),
                     r.getString("cliente"),
                     r.getString("empleado"),
                     r.getString("producto"),
                     r.getInt("cantidad"),
                     r.getDouble("total")
                 });
             }
         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
             // Cerrar recursos en el orden inverso de apertura
             try {
                 if (r != null) r.close();
                 if (pr != null) pr.close();
                 if (conn != null) conn.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
         }

         // Devolver la lista de resultados
         return data;
     }
}

