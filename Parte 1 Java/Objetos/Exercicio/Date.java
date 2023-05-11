package Objetos.Exercicio;

public class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void displaydate(int dia, int mes, int ano){

        System.out.printf("Data %s/%s/%s %n",this.dia, this.mes, this.ano);
    }

}
