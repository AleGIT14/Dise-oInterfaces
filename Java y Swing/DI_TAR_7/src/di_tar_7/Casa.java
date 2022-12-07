package di_tar_7;

/**
 *
 * @author AsEh
 */

public class Casa extends javax.swing.JFrame {

    int contHab = 0;
    int contSalon = 0;
    int contCoc = 0;
    int contBano = 0;
    int contGar = 0;
    int contTrast = 0;
    
    /**
     * Creates new form Casa
     */
    public Casa() {
        initComponents();
        mncSalon.setSelected(false);
        mnr1.setSelected(false);
        mnr2.setSelected(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuHab = new javax.swing.JMenu();
        mniHab1 = new javax.swing.JMenuItem();
        mniHab2 = new javax.swing.JMenuItem();
        mncSalon = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnr1 = new javax.swing.JRadioButtonMenuItem();
        mnr2 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniGaraje = new javax.swing.JMenuItem();
        mniTrastero = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(txtTexto);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/di_tar_7/res/house_icon.png"))); // NOI18N
        jMenu1.setText("Casa");
        jMenu1.setAlignmentX(0.0F);
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu1.setIconTextGap(1);
        jMenu1.setMaximumSize(new java.awt.Dimension(95, 100));

        mnuHab.setText("Habitaciones");

        mniHab1.setText("Habitacion 1");
        mniHab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHab1ActionPerformed(evt);
            }
        });
        mnuHab.add(mniHab1);

        mniHab2.setText("Habitacion 2");
        mniHab2.setEnabled(false);
        mnuHab.add(mniHab2);

        jMenu1.add(mnuHab);

        mncSalon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mncSalon.setSelected(true);
        mncSalon.setText("Salon");
        mncSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mncSalonActionPerformed(evt);
            }
        });
        jMenu1.add(mncSalon);
        jMenu1.add(jSeparator1);

        mnr1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnr1.setText("Cocina");
        mnr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnr1ActionPerformed(evt);
            }
        });
        jMenu1.add(mnr1);

        mnr2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnr2.setSelected(true);
        mnr2.setText("Baño");
        mnr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnr2ActionPerformed(evt);
            }
        });
        jMenu1.add(mnr2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Extra");

        mniGaraje.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniGaraje.setText("Garaje");
        mniGaraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGarajeActionPerformed(evt);
            }
        });
        jMenu2.add(mniGaraje);

        mniTrastero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniTrastero.setText("Trastero");
        mniTrastero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTrasteroActionPerformed(evt);
            }
        });
        jMenu2.add(mniTrastero);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniHab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHab1ActionPerformed
        contHab++;
        
        if (contHab == 1) {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado a la habitacion " + contHab + " vez.");
        } else {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado a la habitacion " + contHab + " veces.");
        }
    }//GEN-LAST:event_mniHab1ActionPerformed

    private void mncSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mncSalonActionPerformed
        contSalon++;
        if (mncSalon.isSelected()) {
            if (contSalon == 1) {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al salon " + contSalon + " vez. Estado activado.");
            } else {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al salon " + contSalon + " veces. Estado activado.");
            }
        } else {
            if (contSalon == 1) {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al salon " + contSalon + " vez. Estado desactivado.");
            } else {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al salon " + contSalon + " veces. Estado desactivado.");
            }
        }
    }//GEN-LAST:event_mncSalonActionPerformed

    private void mnr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnr1ActionPerformed
        contCoc++;
        if (mnr1.isSelected()) {
            if (contCoc == 1) {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado a la cocina " + contCoc + " vez. Estado activado.");
            } else {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado a la cocina " + contCoc + " veces. Estado activado.");
            }
        } else {
            if (contCoc == 1) {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado a la cocina " + contCoc + " vez. Estado desactivado.");
            } else {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado a la cocina " + contCoc + " veces. Estado desactivado.");
            }
        }
    }//GEN-LAST:event_mnr1ActionPerformed

    private void mnr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnr2ActionPerformed
        contBano++;
        if (mnr2.isSelected()) {
            if (contBano == 1) {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al baño " + contBano + " vez. Estado activado.");
            } else {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al baño " + contBano + " veces. Estado activado.");
            }
        } else {
            if (contCoc == 1) {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al baño " + contBano + " vez. Estado desactivado.");
            } else {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al baño " + contBano + " veces. Estado desactivado.");
            }
        }
    }//GEN-LAST:event_mnr2ActionPerformed

    private void mniGarajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGarajeActionPerformed
        contGar++;
        
        if (contGar == 1) {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al garaje " + contGar + " vez.");
        } else {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al garaje " + contGar + " veces.");
        }
    }//GEN-LAST:event_mniGarajeActionPerformed

    private void mniTrasteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTrasteroActionPerformed
        contTrast++;
        
        if (contTrast == 1) {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al trastero " + contTrast + " vez.");
        } else {
            txtTexto.setText(txtTexto.getText() + "\n" + "Has entrado al trastero " + contTrast + " veces.");
        }
    }//GEN-LAST:event_mniTrasteroActionPerformed

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
            java.util.logging.Logger.getLogger(Casa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Casa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Casa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Casa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Casa().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBoxMenuItem mncSalon;
    private javax.swing.JMenuItem mniGaraje;
    private javax.swing.JMenuItem mniHab1;
    private javax.swing.JMenuItem mniHab2;
    private javax.swing.JMenuItem mniTrastero;
    private javax.swing.JRadioButtonMenuItem mnr1;
    private javax.swing.JRadioButtonMenuItem mnr2;
    private javax.swing.JMenu mnuHab;
    private javax.swing.JTextPane txtTexto;
    // End of variables declaration//GEN-END:variables
}
