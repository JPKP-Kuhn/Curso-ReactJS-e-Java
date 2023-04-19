package Objetos.Exercicio;

import java.util.Scanner;

public class ShowDate {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Mostrar a data!");

        System.out.print("Digite o dia de hoje: ");
        int dia = input.nextInt();

        System.out.print("Digite o mês atual: ");
        int mes = input.nextInt();

        System.out.print("Digite o ano: ");
        int ano = input.nextInt();

        Date data = new Date(dia, mes, ano);
        data.displaydate(dia, mes, ano);
    }
}
