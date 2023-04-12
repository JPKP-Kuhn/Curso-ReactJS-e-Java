import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //leitura do sistema na parte da entrada (o teclado)
        System.out.print("Digite o primeiro número: ");
        int number1 = input.nextInt(); //Valor inteiro digitado, esse scanner o próximo int vai ser lido
        System.out.print("Digite o segundo número: ");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.printf("Soma: %d%n", sum);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.printf("Resultado %d%n", num1 % num2);
    }
    
}
