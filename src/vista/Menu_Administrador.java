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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
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
    public Menu_Administrador(Usuario usuario) {
        initComponents();
        this.user = usuario;
        inicializarPaneles();
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
        buttonIcon1 = new org.edisoncor.gui.button.ButtonIcon();
        btnDocentes = new org.edisoncor.gui.button.ButtonTransluceIcon();
        btnPeriodoAcademicos = new org.edisoncor.gui.button.ButtonTransluceIcon();
        BtnMatricula = new org.edisoncor.gui.button.ButtonTransluceIcon();
        btnEstudiantes = new org.edisoncor.gui.button.ButtonTransluceIcon();
        btnAdministrarAsignaturas = new org.edisoncor.gui.button.ButtonTransluceIcon();
        jPanel3 = new javax.swing.JPanel();
        buttonIcon2 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon3 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon4 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon5 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon6 = new org.edisoncor.gui.button.ButtonIcon();
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
        jSeparator2 = new javax.swing.JSeparator();
        panelRound1 = new org.edisoncor.gui.panel.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

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

        buttonIcon1.setBackground(new java.awt.Color(115, 102, 35));
        buttonIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-configuración-del-administrador.gif"))); // NOI18N
        buttonIcon1.setText("buttonIcon1");
        buttonIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon1ActionPerformed(evt);
            }
        });

        btnDocentes.setBackground(new java.awt.Color(255, 250, 205));
        btnDocentes.setForeground(new java.awt.Color(255, 255, 204));
        btnDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/45109776-suscriptores-seguidores-usuarios-icono-vector-también-image-can-utilizarse-para-admin-salpicadero_3_-removebg-preview.png"))); // NOI18N
        btnDocentes.setText("buttonTransluceIcon1");
        btnDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocentesActionPerformed(evt);
            }
        });

        btnPeriodoAcademicos.setBackground(new java.awt.Color(203, 222, 188));
        btnPeriodoAcademicos.setForeground(new java.awt.Color(255, 255, 204));
        btnPeriodoAcademicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images_1_-removebg-preview.png"))); // NOI18N
        btnPeriodoAcademicos.setText("buttonTransluceIcon1");
        btnPeriodoAcademicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodoAcademicosActionPerformed(evt);
            }
        });

        BtnMatricula.setBackground(new java.awt.Color(203, 222, 188));
        BtnMatricula.setForeground(new java.awt.Color(255, 255, 204));
        BtnMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo-con-una-persona-y-una-marca-de-verificacion-verde-2k2fm87-removebg-preview.png"))); // NOI18N
        BtnMatricula.setText("buttonTransluceIcon1");
        BtnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMatriculaActionPerformed(evt);
            }
        });

        btnEstudiantes.setBackground(new java.awt.Color(203, 222, 188));
        btnEstudiantes.setForeground(new java.awt.Color(255, 255, 204));
        btnEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-invitado-masculino.gif"))); // NOI18N
        btnEstudiantes.setText("buttonTransluceIcon1");
        btnEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiantesActionPerformed(evt);
            }
        });

        btnAdministrarAsignaturas.setBackground(new java.awt.Color(203, 222, 188));
        btnAdministrarAsignaturas.setForeground(new java.awt.Color(255, 255, 204));
        btnAdministrarAsignaturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-flat-green-laptop-icon-with-computer-screen-answer-fill-form-vector-png-image_12719274.png"))); // NOI18N
        btnAdministrarAsignaturas.setText("buttonTransluceIcon1");
        btnAdministrarAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarAsignaturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdministrarAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(buttonIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(btnPeriodoAcademicos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(666, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnPeriodoAcademicos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(btnAdministrarAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 1010, 640));

        jPanel3.setBackground(new java.awt.Color(51, 51, 0));

        buttonIcon2.setBackground(new java.awt.Color(255, 250, 205));
        buttonIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Image1-removebg-preview.png"))); // NOI18N
        buttonIcon2.setText("buttonIcon2");
        buttonIcon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon2ActionPerformed(evt);
            }
        });

        buttonIcon3.setBackground(new java.awt.Color(255, 250, 205));
        buttonIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Image1-removebg-preview.png"))); // NOI18N
        buttonIcon3.setText("buttonIcon2");

        buttonIcon4.setBackground(new java.awt.Color(255, 250, 205));
        buttonIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/communities-line-green-and-black-icon-vector-removebg-preview.png"))); // NOI18N
        buttonIcon4.setText("buttonIcon2");
        buttonIcon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon4ActionPerformed(evt);
            }
        });

        buttonIcon5.setBackground(new java.awt.Color(255, 250, 205));
        buttonIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo-con-una-persona-y-una-marca-de-verificacion-verde-2k2fm87-removebg-preview.png"))); // NOI18N
        buttonIcon5.setText("buttonIcon2");
        buttonIcon5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon5ActionPerformed(evt);
            }
        });

        buttonIcon6.setBackground(new java.awt.Color(255, 250, 205));
        buttonIcon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Image1-removebg-preview.png"))); // NOI18N
        buttonIcon6.setText("buttonIcon2");
        buttonIcon6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel1.setText("ADMINISTRAR ");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel2.setText("DOCENTES");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel3.setText("ADMINISTRAR ");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel4.setText("MATRICULAS");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel5.setText("ADMINISTRAR ");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel6.setText("ESTUDIANTES");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel7.setText("PERIODO ACADEMICO");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel8.setText("ADMINISTRAR ");

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel9.setText("ADMINISTRAR ");

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel10.setText("ADMINISTRAR ");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        panelRound1.setBackground(new java.awt.Color(255, 250, 205));
        panelRound1.setForeground(new java.awt.Color(255, 250, 205));
        panelRound1.setColorPrimario(new java.awt.Color(255, 250, 205));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(buttonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(buttonIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(buttonIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(buttonIcon6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(buttonIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6))
                    .addComponent(buttonIcon3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(buttonIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonIcon6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 690));

        jPanel4.setBackground(new java.awt.Color(51, 51, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1010, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDocentesActionPerformed

    private void btnPeriodoAcademicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriodoAcademicosActionPerformed
        
    }//GEN-LAST:event_btnPeriodoAcademicosActionPerformed

    private void BtnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMatriculaActionPerformed
  

    }//GEN-LAST:event_BtnMatriculaActionPerformed

    private void btnEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstudiantesActionPerformed

    private void buttonIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIcon1ActionPerformed

    private void btnAdministrarAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarAsignaturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdministrarAsignaturasActionPerformed

    private void buttonIcon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIcon2ActionPerformed

    private void buttonIcon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIcon4ActionPerformed

    private void buttonIcon5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIcon5ActionPerformed

    private void buttonIcon6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIcon6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
            JFrame frame = new JFrame("JPanel con Bordes Circulares");
            .setPreferredSize(new Dimension(200, 200));
            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Administrador().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTransluceIcon BtnMatricula;
    private org.edisoncor.gui.button.ButtonTransluceIcon btnAdministrarAsignaturas;
    private org.edisoncor.gui.button.ButtonTransluceIcon btnDocentes;
    private org.edisoncor.gui.button.ButtonTransluceIcon btnEstudiantes;
    private org.edisoncor.gui.button.ButtonTransluceIcon btnPeriodoAcademicos;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon1;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon2;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon3;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon4;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon5;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon6;
    private com.jgoodies.animation.components.CircleComponent circleComponent1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
    private org.edisoncor.gui.panel.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables

    private void mostrarGif() {
    }
}
