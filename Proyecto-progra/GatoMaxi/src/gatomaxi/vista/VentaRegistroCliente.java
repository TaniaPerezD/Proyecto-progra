/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gatomaxi.vista;

import gatomaxi.modelo.Cliente;
import gatomaxi.modelo.Combo;
import gatomaxi.modelo.ConeBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import raven.toast.Notifications;

/**
 *
 * @author usuario
 */
public class VentaRegistroCliente extends javax.swing.JFrame {
    public String nit;
    public String razonSocial;
    public int telefono;
    public String email;
    public int idEmpleado;
    
    /**
     * Creates new form VentaRegistroCliente
     */
    public VentaRegistroCliente(int idEmpleado) {
        this.idEmpleado=idEmpleado;
        initComponents();
        
        llenarTabla();
        System.out.println("Se ha podido llenar los clientes");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AGREGAR = new javax.swing.JButton();
        RAZONSOCIAL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NIT = new javax.swing.JTextField();
        TELEFONO = new javax.swing.JTextField();
        EMAIL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        VERIFICAR = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NUEVAVENTA = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NUEVOCLIENTE = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setForeground(new java.awt.Color(255, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Producto", "Nombre Producto", "Cantidad", "Precio Unitacio"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jTable2.setForeground(new java.awt.Color(255, 102, 102));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Producto", "Nombre Producto", "Cantidad", "Precio Unitacio"
            }
        ));
        jTable2.setEnabled(false);
        jTable2.setRowHeight(25);
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(246, 190, 175));
        jPanel5.setForeground(new java.awt.Color(244, 159, 154));

        jLabel3.setBackground(new java.awt.Color(255, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel3.setText("Razon Social:");

        AGREGAR.setBackground(new java.awt.Color(245, 161, 128));
        AGREGAR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        AGREGAR.setForeground(new java.awt.Color(51, 51, 51));
        AGREGAR.setText("Agregar");
        AGREGAR.setEnabled(false);
        AGREGAR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });

        RAZONSOCIAL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RAZONSOCIAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAZONSOCIALActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel6.setText("NIT:");

        NIT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NITActionPerformed(evt);
            }
        });

        TELEFONO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TELEFONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TELEFONOActionPerformed(evt);
            }
        });

        EMAIL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMAILActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 153, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel7.setText("Telefono:");

        jLabel8.setBackground(new java.awt.Color(255, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel8.setText("Email:");

        VERIFICAR.setBackground(new java.awt.Color(245, 161, 128));
        VERIFICAR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        VERIFICAR.setForeground(new java.awt.Color(51, 51, 51));
        VERIFICAR.setText("Verificar");
        VERIFICAR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        VERIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VERIFICARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(129, 129, 129))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NIT, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AGREGAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VERIFICAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(EMAIL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TELEFONO, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RAZONSOCIAL, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RAZONSOCIAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(VERIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "NIT", "Razon Social", "Telefono", "Email", "Activo"
            }
        ));
        jTable.setEnabled(false);
        jTable.setRowHeight(25);
        jScrollPane3.setViewportView(jTable);

        jPanel1.setBackground(new java.awt.Color(244, 159, 154));
        jPanel1.setForeground(new java.awt.Color(244, 159, 154));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatomaxi/icon/user_icon.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        NUEVAVENTA.setBackground(new java.awt.Color(246, 190, 175));
        NUEVAVENTA.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        NUEVAVENTA.setForeground(new java.awt.Color(51, 51, 51));
        NUEVAVENTA.setText("Nueva Venta");
        NUEVAVENTA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NUEVAVENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVAVENTAActionPerformed(evt);
            }
        });

        SALIR.setBackground(new java.awt.Color(246, 190, 175));
        SALIR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        SALIR.setForeground(new java.awt.Color(51, 51, 51));
        SALIR.setText("SALIR");
        SALIR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatomaxi/icon/compra_icon.png"))); // NOI18N
        jLabel10.setText("jLabel5");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("CAJERO");

        NUEVOCLIENTE.setBackground(new java.awt.Color(246, 190, 175));
        NUEVOCLIENTE.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        NUEVOCLIENTE.setForeground(new java.awt.Color(51, 51, 51));
        NUEVOCLIENTE.setText("Registro de clientes");
        NUEVOCLIENTE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NUEVOCLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVOCLIENTEActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatomaxi/icon/User.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NUEVOCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NUEVAVENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUEVAVENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUEVOCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NUEVOCLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVOCLIENTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUEVOCLIENTEActionPerformed

    private void RAZONSOCIALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAZONSOCIALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RAZONSOCIALActionPerformed

    private void NITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NITActionPerformed

    private void TELEFONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TELEFONOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TELEFONOActionPerformed

    private void EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMAILActionPerformed

    private void NUEVAVENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVAVENTAActionPerformed
        // TODO add your handling code here:
        /*
        VentaRegistroProductos pantalla = new VentaRegistroProductos();
        */
        VentaRegistroProductos pantalla = new VentaRegistroProductos(idEmpleado);
        pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_NUEVAVENTAActionPerformed

    private void VERIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VERIFICARActionPerformed
        // TODO add your handling code here:
        verificarInformacion();
        
    }//GEN-LAST:event_VERIFICARActionPerformed

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
        // TODO add your handling code here:
        System.out.println(jTable.getRowCount());
        for(int i=0;i<jTable.getRowCount();i++){
            jTable.setValueAt(null, i, 0);
            jTable.setValueAt(null, i, 1);
            jTable.setValueAt(null, i, 2);
            jTable.setValueAt(null, i, 3);
            jTable.setValueAt(null, i, 4);
            jTable.setValueAt(null, i, 5);
        }
    
        System.out.println("se ha limpiado la tbala tabla");
        agregarClientes();
        Notifications.getInstance().show(Notifications.Type.SUCCESS,"Se ha logrado insertar");
        llenarTabla();
    }//GEN-LAST:event_AGREGARActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaRegistroCliente().setVisible(true);
            }
        });
    }
    */
    public void verificarInformacion(){
        try{
            if(!verificarNulidad()){
                Notifications.getInstance().show(Notifications.Type.ERROR,"Todos los campos deben estar llenados");
                System.out.println("Entra no nulidad");
            }
            else{
                if(!verificarEmail()){
                    Notifications.getInstance().show(Notifications.Type.ERROR,"El email intruducido no es corrrecto");
                }
                else{
                    telefono= Integer.parseInt(TELEFONO.getText());
                    nit=NIT.getText();
                    email= EMAIL.getText();
                    razonSocial = RAZONSOCIAL.getText();
                    AGREGAR.setEnabled(true);
                    Notifications.getInstance().show(Notifications.Type.SUCCESS,"Todos los valores son correctos");
                }
            }            
        }catch (Exception e){
            Notifications.getInstance().show(Notifications.Type.ERROR,"Telefono sola acepta valores numericos");
        }
    }
    public boolean verificarEmail(){
        char[] chars = EMAIL.getText().toCharArray();
		 
        for (char ch: chars) {
        	if(ch=='@') {
        		return true;
        	}
        }
        return false;
    }
    public boolean verificarNulidad(){
        if(NIT.getText().isEmpty()){
            return false;
        }
        if(TELEFONO.getText().isEmpty()){
            return false;
        }
        if(RAZONSOCIAL.getText().isEmpty()){
            return false;
        }
        if(EMAIL.getText().isEmpty()){
            return false;
        }
        return true;
    }
    
    public void agregarClientes(){
        /*
        String sql = "INSERT INTO CLIENTE (nit,telefono,email,razon_social,estado) VALUES (?,?,?,?,?);";
        
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();
        String estado ="Activo";
        if(connection != null){
            try {
                PreparedStatement pst = connection.prepareStatement(sql);

                pst.setString(1, nit);
                pst.setInt(2, telefono);
                pst.setString(3, email);
                pst.setString(4, razonSocial);
                pst.setString(5, estado);
                
                int affectedRows = pst.executeUpdate();
                if (affectedRows > 0) {
                    System.out.println("Cliente insertado correctamente.");
                } else {
                    System.out.println("Cliente pudo insertar el empleado.");
                }
                    
                    pst.close(); 

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }  
        */
        
        Cliente cliente = new Cliente(nit,telefono,email, razonSocial,"Activo");
        cliente.altas();
        
    }
    
    public void llenarTabla(){
        ArrayList <Cliente> listCliente =listarCliente();
        for(int i=0;i<listCliente.size();i++){
            jTable.setValueAt((listCliente.get(i).getIdCliente()), i, 0);
            jTable.setValueAt((listCliente.get(i).getNit()), i, 1);
            jTable.setValueAt((listCliente.get(i).getRazonSocial()), i, 2);
            jTable.setValueAt((listCliente.get(i).getTelefono()), i, 3);
            jTable.setValueAt((listCliente.get(i).getEmail()), i, 4);
            jTable.setValueAt((listCliente.get(i).getEstado()), i, 5);
        }
    }
    
    
    public ArrayList <Cliente> listarCliente(){
        ArrayList <Cliente> listCliente = new  ArrayList<>();
        String sql = "SELECT * FROM cliente";
        ResultSet rs = null;
        ConeBD conn = new ConeBD();
        Connection connection = conn.conectar();

        if(connection != null){
            try {
                PreparedStatement pst = connection.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next()){
                    Cliente cl = new Cliente();
                    cl.setIdCliente(rs.getInt("id_cliente"));
                    cl.setNit(rs.getString("nit"));
                    cl.setTelefono(rs.getInt("telefono"));
                    cl.setEmail(rs.getString("email"));
                    cl.setRazonSocial(rs.getString("razon_social"));
                    cl.setEstado(rs.getString("estado"));
                    listCliente.add(cl);
                    //listCliente.add(Integer.parseInt(rs.getString("nit")));
                }
                rs.close();
                pst.close(); 
                
            } catch (Exception ex) {
                 ex.printStackTrace();
            } finally {
            try {
                if (conn != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                }
            }
        }
        return listCliente;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGREGAR;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField NIT;
    private javax.swing.JButton NUEVAVENTA;
    private javax.swing.JButton NUEVOCLIENTE;
    private javax.swing.JTextField RAZONSOCIAL;
    private javax.swing.JButton SALIR;
    private javax.swing.JTextField TELEFONO;
    private javax.swing.JButton VERIFICAR;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jTable;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
