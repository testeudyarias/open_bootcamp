package EstructuraControl;

/**
 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 *
 * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
 *
 * String[] nombres = {"", "", "", ""}
 */
public class EjerciciosTema3 {

    public static String joinText(String[] arg){
        String text = "";
        for (var item: arg) {
            text += item+" ";
        }
        return text;
    }

    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Marcos", "Maria"};
        System.out.println(joinText(nombres));
    }
}
