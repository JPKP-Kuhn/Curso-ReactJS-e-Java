public class variaveis {

    public static void main(String[] args){
        double preco = 20.0; //Recebe (atribui) o valor double 20.0
        System.out.printf("preço: %.2f%n", preco);
        preco += 0.90;
        System.out.printf("preço: %.2f%n", preco);
        preco -= 2.50;
        System.out.printf("preço: " + preco + "%n");
    }
    
}
