import java.util.Scanner;
public class equacao {
    public static void main(String[] args) {
        System.out.println("Cálculo de Equação do 2º Grau. aX² + bX + c = 0");

        Scanner ler = new Scanner (System.in);

        System.out.print("a: ");
        double a = ler.nextDouble();

        System.out.print("b: ");
        double b = ler.nextDouble();

        System.out.print("c: ");
        double c = ler.nextDouble();

        System.out.printf("(%.2f)X² + (%.2f)X + (%.2f) = 0 %n", a ,b, c);

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("Delta é %.2f%n", delta);

        if(delta < 0){
            System.out.println("Solução não pertence aos reais");
        } else {
            double x1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
            double x2 = (-b - Math.pow(delta, 0.5)) / 2 * a;

            System.out.printf("Solução {X1 = %.2f ; X2 = %.2f} %n", x1, x2);
            ler.close();
        }
        
    }

}
