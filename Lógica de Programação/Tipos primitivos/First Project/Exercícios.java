import java.util.Scanner;

public class Exercícios {
    public static void main(String[] args) { 
        //Ex 1
        System.out.println("João consegue terminar uma corrida com percurso de 1260 metros em 4 minutos. Faça um programa para mostrar a velocidade média de João em metros por segundo.");

        System.out.printf("Velocida média do João %.2f m/s ou %.2f km/h %n", 1260.0 / (4 * 60), 1260.0 / (4 * 60) * 3.6);

        //Mesmo exercício, mas com variáveis
        double metro = 1260.0;
        double tempo = 4.0 * 60;
        double velocidade = metro / tempo;

        System.out.printf("Velocidade média do João: %.2f m/s e %.2f km/h %n", velocidade, velocidade * 3.6);


        //Ex 2 
        Scanner input = new Scanner(System.in);
        System.out.println("Uma empresa corta barras de aço em pedaços de tamanhos iguais. Construa um programa em que o usuário digita o tamanho da barra de aço e o programa mostra o que sobra da barra de aço depois de cortá-la em pedaços de 5 metros até não ser mais possível.");
        System.out.print("Digite o comprimento da barra: ");
        double comprimento = input.nextDouble();
        System.out.printf("Os pedaços serão de: %.2f %n", comprimento % 5);

    }
    
}
