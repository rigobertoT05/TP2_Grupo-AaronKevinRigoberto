
package TP2_Grupo_AaronKevinRigoberto;

import java.io.Serializable;
import java.util.ArrayList;


public abstract class Servicio implements Serializable {
    private static final long serialVersionUID = 1L; // Importante para versiones de archivos
    protected String identificador;
    protected String nombre;
    protected int duracionMinutos;
    protected double costo;
    

    public Servicio(String identificador, String nombre, int duracionMinutos, double costo) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.duracionMinutos = duracionMinutos;
        this.costo = costo;
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

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


    // Método abstracto para polimorfismo: cada servicio calcula su descripción diferente
    public abstract String obtenerDetalleServicio();
}