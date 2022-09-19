import Interfaces.CocheCRUD;
import Modelos.CocheCRUDImpl;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Crear una interfaz CocheCRUD.
 *
 * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
 *
 * Como métodos de CocheCRUD podemos poner:
 *
 * save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
 *
 * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 *
 * Ejemplo:
 *
 * CocheCRUD cocheCrud = new CocheCRUDImpl()
 */
public class Main {
    public static void main(String[] args) {
        /*
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();*/
        //System.out.println(Multiply.multiply(5d,5d));
        BigDecimal v1 = new BigDecimal(10);
        BigDecimal v2 = new BigDecimal(10);
        System.out.println(v1.multiply(v2));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("k1",1);
        map.put("k2",2);
        map.put("k3",3);
        map.put("k4",4);
        map.put("k5",5);
        for (var item: map.entrySet() ) {
            System.out.println(item);
            System.out.println(java.text.MessageFormat.format("Key:{0} Value:{1}",item.getKey(),item.getValue()));
        }
    }

    public class Multiply {
        public static Double multiply(Double a, Double b) {
            return a * b;
        }
    }
}
