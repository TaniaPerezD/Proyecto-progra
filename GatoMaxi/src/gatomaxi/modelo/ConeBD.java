package gatomaxi.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConeBD {
    private static final String jdbcURL = "jdbc:postgresql://127.0.0.1:9210/supermercado";
    private static final String USER = "postgres";
    private static final String PASSWORD = "bichito";
    
    public Connection conectar() {
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(jdbcURL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Driver PostgreSQL no encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos");
            e.printStackTrace();
        }

        return conn;
    }
}
