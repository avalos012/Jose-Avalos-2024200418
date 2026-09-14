/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author laboratorioasu
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public void Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getEdad(int edad){
        this.edad = edad;
        return edad;
    }
  
       
}
