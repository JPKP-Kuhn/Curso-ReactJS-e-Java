import java.util.Scanner;

class Exercicios{

     public static void main(String[] args) {
        //Ex1
        System.out.println("Escreva um programa para aumentar em 10% o salário do funcionário Carlos. O usuário deve digitar o salário do Carlos e o programa deve mostrar o novo salário e o valor do aumento em reais.");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Qual o salário de Carlos:");
            double salario1 = input.nextDouble();
            System.out.print("Digite a porcentagem de aumento: ");
            double porcentagem = input.nextDouble()/100;
            double aumento = salario1 * (1+ porcentagem);
            System.out.printf("O salário agora é: R$%.2f aumentou R$%.2f %n.", aumento, aumento - salario1 );

        }
        
    }
}    