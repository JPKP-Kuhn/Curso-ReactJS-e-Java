package Logica_programacao.Listas;

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
        System.out.println("Faça um programa em que o usuário insere a quantidade de elementos de uma lista e o programa coloca o valor 0 nas posições pares e 1 nas posições ímpares.");

        Scanner input = new Scanner(System.in);
        System.out.print("Insira a quantidade de elementos de uma lista: ");
        int elementos = input.nextInt();

        int[] lista = new int[elementos];

        for (int i = 0; i < lista.length; i++){
            if(i % 2 == 0){
                lista[i] = 0;
            } else {
                lista[i] = 1;
            }
            System.out.printf("Elemento na posição %dº é %d %n", i+1, lista[i]);
        }
    }

    public static void exercicio2(){
        System.out.println("Fazer um programa que recebe a nota de cada aluno de uma turma. O programa deve mostrar a média geral da turma e a quantidade de alunos com média maior ou igual a média da turma.");
    }
}
