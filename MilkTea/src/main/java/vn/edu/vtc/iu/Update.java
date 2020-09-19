package vn.edu.vtc.iu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.TreeUI;
import javax.swing.table.DefaultTableModel;
import vn.edu.vtc.App;
import vn.edu.vtc.bl.DrinkBL;
import vn.edu.vtc.bl.InvoiceBL;
// import vn.edu.vtc.bl.InvoiceBL;
import vn.edu.vtc.dal.InvoiceDAL;
import vn.edu.vtc.persistance.Drink;
import vn.edu.vtc.persistance.Invoice;

public class Update extends javax.swing.JFrame {

    public static DefaultTableModel tblModel1;
    public static DefaultTableModel tblModel2;
    public static List<Drink> lDrinks = new ArrayList<>();

    public Update() {
        initComponents();
        this.setTitle("Staff");
        tblModel1 = (DefaultTableModel) jTable.getModel();
        tblModel2 = (DefaultTableModel) jTable1.getModel();
        pre.setEnabled(false);
        jSaveUpdate.setEnabled(false);
        jCode.setEditable(false);
        page.setText("1");
        jFind.setEnabled(false);
        showAllCard(lDrinks);
        showAll(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        page = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        jSugar = new javax.swing.JComboBox<>();
        pre = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jUpdate = new javax.swing.JButton();
        jCode = new javax.swing.JTextField();
        jSaveUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jReset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPrint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jQuantity = new javax.swing.JTextField();
        jLog = new javax.swing.JButton();
        jIce = new javax.swing.JComboBox<>();
        jLog1 = new javax.swing.JButton();
        jFind = new javax.swing.JButton();
        jInvoiceID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        page.setText("1");
        page.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pageKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("% ice");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("% sugar");

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jSugar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jSugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "30", "50", "70" }));
        jSugar.setPreferredSize(new java.awt.Dimension(68, 24));

        pre.setText("Previous");
        pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Code");

        jUpdate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jCode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCodeKeyReleased(evt);
            }
        });

        jSaveUpdate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jSaveUpdate.setText("Save update");
        jSaveUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveUpdateActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTable1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "No","Code", "Name", "Uint price", "Quantity", "Ice", "Sugar"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jReset.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jReset.setText("Reset");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Quantity");

        jPrint.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPrint.setText("Print");
        jPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrintActionPerformed(evt);
            }
        });

        jTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "No","Code", "Name", "Uint price", "Sold"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jQuantity.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jQuantity.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jQuantity.setText("1");
        jQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jQuantityKeyReleased(evt);
            }
        });

        jLog.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLog.setText("Logout");
        jLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogActionPerformed(evt);
            }
        });

        jIce.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jIce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "30", "40", "70" }));

        jLog1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLog1.setText("Back");
        jLog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLog1ActionPerformed(evt);
            }
        });

        jFind.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jFind.setText("Find");
        jFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFindActionPerformed(evt);
            }
        });

        jInvoiceID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jInvoiceID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jInvoiceIDKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Invoice ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSugar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLog1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLog, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jInvoiceID)
                                            .addComponent(jCode, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFind))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jIce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jUpdate)
                                                .addGap(27, 27, 27)
                                                .addComponent(jSaveUpdate))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFind, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jInvoiceID)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jCode))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSaveUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLog, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLog1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFindActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Invoice in = new Invoice();
        List<Drink> lDrinks = new ArrayList<>();
        lDrinks.clear();
        in = InvoiceDAL.getInvoiceByID(Integer.parseInt(jInvoiceID.getText()));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.parse(in.getDate(), formatter);
        long time = java.time.Duration.between(localDateTime2, localDateTime1).toMinutes();
        if (time > 60.0 && in.getStaffId() == 1) {
            JOptionPane.showMessageDialog(null,
                    "You can only update this invoice within 60 minutes of it being created.");

        } else if (in.getStaffId() != 1) {
            JOptionPane.showMessageDialog(null, "You are not allow to update this invoice!");
        } else if (time <= 60 && in.getStaffId() == 1) {
            lDrinks = InvoiceDAL.getInvoiceDetails(Integer.parseInt(jInvoiceID.getText()));
        }
        showAllCard(lDrinks);
    }// GEN-LAST:event_jFindActionPerformed

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

    private void pageKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_pageKeyReleased
        // TODO add your handling code here:
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
        // TODO add your handling code here:
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
        // TODO add your handling code here:
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

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jUpdateActionPerformed
        // TODO add your handling code here:
        int selectedIndex;
        selectedIndex = jTable1.getSelectedRow();
        List<Drink> lDrinks = new ArrayList<>();
        lDrinks.clear();
        lDrinks = InvoiceDAL.getInvoiceDetails(Integer.parseInt(jInvoiceID.getText()));
        if (lDrinks.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "No drink to update");
        } else if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, "Choose a row to update!");
        } else {
            jSaveUpdate.setEnabled(true);
            Drink drink2 = new Drink();
            drink2 = lDrinks.get(selectedIndex);
            jCode.setText(drink2.getCode());
            jQuantity.setText(String.valueOf(drink2.getQuantity()));
            jIce.setSelectedItem(String.valueOf(drink2.getIce()));
            jSugar.setSelectedItem(String.valueOf(drink2.getSugar()));
        }
    }// GEN-LAST:event_jUpdateActionPerformed

    private void jCodeKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jCodeKeyReleased

    }// GEN-LAST:event_jCodeKeyReleased

    private void jSaveUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jSaveUpdateActionPerformed
        // TODO add your handling code here:
        int selectedIndex;
        selectedIndex = jTable1.getSelectedRow();
        List<Drink> lDrinks = new ArrayList<>();
        lDrinks.clear();
        lDrinks = InvoiceDAL.getInvoiceDetails(Integer.parseInt(jInvoiceID.getText()));
        Drink dr = new Drink();
        dr = DrinkBL.getByCode(jCode.getText());
        int temp, change;
        temp = Integer.parseInt(jQuantity.getText());
        change = temp - lDrinks.get(selectedIndex).getQuantity();
        dr.setQuantity(temp);
        dr.setQuantity(Integer.parseInt(jQuantity.getText()));
        dr.setIce(Integer.parseInt(jIce.getSelectedItem().toString()));
        dr.setSugar(Integer.parseInt(jSugar.getSelectedItem().toString()));
        dr.setAmount(dr.getUnitPrice() * dr.getQuantity());
        for (int i = 0; i < lDrinks.size(); i++) {
            if (i == selectedIndex) {
                lDrinks.set(i, dr);
            }
        }
        jSaveUpdate.setEnabled(false);

        if (InvoiceBL.updateInvoiceDetails(Integer.parseInt(jInvoiceID.getText()), dr.getCode(), dr.getQuantity(), change, dr.getIce(), dr.getSugar())){
            JOptionPane.showMessageDialog(rootPane, "Update successfully!");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Update fail!");
  
        }        

        showAllCard(lDrinks);
    }// GEN-LAST:event_jSaveUpdateActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jResetActionPerformed
        // TODO add your handling code here:
        lDrinks.clear();
        jCode.setText(null);
        jQuantity.setText(null);
        jInvoiceID.setText(null);
        showAllCard(lDrinks);
    }// GEN-LAST:event_jResetActionPerformed

    private void jPrintActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jPrintActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintInvoice().setVisible(true);
            }
        });
    }// GEN-LAST:event_jPrintActionPerformed

    private void jQuantityKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jQuantityKeyReleased
        // TODO add your handling code here:
        if (jQuantity.getText().isEmpty()) {
            jTextArea1.setText("Quantity must not be empty!");
            jSaveUpdate.setEnabled(false);

        } else {
            if (jQuantity.getText().matches("\\d+") && Integer.parseInt(jQuantity.getText()) > 0) {
                Drink dr = new Drink();
                dr = DrinkBL.getByCode(jCode.getText());
                jTextArea1.setText("Name: " + dr.getName() + "\nUnit price: " + dr.getUnitPrice() + "\nQuantity: "
                        + jQuantity.getText());

            } else {
                jTextArea1.setText("Quantity must be a number & greater than 0.");
                jSaveUpdate.setEnabled(false);

            }
        }
    }// GEN-LAST:event_jQuantityKeyReleased

    private void jLogActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jLogActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }// GEN-LAST:event_jLogActionPerformed

    private void jLog1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jLog1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffFrm().setVisible(true);
            }
        });
    }// GEN-LAST:event_jLog1ActionPerformed

    private void jSaveDtbActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jSaveDtbActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jSaveDtbActionPerformed

    private void jInvoiceIDKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jInvoiceIDKeyReleased
        // TODO add your handling code here:
        if (jInvoiceID.getText().isEmpty()) {
            jTextArea1.setText("Invoice is empty!");
        } else {
            if (jInvoiceID.getText().matches("\\d+")) {
                Invoice in = new Invoice();
                int id;
                id = Integer.parseInt(jInvoiceID.getText());
                List<Drink> lst = new ArrayList<>();
                in = InvoiceDAL.getInvoiceByID(id);
                if (in.getId() == 0) {
                    jTextArea1.setText("Invoice doesn't exist!");
                    jFind.setEnabled(false);
                } else {
                    jTextArea1.setText(null);
                    jFind.setEnabled(true);
                }
            } else {
                jTextArea1.setText("Invoice ID must be a number.");
                jFind.setEnabled(false);
            }
        }
    }// GEN-LAST:event_jInvoiceIDKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCode;
    private javax.swing.JButton jFind;
    private javax.swing.JComboBox<String> jIce;
    private javax.swing.JTextField jInvoiceID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jLog;
    private javax.swing.JButton jLog1;
    private javax.swing.JButton jPrint;
    private javax.swing.JTextField jQuantity;
    private javax.swing.JButton jReset;
    private javax.swing.JButton jSaveUpdate;
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
