/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author usuario
 */
public class Autogen_Autorizacion {
    
    public Autogen_Autorizacion(){
    
    }
    
    
    public String autogenerado(){
        String CADENA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz0123456789";
        int longitud=10;
        String generado="";
        do{
            generado="";
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<longitud;i++){
                double aleatorio = Math.random() *CADENA.length();
                int posicion= (int) aleatorio;
                char letra =CADENA.charAt(posicion);
                generado+=letra;
            }
            return generado;
        }while(verificarUnicidad(generado));
        
    }
    
    public boolean verificarUnicidad(String generado){
        String query = "SELECT * FROM factura WHERE num_autorizacion = ?";
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if (connection != null) {
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
                pst = connection.prepareStatement(query);
                pst.setString(1, generado);
                
                rs = pst.executeQuery();

                if (rs.next()) {
                    // Leer los valores de las columnas que necesitamos
                    return true;
                    

                } else {
                    System.out.println("No se encontró ningún producto con el código de barras especificado o no cumple con las condiciones.");
                    return false;
                
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (pst != null) {
                        pst.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        else{
            return false;
        }
    }    
    
}
