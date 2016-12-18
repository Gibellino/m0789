package nivel1;

import java.util.Scanner;

public class Exercicio5 {

	/*
	 * 5. Dificuldade [1]
	 * Indique o código em que:
	 *
	 * Vai pedindo números a um utilizador
	 * Soma cada valor recebido
	 * Interrompe quando o utilizador introduz o número 0
	 * Mostra no ecrã a soma de todos os números introduzidos
	 * 
	 */
	
	public Exercicio5() {
		// TODO Auto-generated constructor stub
		
		Scanner read = new Scanner(System.in);
		
		int soma = 0, n= 0;
		
		do{
			System.out.println("Insira um numero: ");
			n = read.nextInt();
			
			if(n != 0){
				soma+=n;
			}
			else{
				break;
			}
		}while(true);
		
		System.out.println("\nA soma dos valor inseridos é de: " + soma);
	}

}
