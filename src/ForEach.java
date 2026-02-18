import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach{
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));

        System.out.println(lista);

        for(String s : lista) {
            if ("B".equals(s)) {
                lista.remove(s); // Lanza ConcurrentModificationException
            }
        }
        System.out.println(lista);
    }
}
