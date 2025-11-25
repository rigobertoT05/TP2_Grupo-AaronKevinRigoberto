package TP2_Grupo_AaronKevinRigoberto;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */import java.util.ArrayList;


public class GestorCliente {

    private static final GestorDatos gestorDatos = GestorDatos.getInstancia();

    public static void agregarCliente(Cliente cliente) {
        gestorDatos.clientes.add(cliente);
        gestorDatos.guardarDatos();
    }

    public static Cliente buscarPorID(String id) {
        for (Cliente clienteActual : gestorDatos.clientes) {
            if (clienteActual.getIdentificadorUnico().equals(id)) {
                return clienteActual;
            }
        }
        return null;
    }
    public static ArrayList<Cliente> buscarPorNombre(String nombre) {
        ArrayList<Cliente> resultados = new ArrayList<>();
        String nombreBusqueda = nombre.toLowerCase().trim();
        for (Cliente clienteActual : gestorDatos.clientes) {
            if (clienteActual.getNombre().toLowerCase().contains(nombreBusqueda)) {
                resultados.add(clienteActual);
            }
        }
        return resultados;
    }

    public static ArrayList<Cliente> buscarPorNombreOTelefono(String criterio) {
        ArrayList<Cliente> resultados = new ArrayList<>();
        String criterioBusqueda = criterio.toLowerCase().trim();
        for (Cliente clienteActual : gestorDatos.clientes) {
            if (clienteActual.getNombre().toLowerCase().contains(criterioBusqueda)) {
                if (!resultados.contains(clienteActual)) {
                    resultados.add(clienteActual);
                }
            }
            if (String.valueOf(clienteActual.getNumeroTelefono()).contains(criterioBusqueda)) {
                if (!resultados.contains(clienteActual)) {
                    resultados.add(clienteActual);
                }
            }
        }
        return resultados;
    }

    public static boolean existeID(String id) {
        for (Cliente clienteActual : gestorDatos.clientes) {
            if (clienteActual.getIdentificadorUnico().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public static boolean eliminarCliente(String id) {
        Cliente clienteActual = buscarPorID(id);
        if (clienteActual != null) {
            gestorDatos.clientes.remove(clienteActual);
            gestorDatos.guardarDatos();
            return true;
        }
        return false;
    }

    public static boolean modificarCliente(String id, String nombre, int telefono, String email) {
        Cliente clienteActual = buscarPorID(id);
        if (clienteActual != null) {
            clienteActual.nombre = nombre;
            clienteActual.numeroTelefono = telefono;
            clienteActual.correoElectronico = email;
            gestorDatos.guardarDatos();
            return true;
        }
        return false;
    }

    public static ArrayList<Cliente> getCliente() {
        return gestorDatos.clientes;
    }
}