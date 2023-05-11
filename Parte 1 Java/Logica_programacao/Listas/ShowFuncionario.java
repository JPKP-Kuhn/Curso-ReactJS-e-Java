package Logica_programacao.Listas;

public class ShowFuncionario {
    public static void  main(String[] args){
        Funcionario chefe = new Funcionario("José", 10000.00,"Chefe");
        int numeroMaximoFuncionarios = 5;

        Funcionario[] funcionariosEmpresa = new Funcionario[numeroMaximoFuncionarios];

        funcionariosEmpresa[0] = chefe;
        funcionariosEmpresa[0].setSalario(12000.00);

    }
    

}
