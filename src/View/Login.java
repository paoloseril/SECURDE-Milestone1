
package View;

import Model.User;
import Values.Constant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Login extends javax.swing.JPanel {

    public Frame frame;

    private void resetAttemptCounts() {
        for (Map.Entry<String, Integer> entry : Constant.attemptCounts.entrySet()) {
            Constant.attemptCounts.put(entry.getKey(), 0);
        }
    }

    private void increaseCount(String user) {
        Constant.attemptCounts.put(user, Constant.attemptCounts.get(user) + 1);
    }

    private int getCount(String user) {
        return Constant.attemptCounts.get(user);
    }

    public Login() {
        initComponents();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel("You are locked out. Please contact I.T. support.");
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new JButton("Back!");

        jButton3.setVisible(false);
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton3.setVisible(false);
                jLabel3.setVisible(false);
                jLabel1.setVisible(true);
                jLabel2.setVisible(true);
                jTextField1.setVisible(true);
                jTextField2.setVisible(true);
                jButton1.setVisible(true);
                jButton2.setVisible(true);
                jTextField1.setEnabled(true);
                jTextField2.setEnabled(true);
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial", Font.PLAIN, 15));
        jLabel2.setForeground(Color.RED);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("");
        jLabel2.setToolTipText("");

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.BLACK, 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jTextField2.setBackground(new java.awt.Color(240, 240, 240));
        jTextField2.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24)); // NOI18N
        jButton1.setForeground(Color.BLACK);
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLabel3.setVisible(false);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(Color.BLACK);
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(200, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, GroupLayout.DEFAULT_SIZE)
                                .addComponent(jTextField1)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(88, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String username = jTextField1.getText().strip();
        String password = String.valueOf(jTextField2.getPassword());
        setUsernameFieldBlack();
        setPasswordFieldBlack();
        if (username.isEmpty() || password.isEmpty()) {
            frame.main.sqlite.addLogs(Constant.LOGIN_FAILED, username, "User '" + username + "' failed to login due to missing input fields", new Timestamp(new Date().getTime()).toString());
            if (username.isEmpty() && password.isEmpty()) {
                jLabel2.setText("Username and password fields are empty!");
                setUsernameFieldRed();
                setPasswordFieldRed();
            }
            else if (username.isEmpty()){
                jLabel2.setText("Username field is empty!");
                setUsernameFieldRed();
            }
            else {
                jLabel2.setText("Password field is empty!");
                setPasswordFieldRed();
            }
        }
        else {
            int role = frame.main.sqlite.authenticate(username, password);
            if (role != -99) {
                if (frame.main.sqlite.isLocked(username)) {
                    frame.main.sqlite.addLogs(Constant.USER_LOCKED, username, "User '" + username + "' attempted to login but was locked out", new Timestamp(new Date().getTime()).toString());
                    e_Mode();
                }
                else {
                    setNormal();
                    resetAttemptCounts();
                    System.out.println("P");
                    frame.main.sqlite.addLogs(Constant.LOGIN_SUCCESSFUL, username, "User '" + username + "' has successfully logged in", new Timestamp(new Date().getTime()).toString());
                    frame.mainNav(username, role);
                }
            }
            else {
                if (frame.main.sqlite.isLocked(username)) {
                    frame.main.sqlite.addLogs(Constant.USER_LOCKED, username, "User '" + username + "' attempted to login but was locked out", new Timestamp(new Date().getTime()).toString());
                    e_Mode();
                }
                else {
                    jLabel2.setText("Invalid credentials!");
                    if (frame.main.sqlite.userExists(username) && !username.equalsIgnoreCase("admin")) {
                        increaseCount(username);
                        frame.main.sqlite.addLogs(Constant.LOGIN_FAILED, username, "User '" + username + "' has been unsuccessful to login due to invalid credentials", new Timestamp(new Date().getTime()).toString());
                        if (getCount(username) == 5) {
                            // set lock out for user
                            frame.main.sqlite.setLockout(username, 1);
                            e_Mode();
                            frame.main.sqlite.addLogs(Constant.USER_LOCKED, username, "User '" + username + "' has been locked out after 5 attempts to login", new Timestamp(new Date().getTime()).toString());
                            resetAttemptCounts();
                        }
                    }
                }
            }
        }
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    private void e_Mode() {
        setNormal();
        jButton3.setVisible(true);
        jLabel3.setVisible(true);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);

    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setNormal();
        frame.registerNav();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setUsernameFieldRed() {
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.RED, 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
    }

    private void setPasswordFieldRed() {
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.RED, 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
    }

    private void setUsernameFieldBlack() {
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.BLACK, 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
    }

    private void setPasswordFieldBlack() {
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.BLACK, 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
    }

    private void setNormal() {
        jTextField1.setText("");
        jTextField2.setText("");
        jLabel2.setText("");
        setUsernameFieldBlack();
        setPasswordFieldBlack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private JLabel jLabel2, jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField jTextField2;
    // End of variables declaration//GEN-END:variables
}
