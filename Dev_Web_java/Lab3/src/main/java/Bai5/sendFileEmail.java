package Bai5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Servlet implementation class sendFileEmail
 */
@MultipartConfig

public class sendFileEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sendFileEmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Views/sendfile.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.ssl.protocols", "TLSv1.2");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", 587);
            p.put("mail.debug", "true");  
            Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("phamminhduc15112003dilinh@gmail.com", "sardyptmvfiigpqy");
                }
            });
            javax.mail.Message msg = new MimeMessage(s);
            msg.setFrom(new InternetAddress("phamminhduc15112003dilinh@gmail.com"));

            msg.setRecipients(javax.mail.Message.RecipientType.TO, InternetAddress.parse("pm865743@gmail.com"));
          
            String subject = request.getParameter("subject");
            msg.setSubject(subject);
            String content = request.getParameter("body");
           
           
            
            MimeMultipart mimeMultipart = new MimeMultipart();
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            Part fileAttach = request.getPart("filetest");
            File file = new File(request.getServletContext().getRealPath(fileAttach.getSubmittedFileName()));
            mimeBodyPart.setDataHandler(new DataHandler(new FileDataSource(file))); 
            mimeBodyPart.setFileName(file.getName());
            mimeBodyPart.setContent(file.getAbsolutePath(), "text/html; charset=utf-8");
            mimeMultipart.addBodyPart(mimeBodyPart);
            
            
            
            
            msg.setContent(mimeMultipart);
            Transport.send(msg);
	        
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("message", "Send email fail!");
		}
		request.getRequestDispatcher("Views/sendfile.jsp").forward(request, response);
	}

}
