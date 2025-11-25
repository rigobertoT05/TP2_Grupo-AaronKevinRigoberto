/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Grupo_AaronKevinRigoberto;

import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 *
 * @author rigoberto
 */
public class GestorReservaciones {

    private static final GestorDatos gestorDatos = GestorDatos.getInstancia();

    public static void agregarReservacion(Reservacion reservacion) {
        gestorDatos.reservaciones.add(reservacion);
        gestorDatos.guardarDatos();
    }

    public static Reservacion buscarPorID(String id) {
        for (Reservacion reservacionActual : gestorDatos.reservaciones) {
            if (reservacionActual.getId().equals(id)) {
                return reservacionActual;
            }
        }
        return null;
    }

    public static boolean eliminarReservacion(String id) {
        Reservacion reservacionActual = buscarPorID(id);
        if (reservacionActual != null) {
            gestorDatos.reservaciones.remove(reservacionActual);
            gestorDatos.guardarDatos();
            return true;
        }
        return false;
    }

    public static boolean existeID(String id) {
        return buscarPorID(id) != null;
    }

    public static boolean modificarReservacion(String id, LocalDateTime nuevaFechaHora) {
        Reservacion reservacionActual = buscarPorID(id);
        if (reservacionActual != null) {
            reservacionActual.setFechaHora(nuevaFechaHora);
            gestorDatos.guardarDatos();
            return true;
        }
        return false;
    }

    public static ArrayList<Reservacion> buscarPorCliente(String nombreCliente) {
        ArrayList<Reservacion> resultado = new ArrayList<>();
        String criterio = nombreCliente.toLowerCase().trim();
        for (Reservacion reservacionActual : gestorDatos.reservaciones) {
            if (reservacionActual.getCliente().getNombre().toLowerCase().contains(criterio)) {
                resultado.add(reservacionActual);
            }
        }
        return resultado;
    }

    public static ArrayList<Reservacion> buscarPorEmpleadoYFecha(String nombreEmpleado, String fecha) {
        ArrayList<Reservacion> resultado = new ArrayList<>();
        String criterioEmpleado = nombreEmpleado.toLowerCase().trim();
        for (Reservacion reservacionActual : gestorDatos.reservaciones) {
            String fechaReserva = reservacionActual.getFechaHora().toLocalDate().toString();
            if (reservacionActual.getEmpleado().getNombre().toLowerCase().contains(criterioEmpleado)
                    && fechaReserva.equals(fecha)) {
                resultado.add(reservacionActual);
            }
        }
        return resultado;
    }

    public static ArrayList<Reservacion> getReservaciones() {
        return gestorDatos.reservaciones;
    }
}

