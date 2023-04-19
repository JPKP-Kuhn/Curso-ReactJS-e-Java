package Objetos.Exercicio;

public class Conta {

    private String nome;
    private double saldo;

    public Conta(String nomeInicial, double saldoInicial) {
        this.nome = nomeInicial;
        if(saldo >= 0){
            this.saldo = saldoInicial;
        }
        else{
            this.saldo = 0;
        }
    }
    public void setName(String nome) {
        this.nome = nome;
    }

    public String getName() {
        return nome;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double deposito(double deposito){
        if(deposito > 0){
            this.saldo += deposito;
        }
        return deposito;
    }

    public void saque(double saque) {
        if (this.saldo >= saque){
            this.saldo -= saque;
        } else {
            System.out.println("Valor de saque excede o saldo da conta");
        }
        if (saque < 0){
            System.out.println("Valor inapropriado");
        }
    }

    public static class Empregado {
        private String primeiroNome;
        private String ultimoNome;
        private double salarioMensal;

        public Empregado(String primeiroNome, String ultimoNome, double salarioMensal){

        }

    }
}
