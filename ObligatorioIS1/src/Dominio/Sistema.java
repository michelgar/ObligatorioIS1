
package Dominio;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Mascota> listaMascotas;
    private ArrayList<String> listaAlimentos;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Paseo> listaPaseos;
    private ArrayList<Veterinario> listaVeterinarios;

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
            if(h>24||h<0||m>60||m<0){
                esValido =false;
            }else{
                return true;
            }
        }
      
        return esValido;
    }
 public String[][] crearCalendarioVacio() {

        String[][] calen = new String[6][8];
        for (int i = 0; i < calen.length; i++) {
            for (int j = 0; j < calen[0].length; j++) {

                calen[i][j] = " ";
               
            }
        }

        return calen;
    }
 public void ingresarActividad(int dia, int mes,Actividad actividad,String[][] calend){

     
 }
}
