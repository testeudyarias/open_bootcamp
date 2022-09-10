/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author developer
 */
/*
Para practicar la encapsulación:
    Crear clase Persona.
    Crear variables las privadas edad, nombre y telefono de la clase Persona.
    Crear gets y sets de cada propiedad.
    Crear un objeto persona en el main.
    Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
*/
public class Persona {
   private int edad; 
   private String nombre;
   private String telefono; 

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre:"+this.getNombre()+" , Edad: "+String.valueOf(this.getEdad())+" , Telefono:"+this.getTelefono(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
