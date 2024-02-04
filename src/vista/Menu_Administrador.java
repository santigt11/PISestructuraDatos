/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import modelo.Usuario;
import prepis.sSlide;

/**
 *
 * @author Usuario
 */
public class Menu_Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Administrador
     */
    //variable global
    Usuario user;
    sSlide slide;
    //constructor con parametros
    public Menu_Administrador(Usuario usuario) {
        initComponents();
        this.user=usuario;
    }
    //contructor 
     public Menu_Administrador() {
        initComponents();
        Color miColorPersonalizado = new Color(40, 40, 40);
        jPanel1.setBackground(miColorPersonalizado);
         slide=new sSlide();
        
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        JPanelAcceso = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAdministarDoc = new javax.swing.JButton();
        btnAdminEstudiantes = new javax.swing.JToggleButton();
        adminMatricula = new javax.swing.JButton();
        AdminPeriodo = new javax.swing.JButton();
        AdminAsignatura = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        buttonColoredAction1 = new org.edisoncor.gui.button.ButtonColoredAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Exit");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, 0, 0));
        jPanel2.getAccessibleContext().setAccessibleName("");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        JPanelAcceso.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JPanelAccesoLayout = new javax.swing.GroupLayout(JPanelAcceso);
        JPanelAcceso.setLayout(JPanelAccesoLayout);
        JPanelAccesoLayout.setHorizontalGroup(
            JPanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        JPanelAccesoLayout.setVerticalGroup(
            JPanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(JPanelAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 840, 690));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MENU.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        btnAdministarDoc.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnAdministarDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/45109776-suscriptores-seguidores-usuarios-icono-vector-también-image-can-utilizarse-para-admin-salpicadero(3).jpg"))); // NOI18N
        btnAdministarDoc.setText("Administrar Docentes");
        btnAdministarDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdministarDoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdministarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministarDocActionPerformed(evt);
            }
        });

        btnAdminEstudiantes.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnAdminEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/communities-line-green-and-black-icon-vector.jpg"))); // NOI18N
        btnAdminEstudiantes.setText("Administar Estudiantes");
        btnAdminEstudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminEstudiantes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdminEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminEstudiantesActionPerformed(evt);
            }
        });

        adminMatricula.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        adminMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo-con-una-persona-y-una-marca-de-verificacion-verde-2k2fm87.jpg"))); // NOI18N
        adminMatricula.setText("Administrar Matriculas");
        adminMatricula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adminMatricula.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        adminMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminMatriculaActionPerformed(evt);
            }
        });

        AdminPeriodo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        AdminPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images(1).jpeg"))); // NOI18N
        AdminPeriodo.setText("Administrar Periodos Academicos");
        AdminPeriodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdminPeriodo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AdminPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPeriodoActionPerformed(evt);
            }
        });

        AdminAsignatura.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        AdminAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-flat-green-laptop-icon-with-computer-screen-answer-fill-form-vector-png-image_12719274.png"))); // NOI18N
        AdminAsignatura.setText("Administrar Asignaturas");
        AdminAsignatura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdminAsignatura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AdminAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminAsignaturaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("HOME");

        buttonColoredAction1.setText("Exit");
        buttonColoredAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColoredAction1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdministarDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdminEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminAsignatura)
                    .addComponent(buttonColoredAction1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(btnAdministarDoc)
                .addGap(18, 18, 18)
                .addComponent(btnAdminEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AdminPeriodo)
                .addGap(18, 18, 18)
                .addComponent(AdminAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonColoredAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminPeriodoActionPerformed

    private void AdminAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminAsignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminAsignaturaActionPerformed

    private void adminMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminMatriculaActionPerformed

    private void btnAdminEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminEstudiantesActionPerformed

    private void btnAdministarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministarDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdministarDocActionPerformed

    private void buttonColoredAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColoredAction1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonColoredAction1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        slide.JPanelXDerecha(-180,0,10,5,jPanel1);
        slide.JPanelXIzquierda(0,-180,10,5,jPanel1);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AdminAsignatura;
    private javax.swing.JButton AdminPeriodo;
    private javax.swing.JPanel JPanelAcceso;
    private javax.swing.JButton adminMatricula;
    private javax.swing.JToggleButton btnAdminEstudiantes;
    private javax.swing.JButton btnAdministarDoc;
    private org.edisoncor.gui.button.ButtonColoredAction buttonColoredAction1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
