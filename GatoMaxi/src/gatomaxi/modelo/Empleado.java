/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Empleado {
    private int id;
    private String nombre;
    private String ap_materno;
    private String ap_paterno;
    private String email;
    private String contra;
    private String rol;
    private LocalDate fecha_con;
    private String direccion;
    private String usu;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String ap_materno, String ap_paterno, String email, String contra, String rol, LocalDate fecha_con, String direccion, String usu) {
        this.id = id;
        this.nombre = nombre;
        this.ap_materno = ap_materno;
        this.ap_paterno = ap_paterno;
        this.email = email;
        this.contra = contra;
        this.rol = rol;
        this.fecha_con = fecha_con;
        this.direccion = direccion;
        this.usu = usu;
    }

    public Empleado(String nombre, String ap_materno, String ap_paterno, String email, String contra, String rol, LocalDate fecha_con, String direccion, String usu) {
        this.nombre = nombre;
        this.ap_materno = ap_materno;
        this.ap_paterno = ap_paterno;
        this.email = email;
        this.contra = contra;
        this.rol = rol;
        this.fecha_con = fecha_con;
        this.direccion = direccion;
        this.usu = usu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getFecha_con() {
        return fecha_con;
    }

    public void setFecha_con(LocalDate fecha_con) {
        this.fecha_con = fecha_con;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usu;
    }

    public void setUsuario(String usu) {
        this.usu = usu;
    }

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

}
