package Services;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.function.Predicate;

public class Tool {
    /**
     * Dada la función:
     *
     *  public static String reverse(String texto) { }
     *
     * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
     * @param texto
     * @return
     */
    public static String reverse(String texto) {
        String reverseText = "";
        for (int i = texto.length()-1; i >= 0 ; i--) {
            reverseText += String.valueOf(texto.toCharArray()[i]);
        }
        return reverseText;
    }
    /**
     * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
     */
    public static  void arrayStringShow(){
        String[] saludo = {"hola","soy","eudy"};
        for (var item: saludo ) {
            System.out.println(item);
        }
    }

    /**
     * Crea un array bidimensional de enteros y recórrelo, mostrando la posición
     * y el valor de cada elemento en ambas dimensiones.
     */
    public static  void arrayBidimensional(){
        int[][] elementos = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos[i].length ; j++) {
                System.out.print(java.text.MessageFormat.format(" {0} | ",elementos[i][j]));
                //System.out.print(java.text.MessageFormat.format("Valor {0} Fila {1} Columna {2}",elementos[i][j],i,j));
            }
            System.out.println();
        }
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos[i].length ; j++) {
                System.out.println(java.text.MessageFormat.format("Valor {0} Fila {1} Columna {2}",elementos[i][j],i,j));
            }
        }
    }

    /**
     * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
     * Elimina el 2o y 3er elemento y muestra el resultado final.
     */
    public  static void vectorR(){
        Vector<Integer> vector = new Vector();
        //Llenar
        for (int i = 1; i <= 5; i++) {
            vector.add(i);
        }
        //Eliminar
        vector.remove(1);
        vector.remove(2);
        for (var i:vector ) {
            System.out.println(i);
        }

    }

    /**
     * Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
     * si tuviésemos 1000 elementos para ser añadidos al mismo.
     */
    public static void problemaVector(){
        /*
        Se debe realizar una copia del arreglo para aumentar la capacidad.
        Se tiene que crear un array nuevo con una capacidad mayor y no aun no se puede ingresar todos los
        elementos entonces se debe crear otro arreglo mas, realizar una copia y repetir la operacion hasta que
        se puedan agregar todos los elementos deseados
         */

        String Explicacion ="""
                El problema es: El uso exagerado de memoria ram.\s
                Esto se debe a que se realizara una copia del arreglo para aumentar la capacidad. 
                Es decir se agregan los primeros 10 elemento que es la capacidad por default del vector 
                pero cuando se agrega el elemento 11 este tiene que crea un arreglo nuevo 
                con el doble de elementos del anterior ósea se crea un arreglo de 20 elemento y luego de esto
                se tienen que pasar los 10 primeros elemento ingresado al nuevo arreglo de 20 elemento,
                este proceso se repite hasta poder ingresar todos los elementos al final vamos a tener un vector
                con una capacidad 1280 elemento cuando en realidad solo tenemos usa 1000.
                
                Ahora le mostrare paso a paso lo que sucede cada vez que agregamos un elemento.                                            
                """;
        //System.out.println(Explicacion);
        try {
            for (var item :Explicacion.toCharArray()) {
                Thread.sleep(100);
                System.out.print(item);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Vector<Integer> vector = new Vector<Integer>();
        try {
            for (int i = 1; i <= 1000 ; i++) {
                Thread.sleep(200);
                vector.add(i);
                System.out.println(vector);
                System.out.println("Capacidad: "+vector.capacity()+" size: "+vector.size());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
     * Recorre ambos mostrando únicamente el valor de cada elemento.
     */
    public static  void copiaList(){
        ArrayList<String> array1 =new ArrayList<String>();
        array1.add("Arroz");
        array1.add("Carne");
        array1.add("Pasta");
        array1.add("Jugo");
        LinkedList<String> array2 = new LinkedList<>();
        array2.addAll(array1);
        for (int i = 0; i < array1.size(); i++) {
            System.out.println("Array 1: "+array1.get(i)+" Posicion : "+i);
            System.out.println("Array 2: "+array2.get(i)+" Posicion : "+i);
        }
    }

    /**
     * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
     * A continuación, con otro bucle, recórrelo y elimina los numeros pares.
     * Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves,
     * puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
     */
    public  static  void adminArrayList(){
        ArrayList<Integer> array1 =new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            array1.add((i+1));
        }
        ArrayList<Integer> array2 = array1;

        for (int i = 0; i < array1.size() ; i++) {
            if ((array1.get(i) % 2) == 0){
                Integer aux = array1.get(i);
                array2.removeIf(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer == aux;
                    }
                });
            }
        }
        System.out.println("Resultado: "+array2);
    }

    /**
     * Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
     */
    public static void   division(Integer a, Integer b){
        try {
            if (b == 0){
                throw new ArithmeticException("No se puede dividir entre cero");
            }
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Utilizando InputStream y PrintStream, crea una función que reciba dos
     * parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del
     * fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
     */
    public static void copiarArchivo(String fileIn,String fileOut){
        try {
            System.out.println(
                    java.text.MessageFormat.format(
                    "Copiando el archivo {0} a {1}",
                    fileIn,
                    fileOut
                    )
            );

            //Leer
            InputStream fileInputStream = new FileInputStream(fileIn);
            String texto = new String(fileInputStream.readAllBytes());

            //Crear
            PrintStream printStream = new PrintStream(fileOut);
            printStream.println(texto);
            Thread.sleep(1000);
            System.out.println(
                    java.text.MessageFormat.format(
                            "Se copio el archivo {0} a {1}",
                            fileIn,
                            fileOut
                    )
            );
            Thread.sleep(1000);
            System.out.println("Leyendo contenido del archivo"
            );
            Thread.sleep(1000);
            System.out.println(
                    java.text.MessageFormat.format(
                            "Contenido del archivo copiado {0}",
                            texto
                    )
            );

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
}
