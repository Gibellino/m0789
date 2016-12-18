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
		 * 1) Pedir um número N;
		 * 
		 * 2) Calcular e mostrar a média dos números entre 1 e N;
		 * 
		 * 3) Mostrar quais os números entre 1 e N são pares ou impares.
		 */
		
		int n;
		double media=0;
		
		System.out.println("Insira um número ");
		n = read.nextInt();
		
		System.out.println("\n");
		
		for(int i = 1; i<=n;i++){
			media+=i;
			if((i%2) == 0){
				System.out.println("O número " + i + " é par!");
			}
			else{
				System.out.println("O número " + i + " é impar!");
			}
		}
		
		System.out.println("\nA média dos números é " + (media/n));

	}

}
