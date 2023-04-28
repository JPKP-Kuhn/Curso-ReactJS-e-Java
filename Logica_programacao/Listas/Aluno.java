package Logica_programacao.Listas;

public class Aluno {
    
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNota1(double novaNota1){
        nota1 = novaNota1;
    }

    public void setNota2(double novaNota2){
        nota2 = novaNota2;
    }

    public double media(){
        return (nota1 + nota2)/2.0; 
    }


}
