package Logica_programacao.Listas.GradeBook;

public class GradeBook {

    private String curso;
    private double nota1;
    private double nota2;

    public GradeBook (String curso, double nota1, double nota2){
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public double getNota1(){
        return nota1;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double media(){
        return (nota1 + nota2)/2.0; 
    }

    
}
