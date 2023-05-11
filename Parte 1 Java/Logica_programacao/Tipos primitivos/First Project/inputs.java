import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        char myChar;
        String myString;
        double valor;


        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int number1 = input.nextInt(); //Valor inteiro digitado, esse scanner o próximo int vai ser lido
            System.out.print("Digite o segundo número: ");
            int number2 = input.nextInt();
            int sum = number1 + number2;
            System.out.printf("Soma: %d%n", sum);

            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.printf("Resultado %d%n", num1 % num2);

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
