package gatomaxi.modelo.LeerEscribirBD;

import gatomaxi.modelo.ConeBD;
import gatomaxi.modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class WREmpleado {

    public List<Empleado> todoParaTabla() throws SQLException {
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet r = null;
        List<Empleado> lista = new ArrayList<>();
        
        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();
            String query = "SELECT id_empleado, nombre, ap_paterno, rol, email, usuario, contrasenia, estado FROM empleado";
            pr = conn.prepareStatement(query);
            r = pr.executeQuery();
            
            while (r.next()) {
                int id = r.getInt("id_empleado");
                String nom = r.getString("nombre");
                String ap = r.getString("ap_paterno");
                String rol = r.getString("rol");
                String correo = r.getString("email");
                String usu = r.getString("usuario");
                String contra = r.getString("contrasenia");
                String estado = r.getString("estado");

                lista.add(new Empleado(id, nom, ap, correo, contra, rol, usu, estado));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pr != null) {
                try {
                    pr.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return lista;
    }
    
    public List<Empleado> Buscar(String b) throws SQLException {
    Connection conn = null;
    PreparedStatement pr = null;
    ResultSet r = null;
    List<Empleado> lista = new ArrayList<>();
    
    try {
        ConeBD c = new ConeBD();
        conn = c.conectar();
        String query = "SELECT id_empleado, nombre, ap_paterno, rol, email, usuario, contrasenia, estado "
                     + "FROM empleado "
                     + "WHERE nombre ILIKE ? "
                     + "OR estado ILIKE ?";
        
        pr = conn.prepareStatement(query);
        pr.setString(1, "%" + b + "%");
        pr.setString(2, "%" + b + "%");
        r = pr.executeQuery();
        
        while (r.next()) {
            int id = r.getInt("id_empleado");
            String nom = r.getString("nombre");
            String ap = r.getString("ap_paterno");
            String rol = r.getString("rol");
            String correo = r.getString("email");
            String usu = r.getString("usuario");
            String contra = r.getString("contrasenia");
            String estado = r.getString("estado");

            lista.add(new Empleado(id, nom, ap, correo, contra, rol, usu, estado));
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw e;
    } finally {
        if (r != null) {
            try {
                r.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pr != null) {
            try {
                pr.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    return lista;
}
    public Empleado todosLosDatos(int id) throws SQLException{
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet r = null;
        Empleado datos = new Empleado();
        
        try {
            ConeBD c = new ConeBD();
            conn = c.conectar();
            String query = "SELECT * FROM empleado WHERE id_empleado = ?";
            pr = conn.prepareStatement(query);
            pr.setInt(1, id); 
            r = pr.executeQuery();
            
            while (r.next()) {
                int i = r.getInt("id_empleado");
                String nom = r.getString("nombre");
                String ap = r.getString("ap_paterno");
                String am = r.getString("ap_materno");
                Date fecha = r.getDate("fecha_contratacion");
                String dire = r.getString("direccion"); 
                String rol = r.getString("rol");
                String correo = r.getString("email");
                String usu = r.getString("usuario");
                String contra = r.getString("contrasenia");
                String estado = r.getString("estado");

                datos = new Empleado(i, nom, am, ap, correo, contra, rol, fecha, dire, usu, estado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pr != null) {
                try {
                    pr.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return datos;
        
    }

    public static void main(String[] args) throws SQLException {
        WREmpleado wrEmpleado = new WREmpleado();

        List<Empleado> empleados = wrEmpleado.todoParaTabla();
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}
