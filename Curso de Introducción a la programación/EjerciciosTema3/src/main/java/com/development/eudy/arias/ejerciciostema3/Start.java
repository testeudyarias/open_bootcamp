/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.development.eudy.arias.ejerciciostema3;

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
        //First
        Double result = Services.FunctionMath.addUp(10d, 20d, 30d);
        System.out.println("La suma de los tres numeros es: "+result.toString());
        //Second
        Services.Coche miCoche = new Services.Coche();
        miCoche.increaseDoor();
        System.out.println("Cantidad de puertas "+miCoche.numDoor.toString());
    }
    
}
