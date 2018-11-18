
package Interfaz;

import Dominio.Mascota;
import Dominio.Notificacion;
import Dominio.Sistema;
import Dominio.Usuario;
import Dominio.Veterinario;


public class ObligatorioIS1 {

    public static void main(String[] args) throws InterruptedException {
    Sistema sistema = new Sistema();
    Usuario usuario1= new Usuario("Jose","michelgarcen@gmail.com"); 
    Mascota mascota= new Mascota("Rocky",(1),(2),"Sucio");
    Veterinario vet= new Veterinario("Tio mario","laas palmeras","09955641");
    sistema.agregarAlimento();
    sistema.getListaVeterinarios().add(vet);
    sistema.getListaMascotas().add(mascota);
    sistema.getListaUsuarios().add(usuario1);
    MenuPrincipal m = new MenuPrincipal(sistema);
        m.setVisible(true);
    }
    
}
