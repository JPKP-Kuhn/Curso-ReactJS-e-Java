package Objetos.obj;

public class Conta {
    private String name;

    private double saldo;
    //Entre () estão os parâmetros, os argumetos dos métodos/função da classe
    public void setName(String name){ //void, não precisa ter um retorno, deixa isso pro return
        this.name = name; //this pra indicar que é um atributo da classe
    }
    
    public String getName(){ //Método: Retorna como string
        return name;
    }

    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
