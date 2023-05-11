package Atividade.ContaPoupança.Objetos.Tipo_referencia.Atividade.ContaPoupança;

/*Defina uma classe ContaPoupanca com as características a seguir. Use um atributo de classe para armazenar a taxa de rendimento anual de todas as contas. Cada objeto da classe deve ter um atributo privado indicando a quantidade atual depositada. Forneça um método para calcular o rendimento mensal multiplicando o rendimento anual dividido por 12 pelo saldo e, em seguida, o rendimento deve ser incorporado no saldo. Forneça também um método estático para modificar a taxa de rendimento anual. 

Escreva um programa para testar sua classe: construa dois objetos da classe com saldos definidos por você. Defina uma taxa de rendimento anual de 4%. Calcule o rendimento mensal para cada um dos 12 meses e mostre os novos saldos para cada uma das poupanças. Em seguida, defina uma taxa de rendimento anual de 5%, e calcule o rendimento do próximo mês mostrando o novo saldo das duas poupanças. */

public class ContaPoupanca {
    private String nome;
    private static double taxaRendimentoAnual;
    private double quantidadeAtualDepositada;

    public ContaPoupanca(String nome, double quantidadeAtualDepositada){
        this.nome = nome;
        this.quantidadeAtualDepositada = quantidadeAtualDepositada;
    }

    public void rendimentoMensal(){
        quantidadeAtualDepositada += taxaRendimentoAnual/12.0 * quantidadeAtualDepositada;
    }

    public static void  mudaTaxadeRendimentoAnual(double novaTaxadeRendimntoAnual){
        taxaRendimentoAnual = novaTaxadeRendimntoAnual;
    }

    public double getQuantidadeAtualDepositada(){
        return quantidadeAtualDepositada;
    }
}
