package brunogibellino;

import java.util.Scanner;

public class Exe3 {

	public Exe3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		/*
		 * Desafio nivel 1
		 * 
		 * 1) Pedir um n�mero N;
		 * 
		 * 2) Calcular e mostrar a m�dia dos n�meros entre 1 e N;
		 * 
		 * 3) Mostrar quais os n�meros entre 1 e N s�o pares ou impares.
		 */
		
		int n;
		double media=0;
		
		System.out.println("Insira um n�mero ");
		n = read.nextInt();
		
		System.out.println("\n");
		
		for(int i = 1; i<=n;i++){
			media+=i;
			if((i%2) == 0){
				System.out.println("O n�mero " + i + " � par!");
			}
			else{
				System.out.println("O n�mero " + i + " � impar!");
			}
		}
		
		System.out.println("\nA m�dia dos n�meros � " + (media/n));

	}

}
