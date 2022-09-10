/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Eudy Arias
 * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, 
 * y con una variable salario que solo tenga la clase Trabajador.
 */
public class Trabajador extends Persona {
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" , Edad: "+String.valueOf(this.getEdad())+" , Telefono: "+this.getTelefono()+" , Salario: "+this.getSalario().toString(); 
    }
}
