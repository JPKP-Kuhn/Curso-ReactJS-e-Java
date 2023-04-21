public class TipoReferencia{
    public static void main (String[] args){
        int numero = 1;
        int numero2 = numero;
        numero = 2;
        System.out.printf("Primeiro número %d%n", numero);
        System.out.printf("Segundo número %d%n", numero2);

        Conta myAccount = new Conta();
        myAccount.setName("Java");
        Conta myAccount2 = myAccount; //tipo referência
        myAccount.setName("João");
        System.out.printf("Nome em myAccount: %s%n", myAccount.getName());
        System.out.printf("Nome em myAccount2: %s%n", myAccount2.getName());

    }
}