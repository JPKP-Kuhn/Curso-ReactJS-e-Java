package Atividade.Aposta.Aposta;

public class Aposta {
    private double valorApostado;
    private double porcentagemGanho;
    private String jogo;

    public Aposta(double valorAposta, double porcentagemGanho, String jogo){
        this.valorApostado = valorAposta;
        this.porcentagemGanho = porcentagemGanho;
        this.jogo = jogo;
    }

    public double getValorAposta(){
        return valorApostado;
    }
}
