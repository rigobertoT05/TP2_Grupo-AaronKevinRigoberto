/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Grupo_AaronKevinRigoberto;
import java.util.ArrayList;



public class GestorEmpleado {

    private static final GestorDatos gestorDatos = GestorDatos.getInstancia();

    public GestorEmpleado() {
        gestorDatos.guardarDatos();
    }

    public static void agregarEmpleado(Empleado empleado) {
        gestorDatos.empleados.add(empleado);
        gestorDatos.guardarDatos();
    }

    public static Empleado buscarPorID(String id) {
        for (Empleado empleadoActual : gestorDatos.empleados) {
            if (empleadoActual.getIdentificador().equals(id)) {
                return empleadoActual;
            }
        }
        return null;
    }

    public static boolean eliminarEmpleado(String id) {
        Empleado empleadoActual = buscarPorID(id);
        if (empleadoActual != null) {
            gestorDatos.empleados.remove(empleadoActual);
            gestorDatos.guardarDatos();
            return true;
        }
        return false;
    }

    public static boolean existeID(String id) {
        return buscarPorID(id) != null;
    }

    public static boolean modificarEmpleado(String id, String nombre, String especialidad, int telefono) {
        Empleado empleadoActual = buscarPorID(id);
        if (empleadoActual != null) {
            empleadoActual.nombre = nombre;
            empleadoActual.especialidad = especialidad;
            empleadoActual.numeroTelefono = telefono;
            gestorDatos.guardarDatos();
            return true;
        }
        return false;
    }

    public static ArrayList<Empleado> getEmpleados() {
        return gestorDatos.empleados;
    }
}