/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import modelo.Persona;
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
    private Usuario user;
    private sSlide slide;
    private JPanel panel1;
    private JPanel panel2;

    private FrmGenerarInforme frmGenerarInforme;
    private FrmTutoriasPrincipal frmTutoriasPrincipal;
    private ImageIcon imagen;

    // constructor con parámetros
    public Menu_Administrador(Usuario usuario,Persona persona) {
        initComponents();
        
        this.user = usuario;
        inicializarPaneles();
        txtUsuario.setText(persona.getNombre());
     
 
    }
    public Menu_Administrador() {
         initComponents();
        mostrarGif();
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/matricula.png"));
        FotoAdmin.setIcon(icono);
       
  }
        private void mostrarGif() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1122, 670);

        // Crea un JLabel y carga el GIF
        ImageIcon gifIcon = new ImageIcon("src/imagenes/GIF.gif"); // Reemplaza con la ruta de tu archivo GIF
        JLabel backgroundLabel = new JLabel(gifIcon);

        // Establece el layout del JFrame como BorderLayout
        setLayout(new BorderLayout());

        // Agrega el JLabel al fondo del JFrame
        getContentPane().add(backgroundLabel, BorderLayout.CENTER);

        // Hacer visible el JFrame
        setVisible(true);
    }

       protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        int width = getWidth();
        int height = getHeight();
        int arc = 20; // Modifica este valor para cambiar el radio del borde

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, width, height, arc, arc);
        g2d.setColor(getForeground());
        g2d.drawRoundRect(0, 0, width - 1, height - 1, arc, arc);
        g2d.dispose();
    }

    private void inicializarPaneles() {
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        this.setLocationRelativeTo(null);
        slide = new sSlide();
        // FrmGenerarInforme frm = new FrmGenerarInforme(); // Esto lo comentamos
        // panel2.add(frm, java.awt.BorderLayout.CENTER); // Esto lo comentamos

        // Puedes mostrar el formulario directamente
        FrmGenerarInforme frm = new FrmGenerarInforme();
        frm.setVisible(true);
        panel2.add(frm.getContentPane(), java.awt.BorderLayout.CENTER);

        mostrarPanel(panel2);  // Mostrar el panel2 por defecto
    }

    // Método para mostrar un panel específico
    private void mostrarPanel(JPanel panel) {
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        circleComponent1 = new com.jgoodies.animation.components.CircleComponent();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buttonIcon2 = new org.edisoncor.gui.button.ButtonIcon();
        AdminDocentes = new org.edisoncor.gui.button.ButtonIcon();
        AdminEstudiante = new org.edisoncor.gui.button.ButtonIcon();
        AdminMatricula = new org.edisoncor.gui.button.ButtonIcon();
        AdminPeriodo = new org.edisoncor.gui.button.ButtonIcon();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        FotoAdmin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Exit");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, 0, 0));
        jPanel2.getAccessibleContext().setAccessibleName("");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(circleComponent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 250, 205));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 1020, 570));

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        buttonIcon2.setBackground(new java.awt.Color(255, 250, 205));
        buttonIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5526535.png"))); // NOI18N
        buttonIcon2.setText("buttonIcon2");
        buttonIcon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon2ActionPerformed(evt);
            }
        });

        AdminDocentes.setBackground(new java.awt.Color(255, 250, 205));
        AdminDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/docente.png"))); // NOI18N
        AdminDocentes.setText("buttonIcon2");

        AdminEstudiante.setBackground(new java.awt.Color(255, 250, 205));
        AdminEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiantes.png"))); // NOI18N
        AdminEstudiante.setText("buttonIcon2");
        AdminEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminEstudianteActionPerformed(evt);
            }
        });

        AdminMatricula.setBackground(new java.awt.Color(255, 250, 205));
        AdminMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/matricula.png"))); // NOI18N
        AdminMatricula.setText("buttonIcon2");
        AdminMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminMatriculaActionPerformed(evt);
            }
        });

        AdminPeriodo.setBackground(new java.awt.Color(255, 250, 205));
        AdminPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/periodo.png"))); // NOI18N
        AdminPeriodo.setText("buttonIcon2");
        AdminPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPeriodoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 250, 205));
        jLabel1.setText("ADMINISTRAR ");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 250, 205));
        jLabel2.setText("DOCENTES");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 250, 205));
        jLabel3.setText("ADMINISTRAR ");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 250, 205));
        jLabel4.setText("MATRICULAS");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 250, 205));
        jLabel5.setText("ADMINISTRAR ");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 250, 205));
        jLabel6.setText("ESTUDIANTES");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 250, 205));
        jLabel7.setText("PERIODO ACADEMICO");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 250, 205));
        jLabel8.setText("ADMINISTRAR ");

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 250, 205));
        jLabel9.setText("ADMINISTRAR ");

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 250, 205));
        jLabel10.setText("ASIGNATURAS ");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(255, 250, 205));
        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 250, 205));
        jLabel12.setText("SEAES");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image(4)(1).png"))); // NOI18N

        txtUsuario.setBackground(new java.awt.Color(47, 30, 30));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsuario.setEnabled(false);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        FotoAdmin.setBackground(new java.awt.Color(255, 255, 255));
        FotoAdmin.setForeground(new java.awt.Color(255, 255, 255));
        FotoAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FotoAdmin.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(buttonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(AdminMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(AdminPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AdminDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AdminEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(FotoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FotoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addComponent(AdminDocentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AdminEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AdminMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(AdminPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(buttonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, 630));

        jPanel4.setBackground(new java.awt.Color(58, 39, 34));

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/USU-removebg-preview(1).png"))); // NOI18N
        jLabel19.setText("USUARIO");
        jLabel19.setToolTipText("");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel20.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa.png"))); // NOI18N
        jLabel20.setText("HOME");

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("NOTIFICACION");

        jComboBox1.setBackground(new java.awt.Color(153, 102, 0));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "English" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 547, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(32, 32, 32)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 1020, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminPeriodoActionPerformed

    private void BtnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMatriculaActionPerformed
   
    }//GEN-LAST:event_BtnMatriculaActionPerformed

    private void AdminMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminMatriculaActionPerformed


    private void AdminEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminEstudianteActionPerformed

    private void buttonIcon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIcon2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
                     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                

            }
        });
        SwingUtilities.invokeLater(() -> new Menu_Administrador().mostrarGif());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon AdminDocentes;
    private org.edisoncor.gui.button.ButtonIcon AdminEstudiante;
    private org.edisoncor.gui.button.ButtonIcon AdminMatricula;
    private org.edisoncor.gui.button.ButtonIcon AdminPeriodo;
    private javax.swing.JLabel FotoAdmin;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon2;
    private com.jgoodies.animation.components.CircleComponent circleComponent1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

   
}
