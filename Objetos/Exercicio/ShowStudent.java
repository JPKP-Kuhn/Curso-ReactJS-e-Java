package Objetos.Exercicio;
import java.util.Scanner;

public class ShowStudent {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = input.nextLine();

        System.out.print("Digite a sua média, entre 0 e 100: ");
        double media = input.nextDouble();

        Student estudante = new Student(nome, media);
        System.out.printf("Aluno: %s %n", estudante.getNome());
        estudante.conceito(media);
    }
}
