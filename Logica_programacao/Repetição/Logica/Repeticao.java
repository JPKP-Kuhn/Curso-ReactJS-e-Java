package Logica_programacao.Repetição.Logica;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        System.out.print("Digite um número inteiro < 20: ");
        int number = input.nextInt();
    
        while (number <= 20){
            number += 2;
            System.out.println(number);
        }
        System.out.println("Depois do while");
        System.out.println(number);

        System.out.println("Counter");
        int counter = 1;
        do {
            System.out.printf("%d %n", counter);
            counter = counter + 1;
        } while (counter < 10);

        System.out.println("Depois do do..while:");
        System.out.println(counter);
    }
    
}
