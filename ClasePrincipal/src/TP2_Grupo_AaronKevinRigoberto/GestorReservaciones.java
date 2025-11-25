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
public class GestorReservaciones {
    public static ArrayList<Reservacion> listaReservaciones = new ArrayList();
    
    // Agregar
    public static void agregarReservacion(Reservacion reservacion){
        listaReservaciones.add(reservacion);
    }

    // Buscar por ID
    public static Reservacion buscarPorID(String id){
        for (Reservacion reservacio : listaReservaciones) {
            if (reservacio.getId().equals(id)) {
                return reservacio;
            }
        }
        return null;
    }

    // Eliminar
    public static boolean eliminarReservacion(String id){
        Reservacion r = buscarPorID(id);
        if (r != null) {
            listaReservaciones.remove(r);
            return true;
        }
        return false;
    }

    // Existe ID
    public static boolean existeID(String id){
        for (Reservacion reservacio : listaReservaciones) {
            if (reservacio.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    // Modificar (solo fecha/hora, el cliente/empleado/servicio no cambian en la mayoría de sistemas)
    public static boolean modificarReservacion(String id, java.time.LocalDateTime nuevaFechaHora){
        Reservacion r = buscarPorID(id);
        if (r != null) {
            r.setFechaHora(nuevaFechaHora);
            return true;
        }
        return false;
    }

    // Buscar por cliente (nombre)
    public static ArrayList<Reservacion> buscarPorCliente(String nombreCliente){
        ArrayList<Reservacion> resultado = new ArrayList<>();
        String criterio = nombreCliente.toLowerCase().trim();

        for (Reservacion r : listaReservaciones) {
            if (r.getCliente().getNombre().toLowerCase().contains(criterio)) {
                resultado.add(r);
            }
        }

        return resultado;
    }

    // Buscar por empleado y fecha (en formato YYYY-MM-DD)
    public static ArrayList<Reservacion> buscarPorEmpleadoYFecha(String nombreEmpleado, String fecha){
        ArrayList<Reservacion> resultado = new ArrayList<>();
        String criterioEmpleado = nombreEmpleado.toLowerCase().trim();

        for (Reservacion r : listaReservaciones) {
            String fechaReserva = r.getFechaHora().toLocalDate().toString();

            if (r.getEmpleado().getNombre().toLowerCase().contains(criterioEmpleado)
                    && fechaReserva.equals(fecha)) {

                resultado.add(r);
            }
        }

        return resultado;
    }

 
    public static ArrayList<Reservacion> getReservaciones(){
        return listaReservaciones;
    }
}

