
package Dominio;

import java.util.ArrayList;

public class Calendario{
    
private String[][] calen;

    
private int mes;
private int dia;
private ArrayList<Actividad> listaActividades;

 public Calendario() {
       this.setCalen(null);
       this.setDia(1);
       this.setMes(1);
       this.listaActividades = new ArrayList<Actividad>();
    } 
 
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

   
     public ArrayList<Actividad> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(ArrayList<Actividad> listaActividades) {
        this.listaActividades = listaActividades;
    }

    public String[][] getCalen() {
        return calen;
    }

    public void setCalen(String[][] calen) {
        this.calen = calen;
    }
}

   