/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wattlegalcoursework.Settings;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author Reuben
 */
public class PersonelDetailSettings extends javax.swing.JPanel {

    /**
     * Creates new form PersonelDetailSettings
     */
    public PersonelDetailSettings() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel34 = new javax.swing.JLabel();
        txtFirstSettings = new javax.swing.JTextField();
        txtLastSettings = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtLawFirmSettings = new javax.swing.JTextField();
        txtEmailSettings = new javax.swing.JTextField();
        txtJobTitleSettings = new javax.swing.JTextField();
        txtSexSettings = new javax.swing.JTextField();
        btnSaveSettings1 = new javax.swing.JButton();

        jLabel34.setText("First Name:");

        txtFirstSettings.setText("jTextField1");

        txtLastSettings.setText("jTextField2");

        jLabel41.setText("Last Name:");

        jLabel42.setText("Sex");

        jLabel43.setText("Job Title:");

        jLabel44.setText("Email:");

        jLabel45.setText("Need to include change password some how");

        jLabel46.setText("Law firm");

        txtLawFirmSettings.setEditable(false);
        txtLawFirmSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLawFirmSettingsActionPerformed(evt);
            }
        });

        txtEmailSettings.setText("jTextField5");

        txtJobTitleSettings.setText("jTextField4");

        txtSexSettings.setText("jTextField3");

        btnSaveSettings1.setText("Save");
        btnSaveSettings1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSaveSettings1MouseReleased(evt);
            }
        });
        btnSaveSettings1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSettings1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel45)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addGap(51, 51, 51)
                                        .addComponent(txtEmailSettings))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel41)
                                                        .addGap(25, 25, 25)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel42)
                                                    .addGap(61, 61, 61)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel43)
                                                .addGap(35, 35, 35)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFirstSettings)
                                            .addComponent(txtLastSettings)
                                            .addComponent(txtSexSettings)
                                            .addComponent(txtJobTitleSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(53, 53, 53)
                                .addComponent(txtLawFirmSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnSaveSettings1)))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtLastSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtSexSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtJobTitleSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtEmailSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtLawFirmSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnSaveSettings1)
                .addContainerGap(419, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLawFirmSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLawFirmSettingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLawFirmSettingsActionPerformed

    private void btnSaveSettings1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveSettings1MouseReleased
        String UpdateFirst = txtFirstSettings.getText();
        String UpdateLast = txtLastSettings.getText();
        String UpdateSex = txtSexSettings.getText();
        String UpdateJobTitle = txtJobTitleSettings.getText();
        String UpdateEmail = txtEmailSettings.getText();
        String UpdateLawFirm = txtLawFirmSettings.getText();
        try {
            String host = "jdbc:derby://localhost:1527/Lawyers";
            String uName = "spyfire14";
            String uPass = "spyfire14";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            con.setAutoCommit(false);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM LAWYERLISTS WHERE ID = "; //+ID};
            ResultSet rs = stmt.executeQuery(sql);

            rs.first();
            rs.updateString("FIRST_NAME", UpdateFirst);
            rs.updateString("LAST_NAME", UpdateLast);
            rs.updateString("SEX", UpdateSex);
            rs.updateString("JOB_TITLE", UpdateJobTitle);
            rs.updateString("EMAIL", UpdateEmail);

            //Include a confirmation
            rs.updateRow();
            rs.updateString("EMAIL", UpdateEmail);
            con.commit();
            rs.close();
            stmt.close();
            System.out.println(UpdateEmail);

        } catch (SQLException ex) {
            Logger.getLogger(PersonelDetailSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveSettings1MouseReleased

    private void btnSaveSettings1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSettings1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveSettings1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveSettings1;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    public static javax.swing.JTextField txtEmailSettings;
    public static javax.swing.JTextField txtFirstSettings;
    public static javax.swing.JTextField txtJobTitleSettings;
    public static javax.swing.JTextField txtLastSettings;
    public static javax.swing.JTextField txtLawFirmSettings;
    public static javax.swing.JTextField txtSexSettings;
    // End of variables declaration//GEN-END:variables
}