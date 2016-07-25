package controller;



import java.io.*;
import java.net.InetAddress;
import java.util.Properties;
import java.util.Date;

import javax.mail.*;
import javax.mail.internet.*;

import com.sun.mail.smtp.*;


//@SuppressWarnings("unused")


@SuppressWarnings("unused")
public class ehrmail {
	public static void main(String[] args) throws Exception{
		/*String host = "mail.hd2mtech.com";
		String user = "mail.mdtree@hd2mtech.com";
		String pass = "hostignitionpwd";
		String to = "haridharna@gmail.com";
		String from = "mail.mdtree@hd2mtech.com";//The from address should be any valid email address.
		String subject = "Test subject";
		String messageText = "Please click this link http://hd2mtech.com/MDTreeWebClient/";
		boolean sessionDebug = false;
		Properties props = System.getProperties();
		props.put("mail.host", host);
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		Session mailSession = Session.getDefaultInstance(props, null);
		mailSession.setDebug(sessionDebug);
		Message msg = new MimeMessage(mailSession);
		msg.setFrom(new InternetAddress(from));
		InternetAddress[] address = {new InternetAddress(to)};
		msg.setRecipients(Message.RecipientType.TO, address);
		msg.setSubject(subject);
		msg.setSentDate(new Date());
		msg.setText(messageText);
		Transport transport = mailSession.getTransport("smtp");
		transport.connect(host, user, pass);
		transport.sendMessage(msg, msg.getAllRecipients());
		transport.close();*/
		System.out.println("sai>>>>");
		final String to = "cholleti.sai@gmail.com";
		final String password ="1233454342";
		//send("info@visitreminder.com","jeevank@ihdmtech.com", password,"test");
		System.out.println("Mail Sent");
	}
	public static boolean send( String from,String to,String subject,String textmessage,String phone,String name) {
//    public static void main(String args[]) throws Exception {
        Properties props = System.getProperties();
        props.put("mail.smtps.host","mail.ehr2ehr.com");
        props.put("mail.smtps.auth","true");
        Session session = Session.getInstance(props, null);
        try {
        Message msg = new MimeMessage(session);
        //for(String t:email){if {t!=null}
        	
        
        msg.setFrom(new InternetAddress(from));//from
        msg.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse(to, false));
        msg.setSubject(subject);
        msg.setText(textmessage);
        msg.setContent(textmessage, "text/html;");
        msg.setSentDate(new Date());
        SMTPTransport t =
            (SMTPTransport)session.getTransport("smtps");
        t.connect("mail.ehr2ehr.com", "admin@ehr2ehr.com", "admin@123");
        t.sendMessage(msg, msg.getAllRecipients());
        System.out.println("Response: " + t.getLastServerResponse());
        //String response=t.getLastServerResponse();
        //if(response.equals("250 Great success")){
        	//t.close();
        	return true;}
        //else{
        	//t.close();
        	//return false;}
    //}
	catch (MessagingException e) {
        throw new RuntimeException(e);
    }
	}
}