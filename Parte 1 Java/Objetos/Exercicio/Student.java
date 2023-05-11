package Objetos.Exercicio;

public class Student{
    private String nome = "";
    private double media = 0;

    public Student(String nome, double media){
        this.nome = nome;
        if (media >= 0 && media <= 100){
            this.media = media;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public double setMedia(double media) {
        if (media >= 0 && media <= 100){
            this.media = media;
        }
        return this.media;
    }

    public void conceito(double media){ //poderia retornar um char, pra cada id return 'char'
        double conceito = setMedia(media);
        if(conceito >= 90){
            System.out.printf("A, nota %.2f %n", conceito);
        } else if (conceito >= 80){
            System.out.printf("B, nota %.2f %n", conceito);
        } else if (conceito >= 70){
            System.out.printf("C, nota %.2f %n", conceito);
        } else if (conceito >= 60){
            System.out.printf("D, nota %.2f %n", conceito);
        } else if (conceito >= 50){
            System.out.printf("E, nota %.2f %n", conceito);
        } else {
            System.out.printf("F, nota %.2f %n", conceito);
        }
    }
}