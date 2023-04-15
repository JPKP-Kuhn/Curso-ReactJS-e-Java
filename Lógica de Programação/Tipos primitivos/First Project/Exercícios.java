import java.util.Scanner;

public class Exercícios {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva um número de 1 a 7 para ver o exercício: ");
        switch (input.nextInt()){
            case 1 -> exercicio1(input);
            case 2 -> exercicio2(input);
            case 3 -> exercicio3(input);
            case 4 -> exercicio4(input);
            case 5 -> exercicio5(input);
            case 6 -> exercicio6(input);
            case 7 -> exercicio7(input);
            
        input.close();
    }


    private static void exercicio1(Scanner input) {
                
        System.out.println("João consegue terminar uma corrida com percurso de 1260 metros em 4 minutos. Faça um programa para mostrar a velocidade média de João em metros por segundo.");

        System.out.printf("Velocida média do João %.2f m/s ou %.2f km/h %n", 1260.0 / (4 * 60), 1260.0 / (4 * 60) * 3.6);

        //Mesmo exercício, mas com variáveis
        double metro = 1260.0;
        double tempo = 4.0 * 60;
        double velocidade = metro / tempo;

        System.out.printf("Velocidade média do João: %.2f m/s e %.2f km/h %n", velocidade, velocidade * 3.6);

    }

        
    private static void exercicio2(Scanner input) {
                
    System.out.println("Uma empresa corta barras de aço em pedaços de tamanhos iguais. Construa um programa em que o usuário digita o tamanho da barra de aço e o programa mostra o que sobra da barra de aço depois de cortá-la em pedaços de 5 metros até não ser mais possível.");
    System.out.print("Digite o comprimento da barra: ");
    double comprimento = input.nextDouble();
    System.out.printf("Os pedaços serão de: %.2f %n", comprimento % 5);
    }
            
    private static void exercicio3(Scanner input) {
                
            
        System.out.println("Escreva um programa para aumentar em 10% o salário do funcionário Carlos. O usuário deve digitar o salário do Carlos e o programa deve mostrar o novo salário e o valor do aumento em reais.");
        System.out.print("Qual o salário de Carlos:");
        double salario1 = input.nextDouble();
        System.out.print("Digite a porcentagem de aumento: ");
        double porcentagem = input.nextDouble()/100;
        double aumento = salario1 * (1+ porcentagem);
        System.out.printf("O salário agora é: R$%.2f aumentou R$%.2f %n.", aumento, aumento - salario1 );
    }

    private static void exercicio4(Scanner input) {
            
        
        System.out.println("Defina um programa que recebe um número inteiro e diz o módulo desse número. Por exemplo, o módulo de -5 é 5 e o módulo de 2 é 2.");
        System.out.print("Digite um número inteiro: ");
        int inteiro = input.nextInt();
        System.out.printf("O módulo do seu número é: %d%n", Math.abs(inteiro));
    }

    private static void exercicio5(Scanner input){

        System.out.print("Digite um número natural: ");
        int natural = input.nextInt();
        if (natural % 2 == 0){
                System.out.printf("Número %d é par %n", natural);
        }
        else {
            System.out.printf("Número %d é ímpar %n", natural);
        }
    }

    private static void exercicio6(Scanner input){
        System.out.println("Faça um programa que recebe o salário de um vendedor e o valor total das suas vendas. Se o salário for menor que R$ 1500,00 e valor das vendas for maior que R$ 2000,00, o programa deve aumentar o salário em 10% e mostrar o novo salário. Caso contrário, o programa deve informar que não teve aumento.");

        System.out.print("Digite o salário do vendedor: ");
        double sal = input.nextDouble();

        System.out.print("Valor das vendas: ");
        double vendas = input.nextDouble();

        if (sal < 1500 && vendas > 2000){
            System.out.printf("Novo salário: %.2f %n", sal*1.1);
        } else{
            System.out.println("Não teve aumento.");
        }
    }

    private static void exercicio7(Scanner input){
        System.out.println("Fazer um programa que diz o menor entre três números recebidos.");

        System.out.print("Digite o primeiro número: ");
        double n1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = input.nextDouble();

        // Math.min() pega o menor número
        if (n1 <= n2 && n1 <= n3){
            System.out.printf("O menor número foi %.2f, o primeiro %n", n1);
        } else if (n2 <= n1 && n2 <= n3){
            System.out.printf("O menor número foi %.2f, o segundo %n", n2);
        } else if (n3 <= n2 && n3 <= n1){
            System.out.printf("O menor número foi %.2f, o terceiro%n", n3);
        }


    }


    
}
