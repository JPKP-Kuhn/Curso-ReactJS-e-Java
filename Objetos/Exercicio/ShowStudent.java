package Objetos.Exercicio;
import java.util.Random;
import java.util.Scanner;

public class ShowStudent {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do 1º aluno: ");
        String nome = input.nextLine();

        System.out.print("Digite a sua média, entre 0 e 100: ");
        double media = input.nextDouble();

        Student estudante1 = new Student(nome, media);
        System.out.printf("Aluno: %s %n", estudante1.getNome());
        estudante1.conceito(media);

        Scanner input2 = new Scanner(System.in);
        System.out.print("Nome do 2º aluno: ");
        String nome2 = input2.nextLine();

        System.out.print("Digite a sua média, entre 0 e 100: ");
        double media2 = input2.nextDouble();

        Student estudante2 = new Student(nome2, media2);
        System.out.printf("Aluno: %s %n", estudante2.getNome());
        estudante2.conceito(media);

        int nAlunos = 0;
        String[] names = {"João", "Maria", "Adriana", "Carla", "Roberto", "Mario", "Cleitom", "Spok", "Ariel", "Nicol", "Bolas", "Han Solo", "Chandra", "Jace", "Marte", "Boba Fett", "Frodo", "Samwise", "Peregrin", "Meriadoc", "Gandalf", "Luke Skywalker", "Leia", "Obi-wan", "Yoda", "Harry", "Rony", "Hermione", "Dumbledore" };
        Random random = new Random();
        while (nAlunos <= 100){
            double n1 = random.nextDouble(100)+1;
            double n2 = random.nextDouble(100)+1;
            double n3 = random.nextDouble(100)+1;
            double medianotas = (n1 + n2 + n3)/3;
            String nomelista = names[random.nextInt(names.length)];
            Student aluno = new Student(nomelista, medianotas);
            System.out.printf("Nome do Aluno %s\n", aluno.getNome());
            aluno.conceito(medianotas);
            nAlunos++;
        }
    }
}
