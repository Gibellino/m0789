package nivel1;

import java.util.Scanner;

public class Exercicio18 {

	/*
	 * 18. Dificuldade [1]
	 * 
	 * Indique o código em que:	
	 *
	 * Pede ao utilizador 1 número
	 * Mostra no ecrã se esse número é primo
	 *  
	 */
	
	public Exercicio18() {
		// TODO Auto-generated constructor stub
		
		Scanner read = new Scanner(System.in);
		
		Boolean ver = true;
		
		System.out.println("Insira um numero: ");
		int n = read.nextInt();
		
		for(int i=(n-1); i>1;i--){
			if((n%i) == 0){
				ver = false;
				break;
			}
			else{
				ver = true;
			}
		}
		
		if(ver == true){
			System.out.println("\nO numero " + n + " é primo!");
		}
		else{
			System.out.println("\nO numero " + n + " não é primo!");
		}
	}

}
