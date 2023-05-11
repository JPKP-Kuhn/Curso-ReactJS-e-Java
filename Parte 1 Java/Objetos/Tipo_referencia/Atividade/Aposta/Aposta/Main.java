package Atividade.Aposta.Aposta;

public class Main {
    public static void main(String[] args){
        Usuario user1 = new Usuario("João", "JPK", "myemail@gmail.com", 10);
        Usuario user2 = new Usuario("Pedro", "PJK", "anotheremail@gmail.com", 100);

        Aposta aposta1 = new Aposta(5,0.3, "AvaíXFigueira");

        Aposta aposta2 = new Aposta(3, 0.2, "Time1XTime2");

        System.out.printf("Saldo do user1: %.2f\n", user1.getSaldo());
        user1.fazAposta(aposta1);
        user2.fazAposta(aposta2);

        System.out.printf("Saldo do user1: %.2f\n", user1.getSaldo());
    }
}
