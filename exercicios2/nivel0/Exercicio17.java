package nivel0;

import java.util.Scanner;

public class Exercicio17 {

	/*
	 * 17. Dificuldade [0]
	 *
	 * Indique o código em que:
	 *
	 * Pede ao utilizador 2 números
	 * Mostra no ecrã
	 * Que número é o maior
	 * A média desses números
	 * 
	 */
	
	public Exercicio17() {
		// TODO Auto-generated constructor stub
		
		int n=0, n2=0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		n = read.nextInt();
		System.out.println("Insira outro numero: ");
		n2 = read.nextInt();
		
		if(n > n2){
			System.out.println("\nO numero " + n + " é o maior e a média dos numeros é de " + (float)(n+n2)/2);
		}
		else if(n < n2){
			System.out.println("\nO numero " + n2 + " é o maior e a média dos numeros é de " + (float)(n2+n)/2);
		}
		else{
			System.out.println("\nOs numeros são iguais e a média dos numeros é de " + (float)(n+n2)/2);
		}
	}

}
