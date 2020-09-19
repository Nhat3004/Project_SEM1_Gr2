package vn.edu.vtc.iu;

import javax.swing.JOptionPane;

import vn.edu.vtc.bl.DrinkBL;
import vn.edu.vtc.persistance.Drink;

public class AddDrink extends javax.swing.JFrame {

    public AddDrink() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCode = new javax.swing.JTextField();
        jName = new javax.swing.JTextField();
        jAdd = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jUnitPrice = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Add Drink");

        jCode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCodeKeyReleased(evt);
            }
        });

        jName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jNameKeyReleased(evt);
            }
        });

        jAdd.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jAdd.setText("Add");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jCancel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jCancel.setText("Cancel");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Code:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Unit price:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        jTextPane1.setBorder(null);
        jScrollPane1.setViewportView(jTextPane1);

        jUnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jUnitPriceKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup().addContainerGap(160, Short.MAX_VALUE).addComponent(jLabel1)
                                .addContainerGap(160, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup().addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1).addComponent(jName).addComponent(jCode)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31).addComponent(jCancel,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCode, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jUnitPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 28,
                                                Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jAddActionPerformed
        Drink drink = new Drink();
        drink.setCode(jCode.getText());
        drink.setName(jName.getText());
        drink.setUnitPrice(Double.parseDouble(jUnitPrice.getText()));
        if (DrinkBL.insertDrink(drink)) {
            JOptionPane.showMessageDialog(rootPane, "Insert successfully!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Insert fail!");
        }
        jCode.setText(null);
        jName.setText(null);
        jUnitPrice.setText(null);
    }// GEN-LAST:event_jAddActionPerformed

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCancelActionPerformed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerFrm().setVisible(true);
            }
        });
    }// GEN-LAST:event_jCancelActionPerformed

    private void jCodeKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jCodeKeyReleased
        if (jCode.getText().isEmpty()) {
            jTextPane1.setText("Code must not be empty!");
            jAdd.setEnabled(false);
        } else {
            if (!(jCode.getText().length() <= 10)) {
                jTextPane1.setText("Code is too long!(not more 10 character)");
                jAdd.setEnabled(false);
            } else {
                jAdd.setEnabled(true);
                jTextPane1.setText(null);
            }
        }
        Drink dr = new Drink();
        dr = DrinkBL.getByCode(jCode.getText());
        if (dr.getName() != null) {
            jTextPane1.setText("Drink code is existed!");
            jName.setText(dr.getName());
            jUnitPrice.setText(dr.getUnitPrice().toString());
            jAdd.setEnabled(false);
            jName.setEnabled(false);
            jUnitPrice.setEnabled(false);
        } else {
            jAdd.setEnabled(true);
            jTextPane1.setText(null);
            jName.setText(null);
            jUnitPrice.setText(null);
            jName.setEnabled(true);
            jUnitPrice.setEnabled(true);

        }
        if (jName.getText().isEmpty() || jUnitPrice.getText().isEmpty()) {
            jAdd.setEnabled(false);
        }

    }// GEN-LAST:event_jCodeKeyReleased

    private void jNameKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jNameKeyReleased
        if (jName.getText().isEmpty()) {
            jTextPane1.setText("Name must not be empty!");
            jAdd.setEnabled(false);
        } else {
            if (jName.getText().length() <= 60) {
                jAdd.setEnabled(true);
                jTextPane1.setText(null);
            } else {
                jTextPane1.setText("Name is too long!(not more 60 character)");
                jAdd.setEnabled(false);
            }

        }
        if (jCode.getText().isEmpty() || jUnitPrice.getText().isEmpty()) {
            jAdd.setEnabled(false);
        }
    }// GEN-LAST:event_jNameKeyReleased

    private void jUnitPriceKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jUnitPriceKeyReleased

        if (jUnitPrice.getText().isEmpty()) {
            jTextPane1.setText("Unit price must not be empty!");
            jAdd.setEnabled(false);
        } else {
            if (jUnitPrice.getText().matches("\\d+")) {
                jAdd.setEnabled(true);
                jTextPane1.setText(null);
            } else {
                jTextPane1.setText("Unit price must be a number.");
                jAdd.setEnabled(false);
            }
        }
        if (jCode.getText().isEmpty() || jName.getText().isEmpty()) {
            jAdd.setEnabled(false);
        }
    }// GEN-LAST:event_jUnitPriceKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDrink().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jCancel;
    private javax.swing.JTextField jCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField jUnitPrice;
    // End of variables declaration//GEN-END:variables
}
