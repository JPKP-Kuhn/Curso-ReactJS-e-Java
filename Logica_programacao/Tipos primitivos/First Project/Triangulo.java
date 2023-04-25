import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args){
        System.out.println("Formar um triângulo, informando seus lados");
        Scanner input = new Scanner(System.in);

        System.out.print("Lado a: ");
        int a = input.nextInt();

        System.out.print("Lado b: ");
        int b = input.nextInt();

        System.out.print("Lado c: ");
        int c = input.nextInt();

        if (a < b + c && b < a + c && c < b + a){
            System.out.println("Parabéns, você tem um triângulo");
            if (a == b && a == c){
                System.out.println("Triângulo equilátero");
            } else if (a == b ^ a == c) {
                System.out.println("Triângulo isóceles");
            } else if (a != b && a != c && b != c) { //pode ser só um else
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Que pena, o seu triângulo não fecha");
        }
    }
}
