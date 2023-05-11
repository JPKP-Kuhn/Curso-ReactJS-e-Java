package Logica_programacao.Listas;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void setSalario(double novoSalario){
        salario = novoSalario;
    }
}
