import java.util.Scanner;

public class inputs2 {
    
    public static void main(String[] args) {
        char myChar;
        String myString;
        double valor;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Entre com um char: ");
            myChar = input.nextLine().charAt(0);

            System.out.print("Entre com uma string: ");
            myString = input.nextLine();
            
            System.out.print("Entre com um double: ");
            valor = input.nextDouble();
        }

        System.out.printf("myChar: %c%n", myChar);
        System.out.printf("MyString: %s%n", myString);
        System.out.printf("Valor: %f%n", valor);
    }

}
