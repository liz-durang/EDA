//Usar Map en Java es muy similar a un diccionario en Python para almacenar pares clave-valor

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear un HashMap
        Map<String, Integer> edades = new HashMap<>();

        // Agregar elementos (clave, valor)
        edades.put("Alice", 25);
        edades.put("Bob", 30);
        edades.put("Carlos", 28);

        // Acceder a un valor usando su clave
        System.out.println("La edad de Alice es: " + edades.get("Alice"));  // Output: 25

        // Verificar si una clave existe en el Map
        if (edades.containsKey("Bob")) {
            System.out.println("La edad de Bob es: " + edades.get("Bob"));
        }

        // Eliminar un par clave-valor
        edades.remove("Carlos");

        // Iterar sobre las claves y valores del Map
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.println(entrada.getKey() + " tiene " + entrada.getValue() + " años.");
        }
    }
}
