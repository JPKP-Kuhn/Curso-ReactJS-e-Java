package Logica_programacao.Repetição.Logica;

import java.util.Random;
import java.util.Scanner;

public class exercicios {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva um número de 1 a 7 para ver o exercício: ");
        switch (input.nextInt()){
            case 1 -> exercicio1();
            case 2 -> exercicio2();
            case 3 -> exercicio3();
            case 4 -> exercicio4();
            case 5 -> exercicio5();
            case 6 -> exercicio6();
            case 7 -> exercicio7();
            default -> System.out.println("Não digitou uma das opções");
        }  
        input.close();
            
    }      
    
    public static void exercicio1(){
        System.out.println("Faça um programa para calcular e mostrar a média aritmética das duas notas de cada aluno de uma turma de 100 alunos.");    
        Scanner input = new Scanner(System.in);
        Random random1 = new Random();
        Random random2 = new Random();
        int i = 1;
        System.out.print("Digite o número de alunos: ");
        int alunos = input.nextInt();
        while (i <= alunos){
            double n1 = random1.nextInt(10+1);
            double n2 = random2.nextInt(10+1);
            double media = (n1 + n2)/2;

            System.out.printf("O Aluno %d Nota 1: %.2f Nota 2: %.2f Média: %.2f \n ",i, n1, n2, media);
            i++;
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

    public static void exercicio3(){
        System.out.println("Construa um algoritmo que calcula a média aritmética de um conjunto de números positivos pares fornecidos pelo usuário. O usuário pode digitar qualquer número inteiro e digita -1 para terminar.");
        Scanner input = new Scanner(System.in);

        int numeros;
        double soma = 0;
        int i = 0;
        do {
            System.out.print("Digite um número natural e par, para encerrar digite -1: ");
            numeros = input.nextInt();
            
            if (numeros > 0 && numeros % 2 == 0){
                soma += numeros;
                i++;
                
            } else {
                break;
            }
        }
        while (true);

        if (i > 0){
            System.out.printf("A média dos números digitados é %.2f %n", soma/i);
        } else {
            System.out.println("Nenhum número par positivo foi digitado");
        }
    }

    public static void exercicio4(){
        System.out.println("Construa um programa para fazer o levantamento de vinhos de uma adega. As entradas do programa são os tipos de vinho sendo 'T para tinto, 'B' para branco e 'R' para rosê. Ao final da execucão, o programa deve mostrar a porcentagem de cada tipo de vinho na adega. O usuario do seu programa não sabe quantos vinhos possui, então seu programa deve, a cada vinho cadastrado, perguntar se o usuário quer encerrar o levantamento. Você pode assumir que o usuario sempre vai entrar com valores válidos");

        Scanner input = new Scanner(System.in);

        //Gerará a quantidade de garrafas de cada vinho
        double vinhoT = 0;
        double vinhoB = 0;
        double vinhoR = 0;

        double total = 0;
        
        System.out.println("Você pode adicionar ou remover vinhos");

        while (true){
            System.out.print("Tipos de vinho: Tintot(T), Branco(B) e Rosê(R): ");
            char escolha = input.next().charAt(0);
            System.out.print("Adicionar(1) ou remover(2): ");
            int addremo = input.nextInt();

            switch(escolha) {
                case ('T') -> {if(addremo == 1){vinhoT++;}else{vinhoT--;}}
                case('B') -> {if(addremo == 1){vinhoB++;}else{vinhoB--;}}
                case('R') -> {if(addremo == 1){vinhoR++;}else{vinhoR--;}}
                default -> System.out.println("Não digitou uma das opções");
            }
           
            total = vinhoT + vinhoB + vinhoR;
            System.out.print("Você quer encerrar? S/n ");
            char Sn = input.next().charAt(0);
            if (Sn == 'S'){
                break;
            }
        }
        System.out.printf("%.2f, %.2f, %.2f %n", vinhoT, vinhoB, vinhoR);
        System.out.printf("Porcentagem de cada vinho: \n Total: %.2f \n Vinho Tinto: %.2f%% \n Vinho Branco: %.2f%% \n Vinho Rosê: %.2f%% %n", total, (vinhoT/total * 100), (vinhoB/total * 100), (vinhoR/total * 100));
    }

    public static void exercicio5(){
        System.out.println("Crie um programa que usa um comando for para somar os inteiros pares de 2 até 20 e armazena o resultado em uma variável chamada total.");

        int total = 0;
        for (int i = 0; i <=20; i++){
            if (i % 2 == 0){
                total += i;
            }
        }
        System.out.println(total);
    }

    public static void exercicio6(){
        System.out.println("Faça um programa que mostra o valor das vendas de uma loja e a média de vendas de todos os vendedores. O usuário do programa deve fornecer a quantidade de vendedores da loja e o valor das vendas de cada vendedor.");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de vendedores: ");
        int quantidadeVendedores = input.nextInt();

        double valorVendas;
        double totalVendasloja = 0;
        double maiorVenda = 0;
        int melhorVendedor = 0;

        for(int i = 0; i < quantidadeVendedores; i++){
            System.out.printf("Digite o valor das vendas do %dº vendedor: ", i+1);
            valorVendas = input.nextDouble();
            totalVendasloja += valorVendas;
            

            if (valorVendas > maiorVenda){
                maiorVenda = valorVendas;
                melhorVendedor = i + 1;
            }
        
        }
        System.out.printf("Valor total de vendas da loja: %.2f %n", totalVendasloja);
        System.out.printf("A média das vendas dos vendedores é: %.2f %n", totalVendasloja/quantidadeVendedores);
        System.out.printf("Maior valor de vendas entre os vendedore: %.2f. O melhor vendedor foi %dº %n", maiorVenda, melhorVendedor);
    }

    public static void exercicio7(){
        System.out.println("Uma pessoa investe R$1000,00 em uma conta poupança rendendo 2% de juros por ano. Supondo que todos os juros sejam deixados em depósito, calcule e apresente a quantia de dinheiro na conta no final de uma determinada quantidade de anos fornecida pelo usuário.");

        Scanner input = new Scanner(System.in);
        System.out.print("Quantos anos o dinheiro ficará guardado? ");
        int anos = input.nextInt();
        double investimento = 1000;
        for (int i = 0; i < anos; i++){
            investimento *= 1.02;
            System.out.printf("No ano %d a quantia de dinheiro é R$%.2f \n", i+1, investimento);
        }
        System.out.printf("Valor total no final do período: %.2f \n", investimento);
    }

}
