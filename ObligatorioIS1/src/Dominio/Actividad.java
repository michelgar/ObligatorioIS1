
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
        mascota =(null);
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

    public String mensajeRetorno(){
        String retorno="Fecha: "+dia+"/"+mes;
            switch(this.tipo){
                case PASEO:
                retorno=retorno+"Paseo";
                case BAÑO:
                retorno=retorno+"Baño";
                case ALIMENTADO:
                retorno=retorno+"Dar comida";
                case VETERINARIO:
                retorno=retorno+"Ida al veterinario";
            }
                
   return retorno;
}
   
     @Override
    public String toString() {
        return this.mensajeRetorno();
    }
   
}
