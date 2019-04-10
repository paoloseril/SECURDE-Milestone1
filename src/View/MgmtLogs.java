/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SQLite;
import Model.Logs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author beepxD
 */
public class MgmtLogs extends javax.swing.JPanel {

    public SQLite sqlite;
    public DefaultTableModel tableModel;
    public SearchLog searchLog;

    public MgmtLogs(SQLite sqlite) {
        initComponents();
        searchLog = new SearchLog();
        searchLog.getSearchBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the description name if any
                ArrayList<Logs> possibleLogs = sqlite.getLogs();
                // contains ignore case desc
                String desc = searchLog.getDesc().getText().toLowerCase();
                String date = searchLog.getDate().getText();

                List<String> checkListFunction = searchLog.getCheckBoxesFunctionalities();
                List<String> checkListTests = searchLog.getCheckBoxesTests();
                List<String> checkListUser = searchLog.getCheckBoxesUser();

                if (!desc.isEmpty()) {
                    // remove log from list
                    possibleLogs.removeIf(log -> !log.getDesc().toLowerCase().contains(desc));
                }

                if (!date.isEmpty()) {
                    // remove log from list
                    possibleLogs.removeIf(log -> !log.getTimestamp().toString().contains(date));
                }

                if (checkListFunction.size() >= 1 || checkListTests.size() >= 1 || checkListUser.size() >= 1) {
                    String pattern = "";
                    if (checkListFunction.size() >= 1 && checkListTests.size() >= 1) {
                        for (int i = 0; i < checkListTests.size(); i++) {
                            for (int j = 0; j < checkListFunction.size(); j++) {
                                // if the last element in both two lists
                                if (i + 1 == checkListTests.size() && j + 1 == checkListFunction.size()) {
                                    pattern = pattern.concat(checkListFunction.get(j) + "-" + checkListTests.get(i));
                                }
                                else {
                                    pattern = pattern.concat(checkListFunction.get(j) + "-" + checkListTests.get(i)).concat("|");
                                }
                            }
                        }
                    }
                    // CF-[FS]
                    else if (checkListFunction.size() >= 1) {
                        for (int i = 0; i < checkListFunction.size(); i++) {
                            if (i + 1 == checkListFunction.size()) {
                                pattern = pattern.concat(checkListFunction.get(i) + "-[FS]");
                            }
                            else {
                                pattern = pattern.concat(checkListFunction.get(i) + "-[FS]|");
                            }
                        }
                    }
                    // [any]-F |[any]-S
                    else if (checkListTests.size() >= 1) {
                        for (int i = 0; i < checkListTests.size(); i++) {
                            if (i + 1 == checkListTests.size()) {
                                pattern = pattern.concat("\\w+" + "-" + checkListTests.get(i));
                            }
                            else {
                                pattern = pattern.concat("\\w+" + "-" + checkListTests.get(i) + "|");
                            }
                        }
                    }

                    if (checkListUser.size() >= 1) {
                        for (int i = 0; i < checkListUser.size(); i++) {
                            if (i == 0 && pattern.equals("")) {
                                pattern = pattern.concat(checkListUser.get(i));
                            }
                            else {
                                pattern = pattern.concat("|").concat(checkListUser.get(i));
                            }
                        }
                    }

                    System.out.println("Pattern: " + pattern);
                    Iterator<Logs> iterator = possibleLogs.iterator();
                    while (iterator.hasNext()) {
                        Logs log = iterator.next();
                        if (!log.getEvent().matches(pattern)) {
                            // remove log from list
                            iterator.remove();
                        }
                    }
                }

                for(int nCtr = tableModel.getRowCount(); nCtr > 0; nCtr--){
                    tableModel.removeRow(0);
                }

                for (Logs possibleLog : possibleLogs) {
                    tableModel.addRow(new Object[]{
                            possibleLog.getEvent(),
                            possibleLog.getUsername(),
                            possibleLog.getDesc(),
                            possibleLog.getTimestamp()});
                }
            }
        });
        this.sqlite = sqlite;
        tableModel = (DefaultTableModel)table.getModel();
        table.getTableHeader().setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 14));

    }

    public void init(){
        //      CLEAR TABLE
        for(int nCtr = tableModel.getRowCount(); nCtr > 0; nCtr--){
            tableModel.removeRow(0);
        }

        if (sqlite.getLogs().size() == 0) {
            debugBtn.setEnabled(false);
            clearBtn.setEnabled(false);
        } else {
            debugBtn.setEnabled(true);
            clearBtn.setEnabled(true);
        }
        debugBtn.setText("ENABLE DEBUG MODE");
//      LOAD CONTENTS
        ArrayList<Logs> logs = sqlite.getLogs();
        for(int nCtr = 0; nCtr < logs.size(); nCtr++){
            tableModel.addRow(new Object[]{
                    logs.get(nCtr).getEvent(),
                    logs.get(nCtr).getUsername(),
                    logs.get(nCtr).getDesc(),
                    logs.get(nCtr).getTimestamp()});
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clearBtn = new javax.swing.JButton();
        debugBtn = new javax.swing.JButton();

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Event", "Username", "Description", "Timestamp"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(24);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(80);
            table.getColumnModel().getColumn(1).setPreferredWidth(160);
            table.getColumnModel().getColumn(2).setPreferredWidth(400);
            table.getColumnModel().getColumn(3).setPreferredWidth(240);
        }

        clearBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        debugBtn.setBackground(new java.awt.Color(255, 255, 255));
        debugBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        debugBtn.setText("ENABLE/DISABLE DEBUG MODE");
        debugBtn.setToolTipText("");
        debugBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debugBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(debugBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(0, 0, 0)
                                                .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(debugBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        String tempString = tableModel.getValueAt(table.getSelectedRow(), 3).toString();
        this.sqlite.deleteLogs(tempString);
        if (sqlite.getLogs().size() == 0) {
            debugBtn.setEnabled(false);
            clearBtn.setEnabled(false);
        } else {
            debugBtn.setEnabled(true);
            clearBtn.setEnabled(true);
        }
        init();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void debugBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debugBtnActionPerformed
        if(sqlite.DEBUG_MODE == 1) {
            // close the application
            searchLog.setVisible(false);
            debugBtn.setText("ENABLE DEBUG MODE");
            sqlite.DEBUG_MODE = 0;
            init();
        }
        else {
            debugBtn.setText("DISABLE DEBUG MODE");
            searchLog.setVisible(true);
            clearBtn.setEnabled(false);
            sqlite.DEBUG_MODE = 1;
        }
    }//GEN-LAST:event_debugBtnActionPerformed

    public void setDebugBtn(boolean visible) {
        this.debugBtn.setVisible(visible);
    }

    public void setClearBtn(boolean visible) {
        this.clearBtn.setVisible(visible);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton debugBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
