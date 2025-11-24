/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Grupo_AaronKevinRigoberto;

/**
 *
 * @author rigoberto
 */
public class Manicure extends Servicio {
    public Manicure(String id, String nom, int dur, double costo) {
        super(id, nom, dur, costo);
    }

    @Override
    public String obtenerDetalleServicio() {
        return "Manicure Especializado: " + nombre;
    }
}
