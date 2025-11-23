
package TP2_Grupo_AaronKevinRigoberto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Cliente implements Serializable {
    
    // Atributos de la clase Cliente
    private int identificadorUnico, numeroTelefono;
    private String nombre, correoElectronico;

    public Cliente(int identificadorUnico, String nombre, int numeroTelefono, String correoElectronico) {
        this.identificadorUnico = identificadorUnico;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }
    
    @Override public String toString() { return nombre; }
    
    public int getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void setIdentificadorUnico(int identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    
}
