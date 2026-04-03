package onlinevotingsystem.view;

import Entity.User;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import onlinevotingsystem.model.AccountModel;
import onlinevotingsystem.controller.ValidateCredentials;
import onlinevotingsystem.model.DBConnect;

public class Main extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());
    ButtonGroup bg = new ButtonGroup();

    public Main() {
        new DBConnect();
        initComponents();
        setInputTransparent();
        bg.add(maleRadio);
        bg.add(femaleRadio);
        passwordField.setEchoChar((char) 0);
        passwordRegisterField.setEchoChar((char) 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bgHeader = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
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
        registerPanel = new javax.swing.JPanel();
        dateField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        middleNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        collegeField = new javax.swing.JTextField();
        emailAddressRegisterField = new javax.swing.JTextField();
        passwordRegisterField = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();
        femaleRadio = new javax.swing.JRadioButton();
        maleRadio = new javax.swing.JRadioButton();
        logInSuggestion = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COVS - Login");
        setMinimumSize(new java.awt.Dimension(571, 700));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

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

        loginBtn.setBackground(new java.awt.Color(54, 145, 208));
        loginBtn.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        loginPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 290, 40));

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
        loginPanel.add(loginToYourAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        bsuLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bsu-logo.png"))); // NOI18N
        loginPanel.add(bsuLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        loginBgInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-bg-inputs.png"))); // NOI18N
        loginPanel.add(loginBgInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        loginregisterBg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginregisterBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-register-bg.png"))); // NOI18N
        loginPanel.add(loginregisterBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 570, -1));

        getContentPane().add(loginPanel, "loginCard");

        registerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordField.setOpaque(false);
        dateField.setColumns(2);
        dateField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dateField.setForeground(new java.awt.Color(153, 153, 153));
        dateField.setText("yyyy/mm/dd");
        dateField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        dateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dateFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateFieldFocusLost(evt);
            }
        });
        registerPanel.add(dateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 150, 30));

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
        registerPanel.add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 290, 30));

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
        registerPanel.add(middleNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 290, 30));

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
        registerPanel.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 290, 30));

        passwordField.setOpaque(false);
        collegeField.setColumns(2);
        collegeField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        collegeField.setForeground(new java.awt.Color(153, 153, 153));
        collegeField.setText("College (ex. College of Law)");
        collegeField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        collegeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                collegeFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                collegeFieldFocusLost(evt);
            }
        });
        registerPanel.add(collegeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 290, 30));

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
        registerPanel.add(emailAddressRegisterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 290, 30));

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
        registerPanel.add(passwordRegisterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 290, 30));

        registerBtn.setBackground(new java.awt.Color(54, 145, 208));
        registerBtn.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Register");
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        registerPanel.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 290, 40));

        femaleRadio.setForeground(new java.awt.Color(255, 255, 255));
        femaleRadio.setText("Female");
        femaleRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerPanel.add(femaleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 521, -1, 30));

        maleRadio.setForeground(new java.awt.Color(255, 255, 255));
        maleRadio.setText("Male");
        maleRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerPanel.add(maleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 521, -1, 30));

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
        registerPanel.add(logInSuggestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 250, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Your Voice, Your Vote—Made Digital");
        registerPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 190, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sign up, be ready, make your vote count, BulSUan");
        registerPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Register an account");
        registerPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

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

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String pwd = new String(passwordField.getPassword());
        if (emailAddressField.getText().equals("Email Address") || pwd.equals("Password")) {
            JOptionPane.showMessageDialog(this, "Make sure all fields have inputs.");
            return;
        }
        ValidateCredentials vc = new ValidateCredentials(emailAddressField.getText(), pwd);
        User currentUser = vc.isCorrect();
        if (currentUser != null) {
            if (currentUser.getAccountType().equals("admin")) {
                new AdminUI(currentUser).setVisible(true);
            } else {

            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect credential/s. Please try again.");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String pwd = new String(passwordRegisterField.getPassword());
        String gender = "";
        if (maleRadio.isSelected()) {
            gender = maleRadio.getText();
        } else {
            gender = femaleRadio.getText();
        }
        if (firstNameField.getText().equals("Firs Name") || middleNameField.getText().equals("Middle Name") || lastNameField.getText().equals("Last Name") || emailAddressRegisterField.getText().equals("Email Address") || pwd.equals("Enter Password") || bg.getSelection() == null || collegeField.getText().equals("College (ex. College of Law)") || dateField.getText().equals("yyyy/mm/dd")) {
            JOptionPane.showMessageDialog(this, "Make sure all fields have inputs.");
            return;
        }

        new AccountModel().saveAccount(firstNameField.getText(), middleNameField.getText(), lastNameField.getText(), emailAddressRegisterField.getText(), pwd, gender, collegeField.getText(), dateField.getText());
    }//GEN-LAST:event_registerBtnActionPerformed

    private void dateFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFieldFocusGained
        removeTextFieldPlaceholder(dateField, "yyyy/mm/dd");
    }//GEN-LAST:event_dateFieldFocusGained

    private void dateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFieldFocusLost
        addTextFieldPlaceholder(dateField, "yyyy/mm/dd");
    }//GEN-LAST:event_dateFieldFocusLost

    private void collegeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_collegeFieldFocusGained
        removeTextFieldPlaceholder(collegeField, "College (ex. College of Law)");
    }//GEN-LAST:event_collegeFieldFocusGained

    private void collegeFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_collegeFieldFocusLost
        addTextFieldPlaceholder(collegeField, "College (ex. College of Law)");
    }//GEN-LAST:event_collegeFieldFocusLost

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
        dateField.setBackground(new java.awt.Color(0, 0, 0, 1));
        collegeField.setBackground(new java.awt.Color(0, 0, 0, 1));
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
    private javax.swing.JTextField collegeField;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField emailAddressField;
    private javax.swing.JTextField emailAddressRegisterField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstNameField;
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
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginDesc;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginToYourAccount;
    private javax.swing.JLabel loginregisterBg;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField middleNameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordRegisterField;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel registerSuggestion;
    // End of variables declaration//GEN-END:variables
}
