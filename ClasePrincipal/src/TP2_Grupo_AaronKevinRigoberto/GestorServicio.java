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
import java.util.ArrayList;
import java.time.LocalDateTime;

public class GestorServicio {

    private static final GestorDatos gestorDatos = GestorDatos.getInstancia();

    public GestorServicio() {
        gestorDatos.guardarDatos();
    }

    public void agregarServicio(Servicio servicio) {
        gestorDatos.servicios.add(servicio);
        gestorDatos.guardarDatos();
    }

    public Servicio buscarPorID(String id) {
        for (Servicio servicioActual : gestorDatos.servicios) {
            if (servicioActual.getIdentificador().equalsIgnoreCase(id)) {
                return servicioActual;
            }
        }
        return null;
    }

    public ArrayList<Servicio> buscarDisponibles(LocalDateTime fecha) {
        ArrayList<Servicio> disponibles = new ArrayList<>();
        for (Servicio servicioActual : gestorDatos.servicios) {
            if (servicioActual.getFechaHora().equals(fecha)) {
                disponibles.add(servicioActual);
            }
        }
        return disponibles;
    }

    public boolean eliminarServicio(String id) {
        Servicio servicioActual = buscarPorID(id);
        if (servicioActual != null) {
            gestorDatos.servicios.remove(servicioActual);
            gestorDatos.guardarDatos();
            return true;
        }
        return false;
    }

    public boolean existeID(String id) {
        return buscarPorID(id) != null;
    }

    public boolean modificarServicio(String id, String nombre, int duracion, double costo) {
        Servicio servicioActual = buscarPorID(id);
        if (servicioActual != null) {
            servicioActual.setNombre(nombre);
            servicioActual.setDuracionMinutos(duracion);
            servicioActual.setCosto(costo);
            gestorDatos.guardarDatos();
            return true;
        }
        return false;
    }

    public ArrayList<Servicio> getServicios() {
        return gestorDatos.servicios;
    }
}