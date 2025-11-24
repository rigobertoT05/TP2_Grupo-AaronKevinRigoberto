/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Grupo_AaronKevinRigoberto;

/**
 *
 * @author rigoberto
 */

public class CorteCabello extends Servicio {
    private boolean incluyeLavado;

    public CorteCabello(String id, String nom, int dur, double costo, boolean incluyeLavado) {
        super(id, nom, dur, costo);
        this.incluyeLavado = incluyeLavado;
    }

    @Override
    public String obtenerDetalleServicio() {
       return "Corte: " + nombre + (incluyeLavado ? " (Con lavado)" : "(Sin Lavado)");
    }
}
