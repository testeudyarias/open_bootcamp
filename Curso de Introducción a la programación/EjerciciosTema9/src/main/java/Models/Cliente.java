/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Eudy Arias
 * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
 * esta nueva clase tendrá la variable credito solo para esa clase.
 */
public class Cliente extends Persona {
   private Double credito;

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" , Edad: "+String.valueOf(this.getEdad())+" , Telefono: "+this.getTelefono()+" , Credito: "+this.getCredito().toString(); 
    }
   
   
}
