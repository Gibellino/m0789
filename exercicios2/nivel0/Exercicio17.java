package nivel0;

import java.util.Scanner;

public class Exercicio17 {

	/*
	 * 17. Dificuldade [0]
	 *
	 * Indique o c�digo em que:
	 *
	 * Pede ao utilizador 2 n�meros
	 * Mostra no ecr�
	 * Que n�mero � o maior
	 * A m�dia desses n�meros
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
			System.out.println("\nO numero " + n + " � o maior e a m�dia dos numeros � de " + (float)(n+n2)/2);
		}
		else if(n < n2){
			System.out.println("\nO numero " + n2 + " � o maior e a m�dia dos numeros � de " + (float)(n2+n)/2);
		}
		else{
			System.out.println("\nOs numeros s�o iguais e a m�dia dos numeros � de " + (float)(n+n2)/2);
		}
	}

}
