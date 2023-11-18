package Bai5;
import java.io.File;
import java.util.Properties;
 
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
 
public class DemoSendGmail {
 
  public static void main(String args[]) throws AddressException, MessagingException {
    sendFile();
  }
 
  public static void sendFile() throws AddressException, MessagingException {
    Properties mailServerProperties;
    Session getMailSession;
    MimeMessage mailMessage;
 
    // Step1: setup Mail Server
    mailServerProperties = System.getProperties();
    mailServerProperties.put("mail.smtp.port", "587");
    mailServerProperties.put("mail.smtp.auth", "true");
    mailServerProperties.put("mail.smtp.starttls.enable", "true");
 
    // Step2: get Mail Session
    getMailSession = Session.getDefaultInstance(mailServerProperties, null);
    mailMessage = new MimeMessage(getMailSession);
 
    mailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("ducpmps26590@fpt.edu.vn")); //Thay abc bằng địa chỉ người nhận
 
    // Bạn có thể chọn CC, BCC
//    generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("cc@gmail.com")); //Địa chỉ cc gmail
    mailMessage.setSubject("Demo send file by Gmail from Java");
 
    // Tạo phần gửi message 
    BodyPart messagePart = new MimeBodyPart();
    messagePart.setText("This is message body");
 
    // Tạo phần gửi file
    BodyPart filePart = new MimeBodyPart();
    File file = new File("C:\\Users\\DUC\\Desktop\\Dev_Web_java\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Lab3\\files\\test.txt");
    DataSource source = new FileDataSource(file);
    filePart.setDataHandler(new DataHandler(source));
    filePart.setFileName(file.getName());
 
    // Gộp message và file vào để gửi đi
    Multipart multipart = new MimeMultipart();
    multipart.addBodyPart(messagePart);
    multipart.addBodyPart(filePart);
    mailMessage.setContent(multipart );
 
 
    // Step3: Send mail
    Transport transport = getMailSession.getTransport("smtp");
 
    // Thay your_gmail thành gmail của bạn, thay your_password thành mật khẩu gmail của bạn
    transport.connect("smtp.gmail.com", "phamminhduc15112003dilinh@gmail.com", "sardyptmvfiigpqy"); 
    transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
    transport.close();
  }
 
}