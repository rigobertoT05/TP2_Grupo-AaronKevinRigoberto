/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Grupo_AaronKevinRigoberto;


import java.io.*;
import java.util.ArrayList; 

public class GestorDatos {
    public ArrayList<Cliente> clientes;
    public ArrayList<Empleado> empleados;
    public ArrayList<Servicio> servicios;
    public ArrayList<Reservacion> reservaciones;
    
    private static GestorDatos instancia;
    private final String ARCHIVO_DB = "peluqueria_db.dat";

    private GestorDatos() {
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
        servicios = new ArrayList<>();
        reservaciones = new ArrayList<>();
        cargarDatos(); // Intenta cargar al iniciar
}
public static GestorDatos getInstancia() {
        if (instancia == null) instancia = new GestorDatos();
        return instancia;
    }

    // --- Métodos de Persistencia ---
    public void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_DB))) {
            oos.writeObject(clientes);
            oos.writeObject(empleados);
            oos.writeObject(servicios);
            oos.writeObject(reservaciones);
            System.out.println("Datos guardados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void cargarDatos() {
        File archivo = new File(ARCHIVO_DB);
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                clientes = (ArrayList<Cliente>) ois.readObject();
                empleados = (ArrayList<Empleado>) ois.readObject();
                servicios = (ArrayList<Servicio>) ois.readObject();
                reservaciones = (ArrayList<Reservacion>) ois.readObject();
                System.out.println("Datos cargados exitosamente.");
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al cargar datos: " + e.getMessage());
            }
        }
    }
    
    // --- Métodos de Búsqueda (Requisito 6) ---
    public Cliente buscarCliente(String nombre) {
        for (Cliente c : clientes) {
            // toString devuelve el nombre según el modelo arriba, o usa getNombre()
            if (c.toString().equalsIgnoreCase(nombre)) return c; 
        }
        return null;
    }
}