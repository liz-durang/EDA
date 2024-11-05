//Un Set en Java es ideal cuando necesitas almacenar elementos únicos, sin duplicados, y puedes elegir la implementación según tus necesidades de orden.

import java.util.Set;
import java.util.HashSet;

public class setExample {
    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();

        // Agregar elementos al Set
        nombres.add("Alice");
        nombres.add("Bob");
        nombres.add("Carlos");
        nombres.add("Alice");  // Este elemento duplicado no se añadirá

        // Imprimir el Set
        System.out.println("Elementos en el Set: " + nombres);

        // Verificar si contiene un elemento específico
        if (nombres.contains("Alice")) {
            System.out.println("El Set contiene a Alice.");
        }

        // Eliminar un elemento
        nombres.remove("Bob");
        System.out.println("Elementos después de eliminar a Bob: " + nombres);

        // Iterar sobre los elementos del Set
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
