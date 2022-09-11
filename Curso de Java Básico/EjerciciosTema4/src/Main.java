import Models.*;
public class Main {
    /**
     * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
     *
     * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
     *
     * Crear constructor vacío y con todos los parámetros para cada clase.
     *
     * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
     * @param args
     */
    public static void main(String[] args) {
        SmartDevice smart = new SmartPhone("Phone","samsung"," a03");
        System.out.println(smart.toString());
        smart = new SmartWatch("Watch","samsung","Galaxy Watch5 Pro");
        System.out.println(smart.toString());
    }
}