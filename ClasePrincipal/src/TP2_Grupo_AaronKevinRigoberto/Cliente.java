
package TP2_Grupo_AaronKevinRigoberto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Cliente implements Serializable {
    
    // Atributos de la clase Cliente
    private String identificadorUnico;
    private int numeroTelefono;
    private String nombre, correoElectronico;
    
//constructor

    public Cliente(String identificadorUnico, int numeroTelefono, String nombre, String correoElectronico) {
        this.identificadorUnico = identificadorUnico;
        this.numeroTelefono = numeroTelefono;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }

 //get and set 

    public String getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void setIdentificadorUnico(String identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Cliente{" + "identificadorUnico=" + identificadorUnico + ", numeroTelefono=" + numeroTelefono + ", nombre=" + nombre + ", correoElectronico=" + correoElectronico + '}';
    }
 
    
    
    
}
