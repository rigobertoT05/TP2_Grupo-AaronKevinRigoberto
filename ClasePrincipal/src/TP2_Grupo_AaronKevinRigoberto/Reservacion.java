
package TP2_Grupo_AaronKevinRigoberto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Reservacion implements Serializable {
    private String id;
    private Cliente cliente;
    private Empleado empleado;
    private Servicio servicio;
    private LocalDateTime fechaHora;
    
    public Reservacion(String id, Cliente cliente,Empleado empleado,Servicio servicio,LocalDateTime fechaHora){
        this.id = id;
        this.cliente = cliente;
        this.empleado = empleado;
        this.servicio = servicio;
        this.fechaHora = fechaHora;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    

    // toString para pruebas rápidas

    @Override
    public String toString() {
        return "Reservacion{" + "id=" + id + ", cliente=" + cliente + ", empleado=" + empleado + ", servicio=" + servicio + ", fechaHora=" + fechaHora + '}';
    }
    
}
