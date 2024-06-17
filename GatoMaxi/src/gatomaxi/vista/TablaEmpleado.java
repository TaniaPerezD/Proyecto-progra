package gatomaxi.vista;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import gatomaxi.modelo.ConeBD;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import raven.popup.DefaultOption;
import raven.popup.GlassPanePopup;
import raven.popup.component.SimplePopupBorder;
import raven.toast.Notifications;

//
import gatomaxi.vista.tablas.Empleado.PanelAnd;
//import gatomaxi.vista.raven.GlassPanePopup;
import gatomaxi.vista.tablas.CheckTablas;

/**
 *
 * @author RAVEN
 */
public class TablaEmpleado extends javax.swing.JFrame {

    //private ServiceEmployee service = new ServiceEmployee();

    public TablaEmpleado() {
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

        try {
            ConeBD conexion = new ConeBD();
            conexion.conectar();
            
        } catch (Exception e) {
        }
    }

   /*private void loadData() {
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            if (table.isEditing()) {
                table.getCellEditor().stopCellEditing();
            }
            model.setRowCount(0);
            List<ModelEmployee> list = service.getAll();
            for (ModelEmployee d : list) {
                model.addRow(d.toTableRow(table.getRowCount() + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    /*private void searchData(String search) {
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            if (table.isEditing()) {
                table.getCellEditor().stopCellEditing();
            }
            model.setRowCount(0);
            List<ModelEmployee> list = service.search(search);
            for (ModelEmployee d : list) {
                model.addRow(d.toTableRow(table.getRowCount() + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

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
        btnDetalles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SELECT", "ID", "Nombre", "Apellido Paterno", "Correo", "Usuario", "Contraseña", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, true
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
            tabla.getColumnModel().getColumn(1).setMaxWidth(40);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        lbTitle.setText("Empleado");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");

        btnEliminar.setText("Eliminar");

        btnDetalles.setText("Detalles");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
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
                        .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btnDetalles))
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
                .addGap(52, 52, 52)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
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
        PanelAnd create = new PanelAnd();
        //create.loadData(service, null);
        DefaultOption option = new DefaultOption() {
            @Override
            public boolean closeWhenClickOutside() {
                return true;
            }
        };
        String actions[] = new String[]{"Cancelar", "Guardar"};
        GlassPanePopup.showPopup(new SimplePopupBorder(create, "Añadir empleado", actions, (pc, i) -> {
            if (i == 1) {
                // save
                /*try {
                    service.create(create.getData());
                    pc.closePopup();
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, "Employee has been created");
                    loadData();
                } catch (Exception e) {
                    e.printStackTrace();
                }*/
            } else {
                pc.closePopup();
            }
        }), option);
    }//GEN-LAST:event_btnAgregarActionPerformed
/*/*
    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        List<ModelEmployee> list = getSelectedData();
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                ModelEmployee data = list.get(0);
                Create create = new Create();
                create.loadData(service, data);
                DefaultOption option = new DefaultOption() {
                    @Override
                    public boolean closeWhenClickOutside() {
                        return true;
                    }
                };
                String actions[] = new String[]{"Cancel", "Update"};
                GlassPanePopup.showPopup(new SimplePopupBorder(create, "Edit Employee [" + data.getName() + "]", actions, (pc, i) -> {
                    if (i == 1) {
                        // edit
                        try {
                            ModelEmployee dataEdit = create.getData();
                            dataEdit.setEmployeeId(data.getEmployeeId());
                            service.edit(dataEdit);
                            pc.closePopup();
                            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Employee has been updated");
                            loadData();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        pc.closePopup();
                    }
                }), option);
            } else {
                Notifications.getInstance().show(Notifications.Type.WARNING, "Please select only one employee");
            }
        } else {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Please select employee to edit");
        }
    }//GEN-LAST:event_cmdEditActionPerformed
/*
    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        List<ModelEmployee> list = getSelectedData();
        if (!list.isEmpty()) {
            DefaultOption option = new DefaultOption() {
                @Override
                public boolean closeWhenClickOutside() {
                    return true;
                }
            };
            String actions[] = new String[]{"Cancel", "Delete"};
            JLabel label = new JLabel("Are you sure to delete " + list.size() + " employee ?");
            label.setBorder(new EmptyBorder(0, 25, 0, 25));
            GlassPanePopup.showPopup(new SimplePopupBorder(label, "Confirm Delete", actions, (pc, i) -> {
                if (i == 1) {
                    // delete
                    try {
                        for (ModelEmployee d : list) {
                            service.delete(d.getEmployeeId());
                        }
                        pc.closePopup();
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, "Employee has been deleted");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    loadData();
                } else {
                    pc.closePopup();
                }
            }), option);
        } else {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Please select employee to delete");
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private List<ModelEmployee> getSelectedData() {
        List<ModelEmployee> list = new ArrayList<>();
        for (int i = 0; i < table.getRowCount(); i++) {
            if ((boolean) table.getValueAt(i, 0)) {
                ModelEmployee data = (ModelEmployee) table.getValueAt(i, 2);
                list.add(data);
            }
        }
        return list;
    }*/

    public static void main(String args[]) {
       FlatMacLightLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
