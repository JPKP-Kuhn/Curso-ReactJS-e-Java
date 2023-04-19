package Objetos.Obj;

public class Conta {
    private String name;
    private double saldo;

    public Conta(String nomeInicial, double saldoInicial){
        name = nomeInicial;

        if (saldoInicial > 0){
            saldo = saldoInicial;
        }
        else {
            saldo = 0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void saque(double valorSaque){
        this.saldo = saldo - valorSaque;
    }

    public void deposito(double valorDeposito){
        if (valorDeposito > 0){
            saldo = saldo + valorDeposito;
        }



    }

    public double getSaldo(){
        return saldo;
    }

}