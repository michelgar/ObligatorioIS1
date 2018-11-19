
package Dominio;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Mascota> listaMascotas;
    private ArrayList<String> listaAlimentos;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Paseo> listaPaseos;
    private ArrayList<Veterinario> listaVeterinarios;
    public Notificacion notificacion;
    private ArrayList<Actividad> listaActividades;

    
    
    
    public ArrayList<Veterinario> getListaVeterinarios() {
        return listaVeterinarios;
    }

    public void setListaVeterinarios(ArrayList<Veterinario> listaVeterinarios) {
        this.listaVeterinarios = listaVeterinarios;
    }

    public Sistema() {
        this.listaMascotas = new ArrayList<Mascota>();
        this.listaUsuarios = new ArrayList<Usuario>();
        this.listaPaseos = new ArrayList<Paseo>();
        this.listaVeterinarios = new ArrayList<Veterinario>();
        this.notificacion= new Notificacion();
        this.listaAlimentos=new ArrayList<String>();
        this.listaActividades=new ArrayList<Actividad>();
    }

    

    public ArrayList<String> getListaAlimentos() {
        return listaAlimentos;
    }
   public ArrayList<Actividad> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(ArrayList<Actividad> listaActividades) {
        this.listaActividades = listaActividades;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public ArrayList<Paseo> getListaPaseos() {
        return listaPaseos;
    }

    public void setListaPaseos(ArrayList<Paseo> listaPaseos) {
        this.listaPaseos = listaPaseos;
    }
    
   
     public boolean validarHora(String hora) {
        boolean esValido = true;
        if (hora.trim().isEmpty()) {
            esValido = false;
        }else{
            String[] separo = hora.split(":");
            String horas = separo[0]; 
            String minutos = separo[1]; 
            int h=Integer.parseInt(horas);
            int m=Integer.parseInt(minutos);
            if(h>24||h<0||m>60||m<0||separo.length>5){
                esValido =false;
            }else{
                return true;
            }
        }
      
        return esValido;
    }
 public String actividadesPorDia(int dia, int mes) {
     String retorno="";
     for (int i = 0; i < this.getListaActividades().size(); i++) {
          if(this.getListaActividades().get(i).getDia()==dia&& this.getListaActividades().get(i).getMes()==mes){
              retorno = retorno + this.getListaActividades().get(i).toString()+"\n";
          }
       }
        return retorno;
    }
 public void agregarAlimento(){
     this.getListaAlimentos().add("Dog chow");
 }
 public String mensajeRetorno(Actividad ac){
        String retorno="Fecha: "+ac.dia+"/"+ac.mes+" Responsable: "+ac.getUsuario()+" Actividad: ";
            switch(ac.tipo){
                case PASEO:
                retorno=retorno+" Paseo ";
                break;
                case BAÑO:
                retorno=retorno+" Baño ";
                break;
                case ALIMENTADO:
                retorno=retorno+" Dar comida ";
                break;
                case VETERINARIO:
                retorno=retorno+" Ida al veterinario ";
                break;
            }
                
   return retorno;
}
}
