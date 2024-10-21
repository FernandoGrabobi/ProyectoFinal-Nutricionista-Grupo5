/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nutricionistaVistas;

import nutricionista.Alimento;

/**
 *
 * @author Estudiante
 */
public class DatosPaciente extends javax.swing.JFrame {
    private Alimento alimento;

    /**
     * Creates new form DatosPaciente
     */
    public DatosPaciente() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextEdad = new javax.swing.JTextField();
        jTextAltura = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextPesoActual = new javax.swing.JTextField();
        jTextDescripcion = new javax.swing.JTextField();
        jTextPesoBuscado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jCheckCeliaco = new javax.swing.JCheckBox();
        jCheckLactosa = new javax.swing.JCheckBox();
        jCheckVegetariano = new javax.swing.JCheckBox();
        jCheckVegano = new javax.swing.JCheckBox();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEmpezar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jCheckDesayuno = new javax.swing.JCheckBox();
        jCheckAlmuerzo = new javax.swing.JCheckBox();
        jCheckMerienda = new javax.swing.JCheckBox();
        jCheckCena = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel1.setText("Ingresar Datos");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel2.setText("Nombre completo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel4.setText("Altura:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel5.setText("Peso buscado:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel6.setText("Peso actual:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel7.setText("Descripción:");

        jTextEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEdadActionPerformed(evt);
            }
        });

        jTextAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAlturaActionPerformed(evt);
            }
        });

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jTextPesoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPesoActualActionPerformed(evt);
            }
        });

        jTextDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescripcionActionPerformed(evt);
            }
        });

        jTextPesoBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPesoBuscadoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel8.setText("Fecha inicio:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel9.setText("Tipo:");

        jCheckCeliaco.setText("Celiaco");
        jCheckCeliaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckCeliacoActionPerformed(evt);
            }
        });

        jCheckLactosa.setText("Intolerante a la Lactosa");
        jCheckLactosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckLactosaActionPerformed(evt);
            }
        });

        jCheckVegetariano.setText("Vegetariano");
        jCheckVegetariano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckVegetarianoActionPerformed(evt);
            }
        });

        jCheckVegano.setText("Vegano");
        jCheckVegano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckVeganoActionPerformed(evt);
            }
        });

        jButtonNuevo.setText("Nuevo");

        jButtonEmpezar.setText("Empezar");

        jButtonSalir.setText("Salir");

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel11.setText("Tipo:");

        jCheckDesayuno.setText("Desayuno");
        jCheckDesayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckDesayunoActionPerformed(evt);
            }
        });

        jCheckAlmuerzo.setText("Almuerzo");
        jCheckAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckAlmuerzoActionPerformed(evt);
            }
        });

        jCheckMerienda.setText("Merienda");
        jCheckMerienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckMeriendaActionPerformed(evt);
            }
        });

        jCheckCena.setText("Cena");
        jCheckCena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckCenaActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nutricionista.png"))); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextEdad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextAltura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextPesoActual, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextDescripcion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextPesoBuscado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckCeliaco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckLactosa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckVegetariano, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckVegano, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonEmpezar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckDesayuno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckAlmuerzo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckMerienda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckCena, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jCheckVegano)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckVegetariano))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jCheckCeliaco)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckLactosa)))
                                .addGap(191, 191, 191))
                            .addComponent(jSeparator1)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextPesoBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(jTextAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(jTextEdad)
                                            .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(jTextPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(jFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckDesayuno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckAlmuerzo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckMerienda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckCena)))
                        .addGap(38, 38, 38)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(15, 15, 15)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(14, 14, 14)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckCeliaco)
                    .addComponent(jLabel9)
                    .addComponent(jCheckLactosa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckVegetariano)
                    .addComponent(jCheckVegano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jCheckDesayuno)
                    .addComponent(jCheckAlmuerzo)
                    .addComponent(jCheckMerienda)
                    .addComponent(jCheckCena))
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAlturaActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextPesoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPesoActualActionPerformed

    private void jTextDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescripcionActionPerformed

    private void jTextPesoBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesoBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPesoBuscadoActionPerformed

    private void jTextEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEdadActionPerformed

    private void jCheckCeliacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckCeliacoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckCeliacoActionPerformed

    private void jCheckLactosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckLactosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckLactosaActionPerformed

    private void jCheckVegetarianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckVegetarianoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckVegetarianoActionPerformed

    private void jCheckVeganoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckVeganoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckVeganoActionPerformed

    private void jCheckDesayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckDesayunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckDesayunoActionPerformed

    private void jCheckAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckAlmuerzoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckAlmuerzoActionPerformed

    private void jCheckMeriendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckMeriendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckMeriendaActionPerformed

    private void jCheckCenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckCenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckCenaActionPerformed

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
            java.util.logging.Logger.getLogger(DatosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmpezar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckAlmuerzo;
    private javax.swing.JCheckBox jCheckCeliaco;
    private javax.swing.JCheckBox jCheckCena;
    private javax.swing.JCheckBox jCheckDesayuno;
    private javax.swing.JCheckBox jCheckLactosa;
    private javax.swing.JCheckBox jCheckMerienda;
    private javax.swing.JCheckBox jCheckVegano;
    private javax.swing.JCheckBox jCheckVegetariano;
    private javax.swing.JDesktopPane jDesktopPane1;
    private com.toedter.calendar.JDateChooser jFecha;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextAltura;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPesoActual;
    private javax.swing.JTextField jTextPesoBuscado;
    // End of variables declaration//GEN-END:variables
}
