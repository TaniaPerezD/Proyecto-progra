/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gatomaxi.vista;

import gatomaxi.modelo.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author pdmor
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Alerta = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JButton();
        txtAlerta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        li2 = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        IniSesion = new javax.swing.JLabel();
        Contra = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        Usuario = new javax.swing.JLabel();
        li = new javax.swing.JLabel();
        Nover = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();
        IniSesion1 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        Alerta.setUndecorated(true);
        Alerta.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setBackground(new java.awt.Color(245, 124, 133));
        Cerrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(242, 242, 242));
        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel3.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        txtAlerta.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(txtAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatomaxi/icon/Siren_1.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 30, 30));

        Alerta.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 100));

        jPanel2.setBackground(new java.awt.Color(245, 206, 118));
        Alerta.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 120));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 226, 210));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(246, 190, 175));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        li2.setBackground(new java.awt.Color(245, 159, 154));
        li2.setForeground(new java.awt.Color(242, 242, 242));
        li2.setText("___________________________________________________________");
        jPanel1.add(li2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 290, -1));

        txtUsu.setBackground(new java.awt.Color(246, 190, 175));
        txtUsu.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtUsu.setBorder(null);
        txtUsu.setCaretColor(new java.awt.Color(242, 242, 242));
        jPanel1.add(txtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 280, 30));

        IniSesion.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        IniSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IniSesion.setText("¡Bienvenido de nuevo!");
        jPanel1.add(IniSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 250, 30));

        Contra.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Contra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contra.setText("Contraseña");
        jPanel1.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 120, 20));

        txtContra.setBackground(new java.awt.Color(246, 190, 175));
        txtContra.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtContra.setBorder(null);
        txtContra.setCaretColor(new java.awt.Color(242, 242, 242));
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 280, 30));

        Usuario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario.setText("Usuario");
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 70, 30));

        li.setBackground(new java.awt.Color(245, 159, 154));
        li.setForeground(new java.awt.Color(242, 242, 242));
        li.setText("___________________________________________________________");
        jPanel1.add(li, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 290, -1));

        Nover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatomaxi/icon/Invisible_1.png"))); // NOI18N
        Nover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoverMouseClicked(evt);
            }
        });
        jPanel1.add(Nover, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatomaxi/icon/User.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatomaxi/icon/Eye_2.png"))); // NOI18N
        ver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        IniSesion1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        IniSesion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IniSesion1.setText("Inicio de Sesión");
        jPanel1.add(IniSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 210, 30));

        salir.setBackground(new java.awt.Color(245, 159, 154));
        salir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 290, -1));

        ingresar.setBackground(new java.awt.Color(245, 159, 154));
        ingresar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ingresar.setText("Ingresar");
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 290, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 420, 420));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 366, 290, 30));

        jPanel4.setBackground(new java.awt.Color(247, 226, 210));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatomaxi/icon/Eye_1.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 76, 310, 290));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtContraActionPerformed

    private void NoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoverMouseClicked
        // TODO add your handling code here:
        txtContra.setEchoChar((char)0);
        Nover.setVisible(false);
        Nover.setEnabled(false);
        ver.setEnabled(true);
        ver.setEnabled(true);
    }//GEN-LAST:event_NoverMouseClicked

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        // TODO add your handling code here:
        txtContra.setEchoChar((char)8226);
        Nover.setVisible(true);
        Nover.setEnabled(true);
        ver.setEnabled(false);
        ver.setEnabled(false);
    }//GEN-LAST:event_verMouseClicked

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        Alerta.dispose();
        
    }//GEN-LAST:event_CerrarActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String usuario = txtUsu.getText();
        String contraseña = new String(txtContra.getPassword());
        String rol = Empleado.verificarRol(usuario, contraseña);

        if (usuario.isEmpty() || contraseña.isEmpty()) {
            mostrarDialogoError("Por favor, ingrese usuario y contraseña.");
            return;
            
        } 
        if(rol !=null){
            
            if (rol.equalsIgnoreCase("Admin")) {
                VentanaAdmin admin = new VentanaAdmin();
                admin.setVisible(true);
                dispose();
              
            } else if (rol.equalsIgnoreCase("Cajero")){
                mostrarDialogoError("cajero wi.");
                
                
                
            } 
        }else{
            mostrarDialogoError("Usuario o contraseña incorrectos.");

        }
                                               
        
    }                                        

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void mostrarDialogoError(String mensaje) {
    txtAlerta.setText(mensaje);
    Alerta.pack(); // Ajustar el tamaño del JDialog a sus componentes
    Alerta.setLocationRelativeTo(this); // Centrar el diálogo con respecto al JFrame principal
    Alerta.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Alerta;
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Contra;
    private javax.swing.JLabel IniSesion;
    private javax.swing.JLabel IniSesion1;
    private javax.swing.JLabel Nover;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel li;
    private javax.swing.JLabel li2;
    private javax.swing.JButton salir;
    private javax.swing.JLabel txtAlerta;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsu;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
