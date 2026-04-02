package onlinevotingsystem.view;

import java.awt.CardLayout;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import onlinevotingsystem.controller.OverviewController;

public class AdminUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminUI.class.getName());
    private OverviewController overviewController = new OverviewController();
    
    public AdminUI(String adminName) {
        initComponents();
        setTitle("Admin UI - " + adminName);
        overviewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/overview-selected.png")));
        leftPanel.setBackground(new java.awt.Color(0, 0, 0, 1));
        initData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        accountBtn = new javax.swing.JButton();
        manageCandidatesBtn = new javax.swing.JButton();
        votersBtn = new javax.swing.JButton();
        overviewBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        overviewPanel = new javax.swing.JPanel();
        percentage = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        registeredVoters = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        voterPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setBackground(new java.awt.Color(102, 102, 102));
        leftPanel.setPreferredSize(new java.awt.Dimension(177, 669));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/account-unselected.png"))); // NOI18N
        accountBtn.setBorderPainted(false);
        accountBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountBtn.setFocusPainted(false);
        accountBtn.setPreferredSize(new java.awt.Dimension(177, 48));
        accountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBtnActionPerformed(evt);
            }
        });
        leftPanel.add(accountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        manageCandidatesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/manage-candidates-unselected.png"))); // NOI18N
        manageCandidatesBtn.setBorderPainted(false);
        manageCandidatesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageCandidatesBtn.setFocusPainted(false);
        manageCandidatesBtn.setPreferredSize(new java.awt.Dimension(177, 48));
        manageCandidatesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCandidatesBtnActionPerformed(evt);
            }
        });
        leftPanel.add(manageCandidatesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        votersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/voters-unselected.png"))); // NOI18N
        votersBtn.setBorderPainted(false);
        votersBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        votersBtn.setFocusPainted(false);
        votersBtn.setPreferredSize(new java.awt.Dimension(177, 48));
        votersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votersBtnActionPerformed(evt);
            }
        });
        leftPanel.add(votersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        overviewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/overview-unselected.png"))); // NOI18N
        overviewBtn.setBorderPainted(false);
        overviewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        overviewBtn.setFocusPainted(false);
        overviewBtn.setPreferredSize(new java.awt.Dimension(177, 48));
        overviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewBtnActionPerformed(evt);
            }
        });
        leftPanel.add(overviewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        jLabel4.setForeground(new java.awt.Color(214, 131, 72));
        jLabel4.setText("Campus Online Voting System");
        leftPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/covs-logo-orange.png"))); // NOI18N
        leftPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-panel-bg.png"))); // NOI18N
        leftPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1089, 668));
        mainPanel.setLayout(new java.awt.CardLayout());

        overviewPanel.setBackground(new java.awt.Color(255, 255, 255));
        overviewPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        percentage.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        percentage.setForeground(new java.awt.Color(22, 103, 16));
        percentage.setText("10%");
        overviewPanel.add(percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 170, 30));

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(22, 103, 16));
        jLabel11.setText("Has voted");
        overviewPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 170, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Overview/have-voted-bg.png"))); // NOI18N
        overviewPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(214, 131, 72));
        jLabel8.setText("Registered BulSUan");
        overviewPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, 20));

        registeredVoters.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        registeredVoters.setForeground(new java.awt.Color(214, 131, 72));
        registeredVoters.setText("15");
        overviewPanel.add(registeredVoters, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Overview/registered-bulsuan-bg.png"))); // NOI18N
        overviewPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 300, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Winning Candidate per Position", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 18), new java.awt.Color(60, 63, 65))); // NOI18N

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Position", "Last Name", "First Name", "Middle Name", "Vote Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        overviewPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 1040, 420));

        mainPanel.add(overviewPanel, "overviewCard");

        voterPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout voterPanelLayout = new javax.swing.GroupLayout(voterPanel);
        voterPanel.setLayout(voterPanelLayout);
        voterPanelLayout.setHorizontalGroup(
            voterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1089, Short.MAX_VALUE)
        );
        voterPanelLayout.setVerticalGroup(
            voterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        mainPanel.add(voterPanel, "votersCard");

        titlePanel.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel.setPreferredSize(new java.awt.Dimension(1089, 78));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(98, 98, 98));
        jLabel2.setText("Overview");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(98, 98, 98));
        jLabel5.setText("Monitor the overall status of the voting system, including voter registrations, candidates, and activity");

        jSeparator1.setBackground(new java.awt.Color(255, 231, 214));
        jSeparator1.setForeground(new java.awt.Color(255, 231, 214));

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/refresh.png"))); // NOI18N
        refreshBtn.setBorder(null);
        refreshBtn.setBorderPainted(false);
        refreshBtn.setContentAreaFilled(false);
        refreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshBtnMouseExited(evt);
            }
        });
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(refreshBtn)
                .addGap(28, 28, 28))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBtn)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leftPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void overviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewBtnActionPerformed
        resetButtons();
        overviewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/overview-selected.png")));
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "overviewCard");
    }//GEN-LAST:event_overviewBtnActionPerformed

    private void votersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votersBtnActionPerformed
        resetButtons();
        votersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/voters-selected.png")));
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "votersCard");
    }//GEN-LAST:event_votersBtnActionPerformed

    private void manageCandidatesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCandidatesBtnActionPerformed
        resetButtons();
        manageCandidatesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/manage-candidates-selected.png")));
    }//GEN-LAST:event_manageCandidatesBtnActionPerformed

    private void accountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountBtnActionPerformed
        resetButtons();
        accountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/account-selected.png")));
    }//GEN-LAST:event_accountBtnActionPerformed

    private void refreshBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseEntered
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/refresh-hover.png")));
    }//GEN-LAST:event_refreshBtnMouseEntered

    private void refreshBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseExited
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/refresh.png")));
    }//GEN-LAST:event_refreshBtnMouseExited

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        initData();
    }//GEN-LAST:event_refreshBtnActionPerformed
    
    private void initData() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        registeredVoters.setText(overviewController.getRegisteredVoters() + "");
        percentage.setText(overviewController.getVoteCompletePercentage() + "%");
        dtm.setRowCount(0);
        for (Vector<String> winner : overviewController.getWinningCandidates()) {
            dtm.addRow(winner);
        }
    }
    
    private void resetButtons() {
        accountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/account-unselected.png")));
        overviewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/overview-unselected.png")));
        votersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/voters-unselected.png")));
        manageCandidatesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/manage-candidates-unselected.png")));
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
        java.awt.EventQueue.invokeLater(() -> new AdminUI("").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton manageCandidatesBtn;
    private javax.swing.JButton overviewBtn;
    private javax.swing.JPanel overviewPanel;
    private javax.swing.JLabel percentage;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JLabel registeredVoters;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JPanel voterPanel;
    private javax.swing.JButton votersBtn;
    // End of variables declaration//GEN-END:variables
}
