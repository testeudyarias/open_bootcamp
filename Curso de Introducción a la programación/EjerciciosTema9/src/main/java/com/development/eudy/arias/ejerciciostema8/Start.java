/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.development.eudy.arias.ejerciciostema8;
import Models.Cliente;
import Models.Persona;
import Models.Trabajador;
/**
 *
 * @author developer
 */
public class Start {

    /**
    Crea una clase Persona con las siguientes variables:
        La edad
        El nombre
        El teléfono
        Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
        Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
  
  */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Persona persona = new Persona();
        persona.setEdad(31);
        persona.setNombre("Eudy Arias");
        persona.setTelefono("8297979707");
        System.out.println(persona.toString());*/
        
        Cliente cliente = new Cliente();
        cliente.setEdad(31);
        cliente.setNombre("Eudy Arias");
        cliente.setTelefono("8297979707");
        cliente.setCredito(10d);
        System.out.println(cliente.toString());
        
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(31);
        trabajador.setNombre("Eudy Arias");
        trabajador.setTelefono("8297979707");
        trabajador.setSalario(10000d);
        System.out.println(trabajador.toString());
        
        
        
    }
    
}
