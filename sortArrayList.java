import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortArrayList {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");

        Collections.sort(nombres); // Ordena en orden ascendente
        System.out.println(nombres); // Salida: [Ana, Carlos, Pedro]
    }
}
