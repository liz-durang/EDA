import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSetExample {

    List<List<String>> listEmployees = new ArrayList<>();

    // Constructor para inicializar la lista de empleados y gerentes
    public Solution() {
        // Report - Manager || [[Bob, Alice], [Charlie, Bob], [Dave, Bob]]
        listEmployees.add(List.of("Bob", "Alice"));
        listEmployees.add(List.of("Charlie", "Bob"));
        listEmployees.add(List.of("Dave", "Bob"));
    }

    // Método para convertir la lista de listas en un mapa
    public Map<String, List<String>> listToMap(List<List<String>> listEmployees) {
        Map<String, List<String>> mapEmployees = new HashMap<>();

        for (List<String> employeePair : listEmployees) {
            String employee = employeePair.get(0);
            String manager = employeePair.get(1);

            // Inicializar la lista de empleados si el gerente no existe en el mapa
            mapEmployees.putIfAbsent(manager, new ArrayList<>());
            // Agregar el empleado a la lista del gerente
            mapEmployees.get(manager).add(employee);
        }

        return mapEmployees;
    }

    // Método recursivo para calcular el "score" de reportes de un empleado
    public int getScore(String name, Map<String, List<String>> reportEmployees) {
        int score = 1; // Iniciamos con un puntaje base de 1

        // Obtener la lista de empleados que reportan al empleado actual
        List<String> subordinates = reportEmployees.getOrDefault(name, new ArrayList<>());

        // Calcular recursivamente el puntaje de cada subordinado
        for (String subordinate : subordinates) {
            score += getScore(subordinate, reportEmployees);
        }

        return score;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Convertir la lista de empleados a un mapa de gerentes
        Map<String, List<String>> mapEmployees = solution.listToMap(solution.listEmployees);
        System.out.println("Mapa de gerentes y empleados: " + mapEmployees);

        // Calcular el puntaje de reporte para un empleado específico
        int score = solution.getScore("Bob", mapEmployees);
        System.out.println("Score de Bob: " + score);
    }
}
