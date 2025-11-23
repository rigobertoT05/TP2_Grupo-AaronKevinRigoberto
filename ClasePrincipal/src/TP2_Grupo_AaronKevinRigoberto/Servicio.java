
package TP2_Grupo_AaronKevinRigoberto;

import java.io.Serializable;


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
    // Método abstracto para polimorfismo: cada servicio calcula su descripción diferente
    public abstract String obtenerDetalleServicio();

    // Getters y Setters necesarios
    public String getNombre() { return nombre; }
    public String getIdentificador() { return identificador; }
    public double getCosto() { return costo; }
    
    @Override
    public String toString() {
        return nombre + " ($" + costo + ")";
    }
    

public class CorteCabello extends Servicio {
    private boolean incluyeLavado;

    public CorteCabello(String id, String nom, int dur, double costo, boolean incluyeLavado) {
        super(id, nom, dur, costo);
        this.incluyeLavado = incluyeLavado;
    }

    @Override
    public String obtenerDetalleServicio() {
        return "Corte: " + nombre + (incluyeLavado ? " (Con Lavado)" : " (Sin Lavado)");
    }
}

public class Manicure extends Servicio {
    public Manicure(String id, String nom, int dur, double costo) {
        super(id, nom, dur, costo);
    }

    @Override
    public String obtenerDetalleServicio() {
        return "Manicure Especializado: " + nombre;
    }
}
}