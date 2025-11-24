/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Grupo_AaronKevinRigoberto;

import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author rigoberto
 */
public class GestorEmpleado {
    public static ArrayList<Empleado> listaEmpleado = new ArrayList<>();

    public static void agregarServicio(Empleado Empleado){
        listaEmpleado.add(Empleado);
    }
    
    public static Empleado buscarPorID(String id){
        for (Empleado empleado : listaEmpleado) {
            if (empleado.getIdentificador().equals(id)) {
                return empleado;
            }
        }
        return null;
    }
    
    public static boolean eliminarServicio(String id){
     Empleado empleado = buscarPorID(id);
        if (empleado != null) {
            listaEmpleado.remove(empleado);
            return true;
        }
        return false;}
    
    public static boolean existeID(String id) {
    for (Empleado empleado : listaEmpleado) {
        if (empleado.getIdentificador().equalsIgnoreCase(id)) {
            return true;
        }
    }
    return false;
}
    
    public static boolean modificarEmpleado(String id, String nombre,String especialidad,int telefono){
    Empleado empleado = buscarPorID(id);
        if (empleado != null) {
            
            empleado.nombre = nombre;
            empleado.especialidad = especialidad;
            empleado.numeroTelefono = telefono;
            empleado.setNumeroTelefono(telefono);

            return true;
        }
        return false;
    }
    
    public static ArrayList<Empleado> getServicios(){
        return listaEmpleado;
    } 
}
