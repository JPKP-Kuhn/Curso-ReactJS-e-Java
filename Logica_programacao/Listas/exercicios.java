package Logica_programacao.Listas;

import java.util.Random;
import java.util.Scanner;

import javax.xml.validation.Validator;

public class exercicios {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva um número de 1 a 3 para ver o exercício: ");
        switch (input.nextInt()){
            case 1 -> exercicio1();
            case 2 -> exercicio2();
            case 3 -> exercicio3();
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
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int alunos = input.nextInt();

        double media = 0;
        int acimaMedia = 0;
        double[] nota = new double[alunos];

        for (int i = 0; i < nota.length; i++){
            System.out.printf("Digite a nota do %dº aluno: ", i+1);
            nota[i] = input.nextDouble();
            media += nota[i]/nota.length;
            System.out.printf("Nota do %dº aluno: %.2f \n", i+1, nota[i]);
        }
        for (int i =0; i < nota.length; i++){
            if (nota[i] >= media){acimaMedia++;}
        }
        System.out.printf("Media da turma: %.2f. Alunos que tiraram acima ou igual a média %d \n", media, acimaMedia);
        
    }

    public static void exercicio3(){
        System.out.println("Cem funcionários foram pesquisados para dar uma nota de 1 a 10 para a qualidade da comida no restaurante da empresa, com 1 sendo “péssima” e 10 sendo “excelente”. Coloque as 100 respostas em um vetor de inteiros e apresente a frequência de cada nota.");

        Random random = new Random();
        int[] avaliacao = new int[100];
        int[] notas = new int[10];
       

        for (int i = 0; i < avaliacao.length; i++){
            int nota = random.nextInt(10) + 1;
            avaliacao[i] = nota;
            notas[nota - 1]++;
        }

        System.out.printf("Quantidades de cada nota: \n Nota 1: %d, Nota 2: %d, Nota 3: %d, Nota 4 %d, Nota 5: %d, Nota 6: %d, Nota 7: %d, Nota 8: %d, Nota 9: %d, Nota 10: %d %n", notas[0], notas[1], notas[2], notas[3], notas[4], notas[5], notas[6], notas[7], notas[8], notas[9]);
       
    }
}
