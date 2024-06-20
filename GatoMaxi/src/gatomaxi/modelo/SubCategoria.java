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
import java.util.ArrayList;
import java.util.List;

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
    ///
     public List<String> obtenerSubcategorias(String nombreCategoria) {
        List<String> subcategorias = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();

            String query = "SELECT subcategoria.nombre " +
                           "FROM subcategoria " +
                           "INNER JOIN categoria ON subcategoria.id_categoria = categoria.id_categoria " +
                           "WHERE categoria.nombre = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, nombreCategoria);
            rs = stmt.executeQuery();

            while (rs.next()) {
                subcategorias.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return subcategorias;
    }
     ////
        public int obtenerIdSubcategoria(String nombreSubcategoria) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idSubcategoria = -1; // Valor por defecto si no se encuentra

        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();

            String query = "SELECT id_subcategoria FROM subcategoria WHERE nombre = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, nombreSubcategoria);
            rs = stmt.executeQuery();

            if (rs.next()) {
                idSubcategoria = rs.getInt("id_subcategoria");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return idSubcategoria;
    }
    ///
    public String obtenerCategoriaDeSubcategoria(String subcategoria) {
        String categoria = null;
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();
        if (connection != null) {
            String sql = "SELECT c.nombre " +
                         "FROM CATEGORIA c " +
                         "INNER JOIN SUBCATEGORIA s ON c.id_categoria = s.id_categoria " +
                         "WHERE s.nombre = ?";
            try {
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.setString(1, subcategoria);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    categoria = rs.getString("nombre");
                }
                rs.close();
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return categoria;
    }    

        
        
}

    

