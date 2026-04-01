package onlinevotingsystem.view;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import onlinevotingsystem.model.DBConnect;

public class Main extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());

    public Main() {
        new DBConnect();
        initComponents();
        setInputTransparent();
        passwordField.setEchoChar((char) 0);
        passwordRegisterField.setEchoChar((char) 0);
        confirmPasswordField.setEchoChar((char) 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        firstNameField = new javax.swing.JTextField();
        middleNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        emailAddressRegisterField = new javax.swing.JTextField();
        passwordRegisterField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        logInSuggestion = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bgHeader = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registerSuggestion = new javax.swing.JLabel();
        emailAddressField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginDesc = new javax.swing.JLabel();
        loginToYourAccount = new javax.swing.JLabel();
        bsuLogo = new javax.swing.JLabel();
        loginBgInput = new javax.swing.JLabel();
        loginregisterBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COVS - Login");
        setMaximumSize(new java.awt.Dimension(571, 700));
        setMinimumSize(new java.awt.Dimension(571, 700));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        registerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordField.setOpaque(false);
        firstNameField.setColumns(2);
        firstNameField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        firstNameField.setForeground(new java.awt.Color(153, 153, 153));
        firstNameField.setText("First Name");
        firstNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        firstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusLost(evt);
            }
        });
        registerPanel.add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 290, 40));

        passwordField.setOpaque(false);
        middleNameField.setColumns(2);
        middleNameField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        middleNameField.setForeground(new java.awt.Color(153, 153, 153));
        middleNameField.setText("Middle Name");
        middleNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        middleNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                middleNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                middleNameFieldFocusLost(evt);
            }
        });
        registerPanel.add(middleNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 290, 40));

        passwordField.setOpaque(false);
        lastNameField.setColumns(2);
        lastNameField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lastNameField.setForeground(new java.awt.Color(153, 153, 153));
        lastNameField.setText("Last Name");
        lastNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        lastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusLost(evt);
            }
        });
        registerPanel.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 290, 40));

        passwordField.setOpaque(false);
        emailAddressRegisterField.setColumns(2);
        emailAddressRegisterField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emailAddressRegisterField.setForeground(new java.awt.Color(153, 153, 153));
        emailAddressRegisterField.setText("Email Address");
        emailAddressRegisterField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        emailAddressRegisterField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailAddressRegisterFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailAddressRegisterFieldFocusLost(evt);
            }
        });
        registerPanel.add(emailAddressRegisterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 290, 40));

        passwordRegisterField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        passwordRegisterField.setForeground(new java.awt.Color(153, 153, 153));
        passwordRegisterField.setText("Enter Password");
        passwordRegisterField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        passwordRegisterField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordRegisterFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordRegisterFieldFocusLost(evt);
            }
        });
        registerPanel.add(passwordRegisterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 290, 40));

        confirmPasswordField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        confirmPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        confirmPasswordField.setText("Confirm Password");
        confirmPasswordField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        confirmPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasswordFieldFocusLost(evt);
            }
        });
        registerPanel.add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 290, 40));

        jButton2.setBackground(new java.awt.Color(54, 145, 208));
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 290, 40));

        logInSuggestion.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        logInSuggestion.setForeground(new java.awt.Color(255, 255, 255));
        logInSuggestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logInSuggestion.setText("Already have an account? click here");
        logInSuggestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logInSuggestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInSuggestionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logInSuggestionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logInSuggestionMouseExited(evt);
            }
        });
        registerPanel.add(logInSuggestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 250, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Your Voice, Your Vote—Made Digital");
        registerPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 190, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sign up, be ready, make your vote count, BulSUan");
        registerPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Register an account");
        registerPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register-bg-inputs.png"))); // NOI18N
        registerPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 330, 500));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/covs-logo.png"))); // NOI18N
        registerPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-register-bg-header.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        registerPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 571, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-register-bg.png"))); // NOI18N
        registerPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, -1, 560));

        getContentPane().add(registerPanel, "registerCard");

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setMaximumSize(new java.awt.Dimension(571, 802));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Your Voice, Your Vote—Made Digital");
        loginPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 190, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/covs-logo.png"))); // NOI18N
        loginPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        bgHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-register-bg-header.png"))); // NOI18N
        loginPanel.add(bgHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setBackground(new java.awt.Color(54, 145, 208));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 290, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email-icon.png"))); // NOI18N
        loginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password-icon.png"))); // NOI18N
        loginPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 30, 50));

        registerSuggestion.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        registerSuggestion.setForeground(new java.awt.Color(255, 255, 255));
        registerSuggestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerSuggestion.setText("Don’t have an account yet? click here");
        registerSuggestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerSuggestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerSuggestionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerSuggestionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerSuggestionMouseExited(evt);
            }
        });
        loginPanel.add(registerSuggestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 240, 30));

        passwordField.setOpaque(false);
        emailAddressField.setColumns(2);
        emailAddressField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emailAddressField.setForeground(new java.awt.Color(153, 153, 153));
        emailAddressField.setText("Email Address");
        emailAddressField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 45, 1, 1)));
        emailAddressField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailAddressFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailAddressFieldFocusLost(evt);
            }
        });
        loginPanel.add(emailAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 290, 50));

        passwordField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setText("Password");
        passwordField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 45, 1, 1)));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        loginPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 290, 50));

        loginDesc.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        loginDesc.setForeground(new java.awt.Color(255, 255, 255));
        loginDesc.setText("Sign in, and let your vote speak, BulSUan");
        loginPanel.add(loginDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        loginToYourAccount.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        loginToYourAccount.setForeground(new java.awt.Color(255, 255, 255));
        loginToYourAccount.setText("Log in to your account");
        loginPanel.add(loginToYourAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        bsuLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bsu-logo.png"))); // NOI18N
        loginPanel.add(bsuLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        loginBgInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-bg-inputs.png"))); // NOI18N
        loginPanel.add(loginBgInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        loginregisterBg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginregisterBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-register-bg.png"))); // NOI18N
        loginPanel.add(loginregisterBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 570, -1));

        getContentPane().add(loginPanel, "loginCard");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logInSuggestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInSuggestionMouseClicked
        CardLayout cl = (CardLayout) (getContentPane().getLayout());
        cl.show(getContentPane(), "loginCard");
        setTitle("COVS - Login");
    }//GEN-LAST:event_logInSuggestionMouseClicked

    private void registerSuggestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerSuggestionMouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (getContentPane().getLayout());
        cl.show(getContentPane(), "registerCard");
        setTitle("COVS - Register");
    }//GEN-LAST:event_registerSuggestionMouseClicked

    private void logInSuggestionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInSuggestionMouseEntered
        logInSuggestion.setForeground(new java.awt.Color(54, 145, 208));
    }//GEN-LAST:event_logInSuggestionMouseEntered

    private void logInSuggestionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInSuggestionMouseExited
        logInSuggestion.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_logInSuggestionMouseExited

    private void registerSuggestionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerSuggestionMouseEntered
        registerSuggestion.setForeground(new java.awt.Color(54, 145, 208));
    }//GEN-LAST:event_registerSuggestionMouseEntered

    private void registerSuggestionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerSuggestionMouseExited
        registerSuggestion.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_registerSuggestionMouseExited

    private void emailAddressFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailAddressFieldFocusGained
        removeTextFieldPlaceholder(emailAddressField, "Email Address");
    }//GEN-LAST:event_emailAddressFieldFocusGained

    private void emailAddressFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailAddressFieldFocusLost
        addTextFieldPlaceholder(emailAddressField, "Email Address");
    }//GEN-LAST:event_emailAddressFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        removePasswordFieldPlaceholder(passwordField, "Password");
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        addPasswordFieldPlaceholder(passwordField, "Password");
    }//GEN-LAST:event_passwordFieldFocusLost

    private void firstNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusGained
        removeTextFieldPlaceholder(firstNameField, "First Name");
    }//GEN-LAST:event_firstNameFieldFocusGained

    private void firstNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusLost
        addTextFieldPlaceholder(firstNameField, "First Name");
    }//GEN-LAST:event_firstNameFieldFocusLost

    private void middleNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middleNameFieldFocusGained
        removeTextFieldPlaceholder(middleNameField, "Middle Name");
    }//GEN-LAST:event_middleNameFieldFocusGained

    private void middleNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middleNameFieldFocusLost
        addTextFieldPlaceholder(middleNameField, "Middle Name");
    }//GEN-LAST:event_middleNameFieldFocusLost

    private void lastNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusGained
        removeTextFieldPlaceholder(lastNameField, "Last Name");
    }//GEN-LAST:event_lastNameFieldFocusGained

    private void lastNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusLost
        addTextFieldPlaceholder(lastNameField, "Last Name");
    }//GEN-LAST:event_lastNameFieldFocusLost

    private void emailAddressRegisterFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailAddressRegisterFieldFocusGained
        removeTextFieldPlaceholder(emailAddressRegisterField, "Email Address");
    }//GEN-LAST:event_emailAddressRegisterFieldFocusGained

    private void emailAddressRegisterFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailAddressRegisterFieldFocusLost
        addTextFieldPlaceholder(emailAddressRegisterField, "Email Address");
    }//GEN-LAST:event_emailAddressRegisterFieldFocusLost

    private void passwordRegisterFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordRegisterFieldFocusGained
        removePasswordFieldPlaceholder(passwordRegisterField, "Enter Password");
    }//GEN-LAST:event_passwordRegisterFieldFocusGained

    private void passwordRegisterFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordRegisterFieldFocusLost
        addPasswordFieldPlaceholder(passwordRegisterField, "Enter Password");
    }//GEN-LAST:event_passwordRegisterFieldFocusLost

    private void confirmPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFieldFocusGained
        removePasswordFieldPlaceholder(confirmPasswordField, "Confirm Password");
    }//GEN-LAST:event_confirmPasswordFieldFocusGained

    private void confirmPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFieldFocusLost
        addPasswordFieldPlaceholder(confirmPasswordField, "Confirm Password");
    }//GEN-LAST:event_confirmPasswordFieldFocusLost

    private void removeTextFieldPlaceholder(JTextField textField, String text) {
        if (textField.getText().equals(text)) {
            textField.setForeground(Color.white);
            textField.setText("");
        }
    }

    private void addTextFieldPlaceholder(JTextField textField, String text) {
        if (textField.getText().equals("")) {
            textField.setForeground(Color.gray);
            textField.setText(text);
        }
    }

    private void removePasswordFieldPlaceholder(JPasswordField passwordField, String text) {
        String pwd = new String(passwordField.getPassword());
        if (pwd.equals(text)) {
            passwordField.setText("");
            passwordField.setEchoChar('\u2022');
            passwordField.setForeground(Color.white);
        }
    }

    private void addPasswordFieldPlaceholder(JPasswordField passwordField, String text) {
        String pwd = new String(passwordField.getPassword());
        if (pwd.isEmpty()) {
            passwordField.setForeground(Color.gray);
            passwordField.setEchoChar((char) 0);
            passwordField.setText(text);
        }
    }

    private void setInputTransparent() {
        emailAddressField.setBackground(new java.awt.Color(0, 0, 0, 1));
        passwordField.setBackground(new java.awt.Color(0, 0, 0, 1));
        emailAddressRegisterField.setBackground(new java.awt.Color(0, 0, 0, 1));
        firstNameField.setBackground(new java.awt.Color(0, 0, 0, 1));
        middleNameField.setBackground(new java.awt.Color(0, 0, 0, 1));
        lastNameField.setBackground(new java.awt.Color(0, 0, 0, 1));
        emailAddressRegisterField.setBackground(new java.awt.Color(0, 0, 0, 1));
        passwordRegisterField.setBackground(new java.awt.Color(0, 0, 0, 1));
        confirmPasswordField.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgHeader;
    private javax.swing.JLabel bsuLogo;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JTextField emailAddressField;
    private javax.swing.JTextField emailAddressRegisterField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel logInSuggestion;
    private javax.swing.JLabel loginBgInput;
    private javax.swing.JLabel loginDesc;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginToYourAccount;
    private javax.swing.JLabel loginregisterBg;
    private javax.swing.JTextField middleNameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordRegisterField;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel registerSuggestion;
    // End of variables declaration//GEN-END:variables
}
