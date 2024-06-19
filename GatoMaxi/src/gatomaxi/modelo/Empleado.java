/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Empleado implements Abm{
    private int id;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String email;
    private String contra;
    private String rol;
    private Date fecha_con;
    private String direccion;
    private String usu;
    private String estado;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String ap_materno, String ap_paterno, String email, String contra, String rol, Date fecha_con, String direccion, String usu, String estado) {
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
        this.estado = estado;
    }

    public Empleado(String nombre, String ap_materno, String ap_paterno, String email, String contra, String rol, Date fecha_con, String direccion, String usu, String estado) {
        this.nombre = nombre;
        this.ap_materno = ap_materno;
        this.ap_paterno = ap_paterno;
        this.email = email;
        this.contra = contra;
        this.rol = rol;
        this.fecha_con = fecha_con;
        this.direccion = direccion;
        this.usu = usu;
        this.estado = estado;
    }
    ///

    public Empleado(String nombre, String ap_paterno, String ap_materno, String email, String contra, String rol, Date fecha_con, String direccion, String usu) {
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
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

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
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

    public Date getFecha_con() {
        return fecha_con;
    }

    public void setFecha_con(Date fecha_con) {
        this.fecha_con = fecha_con;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    //METODOS
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
                connection.close();
            } catch (Exception ex) {
                 ex.printStackTrace();
            }


        } else{
             System.out.println("No se pudo establecer la conexión");
        }


        return rol;
    }
    
    // METODOS
    //Funcion para insertar empleados en la base de datos
   public void altas() { 
    String sql = "INSERT INTO EMPLEADO (nombre, ap_paterno, ap_materno, email, contrasenia, rol, fecha_contratacion, direccion, usuario, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    
    ConeBD conn = new ConeBD();
    try (Connection connection = conn.conectar();
         PreparedStatement pst = connection.prepareStatement(sql)) {

        if (connection != null) {
            pst.setString(1, nombre);
            pst.setString(2, ap_paterno);
            pst.setString(3, ap_materno);
            pst.setString(4, email);
            pst.setString(5, contra);
            pst.setString(6, rol);
            pst.setDate(7, new java.sql.Date(fecha_con.getTime()));  
            pst.setString(8, direccion);
            pst.setString(9, usu);
            pst.setString(10, estado);

            
            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Empleado insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el empleado.");
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

    
    //Funcion para modificaciones
        
    public void modificaciones(Empleado empleado) {
    String sql = "UPDATE EMPLEADO SET nombre = ?, ap_paterno = ?, ap_materno = ?, email = ?, contrasenia = ?, rol = ?, direccion = ?, usuario = ? WHERE id_empleado = ?";

    ConeBD conn = new ConeBD();
    Connection connection = conn.conectar();

    if (connection != null) {
        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            pst.setString(1, empleado.getNombre());
            pst.setString(2, empleado.getAp_paterno());
            pst.setString(3, empleado.getAp_materno());
            pst.setString(4, empleado.getEmail());
            pst.setString(5, empleado.getContra());
            pst.setString(6, empleado.getRol());
            pst.setString(7, empleado.getDireccion());
            pst.setString(8, empleado.getUsu());
            pst.setInt(9, empleado.getId());

            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Empleado actualizado correctamente."+ empleado.getId());
            } else {
                System.out.println("No se pudo actualizar el empleado." + empleado.getId());
            }
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


    
    //Funcion para eliminar productos
        public void bajas(int id, String nuevo) {
         String query = "UPDATE EMPLEADO SET estado = ? WHERE id_empleado = ?";
         ConeBD conn = new ConeBD();
         Connection connection = conn.conectar();

         if (connection != null) {
             try (PreparedStatement pst = connection.prepareStatement(query)) {
                 pst.setString(1, nuevo);
                 pst.setInt(2, id);

                 int affectedRows = pst.executeUpdate();
                 if (affectedRows > 0) {
                     System.out.println("El estado se cambió con éxito.");
                 } else {
                     System.out.println("No se pudo cambiar el estado.");
                 }
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

       
    ///PARA SACAR DE LA BASE DE DATOS

    public Empleado(int id, String nombre, String ap_paterno, String email, String contra, String rol, String usu, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.email = email;
        this.contra = contra;
        this.rol = rol;
        this.usu = usu;
        this.estado = estado;
    }
///
     public Object[] paraLaTabla(int numFilas) {
        DateFormat df = new SimpleDateFormat("dd-MMMM-yyyy");
        String fecha_con_str = (fecha_con != null) ? df.format(fecha_con) : "Fecha no disponible";
        return new Object[]{false, id, this, ap_paterno, ap_materno, direccion, fecha_con_str, email, usu, contra, rol, estado};
    }
    ///

    @Override
    public String toString() {
        return nombre; 
    }
    
    
    
   
}


