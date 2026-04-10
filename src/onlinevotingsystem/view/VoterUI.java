package onlinevotingsystem.view;

import Entity.User;
import java.awt.CardLayout;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import onlinevotingsystem.controller.VoteNowController;

public class VoterUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VoterUI.class.getName());

    User user;
    VoteNowController voteNowController = new VoteNowController();

    public VoterUI(User user) {
        initComponents();
        this.user = user;
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        setTitle("Voter - " + user.getFname() + " " + user.getLname());
        userNameLabel.setText(user.getLname().toUpperCase() + ", " + user.getFname().toUpperCase() + ", " + user.getMname().toUpperCase());
        userCollegeLabel.setText(user.getCollege().toUpperCase());
        initData();
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
        userNameLabel = new javax.swing.JLabel();
        userCollegeLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        voteNowPanel = new javax.swing.JPanel();
        partyCB = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reviewVoteCandidatesTbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        voteCandidatesTbl = new javax.swing.JTable();
        positionsCB = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        confirmVoteBtn = new javax.swing.JButton();
        removeCandidateBtn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        candidateInfoPanel = new javax.swing.JPanel();
        candidateLName = new javax.swing.JTextField();
        candidateFName = new javax.swing.JTextField();
        candidateMName = new javax.swing.JTextField();
        candidatePosition = new javax.swing.JTextField();
        candidateParty = new javax.swing.JTextField();
        voteCandidateBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        resultPanel = new javax.swing.JPanel();
        positionsCB2 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        winnerTbl = new javax.swing.JTable();

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

        voteNowtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/vote-now-selected.png"))); // NOI18N
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

        userNameLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        userNameLabel.setText("DELA CRUZ, JUAN, REYES");
        titlePanel.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 510, 21));

        userCollegeLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        userCollegeLabel.setForeground(new java.awt.Color(255, 255, 255));
        userCollegeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        userCollegeLabel.setText("College of Information and Communication Technology");
        titlePanel.add(userCollegeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 41, 510, 20));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1089, 668));
        mainPanel.setLayout(new java.awt.CardLayout());

        jScrollPane1.setBorder(null);

        voteNowPanel.setBackground(new java.awt.Color(255, 255, 255));
        voteNowPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        partyCB.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        partyCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Party" }));
        partyCB.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1)));
        partyCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                partyCBItemStateChanged(evt);
            }
        });
        voteNowPanel.add(partyCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 220, 40));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Official Election Ballot");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("<html><b>Instructions:</b> Please review the candidates carefully. You may select up to the maximum number indicated for each position. Your vote is confidential and  final once submitted.</html>");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        voteNowPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1010, 100));

        reviewVoteCandidatesTbl.setBackground(new java.awt.Color(255, 255, 255));
        reviewVoteCandidatesTbl.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        reviewVoteCandidatesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Position", "Last Name", "First Name", "Middle Name", "Party"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reviewVoteCandidatesTbl.setRowHeight(25);
        reviewVoteCandidatesTbl.setSelectionBackground(new java.awt.Color(124, 31, 31));
        reviewVoteCandidatesTbl.setSelectionForeground(new java.awt.Color(255, 255, 255));
        reviewVoteCandidatesTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(reviewVoteCandidatesTbl);
        if (reviewVoteCandidatesTbl.getColumnModel().getColumnCount() > 0) {
            reviewVoteCandidatesTbl.getColumnModel().getColumn(0).setResizable(false);
            reviewVoteCandidatesTbl.getColumnModel().getColumn(1).setResizable(false);
            reviewVoteCandidatesTbl.getColumnModel().getColumn(2).setResizable(false);
            reviewVoteCandidatesTbl.getColumnModel().getColumn(3).setResizable(false);
            reviewVoteCandidatesTbl.getColumnModel().getColumn(4).setResizable(false);
        }

        voteNowPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 850, 1010, 290));

        voteCandidatesTbl.setBackground(new java.awt.Color(255, 255, 255));
        voteCandidatesTbl.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        voteCandidatesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Candidate ID", "Position", "Last Name", "First Name", "Middle Name", "Party"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        voteCandidatesTbl.setRowHeight(25);
        voteCandidatesTbl.setSelectionBackground(new java.awt.Color(124, 31, 31));
        voteCandidatesTbl.setSelectionForeground(new java.awt.Color(255, 255, 255));
        voteCandidatesTbl.getTableHeader().setReorderingAllowed(false);
        voteCandidatesTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voteCandidatesTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(voteCandidatesTbl);
        if (voteCandidatesTbl.getColumnModel().getColumnCount() > 0) {
            voteCandidatesTbl.getColumnModel().getColumn(0).setResizable(false);
            voteCandidatesTbl.getColumnModel().getColumn(1).setResizable(false);
            voteCandidatesTbl.getColumnModel().getColumn(2).setResizable(false);
            voteCandidatesTbl.getColumnModel().getColumn(3).setResizable(false);
            voteCandidatesTbl.getColumnModel().getColumn(4).setResizable(false);
            voteCandidatesTbl.getColumnModel().getColumn(5).setResizable(false);
        }

        voteNowPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 1010, 290));

        positionsCB.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        positionsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positions" }));
        positionsCB.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1)));
        positionsCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                positionsCBItemStateChanged(evt);
            }
        });
        voteNowPanel.add(positionsCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 220, 40));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Review your chosen candidates");
        voteNowPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Sort by: ");
        voteNowPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        voteNowPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 1010, 10));

        confirmVoteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/confirm-vote.png"))); // NOI18N
        confirmVoteBtn.setBorder(null);
        confirmVoteBtn.setBorderPainted(false);
        confirmVoteBtn.setContentAreaFilled(false);
        confirmVoteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmVoteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmVoteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmVoteBtnMouseExited(evt);
            }
        });
        voteNowPanel.add(confirmVoteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 1150, -1, 50));

        removeCandidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/remove-candidate-no-icon.png"))); // NOI18N
        removeCandidateBtn.setBorder(null);
        removeCandidateBtn.setBorderPainted(false);
        removeCandidateBtn.setContentAreaFilled(false);
        removeCandidateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeCandidateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeCandidateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeCandidateBtnMouseExited(evt);
            }
        });
        voteNowPanel.add(removeCandidateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 1150, -1, 50));
        voteNowPanel.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 1200, 100, 50));

        candidateInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Candidate Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        candidateInfoPanel.setOpaque(false);

        candidateLName.setEditable(false);
        candidateLName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        candidateLName.setForeground(new java.awt.Color(0, 0, 0));
        candidateLName.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1))); // NOI18N
        candidateLName.setFocusable(false);
        candidateLName.setRequestFocusEnabled(false);

        candidateFName.setEditable(false);
        candidateFName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        candidateFName.setForeground(new java.awt.Color(0, 0, 0));
        candidateFName.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1))); // NOI18N
        candidateFName.setFocusable(false);
        candidateFName.setRequestFocusEnabled(false);

        candidateMName.setEditable(false);
        candidateMName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        candidateMName.setForeground(new java.awt.Color(0, 0, 0));
        candidateMName.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Middle Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1))); // NOI18N
        candidateMName.setFocusable(false);
        candidateMName.setRequestFocusEnabled(false);

        candidatePosition.setEditable(false);
        candidatePosition.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        candidatePosition.setForeground(new java.awt.Color(0, 0, 0));
        candidatePosition.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Position", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1))); // NOI18N
        candidatePosition.setFocusable(false);
        candidatePosition.setRequestFocusEnabled(false);

        candidateParty.setEditable(false);
        candidateParty.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        candidateParty.setForeground(new java.awt.Color(0, 0, 0));
        candidateParty.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Party", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1))); // NOI18N
        candidateParty.setFocusable(false);
        candidateParty.setRequestFocusEnabled(false);

        javax.swing.GroupLayout candidateInfoPanelLayout = new javax.swing.GroupLayout(candidateInfoPanel);
        candidateInfoPanel.setLayout(candidateInfoPanelLayout);
        candidateInfoPanelLayout.setHorizontalGroup(
            candidateInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, candidateInfoPanelLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(candidateInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, candidateInfoPanelLayout.createSequentialGroup()
                        .addComponent(candidatePosition)
                        .addGap(18, 18, 18)
                        .addComponent(candidateParty, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(candidateInfoPanelLayout.createSequentialGroup()
                        .addComponent(candidateLName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(candidateFName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(candidateMName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
        );
        candidateInfoPanelLayout.setVerticalGroup(
            candidateInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(candidateInfoPanelLayout.createSequentialGroup()
                .addGroup(candidateInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(candidateLName)
                    .addComponent(candidateFName)
                    .addComponent(candidateMName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(candidateInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(candidatePosition, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(candidateParty))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        voteNowPanel.add(candidateInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1010, 200));

        voteCandidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/vote-candidate.png"))); // NOI18N
        voteCandidateBtn.setBorder(null);
        voteCandidateBtn.setBorderPainted(false);
        voteCandidateBtn.setContentAreaFilled(false);
        voteCandidateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voteCandidateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                voteCandidateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                voteCandidateBtnMouseExited(evt);
            }
        });
        voteCandidateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteCandidateBtnActionPerformed(evt);
            }
        });
        voteNowPanel.add(voteCandidateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 730, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        voteNowPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 800, 1010, 10));

        jScrollPane1.setViewportView(voteNowPanel);

        mainPanel.add(jScrollPane1, "voteNowCard");

        resultPanel.setBackground(new java.awt.Color(255, 255, 255));

        positionsCB2.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        positionsCB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positions" }));
        positionsCB2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1)));

        winnerTbl.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        winnerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Positions", "Last Name", "First Name", "Middle Name", "Party", "Vote Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        winnerTbl.setRowHeight(25);
        winnerTbl.setSelectionBackground(new java.awt.Color(124, 31, 31));
        winnerTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(winnerTbl);
        if (winnerTbl.getColumnModel().getColumnCount() > 0) {
            winnerTbl.getColumnModel().getColumn(0).setResizable(false);
            winnerTbl.getColumnModel().getColumn(1).setResizable(false);
            winnerTbl.getColumnModel().getColumn(2).setResizable(false);
            winnerTbl.getColumnModel().getColumn(3).setResizable(false);
            winnerTbl.getColumnModel().getColumn(4).setResizable(false);
            winnerTbl.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(positionsCB2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(positionsCB2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        mainPanel.add(resultPanel, "resultCard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initData() {
        populatePositionsCB();
        populatePartyCB();
        populateVoteCandidatesTbl();
    }

    private void populatePositionsCB() {
        for (String positions : voteNowController.getAvailablePositions()) {
            positionsCB.addItem(positions);
        }
    }

    private void populatePartyCB() {
        for (String party : voteNowController.getParties()) {
            partyCB.addItem(party);
        }
    }

    private void populateVoteCandidatesTbl() {
        DefaultTableModel dtm = (DefaultTableModel) voteCandidatesTbl.getModel();
        for (Vector<String> candidateData : voteNowController.getCandidatesData()) {
            if (candidateData.lastElement().equals("Running")) {
                dtm.addRow(candidateData);
            }
        }
    }

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
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "resultCard");
    }//GEN-LAST:event_resultBtnActionPerformed

    private void voteNowtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteNowtBtnActionPerformed
        resetButtonsIcon();
        voteNowtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/vote-now-selected.png")));
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "voteNowCard");
    }//GEN-LAST:event_voteNowtBtnActionPerformed

    private void confirmVoteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmVoteBtnMouseEntered
        confirmVoteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/confirm-vote-hover.png")));
    }//GEN-LAST:event_confirmVoteBtnMouseEntered

    private void removeCandidateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeCandidateBtnMouseEntered
        removeCandidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/remove-candidate-no-icon-hover.png")));
    }//GEN-LAST:event_removeCandidateBtnMouseEntered

    private void removeCandidateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeCandidateBtnMouseExited
        removeCandidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/remove-candidate-no-icon.png")));
    }//GEN-LAST:event_removeCandidateBtnMouseExited

    private void confirmVoteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmVoteBtnMouseExited
        confirmVoteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/confirm-vote.png")));
    }//GEN-LAST:event_confirmVoteBtnMouseExited

    private void voteCandidateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voteCandidateBtnMouseEntered
        voteCandidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/vote-candidate-hover.png")));
    }//GEN-LAST:event_voteCandidateBtnMouseEntered

    private void voteCandidateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voteCandidateBtnMouseExited
        voteCandidateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/vote-candidate.png")));
    }//GEN-LAST:event_voteCandidateBtnMouseExited

    private void positionsCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_positionsCBItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            filterCandidate();
        }
    }//GEN-LAST:event_positionsCBItemStateChanged

    private void partyCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_partyCBItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            filterCandidate();
        }
    }//GEN-LAST:event_partyCBItemStateChanged

    private void voteCandidatesTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voteCandidatesTblMouseClicked
        // TODO add your handling code here:
        int row = voteCandidatesTbl.getSelectedRow();
        if (row == -1) {
            candidateLName.setText("");
            candidateFName.setText("");
            candidateMName.setText("");
            candidatePosition.setText("");
            candidateParty.setText("");
            return;
        }
        candidateLName.setText(voteCandidatesTbl.getValueAt(row, 2).toString());
        candidateFName.setText(voteCandidatesTbl.getValueAt(row, 3).toString());
        candidateMName.setText(voteCandidatesTbl.getValueAt(row, 4).toString());
        candidatePosition.setText(voteCandidatesTbl.getValueAt(row, 1).toString());
        candidateParty.setText(voteCandidatesTbl.getValueAt(row, 5).toString());

    }//GEN-LAST:event_voteCandidatesTblMouseClicked

    private void voteCandidateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteCandidateBtnActionPerformed
        
    }//GEN-LAST:event_voteCandidateBtnActionPerformed

    private void filterCandidate() {
        DefaultTableModel dtm = (DefaultTableModel) voteCandidatesTbl.getModel();
        dtm.setRowCount(0);

        String position = positionsCB.getSelectedItem().equals("Positions") ? null : positionsCB.getSelectedItem().toString();
        String party = partyCB.getSelectedItem().equals("Party") ? null : partyCB.getSelectedItem().toString();

        for (Vector<String> filterCandidate : voteNowController.getFilteredCandidateData(position, party)) {
            dtm.addRow(filterCandidate);
        }
    }

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
    private javax.swing.JTextField candidateFName;
    private javax.swing.JPanel candidateInfoPanel;
    private javax.swing.JTextField candidateLName;
    private javax.swing.JTextField candidateMName;
    private javax.swing.JTextField candidateParty;
    private javax.swing.JTextField candidatePosition;
    private javax.swing.JButton confirmVoteBtn;
    private javax.swing.JLabel descTextField;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> partyCB;
    private javax.swing.JComboBox<String> positionsCB;
    private javax.swing.JComboBox<String> positionsCB2;
    private javax.swing.JButton removeCandidateBtn;
    private javax.swing.JButton resultBtn;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JTable reviewVoteCandidatesTbl;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel titleTextField;
    private javax.swing.JLabel userCollegeLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JButton voteCandidateBtn;
    private javax.swing.JTable voteCandidatesTbl;
    private javax.swing.JPanel voteNowPanel;
    private javax.swing.JButton voteNowtBtn;
    private javax.swing.JTable winnerTbl;
    // End of variables declaration//GEN-END:variables
}
