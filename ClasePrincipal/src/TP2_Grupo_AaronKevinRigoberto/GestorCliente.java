package TP2_Grupo_AaronKevinRigoberto;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class GestorCliente {
      public static ArrayList<Cliente> listaClientes = new ArrayList<>();
      
       public static void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
       
    
   public static Cliente buscarPorID(String id) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getIdentificadorUnico() == id) {
                return cliente;
            }
        }
        return null;
    }
   
   public static ArrayList<Cliente> buscarPorNombre(String nombre) {
        ArrayList<Cliente> resultados = new ArrayList<>();
        String nombreBusqueda = nombre.toLowerCase().trim();
        
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().toLowerCase().contains(nombreBusqueda)) {
                resultados.add(cliente);
            }
        }
        return resultados;
    }
       
      
   public static ArrayList<Cliente> buscarPorNombreOTelefono(String criterio) {
        ArrayList<Cliente> resultados = new ArrayList<>();
        String criterioBusqueda = criterio.toLowerCase().trim();
        
        for (Cliente cliente : listaClientes) {
            // Buscar por nombre
            if (cliente.getNombre().toLowerCase().contains(criterioBusqueda)) {
                if (!resultados.contains(cliente)) {
                    resultados.add(cliente);
                }
            }
            // Buscar por teléfono
            if (String.valueOf(cliente.getNumeroTelefono()).contains(criterioBusqueda)) {
                if (!resultados.contains(cliente)) {
                    resultados.add(cliente);
                }
            }
        }
        return resultados;
    }
   
   public static boolean existeID(String id) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getIdentificadorUnico() == id) {
                return true;
            }
        }
        return false;
    }
   
   
   public static boolean eliminarCliente(String id) {
        Cliente cliente = buscarPorID(id);
        if (cliente != null) {
            listaClientes.remove(cliente);
            return true;
        }
        return false;
    }
   
   
    public static boolean modificarCliente(String id, String nombre, int telefono, String email) {
        Cliente cliente = buscarPorID(id);
        if (cliente != null) {
            cliente.setNombre(nombre);
            cliente.setNumeroTelefono(telefono);
            cliente.setCorreoElectronico(email);
            return true;
        }
        return false;
    }
   
    public static ArrayList<Cliente> getCliente(){
        return listaClientes;
    }
  
}
