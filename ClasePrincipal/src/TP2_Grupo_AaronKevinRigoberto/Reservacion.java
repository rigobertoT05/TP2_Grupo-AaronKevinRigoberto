
package TP2_Grupo_AaronKevinRigoberto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Reservacion implements Serializable {
    private String id;
    private Cliente cliente;
    private Empleado empleado;
    private Servicio servicio;
    private String fecha;
    private String hora;
    private String estado;
    
    public Reservacion(String fecha, Cliente cliente, Empleado empleado, Servicio servicio, String hora, String estado, String estadoSel){
        this.id = id;
        this.cliente = cliente;
        this.empleado = empleado;
        this.servicio = servicio;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }
    
    
    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }

    public Servicio getServicio() { return servicio; }
    public void setServicio(Servicio servicio) { this.servicio = servicio; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    
    // toString para pruebas rápidas
    @Override
    public String toString() {
        return "Reserva: " + id + " - " + cliente.getNombre();
    }
}
