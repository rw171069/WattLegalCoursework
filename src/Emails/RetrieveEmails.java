/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emails;

import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rw171069
 */
public class RetrieveEmails extends javax.swing.JPanel {

    protected ArrayList<Message> EmailsList = new ArrayList<>();

    public RetrieveEmails() {
        initComponents();
        String username = "reuben.p.j.watt@btinternet.com";// change accordingly
        String password = "gw402293";// change accordingly
        if (username.contains("gmail")) {
            checkGmail(username, password);
        } else if (username.contains("btinternet")) {
            checkBT(username, password);
        }
    }

    public void checkGmail(String user, String password) {
        try {
            String host = "pop.gmail.com";// change accordingly
            String mailStoreType = "pop3";

            //create properties field
            Properties properties = new Properties();

            properties.put("mail.pop3.host", host);
            properties.put("mail.pop3.port", "995");
            properties.put("mail.pop3.starttls.enable", "true");
            Session emailSession = Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server
            Store store = emailSession.getStore("pop3s");

            store.connect(host, user, password);

            //create the folder object and open it
            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            System.out.println("messages.length---" + messages.length);

            //for (int i = 0, n = messages.length; i < n; i++) {
            int MaxEmails = messages.length - 20;
            for (int i = 0, n = messages.length - 1; n > MaxEmails; n--) {
                Message message = messages[n];
                String CorrectMessage = message.getContent().toString().replaceAll("\\<.*?\\>", "");
                DefaultTableModel tableModel = (DefaultTableModel) tblEmailRetrieve.getModel();
                tableModel.addRow(new Object[]{i, message.getSubject(), message.getFrom()[0], CorrectMessage});

                EmailsList.add(message);
            }

            //close the store and folder objects
            emailFolder.close(false);
            store.close();

        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void checkBT(String user, String password) {
        try {
            String host = "mail.btinternet.com";// change accordingly
            String mailStoreType = "pop3";
            //create properties field
            Properties properties = new Properties();

            properties.put("mail.pop3.host", host);
            properties.put("mail.pop3.port", "995");
            properties.put("mail.pop3.starttls.enable", "true");
            Session emailSession = Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server
            Store store = emailSession.getStore("pop3s");

            store.connect(host, user, password);

            //create the folder object and open it
            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            System.out.println("messages.length---" + messages.length);

            //for (int i = 0, n = messages.length; i < n; i++) {
            int MaxEmails = messages.length - 20;
            for (int i = 0, n = messages.length - 1; n > MaxEmails; n--) {
                Message message = messages[n];
                DefaultTableModel tableModel = (DefaultTableModel) tblEmailRetrieve.getModel();
                String CorrectMessage = message.getContent().toString().replaceAll("\\<.*?\\>", "");
                tableModel.addRow(new Object[]{n, message.getSubject(), message.getFrom()[0], CorrectMessage});
//                tableModel.addRow(new Object[]{i, message.getSubject(), message.getFrom()[0],message.getContent().toString() });

            }

            //close the store and folder objects
            emailFolder.close(false);
            store.close();

        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmailRetrieve = new javax.swing.JTable();

        jLabel1.setText("                    Checking Emails");

        tblEmailRetrieve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email Number", "Subject", "From", "Message"
            }
        ));
        tblEmailRetrieve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEmailRetrieveMouseReleased(evt);
            }
        });
        tblEmailRetrieve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblEmailRetrieveKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmailRetrieve);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblEmailRetrieveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmailRetrieveKeyReleased
        int row = tblEmailRetrieve.getSelectedRow();
        String EmailNumber = tblEmailRetrieve.getValueAt(row, 0).toString();
        String EmailNumber2 = tblEmailRetrieve.getValueAt(row, 1).toString();
        System.out.println(EmailNumber + " " + EmailNumber2);
    }//GEN-LAST:event_tblEmailRetrieveKeyReleased

    private void tblEmailRetrieveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmailRetrieveMouseReleased
        int row = tblEmailRetrieve.getSelectedRow();
        String EmailNumber = tblEmailRetrieve.getValueAt(row, 0).toString();
        String EmailSubject = tblEmailRetrieve.getValueAt(row, 0).toString();
        String EmailFrom = tblEmailRetrieve.getValueAt(row, 0).toString();
        String EmailMessage = tblEmailRetrieve.getValueAt(row, 0).toString();
        //EmailLooker(EmailNumber, EmailSubject, EmailFrom, EmailMessage);
    }//GEN-LAST:event_tblEmailRetrieveMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmailRetrieve;
    // End of variables declaration//GEN-END:variables
}
