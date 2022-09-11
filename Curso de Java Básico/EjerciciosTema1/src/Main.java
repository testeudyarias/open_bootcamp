import Services.FirstClass;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        FirstClass.tiposDatos();
        var montoConIva = PrecioConIva(190000);
        System.out.println( java.text.MessageFormat.format("Monto con IVA incluido {0}" ,montoConIva));

    }
    //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    public static double PrecioConIva(double precio){
        return (precio*0.18)+precio;
    }
}