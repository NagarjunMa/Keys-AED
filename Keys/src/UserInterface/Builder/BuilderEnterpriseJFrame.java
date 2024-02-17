package UserInterface.Builder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import Business.DatabaseUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import Utility.MapCoordinates;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author Sanjay Bhaskar Kashyap
 */
public class BuilderEnterpriseJFrame extends javax.swing.JPanel {

    /**
     * Creates new form BuilderEnterprise
     */
    private UserAccount userAccount;
    private EcoSystem system;
    private JPanel container;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    Timer timer;

    
    private void Time() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date= new Date();
                DateFormat timeFormat =  new SimpleDateFormat("HH:mm a");
                String time = timeFormat.format(date);
                timeLabel.setText(time);
            }
        };
        timer = new Timer(100, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }

    public BuilderEnterpriseJFrame(JPanel container, UserAccount userAcc, EcoSystem system) {
        initComponents();
        this.system = system;
        this.container = container;
        this.userAccount = userAcc;
        Time();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        listingsPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        requestPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        goBack = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1040, 190, 30));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        listingsPanel.setBackground(new java.awt.Color(255, 255, 255));
        listingsPanel.setPreferredSize(new java.awt.Dimension(100, 48));
        listingsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listingsPanelMousePressed(evt);
            }
        });
        listingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(115, 120, 128));
        jLabel9.setText("Manage Listings");
        listingsPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 170, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/managelisting30.png"))); // NOI18N
        listingsPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, 30));

        jPanel2.add(listingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 290, 60));

        requestPanel.setBackground(new java.awt.Color(255, 255, 255));
        requestPanel.setPreferredSize(new java.awt.Dimension(100, 48));
        requestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                requestPanelMousePressed(evt);
            }
        });
        requestPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(115, 120, 128));
        jLabel7.setText("Manage Requests");
        requestPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 170, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/managerequest30.png"))); // NOI18N
        requestPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, 30));

        jPanel2.add(requestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 290, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 290, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/keyslogo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 130));

        goBack.setBackground(new java.awt.Color(255, 255, 255));
        goBack.setPreferredSize(new java.awt.Dimension(100, 48));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goBackMousePressed(evt);
            }
        });
        goBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(115, 120, 128));
        jLabel32.setText("Return");
        goBack.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/exit.png"))); // NOI18N
        goBack.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jPanel2.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 290, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 288, 1080));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel10.setText("Builder Dashboard");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(152, 151, 151));
        jLabel1.setText("Manage everything related to Builder Enterprises");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        timeLabel.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        timeLabel.setText("3:45 PM");
        jPanel6.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 20, 190, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1630, 90));

        rightSidePanel.setBackground(new java.awt.Color(250, 249, 251));
        rightSidePanel.setLayout(new java.awt.CardLayout());
        jPanel1.add(rightSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 1630, 990));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestPanelMousePressed
        // TODO add your handling code here:
        displayRequests();
    }//GEN-LAST:event_requestPanelMousePressed

    private void listingsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listingsPanelMousePressed
        // TODO add your handling code here:
        displayListings();
    }//GEN-LAST:event_listingsPanelMousePressed

    private void goBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMousePressed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_goBackMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel listingsPanel;
    private javax.swing.JPanel requestPanel;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

    private void displayRequests() {
        
        listingsPanel.setBackground(new Color(255, 255, 255));
        requestPanel.setBackground(new Color(213, 230, 249));

        BuilderRequestsJPanel builderRequestsJPanel = new BuilderRequestsJPanel(system, container, userAccount);
        rightSidePanel.add(builderRequestsJPanel);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    }

    private void displayListings() {
        
        listingsPanel.setBackground(new Color(213, 230, 249));
        requestPanel.setBackground(new Color(255, 255, 255));

        BuilderManageListingsJPanel builderManageListingsJPanel = new BuilderManageListingsJPanel(system, rightSidePanel, userAccount);
        rightSidePanel.add(builderManageListingsJPanel);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    }

}
