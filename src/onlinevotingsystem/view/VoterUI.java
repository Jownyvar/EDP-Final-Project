package onlinevotingsystem.view;

import Entity.User;
import javax.swing.JOptionPane;

public class VoterUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VoterUI.class.getName());

    User user;

    public VoterUI(User user) {
        this.user = user;
        setTitle("Voter - " + user.getFname() + " " + user.getLname());
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        resultBtn = new javax.swing.JButton();
        voteNowtBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        titleTextField = new javax.swing.JLabel();
        descTextField = new javax.swing.JLabel();
        titleTextField1 = new javax.swing.JLabel();
        titleTextField2 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        leftPanel.setBackground(new java.awt.Color(102, 102, 102));
        leftPanel.setOpaque(false);
        leftPanel.setPreferredSize(new java.awt.Dimension(177, 669));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/result-unselected.png"))); // NOI18N
        resultBtn.setBorderPainted(false);
        resultBtn.setContentAreaFilled(false);
        resultBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resultBtn.setFocusPainted(false);
        resultBtn.setPreferredSize(new java.awt.Dimension(177, 48));
        resultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultBtnActionPerformed(evt);
            }
        });
        leftPanel.add(resultBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 60));

        voteNowtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/vote-now-unselected.png"))); // NOI18N
        voteNowtBtn.setBorderPainted(false);
        voteNowtBtn.setContentAreaFilled(false);
        voteNowtBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voteNowtBtn.setFocusPainted(false);
        voteNowtBtn.setPreferredSize(new java.awt.Dimension(177, 48));
        voteNowtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteNowtBtnActionPerformed(evt);
            }
        });
        leftPanel.add(voteNowtBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 60));

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setForeground(new java.awt.Color(192, 49, 49));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutBtn.setText("Log Out");
        logoutBtn.setBorder(null);
        logoutBtn.setBorderPainted(false);
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        leftPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 160, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ver. bsit2j-g2");
        leftPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 646, 180, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(124, 31, 31));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Campus Online Voting System");
        leftPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/covs-logo-red.png"))); // NOI18N
        leftPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-panel-bg.png"))); // NOI18N
        leftPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        titlePanel.setBackground(new java.awt.Color(124, 31, 31));
        titlePanel.setPreferredSize(new java.awt.Dimension(1089, 78));
        titlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        titlePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 78, 1063, 10));

        titleTextField.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        titleTextField.setForeground(new java.awt.Color(255, 255, 255));
        titleTextField.setText("Bulacan State University");
        titlePanel.add(titleTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 14, 376, 27));

        descTextField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        descTextField.setForeground(new java.awt.Color(255, 255, 255));
        descTextField.setText("Let your vote speak for the University");
        titlePanel.add(descTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 45, 723, 27));

        titleTextField1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        titleTextField1.setForeground(new java.awt.Color(255, 255, 255));
        titleTextField1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleTextField1.setText("DELA CRUZ, JUAN, REYES");
        titlePanel.add(titleTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 510, 21));

        titleTextField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        titleTextField2.setForeground(new java.awt.Color(255, 255, 255));
        titleTextField2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleTextField2.setText("College of Information and Communication Technology");
        titlePanel.add(titleTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 510, 21));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1089, 668));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Confirm Log out", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            this.dispose();
            new Main().setVisible(true);
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void resultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultBtnActionPerformed
        resetButtonsIcon();
        resultBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/result-selected.png")));
    }//GEN-LAST:event_resultBtnActionPerformed

    private void voteNowtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteNowtBtnActionPerformed
        resetButtonsIcon();
        voteNowtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/vote-now-selected.png")));
    }//GEN-LAST:event_voteNowtBtnActionPerformed

    private void resetButtonsIcon() {
        voteNowtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/vote-now-unselected.png")));
        resultBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/result-unselected.png")));
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
//            logger.log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> new VotersUI().setVisible(true));
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton resultBtn;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel titleTextField;
    private javax.swing.JLabel titleTextField1;
    private javax.swing.JLabel titleTextField2;
    private javax.swing.JButton voteNowtBtn;
    // End of variables declaration//GEN-END:variables
}
