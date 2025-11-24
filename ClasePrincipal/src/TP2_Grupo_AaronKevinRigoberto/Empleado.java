
package TP2_Grupo_AaronKevinRigoberto;

import java.io.Serializable;

public class Empleado implements Serializable {
    // Atributos de la clase Empleado
    
 protected String identificador;
 protected String nombre;
 protected String especialidad;
 protected int numeroTelefono;

    public Empleado(String identificador,String nombre, String especialidad, int numeroTelefono) {
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

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    @Override
    public String toString() {
        return nombre + " - " + especialidad;
    }
 
}
