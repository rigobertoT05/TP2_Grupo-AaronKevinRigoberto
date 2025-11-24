/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Grupo_AaronKevinRigoberto;

import java.util.ArrayList;

/**
 *
 * @author rigoberto
 */
public class GestorServicio {
    public static ArrayList<Servicio> listaServicios = new ArrayList<>();
    
    public static void agregarServicio(Servicio servicios){
        listaServicios.add(servicios);
    }
    
    public static Servicio buscarPorID(String id){
        for (Servicio servicio : listaServicios) {
            if (servicio.getIdentificador().equals(id)) {
                return servicio;
            }
        }
        return null;
    }
    
    public static boolean eliminarServicio(String id){
     Servicio servicio = buscarPorID(id);
        if (servicio != null) {
            listaServicios.remove(servicio);
            return true;
        }
     return false;    
    }
    
    public static boolean modificarServicio(String id, String nombre,int duracion, double costo){
    Servicio servicio = buscarPorID(id);
        if (servicio != null) {
            servicio.nombre = nombre;
            servicio.duracionMinutos = duracion;
            servicio.costo = costo;
            return true;
        }
        return false;
    }
    
    public static ArrayList<Servicio> getServicios(){
        return listaServicios;
    }
}
