
package TP2_Grupo_AaronKevinRigoberto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;


public abstract class Servicio implements Serializable {
    private static final long serialVersionUID = 1L; // Importante para versiones de archivos
    protected String identificador;
    protected String nombre;
    protected int duracionMinutos;
    protected double costo;
    private LocalDateTime fechaHora;

    

    public Servicio(String identificador, String nombre, int duracionMinutos, double costo,LocalDateTime fechaHora ) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.fechaHora = fechaHora;
        this.duracionMinutos = duracionMinutos;
        this.costo = costo;
}

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
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