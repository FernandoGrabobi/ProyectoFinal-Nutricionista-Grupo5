
package nutricionistaVistas;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import nutricionista.Alimento;
import nutricionista.Dieta;
import nutricionista.MenuDiario;
import nutricionista.Paciente;
import nutricionista.RenglonMenu;

/**
 *
 * @author Estudiante
 */
public class DatosPaciente extends javax.swing.JFrame {
    private Alimento alimento;
    private Paciente paciente;
    private MenuDiario menu;
    private RenglonMenu renglon;
    private Dieta dieta;
    private DietaHoraria primerDia;
    private DietaRecomendada diet;
    String jCheckDesayuno, jCheckAlmuerzo, jCheckMerienda, jCheckCena;
    /**
     * Creates new form DatosPaciente
     */
    public DatosPaciente() {
        initComponents();
        this.primerDia = primerDia;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        escritorio = new javax.swing.JDesktopPane();
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
        jTextPesoBuscado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFecha = new com.toedter.calendar.JDateChooser();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEmpezar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanelCondicionAlimenticia = new javax.swing.JPanel();
        jCheckCeliaco = new javax.swing.JCheckBox();
        jCheckLactosa = new javax.swing.JCheckBox();
        jCheckVegetariano = new javax.swing.JCheckBox();
        jCheckVegano = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelHorarioAlimenticio = new javax.swing.JPanel();
        jCheckDesayuno = new javax.swing.JCheckBox();
        jCheckAlmuerzo = new javax.swing.JCheckBox();
        jCheckMerienda = new javax.swing.JCheckBox();
        jCheckCena = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

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
        jLabel7.setText("Genero:");

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

        jTextPesoBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPesoBuscadoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel8.setText("Fecha inicio:");

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonEmpezar.setText("Empezar");
        jButtonEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpezarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nutricionista.png"))); // NOI18N

        jPanelCondicionAlimenticia.setBorder(javax.swing.BorderFactory.createTitledBorder("Condicion Alimenticia:"));

        jCheckCeliaco.setText("Celiaco");

        jCheckLactosa.setText("Intolerante a la Lactosa");
        jCheckLactosa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckVegetariano.setText("Vegetariano");

        jCheckVegano.setText("Vegano");

        javax.swing.GroupLayout jPanelCondicionAlimenticiaLayout = new javax.swing.GroupLayout(jPanelCondicionAlimenticia);
        jPanelCondicionAlimenticia.setLayout(jPanelCondicionAlimenticiaLayout);
        jPanelCondicionAlimenticiaLayout.setHorizontalGroup(
            jPanelCondicionAlimenticiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCondicionAlimenticiaLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanelCondicionAlimenticiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckCeliaco)
                    .addComponent(jCheckVegetariano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCondicionAlimenticiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckVegano)
                    .addComponent(jCheckLactosa)))
            .addGroup(jPanelCondicionAlimenticiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCondicionAlimenticiaLayout.createSequentialGroup()
                    .addGap(0, 127, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 127, Short.MAX_VALUE)))
        );
        jPanelCondicionAlimenticiaLayout.setVerticalGroup(
            jPanelCondicionAlimenticiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCondicionAlimenticiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCondicionAlimenticiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckCeliaco)
                    .addComponent(jCheckLactosa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCondicionAlimenticiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckVegetariano)
                    .addComponent(jCheckVegano))
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanelCondicionAlimenticiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCondicionAlimenticiaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelHorarioAlimenticio.setBorder(javax.swing.BorderFactory.createTitledBorder("Horario de comida:"));

        jCheckDesayuno.setText("Desayuno");

        jCheckAlmuerzo.setText("Almuerzo");

        jCheckMerienda.setText("Merienda");

        jCheckCena.setText("Cena");

        javax.swing.GroupLayout jPanelHorarioAlimenticioLayout = new javax.swing.GroupLayout(jPanelHorarioAlimenticio);
        jPanelHorarioAlimenticio.setLayout(jPanelHorarioAlimenticioLayout);
        jPanelHorarioAlimenticioLayout.setHorizontalGroup(
            jPanelHorarioAlimenticioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHorarioAlimenticioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHorarioAlimenticioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckMerienda)
                    .addComponent(jCheckDesayuno))
                .addGap(18, 18, 18)
                .addGroup(jPanelHorarioAlimenticioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckAlmuerzo)
                    .addComponent(jCheckCena))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelHorarioAlimenticioLayout.setVerticalGroup(
            jPanelHorarioAlimenticioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHorarioAlimenticioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHorarioAlimenticioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckDesayuno)
                    .addComponent(jCheckAlmuerzo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHorarioAlimenticioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckMerienda)
                    .addComponent(jCheckCena))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRadioButton1.setText("Hombre");

        jRadioButton2.setText("Mujer");

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jTextEdad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jTextAltura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jTextNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jTextPesoActual, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jTextPesoBuscado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jButtonNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jButtonEmpezar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jButtonSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jPanelCondicionAlimenticia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jPanelHorarioAlimenticio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextPesoBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jTextAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jTextEdad)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jTextPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCondicionAlimenticia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanelHorarioAlimenticio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(15, 15, 15)
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(14, 14, 14)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCondicionAlimenticia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelHorarioAlimenticio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTextPesoBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesoBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPesoBuscadoActionPerformed

    private void jTextEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEdadActionPerformed

    private void jButtonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpezarActionPerformed
    if(jTextNombre.getText().trim().isEmpty() || 
            jTextEdad.getText().trim().isEmpty() || 
            jTextAltura.getText().trim().isEmpty() || 
            jTextPesoActual.getText().trim().isEmpty() || 
            jTextPesoBuscado.getText().trim().isEmpty() || 
            jFecha.getDate() == null ||
            jTextDescripcion.getText().trim().isEmpty()){
            
        JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios");
        
    }else{
        escritorio.removeAll();  
        escritorio.repaint();
        DietaRecomendada d = new DietaRecomendada();
        d.setVisible(true);
        escritorio.add(d);
        escritorio.moveToFront(d);
    }
        

    }//GEN-LAST:event_jButtonEmpezarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed

        if(!jCheckDesayuno.isSelected()){
        JOptionPane.showMessageDialog(this, "tiene q estar mal");
    }else{
        JOptionPane.showMessageDialog(this, "tiene q estar bien");
    }
        limpiarCampos();

    }//GEN-LAST:event_jButtonNuevoActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JDesktopPane escritorio;
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
    private com.toedter.calendar.JDateChooser jFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelCondicionAlimenticia;
    private javax.swing.JPanel jPanelHorarioAlimenticio;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextAltura;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPesoActual;
    private javax.swing.JTextField jTextPesoBuscado;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos(){
        jTextNombre.setText("");
        jTextEdad.setText("");
        jTextAltura.setText("");
        jTextPesoActual.setText("");
        jTextPesoBuscado.setText("");
        jTextDescripcion.setText("");
        jCheckCeliaco.setSelected(false);
        jCheckLactosa.setSelected(false);
        jCheckVegetariano.setSelected(false);
        jCheckVegano.setSelected(false);
        jCheckDesayuno.setSelected(false);
        jCheckAlmuerzo.setSelected(false);
        jCheckMerienda.setSelected(false);
        jCheckCena.setSelected(false);
    }


    private void seleccionarComidaDiaria() {
        if( jCheckDesayuno.isSelected() == true || jCheckAlmuerzo.isSelected() == true || jCheckMerienda.isSelected() == true || jCheckCena.isSelected() == true){
            JOptionPane.showMessageDialog(this, "Todo en orden");
        }else{
            JOptionPane.showMessageDialog(this, "Selecciona alguna comida diaria que consuma");
        }
    }
       


}