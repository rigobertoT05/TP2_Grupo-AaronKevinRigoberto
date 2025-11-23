/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Grupo_AaronKevinRigoberto;

/**
 *
 * @author rigoberto
 */
public class Empleado {
    // Atributos de la clase Empleado
 private int identificador;
 private String nombre;
 private String especialidad;
 private int numeroTelefono;

    public Empleado(int identificador, String nombre, String especialidad, int numeroTelefono) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numeroTelefono = numeroTelefono;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
 
 
}
