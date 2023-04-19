import java.util.Scanner;

public class MenorInserido
{
	public static void main (String[] args)
	{
		try (Scanner entrada = new Scanner(System.in)) {
            int cont;
            int numero;
            int menor;
            
            System.out.println("Digite a quantidade de números a serem digitados: ");
            int digitados = entrada.nextInt();
            
            System.out.printf("Quantidade de números a digitar: %d\n\n",digitados);
            
            System.out.print("Digite um número: ");
            menor = entrada.nextInt();
            
            //Laço FOR para contar a quantidade de valores digitados
            for( cont = 1 ; cont <= digitados ; cont++ )
            {
            	
            	System.out.print("Digite outro número: ");
            	numero = entrada.nextInt();
                
                if( numero < menor )
            {
            	menor = numero;
            		
            }
            	
            	
            }
            
            
            System.out.printf("O menor número digitado foi: %d\n",menor);
        }	
		
		
	}
	
}