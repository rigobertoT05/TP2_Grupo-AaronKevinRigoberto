/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Grupo_AaronKevinRigoberto;

/**
 *
 * @author rigoberto
 */
public class Cliente {
    // Atributos de la clase Cliente
    private int identificadorUnico;
    private String nombre;
    private int numeroTelefono;
    private String correoElectronico;

    public Cliente(int identificadorUnico, String nombre, int numeroTelefono, String correoElectronico) {
        this.identificadorUnico = identificadorUnico;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }

    public int getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void setIdentificadorUnico(int identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    
}
