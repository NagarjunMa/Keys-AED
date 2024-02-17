package UserInterface.Builder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


import Business.Builder.Builder;
import Business.Builder.Listings;
import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manoj Chandrasekaran
 */
public class BuilderManageListingsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmaManageMedicine
     */
    private UserAccount userAcc;
    private EcoSystem system;
    private JPanel container;
    private Builder builder;

    public BuilderManageListingsJPanel(EcoSystem system, JPanel userProcessContainer, UserAccount userAcc) {
        initComponents();
        this.system = system;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        Builder b = (Builder) userAcc;
        this.builder = b;
        displayTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        availableRg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListing = new javax.swing.JTable();
        aptNoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        delButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        addressTextField = new javax.swing.JTextField();
        noOfBedsTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        noOfBathTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rentTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        houseSpecsTextField = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        yesRb = new javax.swing.JRadioButton();
        noRb = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblListing.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Apt no", "Address", "Beds", "Baths", "Rent", "Available"
            }
        ));
        jScrollPane1.setViewportView(tblListing);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1410, 390));

        aptNoTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(aptNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 380, 40));

        jLabel5.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(73, 84, 90));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Apt No:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 414, 120, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(73, 84, 90));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Address:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 466, 110, -1));

        delButton.setBackground(new java.awt.Color(255, 55, 95));
        delButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        delButton.setForeground(new java.awt.Color(255, 255, 255));
        delButton.setText("Delete");
        delButton.setBorder(null);
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });
        jPanel2.add(delButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 220, 50));

        addButton.setBackground(new java.awt.Color(51, 51, 255));
        addButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 670, 220, 50));

        addressTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 460, 380, 40));

        noOfBedsTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(noOfBedsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 512, 380, 40));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("No of beds:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 518, 110, -1));

        noOfBathTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(noOfBathTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 564, 380, 40));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("No of bath:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 570, 110, -1));

        rentTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(rentTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 380, 40));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("House specifications:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 215, -1));

        houseSpecsTextField.setColumns(20);
        houseSpecsTextField.setRows(5);
        jScrollPane2.setViewportView(houseSpecsTextField);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, 380, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Rent ($):");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 215, -1));

        availableRg.add(yesRb);
        yesRb.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        yesRb.setText("Yes");
        jPanel2.add(yesRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 570, -1, -1));

        availableRg.add(noRb);
        noRb.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        noRb.setText("No");
        jPanel2.add(noRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 570, -1, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(73, 84, 90));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Available:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 192, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        // TODO add your handling code here:
        deleteListing();
    }//GEN-LAST:event_delButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        addListing();

    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField aptNoTextField;
    private javax.swing.ButtonGroup availableRg;
    private javax.swing.JButton delButton;
    private javax.swing.JTextArea houseSpecsTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField noOfBathTextField;
    private javax.swing.JTextField noOfBedsTextField;
    private javax.swing.JRadioButton noRb;
    private javax.swing.JTextField rentTextField;
    private javax.swing.JTable tblListing;
    private javax.swing.JRadioButton yesRb;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {

        DefaultTableModel table = (DefaultTableModel) tblListing.getModel();

        table.setRowCount(0);
        for (Listings listing : builder.getListings()) {
            Object[] row = new Object[6];
            row[0] = listing;
            row[1] = listing.getAddress();
            row[2] = listing.getNoOfBeds();
            row[3] = listing.getNoOfBaths();
            row[4] = listing.getRent();
            row[5] = listing.isAvailable() ? "Yes" : "No";
            table.addRow(row);
        }
    }

    private void deleteListing() {
        
        DefaultTableModel table = (DefaultTableModel) tblListing.getModel();
        int selectedRow = tblListing.getSelectedRow();
        if (selectedRow >= 0) {
            Listings selectedListing = (Listings) table.getValueAt(selectedRow, 0);
            builder.getListings().remove(selectedListing);
            system.getListingsDirectory().removeListing(selectedListing);
            displayTable();
            JOptionPane.showMessageDialog(this, "Deleted Listing Successfully!");

        } else {
            JOptionPane.showMessageDialog(this, "select a row to delete");
        }

    }

    private void addListing() {
        if (isValidated()) {
            int aptNo = Integer.parseInt(aptNoTextField.getText());
            String address= addressTextField.getText();
            int noOfBeds = Integer.parseInt(noOfBedsTextField.getText());
            int noOfBaths = Integer.parseInt(noOfBathTextField.getText());
            String houseSpecs = houseSpecsTextField.getText();
            double rent = Double.parseDouble(rentTextField.getText());
            boolean isAvailable = false;
            if(yesRb.isSelected()) {
                isAvailable = true;
            } else if(noRb.isSelected()) {
                isAvailable = false;
            }
            Listings listing = new Listings(aptNo, address, noOfBeds, noOfBaths, houseSpecs, rent, isAvailable);
            builder.getListings().add(listing);
            system.getListingsDirectory().addListing(listing);
            
            displayTable();
            clearFields();
            JOptionPane.showMessageDialog(null, "Listing added Successfully!");

        }

    }

    private boolean isValidated() {
        if (null == aptNoTextField.getText() || aptNoTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter apt number");
            return false;
        } else {
            //Checking if anything other than numbers is input for apt no. If yes, we display an error message.
            try {
                int aptNo = Integer.parseInt(aptNoTextField.getText());
                //checking if aptNo is not negative. If yes, we display error message.
                if (aptNo <= 0) {
                    JOptionPane.showMessageDialog(this, "AptNo should be positive");
                    return false;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid apt number.");
                return false;
            }
        }
        if (null == addressTextField.getText() || addressTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter address");
            return false;
        }
        if (null == noOfBedsTextField.getText() || noOfBedsTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter no of beds");
            return false;
        } else {
            //Checking if anything other than numbers is input for no of beds. If yes, we display an error message.
            try {
                int noOfBeds = Integer.parseInt(noOfBedsTextField.getText());
                //checking if noOfBeds is not negative. If yes, we display error message.
                if (noOfBeds <= 0) {
                    JOptionPane.showMessageDialog(this, "No of beds should be a positive number");
                    return false;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid no of beds.");
                return false;
            }
        }
        if (null == noOfBathTextField.getText() || noOfBathTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter no of baths");
            return false;
        } else {
            //Checking if anything other than numbers is input for no of baths. If yes, we display an error message.
            try {
                int noOfBaths = Integer.parseInt(noOfBathTextField.getText());
                //checking if noOfBaths is not negative. If yes, we display error message.
                if (noOfBaths <= 0) {
                    JOptionPane.showMessageDialog(this, "No of baths should be a positive number");
                    return false;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid no of baths.");
                return false;
            }
        }
        if (null == rentTextField.getText() || rentTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter rent");
            return false;
        } else {
            //Checking if anything other than numbers is input for rent. If yes, we display an error message.
            try {
                double rent = Double.parseDouble(rentTextField.getText());
                //checking if rent is not negative. If yes, we display error message.
                if (rent <= 0.0) {
                    JOptionPane.showMessageDialog(this, "Rent should be a positive number");
                    return false;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid rent.");
                return false;
            }
        }
        if (availableRg.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Please select availability");
            return false;
        }
        return true;
    }

    private void clearFields() {
        aptNoTextField.setText("");
        addressTextField.setText("");
        noOfBathTextField.setText("");
        noOfBedsTextField.setText("");
        rentTextField.setText("");
        houseSpecsTextField.setText("");
        availableRg.clearSelection();
    }
}