/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Grupo_AaronKevinRigoberto;

/**
 *
 * @author rigoberto
 */
public class TratamientoCapilar extends Servicio {

    public TratamientoCapilar(String identificador, String nombre, int duracionMinutos, double costo) {
        super(identificador, nombre, duracionMinutos, costo);
    }

    @Override
    public String obtenerDetalleServicio() {
       return "Tratamiento Capilar:  " + nombre;
    }
    
}
