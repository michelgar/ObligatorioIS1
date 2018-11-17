
package Dominio;


public class Actividad {
   public enum TipoActividad {
       PASEO,BAÑO,ALIMENTADO,VETERINARIO    
   }
   public Mascota mascota;
   public Usuario usuario;
   public int dia;
   public int mes;
   Paseo paseo;
   TipoActividad tipo;
   
   
    public Actividad(Mascota mascota,Usuario usuario, int dia,int mes , Paseo paseo,TipoActividad tipo) {
        this.usuario = usuario;
        this.mes = mes;
        this.dia=dia;
        paseo = (null);
        this.tipo=tipo;
        
    }
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

   
    public Paseo getPaseo() {
        return paseo;
    }

    public void setPaseo(Paseo paseo) {
        this.paseo = paseo;
    }

    
   
     @Override
    public String toString() {
        return "Mascota=" + mascota + ", usuario=" + usuario + ", dia=" + dia + ", mes=" + mes + ", paseo=" + paseo +  '}';
    }
   
}
