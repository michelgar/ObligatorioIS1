
package Dominio;


public class Veterinario {
public String nombre;
    public String direccion;
    public String cel;

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public Veterinario(String nombre, String direccion, String cel) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cel =(" ");
    }
    @Override
    public String toString() {
        return  this.nombre;
    }
}
