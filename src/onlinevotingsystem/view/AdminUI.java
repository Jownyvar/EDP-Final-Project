package onlinevotingsystem.view;

import Entity.User;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import onlinevotingsystem.controller.CandidatesController;
import onlinevotingsystem.controller.OverviewController;
import onlinevotingsystem.controller.VotersController;

public class AdminUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminUI.class.getName());
    private OverviewController overviewController = new OverviewController();
    private VotersController votersController = new VotersController();
    private CandidatesController candidatesController = new CandidatesController();
    private User currentUser;

    public AdminUI(User user) {
        this.currentUser = user;
        initComponents();
        setTitle("Admin UI - " + user.getFname() + " " + user.getLname());
        overviewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/overview-selected.png")));
        leftPanel.setBackground(new java.awt.Color(0, 0, 0, 1));
        initData();
    }

    private void initData() {
        firstNameFieldAccount.setText(currentUser.getFname());
        middleNameFieldAccount.setText(currentUser.getMname());
        lastNameFieldAccount.setText(currentUser.getLname());
        collegeFieldAccount.setText(currentUser.getCollege());
        dateOfBirthFieldAccount.setText(currentUser.getDateOfBirth());
        sexCbAccount.setSelectedItem(currentUser.getSex());

        fullNameTextFieldAccount.setText(currentUser.getLname() + ", " + currentUser.getFname() + ", " + currentUser.getMname());
        dateOfBirthTextFieldAccount.setText(currentUser.getDateOfBirth());
        genderTextFieldAccount.setText(currentUser.getSex());
        collegeTextFieldAccount.setText(currentUser.getCollege());
        vrnTextFieldAccount.setText(currentUser.getVoterID());

        registeredVoters.setText(overviewController.getRegisteredVoters() + "");
        percentage.setText(overviewController.getVoteCompletePercentage() + "%");

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel dtm2 = (DefaultTableModel) votersTbl.getModel();
        DefaultTableModel dtm3 = (DefaultTableModel) candidatesTbl.getModel();

        dtm.setRowCount(0);
        dtm2.setRowCount(0);
        dtm3.setRowCount(0);

        for (Vector<String> winner : overviewController.getWinningCandidates()) {
            dtm.addRow(winner);
        }
        for (Vector<String> voters : votersController.getVotersData()) {
            dtm2.addRow(voters);
        }
        for (Vector<String> candidates : candidatesController.getCandidatesData()) {
            dtm3.addRow(candidates);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        accountBtn = new javax.swing.JButton();
        manageCandidatesBtn = new javax.swing.JButton();
        votersBtn = new javax.swing.JButton();
        overviewBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        votersTbl = new javax.swing.JTable();
        manageCandidatesPanel = new javax.swing.JPanel();
        firstNameField = new javax.swing.JTextField();
        middleNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        partyField = new javax.swing.JTextField();
        candidateBtn = new javax.swing.JButton();
        positionCB = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        candidatesTbl = new javax.swing.JTable();
        searchIDField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        updateCandidateBtn = new javax.swing.JButton();
        reinstateBtn = new javax.swing.JButton();
        accountPanel = new javax.swing.JPanel();
        firstNameFieldAccount = new javax.swing.JTextField();
        middleNameFieldAccount = new javax.swing.JTextField();
        lastNameFieldAccount = new javax.swing.JTextField();
        collegeFieldAccount = new javax.swing.JTextField();
        sexCbAccount = new javax.swing.JComboBox<>();
        dateOfBirthFieldAccount = new javax.swing.JTextField();
        updateInformationBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        vrnTextFieldAccount = new javax.swing.JLabel();
        genderTextFieldAccount = new javax.swing.JLabel();
        dateOfBirthTextFieldAccount = new javax.swing.JLabel();
        collegeTextFieldAccount = new javax.swing.JLabel();
        fullNameTextFieldAccount = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        titlePanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        titleTextField = new javax.swing.JLabel();
        descTextField = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        leftPanel.setBackground(new java.awt.Color(102, 102, 102));
        leftPanel.setPreferredSize(new java.awt.Dimension(177, 669));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/account-unselected.png"))); // NOI18N
        accountBtn.setBorderPainted(false);
        accountBtn.setContentAreaFilled(false);
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
        manageCandidatesBtn.setContentAreaFilled(false);
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
        votersBtn.setContentAreaFilled(false);
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
        overviewBtn.setContentAreaFilled(false);
        overviewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        overviewBtn.setFocusPainted(false);
        overviewBtn.setPreferredSize(new java.awt.Dimension(177, 48));
        overviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewBtnActionPerformed(evt);
            }
        });
        leftPanel.add(overviewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

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
        leftPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 160, 30));

        jLabel4.setForeground(new java.awt.Color(214, 131, 72));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Campus Online Voting System");
        leftPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, -1));

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
        overviewPanel.add(percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 170, 30));

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(22, 103, 16));
        jLabel11.setText("Has voted");
        overviewPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 170, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Overview/have-voted-bg.png"))); // NOI18N
        overviewPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(214, 131, 72));
        jLabel8.setText("Registered BulSUan");
        overviewPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 170, 20));

        registeredVoters.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        registeredVoters.setForeground(new java.awt.Color(214, 131, 72));
        registeredVoters.setText("15");
        overviewPanel.add(registeredVoters, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 170, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Overview/registered-bulsuan-bg.png"))); // NOI18N
        overviewPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Winning Candidate per Position", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 18), new java.awt.Color(60, 63, 65))); // NOI18N

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        overviewPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1040, 450));

        mainPanel.add(overviewPanel, "overviewCard");

        voterPanel.setBackground(new java.awt.Color(255, 255, 255));

        votersTbl.setBackground(new java.awt.Color(255, 255, 255));
        votersTbl.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        votersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Voter ID", "First Name", "Middle Name", "Last Name", "Sex", "College", "Date of Birth", "Voted"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(votersTbl);
        if (votersTbl.getColumnModel().getColumnCount() > 0) {
            votersTbl.getColumnModel().getColumn(0).setResizable(false);
            votersTbl.getColumnModel().getColumn(1).setResizable(false);
            votersTbl.getColumnModel().getColumn(2).setResizable(false);
            votersTbl.getColumnModel().getColumn(3).setResizable(false);
            votersTbl.getColumnModel().getColumn(4).setResizable(false);
            votersTbl.getColumnModel().getColumn(5).setResizable(false);
            votersTbl.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout voterPanelLayout = new javax.swing.GroupLayout(voterPanel);
        voterPanel.setLayout(voterPanelLayout);
        voterPanelLayout.setHorizontalGroup(
            voterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, voterPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        voterPanelLayout.setVerticalGroup(
            voterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(voterPanelLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        mainPanel.add(voterPanel, "votersCard");

        manageCandidatesPanel.setBackground(new java.awt.Color(255, 255, 255));

        firstNameField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        firstNameField.setText("First Name");
        firstNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(98, 98, 98)), javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5)));
        firstNameField.setCaretColor(new java.awt.Color(102, 102, 102));
        firstNameField.setPreferredSize(new java.awt.Dimension(288, 41));
        firstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusLost(evt);
            }
        });

        middleNameField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        middleNameField.setText("Middle Name");
        middleNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(98, 98, 98)), javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5)));
        middleNameField.setCaretColor(new java.awt.Color(102, 102, 102));
        middleNameField.setPreferredSize(new java.awt.Dimension(288, 41));
        middleNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                middleNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                middleNameFieldFocusLost(evt);
            }
        });

        lastNameField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lastNameField.setText("Last Name");
        lastNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(98, 98, 98)), javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5)));
        lastNameField.setCaretColor(new java.awt.Color(102, 102, 102));
        lastNameField.setPreferredSize(new java.awt.Dimension(288, 41));
        lastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusLost(evt);
            }
        });

        partyField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        partyField.setText("Party");
        partyField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(98, 98, 98)), javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5)));
        partyField.setCaretColor(new java.awt.Color(102, 102, 102));
        partyField.setPreferredSize(new java.awt.Dimension(288, 41));
        partyField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                partyFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                partyFieldFocusLost(evt);
            }
        });

        candidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/add-candidate.png"))); // NOI18N
        candidateBtn.setBorder(null);
        candidateBtn.setBorderPainted(false);
        candidateBtn.setContentAreaFilled(false);
        candidateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        candidateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidateBtnActionPerformed(evt);
            }
        });

        positionCB.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        positionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Position", "SSC President", "SSC Vice President", "SSC Senator", "College Governor", "Campus Representative", "Commission on Student Elections Chair" }));
        positionCB.setBorder(new javax.swing.border.MatteBorder(null));
        positionCB.setPreferredSize(new java.awt.Dimension(288, 41));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Active Candidates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 18), new java.awt.Color(70, 73, 75))); // NOI18N

        candidatesTbl.setBackground(new java.awt.Color(255, 255, 255));
        candidatesTbl.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        candidatesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Candidate ID", "Position", "Last Name", "First Name", "Middle Name", "Party", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        candidatesTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candidatesTblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(candidatesTbl);
        if (candidatesTbl.getColumnModel().getColumnCount() > 0) {
            candidatesTbl.getColumnModel().getColumn(0).setResizable(false);
            candidatesTbl.getColumnModel().getColumn(1).setResizable(false);
            candidatesTbl.getColumnModel().getColumn(2).setResizable(false);
            candidatesTbl.getColumnModel().getColumn(3).setResizable(false);
            candidatesTbl.getColumnModel().getColumn(4).setResizable(false);
            candidatesTbl.getColumnModel().getColumn(5).setResizable(false);
            candidatesTbl.getColumnModel().getColumn(6).setResizable(false);
        }

        searchIDField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        searchIDField.setForeground(new java.awt.Color(102, 102, 102));
        searchIDField.setText("Candidate Last Name");
        searchIDField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        searchIDField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchIDFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchIDFieldFocusLost(evt);
            }
        });
        searchIDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchIDFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchIDFieldKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(98, 98, 98));
        jLabel12.setText("Search:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        updateCandidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/update-candidate-disabled.png"))); // NOI18N
        updateCandidateBtn.setBorder(null);
        updateCandidateBtn.setBorderPainted(false);
        updateCandidateBtn.setContentAreaFilled(false);
        updateCandidateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateCandidateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCandidateBtnActionPerformed(evt);
            }
        });

        reinstateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/reinstate-candidate-disabled.png"))); // NOI18N
        reinstateBtn.setBorder(null);
        reinstateBtn.setBorderPainted(false);
        reinstateBtn.setContentAreaFilled(false);
        reinstateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinstateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageCandidatesPanelLayout = new javax.swing.GroupLayout(manageCandidatesPanel);
        manageCandidatesPanel.setLayout(manageCandidatesPanelLayout);
        manageCandidatesPanelLayout.setHorizontalGroup(
            manageCandidatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageCandidatesPanelLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(manageCandidatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(manageCandidatesPanelLayout.createSequentialGroup()
                        .addGroup(manageCandidatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(manageCandidatesPanelLayout.createSequentialGroup()
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(middleNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(manageCandidatesPanelLayout.createSequentialGroup()
                                .addComponent(positionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(partyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(manageCandidatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageCandidatesPanelLayout.createSequentialGroup()
                                .addComponent(candidateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateCandidateBtn))
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reinstateBtn))))
                .addGap(75, 75, 75))
        );
        manageCandidatesPanelLayout.setVerticalGroup(
            manageCandidatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageCandidatesPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(manageCandidatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageCandidatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(manageCandidatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(partyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(positionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(candidateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateCandidateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(reinstateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        mainPanel.add(manageCandidatesPanel, "manageCandidatesCard");

        accountPanel.setBackground(new java.awt.Color(255, 255, 255));
        accountPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstNameFieldAccount.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        firstNameFieldAccount.setText("First Name");
        firstNameFieldAccount.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1))));
        firstNameFieldAccount.setPreferredSize(new java.awt.Dimension(288, 41));
        firstNameFieldAccount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFieldAccountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFieldAccountFocusLost(evt);
            }
        });
        accountPanel.add(firstNameFieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 300, -1));

        middleNameFieldAccount.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        middleNameFieldAccount.setText("Middle Name");
        middleNameFieldAccount.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1)));
        middleNameFieldAccount.setPreferredSize(new java.awt.Dimension(288, 41));
        middleNameFieldAccount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                middleNameFieldAccountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                middleNameFieldAccountFocusLost(evt);
            }
        });
        accountPanel.add(middleNameFieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 300, -1));

        lastNameFieldAccount.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lastNameFieldAccount.setText("Last Name");
        lastNameFieldAccount.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1)));
        lastNameFieldAccount.setPreferredSize(new java.awt.Dimension(288, 41));
        lastNameFieldAccount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFieldAccountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFieldAccountFocusLost(evt);
            }
        });
        accountPanel.add(lastNameFieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 300, -1));

        collegeFieldAccount.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        collegeFieldAccount.setText("College");
        collegeFieldAccount.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1)));
        collegeFieldAccount.setPreferredSize(new java.awt.Dimension(288, 41));
        collegeFieldAccount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                collegeFieldAccountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                collegeFieldAccountFocusLost(evt);
            }
        });
        accountPanel.add(collegeFieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 300, -1));

        sexCbAccount.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        sexCbAccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sex", "Male", "Female" }));
        sexCbAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        sexCbAccount.setPreferredSize(new java.awt.Dimension(104, 41));
        accountPanel.add(sexCbAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 120, -1));

        dateOfBirthFieldAccount.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dateOfBirthFieldAccount.setText("Date of Birth");
        dateOfBirthFieldAccount.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1)));
        dateOfBirthFieldAccount.setPreferredSize(new java.awt.Dimension(176, 41));
        dateOfBirthFieldAccount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dateOfBirthFieldAccountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateOfBirthFieldAccountFocusLost(evt);
            }
        });
        accountPanel.add(dateOfBirthFieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 170, -1));

        updateInformationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/update-information.png"))); // NOI18N
        updateInformationBtn.setBorderPainted(false);
        updateInformationBtn.setContentAreaFilled(false);
        updateInformationBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateInformationBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateInformationBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateInformationBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateInformationBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateInformationBtnMouseReleased(evt);
            }
        });
        updateInformationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInformationBtnActionPerformed(evt);
            }
        });
        accountPanel.add(updateInformationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 170, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setFocusable(false);
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vrnTextFieldAccount.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vrnTextFieldAccount.setForeground(new java.awt.Color(0, 0, 0));
        vrnTextFieldAccount.setText("999999999999");
        jPanel2.add(vrnTextFieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 290, 30));

        genderTextFieldAccount.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        genderTextFieldAccount.setForeground(new java.awt.Color(0, 0, 0));
        genderTextFieldAccount.setText("FEMALE");
        jPanel2.add(genderTextFieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 90, 30));

        dateOfBirthTextFieldAccount.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        dateOfBirthTextFieldAccount.setForeground(new java.awt.Color(0, 0, 0));
        dateOfBirthTextFieldAccount.setText("YYYY/MM/DD");
        jPanel2.add(dateOfBirthTextFieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 110, 30));

        collegeTextFieldAccount.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        collegeTextFieldAccount.setForeground(new java.awt.Color(0, 0, 0));
        collegeTextFieldAccount.setText("COLLEGE OF INFORMATION AND TECHNOLOGY");
        jPanel2.add(collegeTextFieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 290, 30));

        fullNameTextFieldAccount.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        fullNameTextFieldAccount.setForeground(new java.awt.Color(0, 0, 0));
        fullNameTextFieldAccount.setText("DELA CRUZ, JUAN, REYES");
        jPanel2.add(fullNameTextFieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 290, 30));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("sansserif", 2, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("VOTER'S REFERENCE NUMBER");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 240, -1));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("sansserif", 2, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("SEX");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 80, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("sansserif", 2, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("DATE OF BIRTH");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("sansserif", 2, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("COLLEGE");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 240, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("sansserif", 2, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("SURNAME, FIRST NAME, MIDDLE NAME");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 240, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Student Voter's ID");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 240, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("University Commission on Student Election");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ucse-id.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Your UCSE Voter's ID");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 400, -1));

        accountPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 610, 420));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        accountPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 10, 540));

        mainPanel.add(accountPanel, "accountCard");

        titlePanel.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel.setPreferredSize(new java.awt.Dimension(1089, 78));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        titleTextField.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        titleTextField.setForeground(new java.awt.Color(98, 98, 98));
        titleTextField.setText("Overview");

        descTextField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        descTextField.setForeground(new java.awt.Color(98, 98, 98));
        descTextField.setText("Monitor the overall status of the voting system, including voter registrations, candidates, and activity");

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refreshBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                refreshBtnMouseReleased(evt);
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
                    .addComponent(descTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(descTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
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
        titleTextField.setText("Overview");
        descTextField.setText("Monitor the overall status of the voting system, including voter registrations, candidates, and activity.");
        cl.show(mainPanel, "overviewCard");
    }//GEN-LAST:event_overviewBtnActionPerformed

    private void votersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votersBtnActionPerformed
        resetButtons();
        votersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/voters-selected.png")));
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        titleTextField.setText("Voters");
        descTextField.setText("Monitor registered voters, including their information and voting status.");
        cl.show(mainPanel, "votersCard");
    }//GEN-LAST:event_votersBtnActionPerformed

    private void manageCandidatesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCandidatesBtnActionPerformed
        resetButtons();
        manageCandidatesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/manage-candidates-selected.png")));
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        titleTextField.setText("Manage Candidates");
        descTextField.setText("Add, update, and manage candidate information.");
        cl.show(mainPanel, "manageCandidatesCard");
    }//GEN-LAST:event_manageCandidatesBtnActionPerformed

    private void accountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountBtnActionPerformed
        resetButtons();
        accountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/account-selected.png")));
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        titleTextField.setText("Account");
        descTextField.setText("View your account information");
        cl.show(mainPanel, "accountCard");
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

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void refreshBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMousePressed
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/refresh.png")));
    }//GEN-LAST:event_refreshBtnMousePressed

    private void refreshBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseReleased
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/refresh-hover.png")));
    }//GEN-LAST:event_refreshBtnMouseReleased

    private void lastNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusGained
        removeTextFieldPlaceholder(lastNameField, "Last Name");
    }//GEN-LAST:event_lastNameFieldFocusGained

    private void lastNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusLost
        addTextFieldPlaceholder(lastNameField, "Last Name");
    }//GEN-LAST:event_lastNameFieldFocusLost

    private void middleNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middleNameFieldFocusGained
        removeTextFieldPlaceholder(middleNameField, "Middle Name");
    }//GEN-LAST:event_middleNameFieldFocusGained

    private void middleNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middleNameFieldFocusLost
        addTextFieldPlaceholder(middleNameField, "Middle Name");
    }//GEN-LAST:event_middleNameFieldFocusLost

    private void firstNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusGained
        removeTextFieldPlaceholder(firstNameField, "First Name");
    }//GEN-LAST:event_firstNameFieldFocusGained

    private void firstNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusLost
        addTextFieldPlaceholder(firstNameField, "First Name");
    }//GEN-LAST:event_firstNameFieldFocusLost

    private void partyFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_partyFieldFocusGained
        removeTextFieldPlaceholder(partyField, "Party");
    }//GEN-LAST:event_partyFieldFocusGained

    private void partyFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_partyFieldFocusLost
        addTextFieldPlaceholder(partyField, "Party");
    }//GEN-LAST:event_partyFieldFocusLost

    private void candidateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidateBtnActionPerformed
        if (candidatesTbl.getSelectionModel().isSelectionEmpty()) {
            addCandidate();
        } else {
            removeCandidate();
        }
    }//GEN-LAST:event_candidateBtnActionPerformed

    private void candidatesTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesTblMouseClicked
        int row = candidatesTbl.getSelectedRow();
        boolean hasSelection = row != -1;

        String position = "";
        String lastName = "";
        String firstName = "";
        String middleName = "";
        String party = "";
        String status = "";

        if (hasSelection) {
            position = candidatesTbl.getValueAt(row, 1).toString();
            lastName = candidatesTbl.getValueAt(row, 2).toString();
            firstName = candidatesTbl.getValueAt(row, 3).toString();
            middleName = candidatesTbl.getValueAt(row, 4).toString();
            party = candidatesTbl.getValueAt(row, 5).toString();
            status = candidatesTbl.getValueAt(row, 6).toString();
        }

        if (!hasSelection) {
            candidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/add-candidate.png")));

            updateCandidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/update-candidate-disabled.png")));
            updateCandidateBtn.setEnabled(false);
            updateCandidateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

            positionCB.setSelectedIndex(0);
            firstNameField.setText("First Name");
            middleNameField.setText("Middle Name");
            lastNameField.setText("Last Name");
            partyField.setText("Party");

        } else {
            candidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/remove-candidate.png")));

            updateCandidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/update-candidate.png")));
            updateCandidateBtn.setEnabled(true);
            updateCandidateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

            positionCB.setSelectedItem(position);
            firstNameField.setText(firstName);
            middleNameField.setText(middleName);
            lastNameField.setText(lastName);
            partyField.setText(party);
        }

        if (hasSelection && status.equals("Removed")) {
            reinstateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/reinstate-candidate.png")));
            candidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/add-candidate-disabled.png")));

            reinstateBtn.setEnabled(true);
            candidateBtn.setEnabled(false);

            reinstateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            candidateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        } else {
            reinstateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/reinstate-candidate-disabled.png")));

            if (hasSelection) {
                candidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/remove-candidate.png")));
            } else {
                candidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/add-candidate.png")));
            }

            reinstateBtn.setEnabled(false);
            candidateBtn.setEnabled(true);

            candidateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            reinstateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_candidatesTblMouseClicked

    private void updateCandidateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCandidateBtnActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) candidatesTbl.getModel();

        int candidateID = Integer.parseInt(dtm.getValueAt(candidatesTbl.getSelectedRow(), 0).toString());
        int position = positionCB.getSelectedIndex();
        String firstName = firstNameField.getText();
        String middleName = middleNameField.getText();
        String lastName = lastNameField.getText();
        String party = partyField.getText();

        if (candidatesController.updateCandidate(candidateID, firstName, middleName, lastName, party, position)) {
            JOptionPane.showMessageDialog(this, "Successfully updated candidate data.");
            initData();
            return;
        }
        JOptionPane.showMessageDialog(this, "Error updating candidate data.");
    }//GEN-LAST:event_updateCandidateBtnActionPerformed

    private void reinstateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinstateBtnActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) candidatesTbl.getModel();
        int candidateID = Integer.parseInt(dtm.getValueAt(candidatesTbl.getSelectedRow(), 0).toString());
        if (candidatesController.reinstateCandidate(candidateID)) {
            initData();
            JOptionPane.showMessageDialog(this, "Successfully reinstated selected candidate.");
            return;
        }
        JOptionPane.showMessageDialog(this, "Error reinstating selected candidate.");

    }//GEN-LAST:event_reinstateBtnActionPerformed

    private void searchIDFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchIDFieldFocusGained
        removeTextFieldPlaceholder(searchIDField, "Candidate Last Name");
    }//GEN-LAST:event_searchIDFieldFocusGained

    private void searchIDFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchIDFieldFocusLost
        addTextFieldPlaceholder(searchIDField, "Candidate Last Name");
    }//GEN-LAST:event_searchIDFieldFocusLost

    private void searchIDFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchIDFieldKeyReleased
        if (!searchIDField.getText().isEmpty()) {
            searchCandidateID(searchIDField.getText());
        } else {
            initData();
        }
    }//GEN-LAST:event_searchIDFieldKeyReleased

    private void searchIDFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchIDFieldKeyTyped
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_searchIDFieldKeyTyped

    private void firstNameFieldAccountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldAccountFocusGained
        removeTextFieldPlaceholder(firstNameFieldAccount, "First Name");
    }//GEN-LAST:event_firstNameFieldAccountFocusGained

    private void firstNameFieldAccountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldAccountFocusLost
        addTextFieldPlaceholder(firstNameFieldAccount, "First Name");
    }//GEN-LAST:event_firstNameFieldAccountFocusLost

    private void middleNameFieldAccountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middleNameFieldAccountFocusGained
        removeTextFieldPlaceholder(middleNameFieldAccount, "Middle Name");
    }//GEN-LAST:event_middleNameFieldAccountFocusGained

    private void middleNameFieldAccountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middleNameFieldAccountFocusLost
        addTextFieldPlaceholder(middleNameFieldAccount, "Middle Name");
    }//GEN-LAST:event_middleNameFieldAccountFocusLost

    private void lastNameFieldAccountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldAccountFocusGained
        removeTextFieldPlaceholder(lastNameFieldAccount, "Last Name");
    }//GEN-LAST:event_lastNameFieldAccountFocusGained

    private void lastNameFieldAccountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldAccountFocusLost
        addTextFieldPlaceholder(lastNameFieldAccount, "Last Name");
    }//GEN-LAST:event_lastNameFieldAccountFocusLost

    private void collegeFieldAccountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_collegeFieldAccountFocusGained
        removeTextFieldPlaceholder(collegeFieldAccount, "College");
    }//GEN-LAST:event_collegeFieldAccountFocusGained

    private void collegeFieldAccountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_collegeFieldAccountFocusLost
        addTextFieldPlaceholder(collegeFieldAccount, "College");
    }//GEN-LAST:event_collegeFieldAccountFocusLost

    private void dateOfBirthFieldAccountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateOfBirthFieldAccountFocusGained
        removeTextFieldPlaceholder(dateOfBirthFieldAccount, "Date of Birth");
    }//GEN-LAST:event_dateOfBirthFieldAccountFocusGained

    private void dateOfBirthFieldAccountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateOfBirthFieldAccountFocusLost
        addTextFieldPlaceholder(dateOfBirthFieldAccount, "Date of Birth");
    }//GEN-LAST:event_dateOfBirthFieldAccountFocusLost

    private void updateInformationBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInformationBtnMouseEntered
        updateInformationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/update-information-highlighted.png")));
    }//GEN-LAST:event_updateInformationBtnMouseEntered

    private void updateInformationBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInformationBtnMouseExited
        updateInformationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/update-information.png")));
    }//GEN-LAST:event_updateInformationBtnMouseExited

    private void updateInformationBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInformationBtnMousePressed
        updateInformationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/update-information.png")));
    }//GEN-LAST:event_updateInformationBtnMousePressed

    private void updateInformationBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInformationBtnMouseReleased
        updateInformationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/update-information-highlighted.png")));
    }//GEN-LAST:event_updateInformationBtnMouseReleased

    private void updateInformationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInformationBtnActionPerformed
        String fName = firstNameFieldAccount.getText();
        String mName = middleNameFieldAccount.getText();
        String lName = lastNameFieldAccount.getText();
        String sex = sexCbAccount.getSelectedItem().toString();
        String college = collegeFieldAccount.getText();
        String birthday = dateOfBirthFieldAccount.getText();
        if (votersController.updateInfo(fName, mName, lName, sex, college, birthday, Long.parseLong(currentUser.getVoterID()))) {
            currentUser.setFName(fName);
            currentUser.setMName(mName);
            currentUser.setLName(lName);
            currentUser.setSex(sex);
            currentUser.setCollege(college);
            currentUser.setDateOfBirth(birthday);

            initData();
            JOptionPane.showMessageDialog(this, "Successfully updated your data.");
            return;
        }
        JOptionPane.showMessageDialog(this, "Error updating your data.");
    }//GEN-LAST:event_updateInformationBtnActionPerformed

    private void removeCandidate() {
        DefaultTableModel dtm = (DefaultTableModel) candidatesTbl.getModel();
        int candidateID = Integer.parseInt(dtm.getValueAt(candidatesTbl.getSelectedRow(), 0).toString());
        System.out.println(candidateID);

        if (candidatesController.removeCandidate(candidateID)) {
            initData();
            JOptionPane.showMessageDialog(this, "Successfully removed candidate.");
            return;
        }
        JOptionPane.showMessageDialog(this, "Error removing candidate.");
    }

    private void addCandidate() {
        if (candidatesController.addCandidate(firstNameField.getText(), middleNameField.getText(), lastNameField.getText(), partyField.getText(), positionCB.getSelectedIndex())) {
            initData();
            JOptionPane.showMessageDialog(this, "Successfully added.");
            firstNameField.setText("");
            middleNameField.setText("");
            lastNameField.setText("");
            partyField.setText("");
            positionCB.setSelectedIndex(0);
            return;
        }
        JOptionPane.showMessageDialog(this, "Error adding candidate.");
    }

    private void removeTextFieldPlaceholder(JTextField textField, String text) {
        if (textField.getText().equals(text)) {
            textField.setForeground(Color.black);
            textField.setText("");
        }
    }

    private void addTextFieldPlaceholder(JTextField textField, String text) {
        if (textField.getText().equals("")) {
            textField.setForeground(Color.gray);
            textField.setText(text);
        }
    }

    private void searchCandidateID(String candidateLastName) {
        DefaultTableModel dtm = (DefaultTableModel) candidatesTbl.getModel();
        dtm.setRowCount(0);
        for (Vector<String> searchedCandidates : candidatesController.searchByID(candidateLastName)) {
            dtm.addRow(searchedCandidates);
        }
    }

    private void resetButtons() {
        accountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/account-unselected.png")));
        overviewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/overview-unselected.png")));
        votersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/voters-unselected.png")));
        manageCandidatesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/manage-candidates-unselected.png")));
    }

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
//        java.awt.EventQueue.invokeLater(() -> new AdminUI().setVisible(true));
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountBtn;
    private javax.swing.JPanel accountPanel;
    private javax.swing.JButton candidateBtn;
    private javax.swing.JTable candidatesTbl;
    private javax.swing.JTextField collegeFieldAccount;
    private javax.swing.JLabel collegeTextFieldAccount;
    private javax.swing.JTextField dateOfBirthFieldAccount;
    private javax.swing.JLabel dateOfBirthTextFieldAccount;
    private javax.swing.JLabel descTextField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField firstNameFieldAccount;
    private javax.swing.JLabel fullNameTextFieldAccount;
    private javax.swing.JLabel genderTextFieldAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField lastNameFieldAccount;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton manageCandidatesBtn;
    private javax.swing.JPanel manageCandidatesPanel;
    private javax.swing.JTextField middleNameField;
    private javax.swing.JTextField middleNameFieldAccount;
    private javax.swing.JButton overviewBtn;
    private javax.swing.JPanel overviewPanel;
    private javax.swing.JTextField partyField;
    private javax.swing.JLabel percentage;
    private javax.swing.JComboBox<String> positionCB;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JLabel registeredVoters;
    private javax.swing.JButton reinstateBtn;
    private javax.swing.JTextField searchIDField;
    private javax.swing.JComboBox<String> sexCbAccount;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel titleTextField;
    private javax.swing.JButton updateCandidateBtn;
    private javax.swing.JButton updateInformationBtn;
    private javax.swing.JPanel voterPanel;
    private javax.swing.JButton votersBtn;
    private javax.swing.JTable votersTbl;
    private javax.swing.JLabel vrnTextFieldAccount;
    // End of variables declaration//GEN-END:variables
}
