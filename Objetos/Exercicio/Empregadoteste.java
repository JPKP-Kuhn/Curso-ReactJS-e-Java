package Objetos.Exercicio;

import java.util.Scanner;

public class Empregadoteste {
    public static void main (String[] args) {

        Scanner inputS = new Scanner(System.in);
        Scanner inputD = new Scanner(System.in);

        System.out.println("Informações dos empregados");

        System.out.print("Nome do primeiro empregado: ");
        String primeiroNome = inputS.nextLine();

        System.out.print("Sobrenome do primeiro empregado: ");
        String ultimoNome = inputS.nextLine();

        System.out.print("Salário mensal do primeiro empregado: ");
        double salarioMensal = inputD.nextDouble();

        Empregado trabalhador1 = new Empregado(primeiroNome, ultimoNome, salarioMensal);

        System.out.printf("Dados - %n Nome: %s %n Sobrenome: %s %n Salário mensal: %.2f %n Salário anual: %.2f %n", primeiroNome, ultimoNome, salarioMensal, salarioMensal * 12);

        System.out.println("Aumento de 10%");
        System.out.printf("salário mensal: %.2f %n Salário anual: %.2f %n", salarioMensal * 1.1, salarioMensal * 12 * 1.1);

        Empregado trabalhador2 = new Empregado("José", "Silva", 500);
        System.out.printf("Salário do %s, %s é %.2f. Anualmente é %.2f %n", trabalhador2.getUltimoNome(), trabalhador2.getPrimeiroNome(), trabalhador2.getSalarioMensal(), trabalhador2.getSalarioMensal() * 12);
        System.out.println("Aumento de 10%");
        System.out.printf("Salário mensal: %.2f %n Salário anual: %.2f %n", trabalhador2.getSalarioMensal() * 1.1, trabalhador2.getSalarioMensal() * 12 * 1.1);


    }
}
