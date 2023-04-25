import java.util.Scanner;

public class booleano {
    public static void main(String[] args) {
            System.out.printf("Result is %b%n", true);
            System.out.printf("Result is %b%n", false);
            System.out.printf("Result is %b%n", 2 > 5);
            System.out.println("Fazer um programa que execute a multiplicação de dois valores lidos. E se o resultado da multiplicação for menor que 25, mostrar a metade do resultado.");

            Scanner input = new Scanner (System.in);
            System.out.print("Digite um número: ");
            double num1 = input.nextDouble();

            System.out.print("Digite outro número: ");
            double num2 = input.nextDouble();

            double multiplicacao = num1 * num2;
            

            //Operadores lógicos
            if (multiplicacao < 25 || multiplicacao > 50){
                System.out.printf("A multiplicação é %.2f e a sua metade é %.2f %n ", multiplicacao, multiplicacao/2.0);
            }
            else{
                System.out.printf("A multiplicação é %.2f %n", multiplicacao);
            
            }

            System.out.print("Digite um número inteiro: ");
            int n1 = input.nextInt();
            if (!(n1 < 0)){
                System.out.println("Número não negativo");
            }
            if (n1 > 2 && n1 <= 9){
                System.out.println("Inteiro no intervalo ]2,9]");
            }
            if (n1 > 10 || n1 < 0){
                System.out.println("Inteiro maior do que 10 ou negativo");
            }
            input.close();
        
    }
    
}
