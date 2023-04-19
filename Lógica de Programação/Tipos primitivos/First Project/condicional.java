import java.util.Scanner;

public class condicional {
    
    public static void main(String[] args) {
        System.out.println("Cálculo de média de nota");
        try (Scanner input = new Scanner(System.in)){ 
        
            System.out.print("Digite a primeira nota: ");
            double nota1 = input.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = input.nextDouble();

            double media = (nota1 + nota2)/2.0;
            System.out.printf("Média do aluno: %.2f.", media );

            if (media >= 7){
                System.out.println("Aluno aprovado!");
            }
            else{
                System.out.println(" Aluno não aprovado");
            }

        }
    }
}
