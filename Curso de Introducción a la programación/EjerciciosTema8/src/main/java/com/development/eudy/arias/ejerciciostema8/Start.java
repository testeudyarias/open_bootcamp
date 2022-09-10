/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.development.eudy.arias.ejerciciostema8;
import Models.Persona;
/**
 *
 * @author developer
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.setEdad(31);
        persona.setNombre("Eudy Arias");
        persona.setTelefono("8297979707");
        System.out.println(persona.toString());
    }
    
}
