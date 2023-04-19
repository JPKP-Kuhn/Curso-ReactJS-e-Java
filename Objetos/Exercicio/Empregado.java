package Objetos.Exercicio;

public class Empregado {
    private String primeiroNome;
    private String ultimoNome;
    private double salarioMensal;

    public Empregado(String primeiroNome, String ultimoNome, double salarioMensal){
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.salarioMensal = salarioMensal;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0){
            this.salarioMensal = salarioMensal;
        }
    }
}
