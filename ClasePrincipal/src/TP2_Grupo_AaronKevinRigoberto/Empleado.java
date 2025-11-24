
package TP2_Grupo_AaronKevinRigoberto;

import java.io.Serializable;

public class Empleado implements Serializable {
    // Atributos de la clase Empleado
    
 private String identificador;
 private String nombre;
 private String especialidad;
 private String numeroTelefono;

    public Empleado(String identificador,String nombre, String especialidad, String numeroTelefono) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numeroTelefono = numeroTelefono;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    @Override
    public String toString() {
        return nombre + " - " + especialidad;
    }
 
}
