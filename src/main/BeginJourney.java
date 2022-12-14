package main;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MBEAH
 */
public class BeginJourney extends javax.swing.JFrame {

    private String dispatcherId;//dispatch id property
    /**
     * Creates new form BeginJourney
     */
    public BeginJourney() {
        initComponents();
        accountNameLabel.setVisible(false);
        accountNameField.setVisible(false);
    }

    /**
     *  Constructor that takes a string parameter
     * @param Id the dispatch id
     */
    public BeginJourney(String Id) {
        dispatcherId = Id;
        initComponents();
        accountNameLabel.setVisible(false);
        accountNameField.setVisible(false);
        dispatcherLabel.setText(dispatcherId);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        startTimeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pickupPointField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        destinationNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passengerNameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passengerNumberField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        accountNameLabel = new javax.swing.JLabel();
        accountNameField = new javax.swing.JTextField();
        goBackButton = new javax.swing.JButton();
        yesButton = new javax.swing.JRadioButton();
        noButton = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        dispatcherLabel = new javax.swing.JLabel();
        driverIdField = new javax.swing.JComboBox<>();
        errorLabelField = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("GREENWICH CABS: BEGIN JOURNEY");

        jLabel3.setText("DRIVER ID:");

        jLabel4.setText("START TIME:");

        jLabel5.setText("PICKUP POINT:");

        jLabel6.setText("DESTINATION:");

        jLabel7.setText("PASSENGER NAME:");
        jLabel7.setMaximumSize(new java.awt.Dimension(200, 14));

        jLabel8.setText("PASSENGER NO:");

        clearButton.setText("CLEAR");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        submitButton.setText("SUBMIT");
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });

        jLabel9.setText("DISPATCHER ID:");

        accountNameLabel.setText("ACCOUNT NAME:");

        goBackButton.setText("Go Back");
        goBackButton.setToolTipText("");
        goBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackButtonMouseClicked(evt);
            }
        });

        buttonGroup.add(yesButton);
        yesButton.setText("Yes");
        yesButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yesButtonItemStateChanged(evt);
            }
        });

        buttonGroup.add(noButton);
        noButton.setText("No");
        noButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noButtonItemStateChanged(evt);
            }
        });

        jLabel11.setText("ACCOUNT JOB?");
        jLabel11.setToolTipText("");

        jLabel10.setText("PHONE NUMBER:");
        jLabel10.setToolTipText("");

        dispatcherLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dispatcherLabel.setForeground(new java.awt.Color(0, 153, 0));

        driverIdField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        driverIdField.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                driverIdFieldItemStateChanged(evt);
            }
        });

        errorLabelField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorLabelField.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dispatcherLabel)
                            .addComponent(errorLabelField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountNameLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passengerNameField)
                                .addComponent(startTimeField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pickupPointField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(yesButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(noButton)))
                            .addComponent(accountNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(goBackButton)
                    .addComponent(destinationNameField)
                    .addComponent(passengerNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(phoneNumberField)
                    .addComponent(driverIdField, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackButton)
                    .addComponent(dispatcherLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(driverIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pickupPointField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passengerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destinationNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yesButton)
                            .addComponent(noButton)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(passengerNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accountNameLabel)
                            .addComponent(accountNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(errorLabelField)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(submitButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method to validate entries in input fields
    private void validateFields(){
        if (startTime.isEmpty()) {//no start time entered, required
            errorLabelField.setText("Start time not entered!");
            return;
        }
        
        if (pickupPoint.isEmpty()) {//no Pick up point entered, required
            errorLabelField.setText("Pick up point not entered!");
            return;
        }
        
        if (destination.isEmpty()) {//no destination entered, required
            errorLabelField.setText("Destination not entered!");
            return;
        }
        
        if (driverId == 0) {//no driver selected, required
            errorLabelField.setText("Driver ID not selected!");
            return;
        }
        
        if (!phoneNumber.isEmpty()) {//phone number not empty
            try {
                long number = Long.parseLong(phoneNumber);
            } catch (Exception e) {
                errorLabelField.setText("Invalid input in phone number");
                return;
            }
            
        }
        
        if (isAccountJob) {
            if (accountName.isEmpty()) {
                errorLabelField.setText("Account name required if account job");
                return;
            }
        }else
            accountName = "";
        
        createJourney();
    }
    
    //method to store data of journey info after successful validation
    private void createJourney(){
        JourneyMedium medium = new JourneyMedium();
        Journey journey = new Journey();
        int count = medium.getJourneysCount()+1;
        journey.setJourneyId("J"+count);
        journey.setStartTime(startTime);
        journey.setPickupPoint(pickupPoint);
        journey.setDestination(destination);
        journey.setDriversId(driverId);
        journey.setPassengerName(passengerName);
        journey.setAccountName(accountName);
        journey.setPhoneNumber(phoneNumber);
        
        if (medium.createNewJourney(journey)) {
            clearFields();
            JOptionPane.showMessageDialog( this, "Journey Details Saved!");
        } else {
            JOptionPane.showMessageDialog( this, "Failed to Save. Please try again!");
        }
    }
    
    //clear entries in input fields
    private void clearFields(){
        passengerNameField.setText("");
        passengerNumberField.setText("");
        startTimeField.setText("");
        pickupPointField.setText("");
        accountNameField.setText("");
        driverIdField.setSelectedIndex(0);
        destinationNameField.setText("");
        phoneNumberField.setText("");
    }
    
    //when a driver id dropdown item is selected
    private void driverIdFieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_driverIdFieldItemStateChanged
        // TODO add your handling code here:
        if (evt.getSource() == driverIdField) {//dropdown item selected
            driverId =  Integer.parseInt((String) driverIdField.getSelectedItem());
        }
    }//GEN-LAST:event_driverIdFieldItemStateChanged

    //when the yes radio button is clicked
    private void yesButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yesButtonItemStateChanged
        // TODO add your handling code here:
        accountNameField.setVisible(true);
        accountNameLabel.setVisible(true);
    }//GEN-LAST:event_yesButtonItemStateChanged

    //when the no radio button is clicked
    private void noButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noButtonItemStateChanged
        // TODO add your handling code here:
        accountNameField.setVisible(false);
        accountNameLabel.setVisible(false);
    }//GEN-LAST:event_noButtonItemStateChanged

    //when the clear button is clicked
    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clearButtonMouseClicked

    //when the submit button is clicked
    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        // TODO add your handling code here:
        errorLabelField.setText("");
        
        startTime = startTimeField.getText();
        destination = destinationNameField.getText();
        accountName = accountNameField.getText();
        passengerName = passengerNameField.getText();
        passengerNumber = passengerNumberField.getText();
        pickupPoint = pickupPointField.getText();
        driverId = Integer.parseInt((String) driverIdField.getSelectedItem());
        destination = destinationNameField.getText();
        phoneNumber = phoneNumberField.getText();
        
        //
        validateFields();
//        JOptionPane.showMessageDialog( this, "Journey Details Saved!");
    }//GEN-LAST:event_submitButtonMouseClicked

    //when the go back button is clicked
    private void goBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_goBackButtonMouseClicked

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BeginJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BeginJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BeginJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BeginJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BeginJourney().setVisible(true);
            }
        });
    }

    //input field variables
    String destination;
    String accountName;
    int driverId;
    String startTime;
    String passengerName;
    String passengerNumber;
    String pickupPoint;
    String phoneNumber;
    boolean isAccountJob = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNameField;
    private javax.swing.JLabel accountNameLabel;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField destinationNameField;
    private javax.swing.JLabel dispatcherLabel;
    private javax.swing.JComboBox<String> driverIdField;
    private javax.swing.JLabel errorLabelField;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton noButton;
    private javax.swing.JTextField passengerNameField;
    private javax.swing.JTextField passengerNumberField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField pickupPointField;
    private javax.swing.JTextField startTimeField;
    private javax.swing.JButton submitButton;
    private javax.swing.JRadioButton yesButton;
    // End of variables declaration//GEN-END:variables
}
