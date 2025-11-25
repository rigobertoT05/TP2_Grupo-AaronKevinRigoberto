/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Grupo_AaronKevinRigoberto;

import java.time.LocalDateTime;

/**
 *
 * @author rigoberto
 */

public class CorteCabello extends Servicio {
    private boolean incluyeLavado;

    public CorteCabello(String identificador, String nombre, int duracionMinutos, double costo, LocalDateTime fechaHora) {
        super(identificador, nombre, duracionMinutos, costo, fechaHora);
    }


    @Override
    public String obtenerDetalleServicio() {
       return "Corte: " + nombre + (incluyeLavado ? " (Con lavado)" : "(Sin Lavado)");
    }
}
