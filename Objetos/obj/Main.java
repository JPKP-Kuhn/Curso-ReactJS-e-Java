package Objetos.obj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Conta cliente = new Conta(); //new: Criar uma varíavel pra classe
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = input.nextLine();

        //Chamadas dos métodos da classe Conta()
        cliente.setName(nomeCliente); //Armazena o nome no setName
        cliente.setSaldo(2000);
        input.close();

        System.out.printf("Nome do cliente %s%n", cliente.getName());
        System.out.printf("Saldo do cliente: %.2f%n", cliente.getSaldo());
    }
}
