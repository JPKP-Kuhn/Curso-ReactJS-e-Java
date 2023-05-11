package Logica_programacao.Listas;

public class ArraysParametros {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        multiplyArrayBy2(array);
        System.out.printf("The values of the modified array are:%n");
        for (int value : array) {
            System.out.printf("%d", value);
        }
    }    
        
    private static void multiplyArrayBy2(int[] oldArray) {
        for (int counter = 0; counter < oldArray.length; counter++){
            oldArray[counter] *= 2;
        }
    }
}
