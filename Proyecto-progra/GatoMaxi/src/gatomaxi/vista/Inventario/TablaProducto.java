package gatomaxi.vista.Inventario;

import com.formdev.flatlaf.FlatClientProperties;

import com.formdev.flatlaf.extras.FlatSVGIcon;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import gatomaxi.modelo.ConeBD;
import gatomaxi.modelo.Empleado;
import gatomaxi.modelo.LeerEscribirBD.WREmpleado;
import gatomaxi.modelo.Producto;
import gatomaxi.vista.VentanaAdmin;
import gatomaxi.vista.tablas.CentradoColu;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import raven.popup.DefaultOption;
import raven.popup.GlassPanePopup;
import raven.popup.component.SimplePopupBorder;
import raven.toast.Notifications;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

//
import gatomaxi.vista.tablas.Empleado.PanelAnd;
//import gatomaxi.vista.raven.GlassPanePopup;
import gatomaxi.vista.tablas.CheckTablas;
import java.sql.SQLException;

/**
 *
 * @author RAVEN
 */
public class TablaProducto extends javax.swing.JFrame {

    private Producto productoAux;

    public TablaProducto() {
        this.productoAux = new Producto();
        initComponents();
        init();
    }

    private void init() {
        GlassPanePopup.install(this);
        Notifications.getInstance().setJFrame(this);
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:25;"
                + "background:$Table.background");

        tabla.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "height:30;"
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background;"
                + "font:bold;");

        tabla.putClientProperty(FlatClientProperties.STYLE, ""
                + "rowHeight:70;"
                + "showHorizontalLines:true;"
                + "intercellSpacing:0,1;"
                + "cellFocusColor:$TableHeader.hoverBackground;"
                + "selectionBackground:$TableHeader.hoverBackground;"
                + "selectionForeground:$Table.foreground;");

        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "trackArc:999;"
                + "trackInsets:3,3,3,3;"
                + "thumbInsets:3,3,3,3;"
                + "background:$Table.background;");

        lbTitle.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +5;");

        txtBuscar.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Buscar...");
        txtBuscar.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("gatomaxi/icon/search.svg"));
        txtBuscar.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:15;"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0;"
                + "margin:5,20,5,20;"
                + "background:$Panel.background");

       tabla.getColumnModel().getColumn(0).setHeaderRenderer(new CheckTablas(tabla, 0));

       tabla.getTableHeader().setDefaultRenderer(new CentradoColu(tabla));
        try {
            ConeBD conexion = new ConeBD();
            conexion.conectar();
            cargarDatos();
            
        } catch (Exception e) {
        }
    }
    
   private void cargarDatos() {
    try {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        if (tabla.isEditing()) {
            tabla.getCellEditor().stopCellEditing();
        }
        modelo.setRowCount(0);
        ////CAMBIOS
        List<Object[]> datos = productoAux.cargarDatosProducto();
        for (Object[] fila : datos) {
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
   
    private void buscar(String txtBuscar) {
        
    try {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        if (tabla.isEditing()) {
            tabla.getCellEditor().stopCellEditing();
        }
        modelo.setRowCount(0);
        ///cambios
        List<Object[]> lista = productoAux.buscar(txtBuscar);
        for (Object[] fila : lista) {
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    } catch (Exception e) {
        e.printStackTrace();
    }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lbTitle = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SELECT", "ID", "Código de barras", "Nombre", "Descripción", "Precio Compra", "Precio venta", "Descuento", "Stock mínimo", "Stock máximo", "Stock actual", "Fecha de caducidad", "Fecha ingreso", "Marca", "Industria", "Área", "Estantería", "Álmacen", "Estado", "Subcategoría"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true, true, false, false, false, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.getTableHeader().setReorderingAllowed(false);
        scroll.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMaxWidth(30);
            tabla.getColumnModel().getColumn(1).setMaxWidth(30);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(30);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        lbTitle.setText("Empleado");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActivar.setText("Activar");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1628, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTitle))
                .addContainerGap(455, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActivar)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        //SE QUEDA
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        PanelProducto anadir = new PanelProducto();

        DefaultOption option = new DefaultOption() {
            @Override
            public boolean closeWhenClickOutside() {
                return true;
            }
        };

        String[] actions = new String[]{"Cancelar", "Guardar"};
        GlassPanePopup.showPopup(new SimplePopupBorder(anadir, "Añadir producto", actions, (pc, i) -> {
            if (i == 1) {
                try {
                    Producto nuevo = anadir.tomarDatos();
                    nuevo.altas();
                    pc.closePopup();
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, "¡Producto nuevo!");
                    cargarDatos();
                } catch (IllegalArgumentException e) {
                } catch (Exception e) {
                    e.printStackTrace();
                    Notifications.getInstance().show(Notifications.Type.ERROR, "Ocurrió un error al guardar el producto.");
                }
            } else {
                pc.closePopup();
            }
        }), option);
    }//GEN-LAST:event_btnAgregarActionPerformed
/*/*
    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
 
    }//GEN-LAST:event_cmdEditActionPerformed
/*
    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed

    }//GEN-LAST:event_cmdDeleteActionPerformed
*/
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        buscar(txtBuscar.getText().trim());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    List<Object[]> lista = seleccionDatos(); // Supongo que este método retorna una lista de Object[]
    if (!lista.isEmpty()) {
        if (lista.size() == 1) {
            // Obteniendo el objeto seleccionado
            Object[] datos = lista.get(0);
            
            // Crear el panel para añadir producto
            PanelProducto anadir = new PanelProducto();
            anadir.llenarCamposConDatos(datos); // Llenar los campos del panel con los datos del producto seleccionado
            
            // Configurar opciones para el popup
            DefaultOption option = new DefaultOption() {
                @Override
                public boolean closeWhenClickOutside() {
                    return true;
                }
            };

            String actions[] = new String[]{"Cancelar", "Editar"};
            GlassPanePopup.showPopup(new SimplePopupBorder(anadir, "Editar producto", actions, (pc, i) -> {
                if (i == 1) {
                    try {
                        // Tomar los datos del panel y crear un nuevo objeto Producto
                        Producto nuevo = anadir.tomarDatos();
                        nuevo.setIdProducto((int) datos[1]); // Asegurarse de mantener el ID del producto original

                        nuevo.modificacionesObjeto(nuevo);

                        pc.closePopup();
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, "¡Producto editado!");
                        cargarDatos();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Notifications.getInstance().show(Notifications.Type.ERROR, "Error al editar el producto.");
                    }
                } else {
                    pc.closePopup();
                }
            }), option);
        } else {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Solo puede editar un producto a la vez!");
        }
    } else {
        Notifications.getInstance().show(Notifications.Type.WARNING, "Seleccione un producto");
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    List<Object[]> lista = seleccionDatos();
    if (!lista.isEmpty()) {
        DefaultOption option = new DefaultOption() {
            @Override
            public boolean closeWhenClickOutside() {
                return true;
            }
        };

        String[] actions = new String[]{"Cancelar", "Borrar"};
        JLabel label = new JLabel("¿Está seguro de borrar " + lista.size() + " producto(s)?");
        label.setBorder(new EmptyBorder(0, 25, 0, 25));

        GlassPanePopup.showPopup(new SimplePopupBorder(label, "Borrado", actions, (pc, i) -> {
            if (i == 1) {
                // Borrar productos
                try {
                    for (Object[] datos : lista) {
                        int idProducto = (int) datos[1]; // Asegúrate de que esta es la posición correcta del ID
                        String estado = "Inactivo";
                        Producto p = new Producto();
                        p.bajas(idProducto, estado); // Marcar el producto como inactivo
                    }
                    pc.closePopup();
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, "Productos han sido borrados (desactivados)");
                    cargarDatos(); // Actualizar la tabla de productos
                } catch (Exception e) {
                    e.printStackTrace();
                    Notifications.getInstance().show(Notifications.Type.ERROR, "Error al borrar los productos");
                }
            } else {
                pc.closePopup();
            }
        }), option);
    } else {
        Notifications.getInstance().show(Notifications.Type.WARNING, "No hay productos seleccionados para eliminar");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        List<Object[]> lista = seleccionDatos();
    if (!lista.isEmpty()) {
        DefaultOption option = new DefaultOption() {
            @Override
            public boolean closeWhenClickOutside() {
                return true;
            }
        };

        String[] actions = new String[]{"Cancelar", "Borrar"};
        JLabel label = new JLabel("¿Está seguro de activar " + lista.size() + " producto(s)?");
        label.setBorder(new EmptyBorder(0, 25, 0, 25));

        GlassPanePopup.showPopup(new SimplePopupBorder(label, "Activar", actions, (pc, i) -> {
            if (i == 1) {
                // Borrar productos
                try {
                    for (Object[] datos : lista) {
                        int idProducto = (int) datos[1]; // Asegúrate de que esta es la posición correcta del ID
                        String estado = "Activo";
                        Producto p = new Producto();
                        p.bajas(idProducto, estado); // Marcar el producto como inactivo
                    }
                    pc.closePopup();
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, "Productos han sido activados");
                    cargarDatos(); // Actualizar la tabla de productos
                } catch (Exception e) {
                    e.printStackTrace();
                    Notifications.getInstance().show(Notifications.Type.ERROR, "Error al borrar los productos");
                }
            } else {
                pc.closePopup();
            }
        }), option);
    } else {
        Notifications.getInstance().show(Notifications.Type.WARNING, "No hay productos seleccionados para eliminar");
    }
    }//GEN-LAST:event_btnActivarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VentanaAdmin admin = new VentanaAdmin();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

  private List<Object[]> seleccionDatos() {
    List<Object[]> lista = new ArrayList<>();
    for (int i = 0; i < tabla.getRowCount(); i++) {
        if ((boolean) tabla.getValueAt(i, 0)) {
            Object[] datos = new Object[tabla.getColumnCount()];
            for (int j = 0; j < tabla.getColumnCount(); j++) {
                datos[j] = tabla.getValueAt(i, j);
            }
            lista.add(datos);
        }
    }
    return lista;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
