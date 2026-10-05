/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unida.tarea8_herencia;

/**
 *
 * @author laboratorioasu
 */
public class Persona {
    protected String nombre;
    protected String cedula;
        
    public Persona(String nombre, String cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Cédula: " + cedula;
    }
}
