
package TP2_Grupo_AaronKevinRigoberto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class Reservacion implements Serializable {
    private Cliente cliente;
    private Empleado empleado;
    private Servicio servicio;
    private LocalDateTime fechaHora;
    
    public Reservacion(Cliente cliente, Empleado empleado, Servicio servicio, LocalDateTime fechaHora ){
        this.cliente = cliente;
        this.empleado = empleado;
        this.servicio = servicio;
        this.fechaHora = fechaHora;
    }
    
    
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public Empleado getEmpleado(){
        return empleado;
    }
    
    public Servicio getServicio(){
        return servicio;
    }
    @Override
    public String toString() {
        return "Cliente: " + cliente.toString() + " | Servicio: " + servicio.getNombre() + " | Fecha: " + fechaHora.toString();
    }
}
