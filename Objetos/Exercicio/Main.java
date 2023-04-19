package Objetos.Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inputS = new Scanner(System.in);
        Scanner inputD = new Scanner(System.in);
        String nome = "";
        double saldo = 0;
        //Já atribui os parãmetros nome, saldo a classe
        Conta cliente = new Conta(nome, saldo);

        //Não foram chamados os métodos ainda
        //System.out.printf("Nome do cliente: %s%n", cliente.getName());
        //System.out.printf("Saldo do cliente: %.2f%n", cliente.getSaldo());

        System.out.println("Vamos criar uma conta bancária!");

        System.out.print("Digite seu nome: ");
        nome = inputS.nextLine();
        cliente.setName(nome);

        System.out.print("Digite seu saldo inicial: ");
        saldo = inputD.nextDouble();
        cliente.setSaldo(saldo);

        //Chamando os métodos get
        System.out.printf("Dados - %n Nome: %s %n Saldo: %.2f %n", cliente.getName(), cliente.getSaldo());

        Conta cliente2 = new Conta(nome, saldo);
        System.out.print("Digite o nome do cliente 2: ");
        String nomeCliente = inputS.nextLine();

        System.out.print("Digite o saldo do cliente 2: ");
        double saldo2 = inputD.nextDouble();

        System.out.printf("Dados 2 - %n Nome: %s %n Saldo: %.2f %n", cliente.getName(), cliente.getSaldo());

        cliente2.deposito(3000.00);
        cliente2.saque(1000.00);
        cliente2.deposito(2000.00);
        cliente2.saque(500.00);
        cliente2.saque(1000000.00);

        System.out.printf("Saldo do cliente 2: %s%n", cliente2.getSaldo());


    }
}
