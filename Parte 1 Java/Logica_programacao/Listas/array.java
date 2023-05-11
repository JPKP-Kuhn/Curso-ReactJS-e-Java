package Logica_programacao.Listas;

public class array {
    public static void main(String[] args){
        int[] myArray = new int[12];
        String[] strings = new String[10];

        myArray[0] = 5;
        myArray[11] = 18;
        strings[0] = "João";
        strings[9] = "Pedro";

        System.out.printf("%d%n", myArray[0]);
        System.out.printf("%s%n", strings[0]);
        System.out.printf("%d%n", myArray[11]);
        System.out.printf("%s%n", strings[9]); //erro se for um que não existe

        for (int counter = 0; counter < myArray.length; counter++)
        {
            System.out.printf("Counter %d, myArray[%d]%n", counter, myArray[counter]);
        }

        int[] inteiros = {10, 20, 30, 40, 50};
        for (int counter = 0; counter < inteiros.length; counter++)
        {
            System.out.printf("%d, %s%n", counter, inteiros[counter]);
        }
    }
}
