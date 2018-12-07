/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emails;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Reuben
 */
public class SendEmail {
    
 private String user = "reuben.p.j.watt@gmail.com";
    private String pass = "Spyfire14";

    SendEmail(String to, String Subject, String Mes, String Attach) {
        Properties prop = new Properties();
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", true);
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587"); //Look at what to do for yahoo etc

        //Checks password
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(user, pass);
            }

        });
        try {
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress("reuben.p.j.watt@gmail.com"));
            message.setRecipient(Message.RecipientType.TO, InternetAddress.parse(to)[0]); //Will only send to one email. Need to eventually change that
            message.setSubject(Subject);
//            message.setText(Mes);


// Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            // Now set the actual message
//            messageBodyPart.setText("This is message body");
            messageBodyPart.setText(Mes);

            // Create a multipar message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(Attach);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(Attach);
            multipart.addBodyPart(messageBodyPart);

            // Send the complete message parts
            message.setContent(multipart);

            Transport.send(message);

        } catch (Exception e) {
            System.out.println("Hi");
            System.out.println(e);
            System.out.println("Bye");
        };
    }
}

