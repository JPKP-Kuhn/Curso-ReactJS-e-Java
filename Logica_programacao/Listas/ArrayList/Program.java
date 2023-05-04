package Logica_programacao.Listas.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
    }
    
    private static void display(ArrayList<String> itens, String header) {
        System.out.printf(header);
        /*
        for (String item : itens) {
            System.out.printf(" %s", item);
        }
        */
        System.out.println(Arrays.toString(itens.toArray()));
    }

    private static void removeAll(ArrayList<String> itens, String toRemove){
        while (itens.contains(toRemove)){
            itens.remove(toRemove);
        }
    }
}

