package com.di_pract1;

import com.controlador.ArticuloJpaController;
import com.modelo.Articulo;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Romero
 */
public class DI_PRACT1_AlejandroRomero extends javax.swing.JFrame {

    List<Articulo> listaArt;

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    ArticuloJpaController articuloController = new ArticuloJpaController(emf);

    public DI_PRACT1_AlejandroRomero() {
        initComponents();

        this.listaArt = articuloController.findArticuloEntities();

        btnAtStartAndConsult();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbConsulta = new javax.swing.JRadioButton();
        rbAlta = new javax.swing.JRadioButton();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lblDes = new javax.swing.JLabel();
        txtDescrip = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(rbConsulta);
        rbConsulta.setSelected(true);
        rbConsulta.setText("Consulta articulo");
        rbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConsultaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAlta);
        rbAlta.setText("Alta de artículo");
        rbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(rbAlta)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbConsulta)
                    .addComponent(rbAlta))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        lblCode.setText("Código");

        lblDes.setText("Descripción del articulo");

        lblPrecio.setText("Precio");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar producto");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Total de artículos en stock:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDes, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lblRes))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addGap(112, 112, 112)
                                .addComponent(btnGuardar)))))
                .addGap(59, 89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCode))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnGuardar))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblRes))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsultaActionPerformed
        if (rbConsulta.isSelected()) {

            btnAtStartAndConsult();
        }
    }//GEN-LAST:event_rbConsultaActionPerformed

    private void rbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAltaActionPerformed
        if (rbAlta.isSelected()) {

            lblCode.setEnabled(true);
            txtCode.setEditable(true);
            lblDes.setEnabled(true);
            txtDescrip.setEditable(true);
            lblPrecio.setEnabled(true);
            txtPrecio.setEditable(true);
            limpiarCampos();

            btnBuscar.setEnabled(false);
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_rbAltaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        limpiarCampos();

        boolean flag = true;

        for (Articulo articulo : listaArt) {
            if (articulo.getCodigo().equalsIgnoreCase(txtCode.getText())) {

                txtDescrip.setText(articulo.getDescripcion());
                txtPrecio.setText(articulo.getPrecio().toString());

                flag = false;

                break;
            }
        }
        if (flag) {
            JOptionPane.showMessageDialog(null,
                    "NO SE HA ENCONTRADO NINGÚN REGISTRO \nBUSQUE POR OTRO CODIGO",
                    "¡ADVERTENCIA!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    @SuppressWarnings("null")
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        boolean check = true;

        try {
            String cod = txtCode.getText();
            String des = txtDescrip.getText();
            Double precio = Double.valueOf(txtPrecio.getText());

            if (!cod.isEmpty() && !des.isEmpty()) {
                for (Articulo articulo : listaArt) {
                    if (articulo.getCodigo().equalsIgnoreCase(cod)) {
                        check = false;
                        break;
                    }
                }
                if (check) {

                    Articulo art = new Articulo(cod.toUpperCase(), des, precio);

                    art.setPrecio(precio);

                    articuloController.create(art);

                    txtCode.setText("");
                    limpiarCampos();

                    this.listaArt = articuloController.findArticuloEntities();
                    
                    
                    lblRes.setText(String.valueOf(listaArt.size()));

                    JOptionPane.showMessageDialog(null,
                            "REGISTRO AÑADIDO CORRECTAMENTE",
                            "¡INFO!",
                            JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null,
                            "EL CODIGO INTRODUCIDO YA EXISTE \n UTILICE OTRO",
                            "¡ADVERTENCIA!",
                            JOptionPane.WARNING_MESSAGE);

                }

            } else {
                JOptionPane.showMessageDialog(null,
                            "LOS CAMPOS NO PUEDEN ESTAR VACIOS",
                            "¡ADVERTENCIA!",
                            JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "EL VALOR PRECIO DEBE SER NUMÉRICO\nCON UN MÁXIMO DE DOS DECIMALES\nO ESTÁ VACIO",
                    "¡ADVERTENCIA!",
                    JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DI_PRACT1_AlejandroRomero().setVisible(true);
            }
        });
    }

    private void btnAtStartAndConsult() {
        lblCode.setEnabled(true);
        txtCode.setEditable(true);
        lblDes.setEnabled(false);
        txtDescrip.setEditable(false);
        lblPrecio.setEnabled(false);
        txtPrecio.setEditable(false);
        limpiarCampos();

        btnBuscar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }

    private void limpiarCampos() {
        txtDescrip.setText("");
        txtPrecio.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRes;
    private javax.swing.JRadioButton rbAlta;
    private javax.swing.JRadioButton rbConsulta;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
