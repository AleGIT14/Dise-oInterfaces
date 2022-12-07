package di_tar_9;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JToggleButton;

/**
 *
 * @author Alejandro Romero Contreras
 */
public class BuscaParejas extends javax.swing.JFrame {

    private String carta1 = "-1";
    private String carta2 = "-1";

    private final ArrayList<String> colores;
    private final ArrayList<JToggleButton> botones = new ArrayList<>();

    public BuscaParejas() {
        initComponents();

        colores = new ArrayList<>();
        colores.add("red");
        colores.add("red");
        colores.add("green");
        colores.add("green");
        colores.add("white");
        colores.add("white");
        colores.add("black");
        colores.add("black");

        botones.add(btt1);
        botones.add(btt2);
        botones.add(btt3);
        botones.add(btt4);
        botones.add(btt5);
        botones.add(btt6);
        botones.add(btt7);
        botones.add(btt8);

        setCartaAbajo();
        setBackCard();
        cartasAleatorias(colores, botones);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btt1 = new javax.swing.JToggleButton();
        btt2 = new javax.swing.JToggleButton();
        btt3 = new javax.swing.JToggleButton();
        btt4 = new javax.swing.JToggleButton();
        btt5 = new javax.swing.JToggleButton();
        btt6 = new javax.swing.JToggleButton();
        btt7 = new javax.swing.JToggleButton();
        btt8 = new javax.swing.JToggleButton();
        txtLabel1 = new javax.swing.JLabel();
        txtIntentos = new javax.swing.JTextPane();
        btnReinicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setLayout(new java.awt.GridLayout(2, 4, 8, 8));

        btt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btt1StateChanged(evt);
            }
        });
        jPanel1.add(btt1);

        btt2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt2ActionPerformed(evt);
            }
        });
        jPanel1.add(btt2);

        btt3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt3ActionPerformed(evt);
            }
        });
        jPanel1.add(btt3);

        btt4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt4ActionPerformed(evt);
            }
        });
        jPanel1.add(btt4);

        btt5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt5ActionPerformed(evt);
            }
        });
        jPanel1.add(btt5);

        btt6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btt6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt6ActionPerformed(evt);
            }
        });
        jPanel1.add(btt6);

        btt7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btt7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt7ActionPerformed(evt);
            }
        });
        jPanel1.add(btt7);

        btt8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btt8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt8ActionPerformed(evt);
            }
        });
        jPanel1.add(btt8);

        txtLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtLabel1.setText("Nº intentos:");

        txtIntentos.setEditable(false);
        txtIntentos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtIntentos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtIntentos.setToolTipText("");
        txtIntentos.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        txtIntentos.setMinimumSize(new java.awt.Dimension(65, 40));
        txtIntentos.setName(""); // NOI18N

        btnReinicio.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnReinicio.setText("Reiniciar");
        btnReinicio.setToolTipText("");
        btnReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReinicio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReinicio)
                    .addComponent(txtLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt2ActionPerformed

    }//GEN-LAST:event_btt2ActionPerformed

    private void btt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btt3ActionPerformed

    private void btt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btt4ActionPerformed

    private void btt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btt5ActionPerformed

    private void btt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btt6ActionPerformed

    private void btt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btt7ActionPerformed

    private void btt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btt8ActionPerformed

    private void btnReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinicioActionPerformed
        setCartaAbajo();
        cartasAleatorias(colores, botones);
    }//GEN-LAST:event_btnReinicioActionPerformed

    private void btt1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btt1StateChanged
        System.out.println("Boton pulsado");
        if (carta1.equals("-1")) {
            System.out.println("Carta 1 es 1");
            carta1 = "1";
            
        } else if (!carta1.equals(-1)){
            carta2 = "1";
            if (carta1.equals(carta2)) {
                System.out.println("Son pareja");
            }
        }
    }//GEN-LAST:event_btt1StateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaParejas().setVisible(true);
            }
        });
    }

    private void setCartaAbajo() {
        btt1.setSelected(false);
        btt2.setSelected(false);
        btt3.setSelected(false);
        btt4.setSelected(false);
        btt5.setSelected(false);
        btt6.setSelected(false);
        btt7.setSelected(false);
        btt8.setSelected(false);
    }

    private void setBackCard() {
        btt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cardBack.jpg")));
        btt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cardBack.jpg")));
        btt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cardBack.jpg")));
        btt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cardBack.jpg")));
        btt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cardBack.jpg")));
        btt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cardBack.jpg")));
        btt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cardBack.jpg")));
        btt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cardBack.jpg")));
    }

    /**
     * Da aleatoriamente a cada boton un frontal de carta (pares de 2);
     *
     * @param colores
     */
    private void cartasAleatorias(ArrayList<String> clor, ArrayList<JToggleButton> botones) {

        Collections.shuffle(clor);

        System.out.println("ayyy");
        for (int i = 0; i < botones.size(); i++) {
            botones.get(i).setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/" + clor.get(i) + ".jpg")));
        }

    }
    
    

    private boolean fijarCarta(JToggleButton boton) {

        return false;
    }

    private boolean comparar2Cartas(String a, String b) {

        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReinicio;
    private javax.swing.JToggleButton btt1;
    private javax.swing.JToggleButton btt2;
    private javax.swing.JToggleButton btt3;
    private javax.swing.JToggleButton btt4;
    private javax.swing.JToggleButton btt5;
    private javax.swing.JToggleButton btt6;
    private javax.swing.JToggleButton btt7;
    private javax.swing.JToggleButton btt8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextPane txtIntentos;
    private javax.swing.JLabel txtLabel1;
    // End of variables declaration//GEN-END:variables
}
