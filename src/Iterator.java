import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Iterator {
    public static   void main(String args[]){
        List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        System.out.println(lista);

        java.util.Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("B")){
                iterator.remove();
            }
        }
        System.out.println(lista);
    }
}
