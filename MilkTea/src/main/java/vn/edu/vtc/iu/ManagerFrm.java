package vn.edu.vtc.iu;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import vn.edu.vtc.App;
import vn.edu.vtc.bl.DrinkBL;
import vn.edu.vtc.persistance.Drink;

public class ManagerFrm extends javax.swing.JFrame {
    public static DefaultTableModel tblModel1;

    public ManagerFrm() {
        initComponents();
        this.setTitle("Manager");
        tblModel1 = (DefaultTableModel) jTable.getModel();
        pre.setEnabled(false);
        page.setText("1");
        showAll(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    public static void showAll(int i) {
        tblModel1.setRowCount(0);
        List<Drink> ls = DrinkBL.getAllDrink();
        if (i <= ls.size() / 10) {
            for (int j = i * 10 - 10; j < i * 10; j++) {
                tblModel1.addRow(new Object[] { j + 1, ls.get(j).getCode(), ls.get(j).getName(),
                        ls.get(j).getUnitPrice(), ls.get(j).getSold() });
            }
        } else {
            for (int j = i * 10 - 10; j < ls.size(); j++) {
                tblModel1.addRow(new Object[] { j + 1, ls.get(j).getCode(), ls.get(j).getName(),
                        ls.get(j).getUnitPrice(), ls.get(j).getSold() });
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jBtAdd = new javax.swing.JButton();
        jBtUpdate = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        page = new javax.swing.JTextField();
        pre = new javax.swing.JButton();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(599, 475));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIST DRINK ORDER BY SOLD");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "No","Code", "Name", "Uint price", "Sold"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jBtAdd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jBtAdd.setText("Add drink");
        jBtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAddActionPerformed(evt);
            }
        });

        jBtUpdate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jBtUpdate.setText("Update drink");
        jBtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtUpdateActionPerformed(evt);
            }
        });

        logOut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        logOut.setText("Log out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        page.setText("1");
        page.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pageKeyReleased(evt);
            }
        });

        pre.setText("Previous");
        pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jBtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jBtUpdate)
                                .addGap(60, 60, 60)
                                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pre)
                    .addComponent(next))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtAdd)
                    .addComponent(jBtUpdate)
                    .addComponent(logOut))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PreActionPerformed
        if (page.getText().matches("\\d+")) {
            next.setEnabled(true);
            int index;
            String indexStr;
            index = Integer.parseInt(page.getText()) - 1;
            if (index <= 1) {
                pre.setEnabled(false);
            }
            indexStr = Integer.toString(index);
            page.setText(indexStr);
            showAll(index);
        }
    }// GEN-LAST:event_PreActionPerformed

    private void pageKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_pageKeyReleased
        if (page.getText().matches("\\d+")) {
            int index, pageNo;
            index = Integer.parseInt(page.getText());
            List<Drink> ls = DrinkBL.getAllDrink();
            pageNo = (ls.size() / 10) + 1;
            if (index > pageNo || index < 1) {
                index = 1;
                page.setText("1");
                pre.setEnabled(false);
            }
            showAll(index);
        }
    }// GEN-LAST:event_pageKeyReleased

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nextActionPerformed
        if (page.getText().matches("\\d+")) {
            pre.setEnabled(true);
            int index, pageNo;
            String indexStr;
            index = Integer.parseInt(page.getText()) + 1;
            List<Drink> ls = DrinkBL.getAllDrink();
            pageNo = (ls.size() / 10) + 1;
            if (index >= pageNo) {
                next.setEnabled(false);
            }
            indexStr = Integer.toString(index);
            page.setText(indexStr);
            showAll(index);
        }

    }// GEN-LAST:event_nextActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logOutActionPerformed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }// GEN-LAST:event_logOutActionPerformed

    private void jBtUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBtUpdateActionPerformed

        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDrink().setVisible(true);
            }
        });
    }// GEN-LAST:event_jBtUpdateActionPerformed

    private void jBtAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBtAddActionPerformed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDrink().setVisible(true);
            }
        });
    }// GEN-LAST:event_jBtAddActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAdd;
    private javax.swing.JButton jBtUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton logOut;
    private javax.swing.JButton next;
    private javax.swing.JTextField page;
    private javax.swing.JButton pre;
    // End of variables declaration//GEN-END:variables
}
