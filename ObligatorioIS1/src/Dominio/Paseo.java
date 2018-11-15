
package Dominio;


public class Paseo {
    public Usuario usuario;
    private Mascota mascota;
    String hora;

    public Paseo(Usuario usuario, Mascota mascota, String hora) {
        this.usuario = usuario;
        this.mascota = mascota;
        this.hora = hora;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    

    public Paseo(Usuario usuario, String hora) {
        this.usuario = usuario;
        this.hora = hora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
