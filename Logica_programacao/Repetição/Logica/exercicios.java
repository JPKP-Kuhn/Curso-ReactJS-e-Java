package Logica_programacao.Repetição.Logica;

import java.util.Random;
import java.util.Scanner;

public class exercicios {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva um número de 1 a 2 para ver o exercício: ");
        switch (input.nextInt()){
            case 1 -> exercicio1();
            case 2 -> exercicio2();
            default -> System.out.println("Não digitou uma das opções");
        }  
        input.close();
            
    }      
    
    public static void exercicio1(){
        System.out.println("Faça um programa para calcular e mostrar a média aritmética das duas notas de cada aluno de uma turma de 100 alunos.");    
        Scanner input = new Scanner(System.in);
        Random random1 = new Random();
        Random random2 = new Random();
        int i = 0;
        System.out.print("Digite o número de alunos: ");
        int alunos = input.nextInt();
        while (i <= alunos){
            double n1 = random1.nextInt(10+1);
            double n2 = random2.nextInt(10+1);
            
            double media = (n1 + n2)/2;
            System.out.printf("O Aluno %d Nota 1: %.2f Nota 2: %.2f Média: %.2f \n ",i, n1, n2, media);
            i = i + 1;
        }

    }

    public static void exercicio2(){
        System.out.println("Faça um programa que recebe do usuário o salário de todos os 20 funcionários de uma empresa. O programa deve mostrar o gasto da empresa com o salário dos funcionários. Também deve mostrar a média salarial da empresa");
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        double gasto = 0;
        int i = 0;
        while(i < 20){
            double salario = random.nextDouble(1320, 13200);
            System.out.printf("R$ %.2f %n", salario);
            gasto += salario;
            i++;
        }
        System.out.printf("\nGasto total da empresa %.2f %n Média salaria %.2f %n", gasto, gasto/i);
    }
}
