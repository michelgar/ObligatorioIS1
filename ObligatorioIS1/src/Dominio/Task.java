
package Dominio;

import java.util.ArrayList;
import java.util.TimerTask;

public class Task extends TimerTask  {
 Notificacion notificacion;
 String mensaje;
Usuario usuario;
   public Task(Notificacion notificacion,String mensaje,Usuario usuario){
       this.notificacion= notificacion;
     //Constructor

   }

   public void run() {
       try {

       notificacion.enviarMail(usuario, mensaje);

       } catch (Exception ex) {
           System.out.println("error running thread " + ex.getMessage());
       }
    }
}