package Services;

/**
 *
 * Para este primer ejercicio tendréis que realizar lo siguiente:
 *
 * Crea un proyecto de Java desde 0
 *
 * Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 *
 * Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
 *
 * Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */
public class FirstClass {
    public static void tiposDatos(){
         byte byteV = 5;
         int intV = 10;
         short shortV = 19;
         long longV = 1000000000;
         float floatV = 19.5f;
         double doubleV = 3.1416;
         boolean booleanV = true;
         char charV = 'a';
         String stringV = "texto";
         Object objectV = "generico";

        System.out.println(java.text.MessageFormat.format(
                """
                El tipo de datos {0}, 
                tiene el valor {1}, 
                su valor minimo es {2}, 
                su valor maximo es {3},
                su cantidad de bytes es {4}
                """,
                ((Object) intV).getClass().getSimpleName(),
                intV,
                Integer.MIN_VALUE,
                Integer.MAX_VALUE,
                Integer.BYTES
                ));
        System.out.println(java.text.MessageFormat.format(
                """
                El tipo de datos {0}, 
                tiene el valor {1}, 
                su valor minimo es {2}, 
                su valor maximo es {3},
                su cantidad de bytes es {4}
                """,
                ((Object) longV).getClass().getSimpleName(),
                longV,
                Long.MIN_VALUE,
                Long.MAX_VALUE,
                Long.BYTES
        ));
        System.out.println(java.text.MessageFormat.format(
                """
                El tipo de datos {0}, 
                tiene el valor {1}, 
                su valor minimo es {2}, 
                su valor maximo es {3},
                su cantidad de bytes es {4}
                """,
                ((Object) floatV).getClass().getSimpleName(),
                floatV,
                Float.MIN_VALUE,
                Float.MAX_VALUE,
                Float.BYTES
        ));

        System.out.println(java.text.MessageFormat.format(
                """
                El tipo de datos {0}, 
                tiene el valor {1}, 
                su valor minimo es {2}, 
                su valor maximo es {3},
                su cantidad de bytes es {4}
                """,
                ((Object) doubleV).getClass().getSimpleName(),
                doubleV,
                Double.MIN_VALUE,
                Double.MAX_VALUE,
                Double.BYTES
        ));

        System.out.println(java.text.MessageFormat.format(
                """
                El tipo de datos {0}, 
                tiene el valor {1}, 
                su valor minimo es {2}, 
                su valor maximo es {3},
                su cantidad de bytes es {4}
                """,
                ((Object) booleanV).getClass().getSimpleName(),
                booleanV,
                "false",
                "true",
                "1"
        ));
        System.out.println(java.text.MessageFormat.format(
                """
                El tipo de datos {0}, 
                tiene el valor {1}, 
                su valor minimo es {2}, 
                su valor maximo es {3},
                su cantidad de bytes es {4}
                """,
                ((Object) charV).getClass().getSimpleName(),
                charV,
                Character.MIN_VALUE,
                Character.MAX_VALUE,
                Character.BYTES
        ));
        System.out.println(java.text.MessageFormat.format(
                """
                El tipo de datos {0}, 
                tiene el valor {1}, 
                su valor minimo es {2}, 
                su valor maximo es {3},
                su cantidad de bytes es {4}
                """,
                ((Object) byteV).getClass().getSimpleName(),
                byteV,
                Byte.MIN_VALUE,
                Byte.MAX_VALUE,
                Byte.BYTES
        ));
        System.out.println(java.text.MessageFormat.format(
                """
                El tipo de datos {0}, 
                tiene el valor {1}, 
                su valor minimo es {2}, 
                su valor maximo es {3},
                su cantidad de bytes es {4}
                """,
                ((Object) shortV).getClass().getSimpleName(),
                shortV,
                Short.MIN_VALUE,
                Short.MAX_VALUE,
                Short.BYTES
        ));


        System.out.println(java.text.MessageFormat.format(
                """
                El tipo de datos {0}, 
                tiene el valor {1}, 
                su valor minimo es {2}, 
                su valor maximo es {3},
                su cantidad de bytes es {4}
                """,
                ((Object) stringV).getClass().getSimpleName(),
                stringV,
                "N/A",
                "N/A",
                "N/A"
        ));


        System.out.println(java.text.MessageFormat.format(
                """
                El tipo de datos {0}, 
                tiene el valor {1}, 
                su valor minimo es {2}, 
                su valor maximo es {3},
                su cantidad de bytes es {4}
                """,
                ((Object) objectV).getClass().getSimpleName(),
                objectV,
                "N/A",
                "N/A",
                "N/A"
        ));

    }
    public static void main(String[] args) {
        FirstClass.tiposDatos();
    }
}
