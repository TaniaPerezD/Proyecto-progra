/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gatomaxi.modelo;

/**
 *
 * @author ADRIANA
 */
public class DetalleFactura {
    public int idDetalleFactura;
    public String numAutorizacion;
    public int cantidad;
    public int idProducto;
    public String codigoBarra;
    
    //Constructores
    public DetalleFactura(){
        
    }
     public DetalleFactura(int idDetalleFactura, String numAutorizacion, int cantidad, int idProducto, String codigoBarra) {
        this.idDetalleFactura = idDetalleFactura;
        this.numAutorizacion = numAutorizacion;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
        this.codigoBarra = codigoBarra;
    }
    //Getter y Setter

    public int getIdDetalleFactura() {
        return idDetalleFactura;
    }

    public void setIdDetalleFactura(int idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public String getNumAutorizacion() {
        return numAutorizacion;
    }

    public void setNumAutorizacion(String numAutorizacion) {
        this.numAutorizacion = numAutorizacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    
    public void buscar(String codigo_barra) {
        String query = "SELECT * FROM PRODUCTO WHERE codigo_barra = ? AND stock_actual > stock_minimo AND stock_minimo < ?";
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if (connection != null) {
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
                pst = connection.prepareStatement(query);
                pst.setString(1, codigo);
                pst.setInt(2, cantidad);
                
                rs = pst.executeQuery();

                if (rs.next()) {
                    // Leer los valores de las columnas que necesitamos
                    nombreProducto = rs.getString("nombre_producto");
                    stockActua = rs.getInt("stock_actual");
                    stockMin = rs.getInt("stock_minimo");
                    precioUnitario = rs.getDouble("precio_unitario");
                    
                    System.out.println("Producto encontrado: " + nombreProducto);
                    System.out.println("Stock actual: " + stockActua);
                    System.out.println("Stock mínimo: " + stockMin);
                    System.out.println("Precio Unitario: " + precioUnitario);
                    

                } else {
                    System.out.println("No se encontró ningún producto con el código de barras especificado o no cumple con las condiciones.");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
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
    }
   
}
