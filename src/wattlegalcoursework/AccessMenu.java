/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wattlegalcoursework;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class AccessMenu extends javax.swing.JPanel {

    private static Connection con;
    private static Statement stmt;
    public static int ID;
    private static String Email;
    private static String Password;
    private static String FirstName;
    private static String LastName;
    private static String Sex;
    private static String JobTitle;
    private static String LawFirm;
    private static File f;

    public AccessMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtFirstRegister = new javax.swing.JTextField();
        txtLastRegister = new javax.swing.JTextField();
        txtEmailRegister = new javax.swing.JTextField();
        txtPasswordRegister = new javax.swing.JTextField();
        txtRePasswordRegister = new javax.swing.JTextField();
        txtSexRegister = new javax.swing.JComboBox<>();
        txtTitleRegister = new javax.swing.JTextField();
        picProfile = new javax.swing.JLabel();
        txtPathRegister = new javax.swing.JTextField();
        btnAttachRegister = new javax.swing.JButton();
        BTNClose1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtFirmNameRegister = new javax.swing.JTextField();
        picLogo = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtFirmLogoPath = new javax.swing.JTextField();
        btnAttachLogo = new javax.swing.JButton();
        btnRegisterDone = new javax.swing.JButton();
        BTNClose3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLogIn = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

        jPanel3.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel26.setText("Owner Register");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(320, 20, 450, 125);

        jLabel4.setText("First Name:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(122, 237, 55, 14);

        jLabel21.setText("Last Name:");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(122, 263, 55, 14);

        jLabel22.setText("Email:");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(122, 289, 28, 14);

        jLabel27.setText("Password:");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(127, 315, 50, 14);

        jLabel28.setText("Re-enter Password:");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(81, 341, 96, 14);

        jLabel29.setText("Sex:");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(155, 367, 22, 14);

        jLabel30.setText("Job title:");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(135, 393, 42, 14);
        jPanel3.add(txtFirstRegister);
        txtFirstRegister.setBounds(181, 234, 143, 20);
        jPanel3.add(txtLastRegister);
        txtLastRegister.setBounds(181, 260, 143, 20);
        jPanel3.add(txtEmailRegister);
        txtEmailRegister.setBounds(181, 286, 143, 20);
        jPanel3.add(txtPasswordRegister);
        txtPasswordRegister.setBounds(181, 312, 143, 20);
        jPanel3.add(txtRePasswordRegister);
        txtRePasswordRegister.setBounds(181, 338, 143, 20);

        txtSexRegister.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel3.add(txtSexRegister);
        txtSexRegister.setBounds(181, 364, 143, 20);

        txtTitleRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(txtTitleRegister);
        txtTitleRegister.setBounds(181, 390, 143, 20);

        picProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(picProfile);
        picProfile.setBounds(530, 210, 133, 158);
        jPanel3.add(txtPathRegister);
        txtPathRegister.setBounds(490, 370, 220, 20);

        btnAttachRegister.setText("Attach");
        btnAttachRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAttachRegisterMouseReleased(evt);
            }
        });
        btnAttachRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(btnAttachRegister);
        btnAttachRegister.setBounds(560, 390, 65, 23);

        BTNClose1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BTNClose1.setText(" X");
        BTNClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNClose1MouseClicked(evt);
            }
        });
        jPanel3.add(BTNClose1);
        BTNClose1.setBounds(1130, 0, 32, 44);

        jTabbedPane2.addTab("Stage 1. Owner register", jPanel3);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel31.setText("Firm Register");

        jLabel32.setText("Name:");

        picLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel34.setText("Logo");

        btnAttachLogo.setText("Attach");
        btnAttachLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachLogoActionPerformed(evt);
            }
        });

        btnRegisterDone.setText("Done");
        btnRegisterDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRegisterDoneMouseReleased(evt);
            }
        });

        BTNClose3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BTNClose3.setText(" X");
        BTNClose3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNClose3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtFirmLogoPath, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(picLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(304, 304, 304))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAttachLogo)
                .addGap(340, 340, 340))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(btnRegisterDone)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                .addComponent(BTNClose3))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(txtFirmNameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(373, 373, 373))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel31))
                    .addComponent(BTNClose3))
                .addGap(71, 71, 71)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtFirmNameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(3, 3, 3)
                .addComponent(picLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFirmLogoPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAttachLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnRegisterDone)
                .addGap(110, 110, 110))
        );

        jTabbedPane2.addTab("Stage 2. Firm register", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Register", jPanel1);

        btnLogIn.setText("Log In");
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogInMouseReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Email:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel23.setText("Log in");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Password:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel24)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 475, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(425, 425, 425))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogIn)
                        .addGap(458, 458, 458))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 163, 163)
                .addComponent(btnLogIn)
                .addGap(151, 151, 151))
        );

        jTabbedPane1.addTab("Log In", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseReleased
        try {
            DoConnect();
            String sql = "SELECT * FROM LAWYERLISTS";
            ResultSet rs = stmt.executeQuery(sql);
            boolean Present = false;
            try {
                while (rs.next()) {
                    Email = rs.getString("Email");
                    String Pass = rs.getString("Password");

                    String InputEmail = txtEmail.getText();
                    String InputPassword = txtPassword.getText();
                    if ((InputEmail.equalsIgnoreCase(Email)) && (Pass.equals(InputPassword))) {
                        Present = true;
                        ID = rs.getInt("ID");
                        FirstName = rs.getString("First_Name");
                        LastName = rs.getString("Last_Name");
                        Email = rs.getString("Email");
                        Sex = rs.getString("Sex");
                        JobTitle = rs.getString("Job_title");
                        LawFirm = rs.getString("LawFirms");
                        break;
                    }

                }
                if (Present == false) {
                    JOptionPane.showMessageDialog(AccessMenu.this, "This combination is not on our database!");
                } else {
                    WattLegalCoursework.addToFrontPanel(Background.BackgroundPanel, new Overview(), true);
                    Background.MenuBar.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccessMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccessMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLogInMouseReleased

    private void txtTitleRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleRegisterActionPerformed

    private void BTNClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_BTNClose1MouseClicked

    private void btnAttachLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachLogoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txtFirmLogoPath.setText(filename);
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(picProfile.getWidth(), picProfile.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        picProfile.setIcon(imageIcon);
    }//GEN-LAST:event_btnAttachLogoActionPerformed

    private void BTNClose3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNClose3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_BTNClose3MouseClicked

    private void btnAttachRegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttachRegisterMouseReleased
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txtPathRegister.setText(filename);
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(picProfile.getWidth(), picProfile.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        picProfile.setIcon(imageIcon);
    }//GEN-LAST:event_btnAttachRegisterMouseReleased

    private void btnRegisterDoneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterDoneMouseReleased
        try {

            DoConnect();

            String sql = "SELECT * FROM LAWYERLISTS" + " ORDER BY ID DESC";
            ResultSet rs = stmt.executeQuery(sql);

            if (txtPasswordRegister.getText().equals(txtRePasswordRegister.getText())) {
                try {
                    //rs.afterLast();
                    rs.next();
                    ID = rs.getInt("ID") + 1;
                    FirstName = txtFirstRegister.getText();
                    LastName = txtLastRegister.getText();
                    Email = txtEmailRegister.getText();
                    Password = txtPasswordRegister.getText();
                    Sex = (String) txtSexRegister.getSelectedItem();
                    JobTitle = txtTitleRegister.getText();
                    LawFirm = txtFirmNameRegister.getText();
                    FileInputStream fin = new FileInputStream(f);

                    String query = " INSERT INTO LAWYERLISTS (ID, FIRST_NAME, LAST_NAME, SEX, JOB_TITLE, EMAIL, PASSWORD, LAWFIRMS, IMAGES)"
                            + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setInt(1, ID);
                    preparedStmt.setString(2, FirstName);
                    preparedStmt.setString(3, LastName);
                    preparedStmt.setString(4, Sex);
                    preparedStmt.setString(5, JobTitle);
                    preparedStmt.setString(6, Email);
                    preparedStmt.setString(7, Password);
                    preparedStmt.setString(8, LawFirm);
                    preparedStmt.setBinaryStream(9, (InputStream) fin, (int) f.length());
                    preparedStmt.execute();
                    con.close();
                    sql = "SELECT * FROM LAWYERLISTS WHERE EMAIL = " + Email;
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        ID = rs.getInt("ID");
                        System.out.println("ID");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(AccessMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AccessMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(AccessMenu.this, "Your passwords do not match");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccessMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegisterDoneMouseReleased

    private void btnAttachRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAttachRegisterActionPerformed

    public void DoConnect() throws SQLException {
        try {
            String host = "jdbc:derby://localhost:1527/Lawyers";
            String uName = "spyfire14";
            String uPass = "spyfire14";
            con = DriverManager.getConnection(host, uName, uPass);
            stmt = con.createStatement();
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BTNClose1;
    private javax.swing.JLabel BTNClose3;
    private javax.swing.JButton btnAttachLogo;
    private javax.swing.JButton btnAttachRegister;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnRegisterDone;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel picLogo;
    private javax.swing.JLabel picProfile;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailRegister;
    private javax.swing.JTextField txtFirmLogoPath;
    private javax.swing.JTextField txtFirmNameRegister;
    private javax.swing.JTextField txtFirstRegister;
    private javax.swing.JTextField txtLastRegister;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPasswordRegister;
    private javax.swing.JTextField txtPathRegister;
    private javax.swing.JTextField txtRePasswordRegister;
    private javax.swing.JComboBox<String> txtSexRegister;
    private javax.swing.JTextField txtTitleRegister;
    // End of variables declaration//GEN-END:variables
}
