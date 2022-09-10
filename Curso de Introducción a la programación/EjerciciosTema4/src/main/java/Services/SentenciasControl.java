/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

/**
 *
 * @author developer
 */
/*

*/
public class SentenciasControl {
    /*
    Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
    */
    public static void funcIf(){
        System.out.println("funcIf");
        int numeroIf = 10;
        if (numeroIf == 0) 
            System.out.println("Es un cero");    
        else if(numeroIf > 0)
            System.out.println("Es positivo");
        else
            System.out.println("Es negativo");
    }
    /*
    Crea un bucle While, este bucle tendrá que tener como condición que la 
    variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.
    */
    public static void funcWhile(){
        System.out.println("funcWhile");
        int numeroWhile = 1;
        while (numeroWhile<3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }
    
    /*
    Para el bucle Do While, deberás crear la misma estructura que en el While, 
    pero solo se debe ejecutar una vez.
    */
    public static void funcDoWhile(){
        System.out.println("funcDoWhile");
        int numeroDoWhile = 3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile<3);
    }
    
    /*
    Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 
    y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 
    su valor cada vez que se ejecute y deberá mostrarse por pantalla.
    */
    public static void funcFor(){
        System.out.println("funcFor");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }
    
    /*
    Por último, para el Switch, deberás crear la variable estacion, y distintos case 
    para las cuatro estaciones del año. Dependiendo del valor de la variable estacion 
    se deberá mandar un mensaje por consola informando de la estación en la que está. 
    También habrá que poner un default para cuando el valor de la variable no sea una estación.
    */
    public static void funcSwitch(){
        System.out.println("funcSwitch");
        String estacion = "otoño";
        
        switch (estacion.toLowerCase()) {
    
            case "primavera":
                  System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
                
            default:
                System.out.println("No es una estacion del año");
        }
    }
}
