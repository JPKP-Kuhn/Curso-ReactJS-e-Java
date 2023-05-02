package Logica_programacao.Listas.GradeBook;
import java.util.Arrays;
import java.util.Scanner;

public class ShowGradeBook {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o curso: ");
        String curso = input.nextLine();
        double nota1 = 0;
        double nota2 = 0;

        System.out.print("Digite a quantidade de alunos na turma: ");
        int quantidadeAlunos = input.nextInt();

        GradeBook[] relatorio = new GradeBook[quantidadeAlunos];
        int[] distribuicao = new int[10];

        double maiorNota = 0;
        double menorNota = 10;
        for (int i=0; i < relatorio.length; i++){
            System.out.printf("Digite a primeira nota do %d aluno: ", i+1);
            double valor = input.nextDouble();
            while (valor < 0){
                System.out.println("Nota inválida");
                System.out.printf("Digite a primeira nota do %d aluno: ", i+1);
                valor = input.nextDouble();
            }
            nota1 = valor;
            System.out.printf("Digite a segunda nota do %d aluno: ", i+1);
            valor = input.nextDouble();
            while (valor < 0){
                System.out.println("Nota inválida");
                System.out.printf("Digite a segunda nota do %d aluno: ", i+1);
                valor = input.nextDouble();
            }
            nota2 = valor;
            
            if (nota1 < menorNota){
                menorNota = nota1;
            }
            if (nota2 < menorNota){
                menorNota = nota2;
            }
            if (nota1 > maiorNota){
                maiorNota = nota1;
            }
            if (nota2 > maiorNota){
                maiorNota = nota2;
            }

            relatorio[i] = new GradeBook(curso, nota1, nota2);

            distribuicao[(int) Math.round(relatorio[i].media())]++;
        }

        //Tabela Relatório
        System.out.printf("\nRelatório do curso %s \n", curso);
        System.out.println("Aluno  Nota1  Nota2  Media");
        double somaMedias = 0;
        for (int i=0; i < relatorio.length; i++){
            
            System.out.printf("  %d    %.2f   %.2f    %.2f\n", i+1, relatorio[i].getNota1(), relatorio[i].getNota2(), relatorio[i].media());
            somaMedias += relatorio[i].media();
        }
        System.out.printf("Média geral da turma: %.2f \n", somaMedias/quantidadeAlunos );
        System.out.printf("Maior nota: %.2f \n Menor nota: %.2f \n", maiorNota, menorNota);
        System.out.println("Intervalo das médias: [0.0, 1.0[, [1.0, 2.0[, [2.0, 3.0[, [3.0, 4.0[, [4.0, 5.0[, [5.0, 6.0[, [6.0, 7.0[, [7.0, 8.0[, [8.0, 9.0[, [9.0, 10.0].");
        System.out.println(Arrays.toString(distribuicao));

    }
}
