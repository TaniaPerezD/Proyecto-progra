/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pdmor
 */
public class ConeBD {
     public String jdbcURL="jdbc:postgresql://127.0.0.1:9210/supermercado";
    private static final String USER = "postgres";
    private static final String PASSWORD = "bichito"; 
    ///
    public Connection conectar(){
        Connection conn = null; 
        
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(jdbcURL, USER, PASSWORD);
            System.out.println("ci");
            
        } catch (Exception e) {
            System.out.println("nu "+e);
            
        }
        return conn; 
    }
    
}
