package Sobrecarga_de_metodos;

import java.util.ArrayList;
import java.util.Arrays;

public class sobrecarga {
    public static void main(String[] args) {
        ArrayList<String> itens = new ArrayList<String>();
        itens.add("red");
        itens.add(0, "yellow"); //o yellow vai jogar o red pro lado
        display(itens, "%nDisplay list contents with enhanced for statement:"); //Loop no array e print pra cada item
        itens.add("green");
        itens.add("yellow");
        display(itens, "List with two new elements:");
        itens.remove("yellow");
        display(itens, "Removed:");
        itens.remove(1);
        display(itens, "Another remove:");

        System.out.printf("%s%n", itens.contains("red"));
        System.out.printf("Size: %s%n", itens.size());

        removeAll(itens, "red");
        display(itens, "After removeAll:");

        ArrayList<Integer> inteiros = new ArrayList<Integer>();
        ;
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        //display(inteiros, "My Array integer: ");
    }


    private static void display(ArrayList<String> itens, String header) {
        System.out.printf(header);
        for (String item : itens) {
            System.out.printf(" %s", item);
        }
        System.out.println();
    }

    /*
    private static void display(ArrayList<Integer> inteiros, String header){
        System.out.printf(header);
        for (int item : inteiros){
            System.out.printf(" %d", item);
        }
        System.out.println();
    }
    */
    private static void removeAll(ArrayList<String> itens, String toRemove) {
        while (itens.contains(toRemove)) {
            itens.remove(toRemove);
        }
    }
}
