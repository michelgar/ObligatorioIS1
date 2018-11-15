
package Dominio;

public class Mascota {
    private String nombre;
    private int altura;
    private int peso;
    public String comentario;

    public Mascota(String nombre, int altura, int peso, String comentario) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.comentario = comentario;
    }


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getComentarios() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
   @Override
    public String toString() {
       return " " +  this.getNombre();
    }
}
