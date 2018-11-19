
package Interfaz;

import Dominio.Actividad;
import static Dominio.Actividad.TipoActividad.ALIMENTADO;
import static Dominio.Actividad.TipoActividad.PASEO;
import Dominio.Mascota;
import Dominio.Sistema;
import Dominio.Usuario;
import Dominio.Veterinario;


public class ObligatorioIS1 {

    public static void main(String[] args) throws InterruptedException {
    Sistema sistema = new Sistema();
    Usuario usuario1= new Usuario("Jose","michelgarcen@gmail.com"); 
    Mascota mascota= new Mascota("Rocky",(1),(2),"Sucio");
    Veterinario vet= new Veterinario("Tio mario","laas palmeras","09955641");
    Actividad act=new Actividad(mascota,usuario1,1,11,null,PASEO);
    Actividad act2=new Actividad(mascota,usuario1,1,11,null,ALIMENTADO);
    sistema.getListaActividades().add(act);
     sistema.getListaActividades().add(act2);
    sistema.agregarAlimento();
    sistema.getListaVeterinarios().add(vet);
    sistema.getListaMascotas().add(mascota);
    sistema.getListaUsuarios().add(usuario1);
    MenuPrincipal m = new MenuPrincipal(sistema);
        m.setVisible(true);
    }
    
}
