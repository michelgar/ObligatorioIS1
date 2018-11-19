package Dominio;
import java.util.Timer;


import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Notificacion extends TimerTask {

    private String password;
    private String userName;
    
    public Notificacion() {
        this.password = ("Theoden123");
        this.userName = ("michelgarcen@gmail.com");
    }


    public void scheduleMail(Usuario usuario, String mensaje,Date fecha) {

  
       Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
       calendar.set(Calendar.HOUR_OF_DAY, 15);
        calendar.set(Calendar.MINUTE, 54);
        Timer time = new Timer(); 
        Task task=new Task(this,mensaje,usuario);
        time.schedule(task, calendar.getTime());
    }

    public void enviarMail(Usuario usuario, String mensaje) {

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
                    InternetAddress.parse(usuario.getCorreo()));
            message.setText(mensaje);
            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
