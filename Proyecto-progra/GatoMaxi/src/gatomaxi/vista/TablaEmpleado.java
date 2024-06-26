package gatomaxi.vista;

import com.formdev.flatlaf.FlatClientProperties;

import com.formdev.flatlaf.extras.FlatSVGIcon;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import gatomaxi.modelo.ConeBD;
import gatomaxi.modelo.Empleado;
import gatomaxi.modelo.LeerEscribirBD.WREmpleado;
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
public class TablaEmpleado extends javax.swing.JFrame {

    private WREmpleado empleados;

    public TablaEmpleado() {
        this.empleados = new WREmpleado();
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
        List<Empleado> lista = empleados.todoParaTabla();
        for (Empleado e : lista) {
            modelo.addRow(e.paraLaTabla(tabla.getRowCount() + 1));
        }
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
        List<Empleado> lista = empleados.Buscar(txtBuscar);
        for (Empleado e : lista) {
            modelo.addRow(e.paraLaTabla(tabla.getRowCount() + 1));
        }
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
                "SELECT", "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Dirección", "Fecha de contratación", "Correo", "Usuario", "Contraseña", "Rol", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, false, true, false, false, false, false, false
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
            tabla.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla.getColumnModel().getColumn(1).setMaxWidth(30);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(120);
            tabla.getColumnModel().getColumn(6).setResizable(false);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(9).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(10).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(11).setPreferredWidth(50);
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
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1520, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addContainerGap(1446, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(btnActivar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
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
        PanelAnd anadir = new PanelAnd();
       
        DefaultOption option = new DefaultOption() {
            @Override
            public boolean closeWhenClickOutside() {
                return true;
            }
        };
        String actions[] = new String[]{"Cancelar", "Guardar"};
        GlassPanePopup.showPopup(new SimplePopupBorder(anadir, "Añadir empleado", actions, (pc, i) -> {
            if (i == 1) {              
                try {
                    Empleado nuevo = new Empleado();
                    nuevo = anadir.tomarDatos();
                    nuevo.altas();
                    
                    pc.closePopup();
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, "¡Empleado nuevo!");
                    cargarDatos();
                } catch (Exception e) {
                    e.printStackTrace();
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
        List<Empleado> lista = seleccionDatos();
        if (!lista.isEmpty()) {
            if (lista.size() == 1) {
                // TENGO EL OBJETO
                Empleado editar = lista.get(0);
                PanelAnd anadir = new PanelAnd();
                // PARA EL ID
                int id = editar.getId();
                try {
                    Empleado mostrar = empleados.todosLosDatos(id);//los datos del empledao seleccionado, para llenar campos
                    if (mostrar != null) {
                        anadir.devolverDatos(mostrar);
                    } else {
                        Notifications.getInstance().show(Notifications.Type.WARNING, "Empleado no encontrado.");
                        return;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    Notifications.getInstance().show(Notifications.Type.ERROR, "Error al obtener los datos del empleado.");
                    return;
                }

                DefaultOption option = new DefaultOption() {
                    @Override
                    public boolean closeWhenClickOutside() {
                        return true;
                    }
                };
                String actions[] = new String[]{"Cancelar", "Editar"};
                GlassPanePopup.showPopup(new SimplePopupBorder(anadir, "Editar empleado", actions, (pc, i) -> {
                    if (i == 1) {
                        try {
                            Empleado nuevo = new Empleado();
                            nuevo = anadir.tomarDatos();///vuelve a tomar los datos
                            nuevo.setId(editar.getId());///para no perder el id

                            editar.modificaciones(nuevo);// y recien le envía los datos

                            pc.closePopup();
                            Notifications.getInstance().show(Notifications.Type.SUCCESS, "¡Empleado editado!");
                            cargarDatos();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        pc.closePopup();
                    }
                }), option);
            } else {
                Notifications.getInstance().show(Notifications.Type.WARNING, "Solo puede editar un empleado a la vez!");
            }
        } else {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Seleccione un empleado");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        List<Empleado> lista = seleccionDatos();
        if (!lista.isEmpty()) {
            DefaultOption option = new DefaultOption() {
                @Override
                public boolean closeWhenClickOutside() {
                    return true;
                }
            };
            String actions[] = new String[]{"Cancelar", "Borrar"};
            JLabel label = new JLabel("¿Está seguro de borrar  " + lista.size() + " empleado(s) ?");
            label.setBorder(new EmptyBorder(0, 25, 0, 25));
            GlassPanePopup.showPopup(new SimplePopupBorder(label,"Borrado", actions, (pc, i) -> {
                if (i == 1) {
                    // delete
                    try {
                        for (Empleado d : lista) {
                            int id = d.getId();
                            String estado= "Inactivo";
                            d.bajas(id, estado);
                            
                        }
                        pc.closePopup();
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, "Ha sido borrado (desactivado)");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    cargarDatos();
                } else {
                    pc.closePopup();
                }
            }), option);
        } else {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Seleccione un empleado");
        }
    

 
      
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
         List<Empleado> lista = seleccionDatos();
        if (!lista.isEmpty()) {
            DefaultOption option = new DefaultOption() {
                @Override
                public boolean closeWhenClickOutside() {
                    return true;
                }
            };
            String actions[] = new String[]{"Cancelar", "Guardar"};
            JLabel label = new JLabel("¿Está seguro de activar" + lista.size() + " empleado(s) ?");
            label.setBorder(new EmptyBorder(0, 25, 0, 25));
            GlassPanePopup.showPopup(new SimplePopupBorder(label,"Activar", actions, (pc, i) -> {
                if (i == 1) {
                    // delete
                    try {
                        for (Empleado d : lista) {
                            int id = d.getId();
                            String estado= "Activo";
                            d.bajas(id, estado);
                            
                        }
                        pc.closePopup();
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, "Ha sido activado");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    cargarDatos();
                } else {
                    pc.closePopup();
                }
            }), option);
        } else {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Seleccione un empleado");
        }
    }//GEN-LAST:event_btnActivarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VentanaAdmin admin = new VentanaAdmin();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private List<Empleado> seleccionDatos(){
        List<Empleado> lista = new ArrayList<>();
        for(int i = 0; i <tabla.getRowCount(); i++){
            if((boolean)tabla.getValueAt(i, 0)){
                Empleado datos = (Empleado)tabla.getValueAt(i, 2);
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
