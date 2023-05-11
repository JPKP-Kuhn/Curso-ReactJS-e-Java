package Atividade.ContaPoupança.Objetos.Tipo_referencia.Atividade.ContaPoupança;

public class Main {
    public static void main(String[] args){
        ContaPoupanca conta1 = new ContaPoupanca("João", 0);
        ContaPoupanca conta2 = new ContaPoupanca("Pedro", 10);

        ContaPoupanca.mudaTaxadeRendimentoAnual(0.04);

        for(int i = 0; i<12; i++){
            conta1.rendimentoMensal();
            conta2.rendimentoMensal();
        }

        System.out.printf("Novo saldo da conta 1: %.2f\n", conta1.getQuantidadeAtualDepositada());
        System.out.printf("Novo saldo da conta 2: %.2f\n", conta2.getQuantidadeAtualDepositada());

        ContaPoupanca.mudaTaxadeRendimentoAnual(0.05);
        conta1.rendimentoMensal();
        conta2.rendimentoMensal();

        System.out.printf("Novo saldo da conta 1: %.2f\n", conta1.getQuantidadeAtualDepositada());
        System.out.printf("Novo saldo da conta 2: %.2f\n", conta2.getQuantidadeAtualDepositada());

    }
}
