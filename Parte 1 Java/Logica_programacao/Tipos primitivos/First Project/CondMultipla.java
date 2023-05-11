import java.util.Scanner;

public class CondMultipla {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número");
        int n = input.nextInt();

        switch (n) {
            case 1 -> System.out.println("Você digitou o 1");
            case 2 -> System.out.println("Você digitou o 2");
            default -> System.out.println("Você não figitou número 1, nem o 2");
        }

        System.out.print("Digite o preço do produto: ");
        double preco = input.nextInt();
        System.out.println("1 -- Dinheiro desconto 10%");
        System.out.println("2 -- cartão desconto 5%");
        System.out.println("3 --parcelado duas vezes preço original");
        System.out.println("4 -- três vezes juros de 5%");
        System.out.print("Digite a opção de pagamento: ");
        int opcao = input.nextInt();

        switch (opcao){
            case 1 -> System.out.printf("Desconto de 10%%, %.2f %n", preco * 0.9);
            case 2 -> System.out.printf("Desconto de 5%%, %.2f %n", preco * 0.95);
            case 3 -> System.out.printf("Preço original, %.2f %n", preco);
            case 4 -> System.out.printf("Juros de 5%%, %.2f %n", preco * 1.05);
            default -> System.out.println("Opção inválida");
        }
    }
}
