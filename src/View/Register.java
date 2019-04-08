
package View;

import Values.Constant;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.sql.Timestamp;
import java.util.Date;

import static javax.swing.GroupLayout.DEFAULT_SIZE;
import static javax.swing.GroupLayout.PREFERRED_SIZE;

public class Register extends javax.swing.JPanel {

    public Frame frame;
    
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        confpass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(Color.BLACK);
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(240, 240, 240));
        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        password.setEchoChar('*');
        username.setBackground(new java.awt.Color(240, 240, 240));
        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial", Font.PLAIN, 15));
        jLabel2.setForeground(Color.BLACK);
        jLabel2.setSize(100, 40);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password should be between 8 to 15 characters in length and should have");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial", Font.PLAIN, 15));
        jLabel3.setForeground(Color.BLACK);
        jLabel3.setSize(100, 40);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("at least 2 uppercase letters, 3 lowercase letters, 2 digits and 1 symbol (except quotes))");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Arial", Font.PLAIN, 15));
        jLabel4.setForeground(Color.RED);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("");
        jLabel4.setToolTipText("");

        confpass.setBackground(new java.awt.Color(240, 240, 240));
        confpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        confpass.setEchoChar('*');
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(Color.BLACK);
        jButton2.setText("<Back");
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
                    .addComponent(username)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE)


                            .addComponent(confpass, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, PREFERRED_SIZE, 220, PREFERRED_SIZE)
                    .addContainerGap()

                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                    .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()

                    .addComponent(jButton2)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, PREFERRED_SIZE, 46, PREFERRED_SIZE)
                .addGap(20, 20, 20)
                    .addComponent(jLabel4, PREFERRED_SIZE, 20, PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(username, PREFERRED_SIZE, 59, PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel2, PREFERRED_SIZE, 20, PREFERRED_SIZE)
                    .addComponent(jLabel3, PREFERRED_SIZE, 20, PREFERRED_SIZE)

                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                    .addComponent(password, PREFERRED_SIZE, 59, PREFERRED_SIZE)

                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confpass, PREFERRED_SIZE, 59, PREFERRED_SIZE)
                .addGap(18, 18, 18)
                    .addComponent(jButton1, PREFERRED_SIZE, 52, PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user_name = username.getText().strip();

        String pass_word = String.valueOf(password.getPassword());

        String conf_pass = String.valueOf(confpass.getPassword());
        username.setText("");
        password.setText("");
        confpass.setText("");
        setUsernameFieldBlack();
        setPasswordFieldBlack();
        setConfirmPasswordFieldBlack();
        jLabel2.setForeground(Color.BLACK);
        jLabel3.setForeground(Color.BLACK);
        if (user_name.isEmpty() || pass_word.isEmpty() || conf_pass.isEmpty()) {
            frame.registerNav();
            String warning = "";
            if (user_name.isEmpty()) {
                warning = warning.concat("Username, ");
                setUsernameFieldRed();
            }
            if (pass_word.isEmpty()) {
                warning = warning.concat("Password, ");
                setPasswordFieldRed();
            }
            if (conf_pass.isEmpty()) {
                warning = warning.concat("Confirm Password");
                setConfirmPasswordFieldRed();
            }
            jLabel4.setText(warning.concat(" field/s are empty!"));
        }
        else if (!conf_pass.equals(pass_word)){
            frame.registerNav();
            setPasswordFieldRed();
            setConfirmPasswordFieldRed();
            jLabel4.setText("Confirmation password does not match the password!");
        }
        else if (frame.main.sqlite.userExists(user_name)) {
            frame.registerNav();
            setUsernameFieldRed();
            jLabel4.setText("The username already exists. Please use a different username!");
        }
        else {
            if (frame.main.sqlite.isAcceptable(user_name, pass_word)) {
                // alert that user has been registered
                frame.registerAction(user_name, pass_word, conf_pass);
                JOptionPane.showMessageDialog(null, "User has been successfully registered.");
                setNormal();
                Constant.attemptCounts.put(user_name, 0);
                frame.loginNav();
            }
            else {
                jLabel2.setForeground(Color.RED);
                jLabel3.setForeground(Color.RED);
                jLabel4.setText("Username or password entered does not follow the rules!");
                setPasswordFieldRed();
                frame.registerNav();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setNormal();
        frame.loginNav();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void setUsernameFieldRed() {
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.RED, 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
    }

    private void setPasswordFieldRed() {
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.RED, 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
    }

    private void setConfirmPasswordFieldRed() {
        confpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.RED, 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
    }

    private void setUsernameFieldBlack() {
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.BLACK, 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
    }

    private void setPasswordFieldBlack() {
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.BLACK, 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
    }

    private void setConfirmPasswordFieldBlack() {
        confpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(Color.BLACK, 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
    }

    private void setNormal() {
        jLabel2.setForeground(Color.BLACK);
        jLabel3.setForeground(Color.BLACK);
        jLabel4.setText("");
        username.setText("");
        password.setText("");
        confpass.setText("");
        setUsernameFieldBlack();
        setPasswordFieldBlack();
        setConfirmPasswordFieldBlack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1, jLabel2, jLabel3, jLabel4;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
