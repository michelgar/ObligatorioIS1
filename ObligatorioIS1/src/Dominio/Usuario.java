
package Dominio;
public class Usuario {

    
  private String nombre;
  private String correo;
  
 public Usuario(String nombre,String correo) {
        this.nombre = nombre;
        this.correo=correo;
    } 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
