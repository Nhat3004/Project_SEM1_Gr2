package vn.edu.vtc.iu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.plaf.TreeUI;
import javax.swing.table.DefaultTableModel;

import vn.edu.vtc.App;
import vn.edu.vtc.bl.DrinkBL;
import vn.edu.vtc.bl.InvoiceBL;
import vn.edu.vtc.persistance.Drink;

public class StaffFrm extends javax.swing.JFrame {
    public static DefaultTableModel tblModel1;
    public static DefaultTableModel tblModel2;

    public static List<Drink> lDrinks = new ArrayList<>();

    public StaffFrm() {
        initComponents();
        this.setTitle("Staff");
        tblModel1 = (DefaultTableModel) jTable.getModel();
        tblModel2 = (DefaultTableModel) jTable1.getModel();
        pre.setEnabled(false);
        jAdd.setEnabled(false);
        jSaveUpdate.setEnabled(false);
        jSavetoDtb.setEnabled(false);
        page.setText("1");
        showAllCard(lDrinks);
        showAll(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        page = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        pre = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCode = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jQuantity = new javax.swing.JTextField();
        jIce = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSugar = new javax.swing.JComboBox<>();
        jAdd = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        jSaveUpdate = new javax.swing.JButton();
        jSavetoDtb = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jPrint = new javax.swing.JButton();
        jLog = new javax.swing.JButton();
        jLog1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "No","Code", "Name", "Uint price", "Quantity", "Ice", "Sugar"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "No","Code", "Name", "Uint price", "Sold"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        page.setText("1");
        page.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pageKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        pre.setText("Previous");
        pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Code");

        jCode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCodeKeyReleased(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Quantity");

        jQuantity.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jQuantity.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jQuantity.setText("1");
        jQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jQuantityKeyReleased(evt);
            }
        });

        jIce.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jIce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "30", "40", "70" }));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("% ice");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("% sugar");

        jSugar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jSugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "30", "50", "70" }));
        jSugar.setPreferredSize(new java.awt.Dimension(68, 24));

        jAdd.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jAdd.setText("Add");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jUpdate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jSaveUpdate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jSaveUpdate.setText("Save update");
        jSaveUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveUpdateActionPerformed(evt);
            }
        });

        jSavetoDtb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jSavetoDtb.setText("Save invoice");
        jSavetoDtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSavetoDtbActionPerformed(evt);
            }
        });

        jReset.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jReset.setText("Reset");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        jPrint.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPrint.setText("Print");
        jPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrintActionPerformed(evt);
            }
        });

        jLog.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLog.setText("Logout");
        jLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogActionPerformed(evt);
            }
        });

        jLog1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLog1.setText("Update Invoice by ID");
        jLog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLog1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSugar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCode, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jIce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2)))
                        .addContainerGap(78, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSavetoDtb)
                        .addGap(18, 18, 18)
                        .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLog, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(pre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jUpdate)
                                .addGap(26, 26, 26)
                                .addComponent(jSaveUpdate)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLog1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pre)
                    .addComponent(next))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jQuantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIce))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSaveUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSavetoDtb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLog, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLog1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        // TODO add your handling code here:
        int selectedIndex;        
        selectedIndex = jTable1.getSelectedRow();
        jAdd.setEnabled(false);
        if(lDrinks.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, 
                    "No drink to update");
        } else if(selectedIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Choose a row to update!");
        } else {
            jSaveUpdate.setEnabled(true);
            Drink drink2 = new Drink();
            drink2=lDrinks.get(selectedIndex);
            jCode.setText(drink2.getCode());
            jQuantity.setText(String.valueOf(drink2.getQuantity()));
            jIce.setSelectedItem(String.valueOf(drink2.getIce()));
            jSugar.setSelectedItem(String.valueOf(drink2.getSugar()));
        }
    }//GEN-LAST:event_jUpdateActionPerformed

    private void jSaveUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveUpdateActionPerformed
        // TODO add your handling code here:
        int selectedIndex;        
        selectedIndex = jTable1.getSelectedRow();
        Drink dr = new Drink();
        dr = DrinkBL.getByCode(jCode.getText());
        dr.setQuantity(Integer.parseInt(jQuantity.getText()));
        dr.setIce(Integer.parseInt(jIce.getSelectedItem().toString()));
        dr.setSugar(Integer.parseInt(jSugar.getSelectedItem().toString()));
        dr.setAmount(dr.getUnitPrice() * dr.getQuantity());
        for (int i = 0; i < lDrinks.size(); i++) {
            if (i ==selectedIndex) {
                lDrinks.set(i, dr);
            }
        }
        jAdd.setEnabled(true);
        jSaveUpdate.setEnabled(false);
        showAllCard(lDrinks);

    }//GEN-LAST:event_jSaveUpdateActionPerformed

    private void jSavetoDtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSavetoDtbActionPerformed
        // TODO add your handling code here:
        int idInvoice;
        idInvoice= InvoiceBL.insertInvoice(1, 1);
        for (Drink drr : lDrinks) {
            InvoiceBL.insertInvoiceDetails(idInvoice, drr.getCode(), drr.getQuantity(), drr.getIce(),drr.getSugar());
        }
        JOptionPane.showMessageDialog(rootPane, "Save successfully!\n Your invoice ID is: "+idInvoice);


    }//GEN-LAST:event_jSavetoDtbActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        // TODO add your handling code here:
        lDrinks.clear();
        jCode.setText(null);
        jSavetoDtb.setEnabled(false);
        showAllCard(lDrinks);

    }//GEN-LAST:event_jResetActionPerformed

    private void jPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrintActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintInvoice().setVisible(true);
            }
        });
    }//GEN-LAST:event_jPrintActionPerformed

    private void jLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogActionPerformed
            // TODO add your handling code here:
            this.dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new App().setVisible(true);
                }
            });
    }//GEN-LAST:event_jLogActionPerformed

    private void jLog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLog1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }//GEN-LAST:event_jLog1ActionPerformed

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jAddActionPerformed
        // TODO add your handling code here:
        Drink dr = new Drink();
        jSavetoDtb.setEnabled(true);
        dr = DrinkBL.getByCode(jCode.getText());
        dr.setQuantity(Integer.parseInt(jQuantity.getText()));
        dr.setIce(Integer.parseInt(jIce.getSelectedItem().toString()));
        dr.setSugar(Integer.parseInt(jSugar.getSelectedItem().toString()));
        dr.setAmount(dr.getUnitPrice() * dr.getQuantity());
        if (lDrinks.isEmpty()) {
            lDrinks.add(dr);
        } else {
            boolean found = false;
            for (Drink drink : lDrinks) {
                if (drink.getCode().equals(dr.getCode()) && drink.getIce() == dr.getIce()
                        && drink.getSugar() == dr.getSugar()) {
                    int newQuantity;
                    newQuantity = drink.getQuantity() + dr.getQuantity();
                    drink.setQuantity(newQuantity);
                    found = true;
                } else {
                    found = false;
                }
            }
            if (!found) {
                lDrinks.add(dr);
            }
        }
        showAllCard(lDrinks);
    }// GEN-LAST:event_jAddActionPerformed

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

    public static void showAllCard(List<Drink> iList) {
        tblModel2.setRowCount(0);
        for (Drink drink : iList) {
            tblModel2.addRow(new Object[] { iList.indexOf(drink) + 1, drink.getCode(), drink.getName(),
                    drink.getUnitPrice(), drink.getQuantity(), drink.getIce(), drink.getSugar() });
        }
    }

    private void jCodeKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jCodeKeyReleased
        if (jCode.getText().isEmpty()) {
            jTextArea1.setText("Code must not be empty!");
            jQuantity.setEnabled(false);
        }
        Drink dr = new Drink();
        dr = DrinkBL.getByCode(jCode.getText());
        if (dr.getName() != null) {
            jQuantity.setEnabled(true);
            jAdd.setEnabled(true);
            jTextArea1.setText("Name: " + dr.getName() + "\nUnit price: " + dr.getUnitPrice());
        } else {
            jTextArea1.setText("Drink code is not existed!");
            jAdd.setEnabled(false);
            jQuantity.setEnabled(false);
        }
    }// GEN-LAST:event_jCodeKeyReleased

    private void jQuantityKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jQuantityKeyReleased
        if (jQuantity.getText().isEmpty()) {
            jTextArea1.setText("Quantity must not be empty!");
            jAdd.setEnabled(false);

        } else {
            if (jQuantity.getText().matches("\\d+") && Integer.parseInt(jQuantity.getText()) > 0) {
                Drink dr = new Drink();
                dr = DrinkBL.getByCode(jCode.getText());
                jTextArea1.setText("Name: " + dr.getName() + "\nUnit price: " + dr.getUnitPrice() + "\nQuantity: "
                        + jQuantity.getText());
                jAdd.setEnabled(true);

            } else {
                jTextArea1.setText("Quantity must be a number & greater than 0.");
                jAdd.setEnabled(false);

            }
        }
    }// GEN-LAST:event_jQuantityKeyReleased

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

    private void preActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_preActionPerformed
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
    }// GEN-LAST:event_preActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StaffFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JTextField jCode;
    private javax.swing.JComboBox<String> jIce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLog;
    private javax.swing.JButton jLog1;
    private javax.swing.JButton jPrint;
    private javax.swing.JTextField jQuantity;
    private javax.swing.JButton jReset;
    private javax.swing.JButton jSaveUpdate;
    private javax.swing.JButton jSavetoDtb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> jSugar;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jUpdate;
    private javax.swing.JButton next;
    private javax.swing.JTextField page;
    private javax.swing.JButton pre;
    // End of variables declaration//GEN-END:variables
}
