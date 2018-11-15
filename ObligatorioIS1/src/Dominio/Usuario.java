
package Dominio;
public class Usuario {

    
  private String nombre;
  
 public Usuario(String nombre) {
        this.nombre = nombre;
    } 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@Override
    public String toString() {
       return " " +  this.getNombre();
    }
 @Override
    public boolean equals(Object o) {
        return this.getNombre().equals(((Usuario) o).getNombre());
    }
}
