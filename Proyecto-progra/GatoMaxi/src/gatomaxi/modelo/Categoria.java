/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//
import java.sql.*;

public class Categoria {
    public int idCategoria;
    public String nombre;
    public String descripcion;
    
    //Constructores
    public Categoria(){
        
    }

    public Categoria(int idCategoria, String nombre, String descripcion) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    //Getter y Setter

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
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
    ////para el uso de las tablas
    public List<Object[]> cargarDatos() {
        List<Object[]> data = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet r = null;

        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();
            
            String query = "SELECT c.id_categoria, c.nombre AS categoria, c.descripcion AS descripcion_categoria, " +
                           "s.id_subcategoria, s.nombre AS subcategoria " + 
                           "FROM categoria c " +
                           "LEFT JOIN subcategoria s ON c.id_categoria = s.id_categoria";

            pr = conn.prepareStatement(query);
            r = pr.executeQuery();

            while (r.next()) {
                data.add(new Object[]{
                    r.getInt("id_categoria"),
                    r.getString("categoria"),
                    r.getString("descripcion_categoria"),
                    r.getInt("id_subcategoria"),
                    r.getString("subcategoria")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (r != null) r.close();
                if (pr != null) pr.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return data;
    }
    ///
     public List<String> nombresCategorias() {
        List<String> categorias = new ArrayList<>();
        ///
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet r = null;
        //
        

        try  {
            ConeBD c = new ConeBD();
            conn = c.conectar();
            //
            String query = "SELECT nombre FROM categoria";
            //
            pr = conn.prepareStatement(query);
            r = pr.executeQuery();

            while (r.next()) {
                categorias.add(r.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categorias;
    }
     ////
     public void nuevaCategoria(String nombreCategoria, String descripCate, String nombreSubcate) {
         ///
        Connection conn = null;
        
        //
         
        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();
            ////QUERYS PARA REALIZAR LAS CONSULTAS, SE NECESITA EL ID DE CATEGORIA PARA LA CONCORDANCIA DE SUBCATEGORIA
            PreparedStatement categoriaStmt = conn.prepareStatement("INSERT INTO categoria (nombre, descripcion) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);///me va retornar lo auto generado
            PreparedStatement subcategoriaStmt = conn.prepareStatement("INSERT INTO subcategoria (nombre,id_categoria) VALUES (?, ?)");

            conn.setAutoCommit(false); // Iniciar la transacción

            // Insertar categoría
            categoriaStmt.setString(1, nombreCategoria);
            categoriaStmt.setString(2, descripCate);
            categoriaStmt.executeUpdate();

            // Obtener el id de la categoría insertada
            ResultSet generatedKeys = categoriaStmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                int categoryId = generatedKeys.getInt(1);

                // Insertar subcategoría
                subcategoriaStmt.setString(1, nombreSubcate);
                subcategoriaStmt.setInt(2, categoryId);
                subcategoriaStmt.executeUpdate();
            }

            conn.commit(); // Confirmar la transacción

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     /////
     public List<Object[]> buscar(String a) {
        List<Object[]> data = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet r = null;

        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();
            String query = "SELECT c.id_categoria, c.nombre AS categoria, c.descripcion AS descripcion_categoria, " +
                           "s.id_subcategoria, s.nombre AS subcategoria " +
                           "FROM categoria c " +
                           "LEFT JOIN subcategoria s ON c.id_categoria = s.id_categoria";

            if (a != null && !a.isEmpty()) {
                query += " WHERE c.nombre LIKE ?";
            }

            pr = conn.prepareStatement(query);

            if (a != null && !a.isEmpty()) {
                pr.setString(1, "%" + a + "%");
            }

            r = pr.executeQuery();

            while (r.next()) {
                data.add(new Object[]{
                    r.getInt("id_categoria"),
                    r.getString("categoria"),
                    r.getString("descripcion_categoria"),
                    r.getInt("id_subcategoria"),
                    r.getString("subcategoria")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (r != null) r.close();
                if (pr != null) pr.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return data;
    }
     
    
}
