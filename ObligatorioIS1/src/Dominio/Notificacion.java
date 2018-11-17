
package Dominio;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class Notificacion {
    private String password;
    private String userName;
    
private InternetAddress[] devolverDirecciones(ArrayList<String> lista) throws AddressException{
    String direcciones=String.join(",", lista);   
    return InternetAddress.parse(direcciones); 
}

    public Notificacion(String password, String userName) {
        this.password = ("Theoden12");
        this.userName = ("michelgarcen@gmail.com");
    }
    
    
    public void enviarMail( ArrayList<String> lista){
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(userName, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(userName));
            message.setRecipients(Message.RecipientType.TO,
                                  this.devolverDirecciones(lista));
            Transport.send(message);
            

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
}
