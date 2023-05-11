package Logica_programacao.Listas;

/*Fazer um programa que recebe a nota de cada aluno de uma
turma. O programa deve mostrar a média geral da turma e a
quantidade de alunos com nota maior ou igual a média da
turma.
*/

import java.util.Scanner;

public class ShowAluno {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner inputStrings = new Scanner(System.in);

		System.out.print("Digite a quantidade de alunos na turma: ");
		int quantidadeAlunos = input.nextInt();

		Aluno[] alunos = new Aluno[quantidadeAlunos];

		for (int i = 0; i < alunos.length; i++){

			System.out.print("Digite o nome do aluno: ");
			String nomeAluno = inputStrings.nextLine();

			System.out.printf("Digite a nota 1 do %dº aluno: ", i+1);
			double nota1Aluno = input.nextDouble();

			System.out.printf("Digite a nota 2 do %dº aluno: ", i+1);
			double nota2Aluno = input.nextDouble();

			alunos[i] = new Aluno(nomeAluno, nota1Aluno, nota2Aluno);
		}

		double[] medias = new double[quantidadeAlunos];
		double somaMedias = 0;
		for (int i = 0; i < alunos.length; i++) {
			medias[i] = alunos[i].media();
			somaMedias += medias[i];
		}

		double mediaTurma = somaMedias/quantidadeAlunos;
		System.out.printf("Média da turma: %.2f%n", mediaTurma);

		int contador = 0;
		for (double media : medias){
			if (media >= mediaTurma){
				contador++;
			}
		}

		System.out.printf("Quantidade de alunos com nota maior ou igual que a média da turma: %d", contador);

	}
}