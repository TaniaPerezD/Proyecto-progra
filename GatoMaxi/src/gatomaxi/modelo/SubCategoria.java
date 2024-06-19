/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SubCategoria {
    public int idSubcategoria;
    public String nombre;
    public int idCategoria;
    
    //Constructores
    public SubCategoria(){
        
    }

    public SubCategoria(int idSubcategoria, String nombre, int idCategoria) {
        this.idSubcategoria = idSubcategoria;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
    }
    
    //Getter y Setter

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

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    ///PARA LAS TABLAS
    public void nuevaSubCategoria(String nomCategoria, String nomSubcategoria) {
    Connection conn = null;
    ResultSet resultSet = null;
    PreparedStatement categoriaStmt = null;
    PreparedStatement subcategoriaStmt = null;

    try {
        ConeBD c = new ConeBD();
        conn = c.conectar();

        // Consulta para obtener el ID de la categoría
        categoriaStmt = conn.prepareStatement("SELECT id_categoria FROM categoria WHERE nombre = ?");
        categoriaStmt.setString(1, nomCategoria);
        resultSet = categoriaStmt.executeQuery();

        if (resultSet.next()) {
            int categoriaId = resultSet.getInt("id_categoria");

            // Insertar subcategoría
            subcategoriaStmt = conn.prepareStatement("INSERT INTO subcategoria (nombre, id_categoria) VALUES (?, ?)");
            subcategoriaStmt.setString(1, nomSubcategoria);
            subcategoriaStmt.setInt(2, categoriaId);

            int rowsAffected = subcategoriaStmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Subcategoría insertada correctamente.");
            } else {
                System.out.println("No se pudo insertar la subcategoría.");
            }
        } else {
            System.out.println("Categoría no encontrada.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Cerrar ResultSet
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Cerrar PreparedStatements
        if (categoriaStmt != null) {
            try {
                categoriaStmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (subcategoriaStmt != null) {
            try {
                subcategoriaStmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Cerrar Connection
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

        
        
}

    

