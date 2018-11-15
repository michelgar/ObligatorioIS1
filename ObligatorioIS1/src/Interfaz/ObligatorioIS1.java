
package Interfaz;

import Dominio.Mascota;
import Dominio.Sistema;
import Dominio.Usuario;


public class ObligatorioIS1 {

    public static void main(String[] args) throws InterruptedException {
    Sistema sistema = new Sistema();
    Usuario usuario1= new Usuario("Jose"); 
    Mascota mascota= new Mascota("Rocky",(1),(2),"Sucio");
    sistema.getListaMascotas().add(mascota);
    sistema.getListaUsuarios().add(usuario1);
    CalendarioComun m = new CalendarioComun(sistema);
   // m.setCalen(sistema.crearCalendarioVacio());  
    m.setVisible(true);
//    CalendarioPaseos c = new CalendarioPaseos(sistema);
//    c.setVisible(true);
    }
    
}
