package Sobrecarga_de_metodos;

public class SobrecargaVetor {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        multiplyArrayBy2(array);
        System.out.printf("The values of the modified array are:%n");
        display(array);

        multiplyArrayBy2(array);
        System.out.printf("The values of the modified array are:%n");
        display(array);

        String[] arrayString = {"Saper", "Java"};
        display(arrayString);
    }

    private static void multiplyArrayBy2(int[] oldArray) {
        for (int counter = 0; counter < oldArray.length; counter++) {
            oldArray[counter] *= 2;
        }
    }

    private static void display(int[] array) {
        for (int item : array) {
            System.out.printf(" %d", item);
        }
        System.out.println();
    }

    private static void display(String[] array) {
        for (String item : array) {
            System.out.printf(" %s", item);
        }
        System.out.println();
    }
}
