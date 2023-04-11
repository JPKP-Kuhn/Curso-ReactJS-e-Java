/*A public class must be place in a file that has a filename of the 
form Classname.java/ */
public class Main{
    // classe com funções aplicadas a ela
    // main method begins execution of Java applications
    public static void main(String[] args) { 
        //esse main é um método, uma funjção atrelada a classe main, o void é pra retornar algum valor, no caso o void não retorna nada, pode ser um valor double, por exemplo, o void não vai ter nenhum retorno. public: outra classe vai poder acessar a função main, dá pra acessar a classe Main e o método main. static: quem chama o método main da classe Main não precisa criar um objeto Main, pode chamar o método direto da classe, nos parêntese são os argumentos
        
        System.out.println("Hello world! Saper!"); //Acessa uma classe imbutida no java o System.out e acessa o método println que passa a string "Hello world" o parâmetro
        //Máquina virtual do Java, compila o código pra outro que é entendido pela máquina virtual Java

        System.out.print("Welcome \nto \nJava \nProgramming!"); // \n quebra de linha, print só mostra o que tá dentro, o ln no final do print é pra já pular uma linha no final do código

        //Operações com dados, aritméticas

        System.out.print(2 + 3);
        System.out.println(50 - 5*6);
        System.out.println(17 / 3); //divisão inteira, pois está com números inteiros
        System.out.println(17 / 3.0); //tem um double, faz a divisão real. float são pra variáveis do tipo float
        System.out.println((3 - 2) * 3);

        System.out.printf("resultado: %d%n", 17 / 3); //f de formatado. %d será substituído por um valor inteiro que tem posteriormente, o 5, o %n é a mesma ideia do \n, mas como tá formatado tem que ser %n
        System.out.printf("resultado1: %d, resultado2: %d%n", 17/3, 12/6);
        //Sem o printf teria que usar vários print em sequência

        System.out.printf("17/3 Com divisão interia: %d%n17/3 Com divisão real: %.2f%n", 17/3, 17/3.0); //agora p %f é double/float

        System.out.printf("12/2 Com divisão real: %.1f%n", 12.0/2);
    }
}