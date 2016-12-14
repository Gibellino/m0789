package nivel3;

import java.util.Scanner;

public class Exercicio19 {

	Scanner read = new Scanner(System.in);
	
	public Exercicio19() {
		// TODO Auto-generated constructor stub
		
		/* 19. Dificuldade [3]
		 *	
		 * Crie um programa que indique o factorial de um número
		 *
		 * // n! = n x (n-1) x (n-2) ... x 1; 5! = 5 X 4 X 3 X 2 X 1; // 5! = 120
		 * Resolva este exercícios com dois métodos
		 * Recorrendo a um ciclo for
		 * Recorrendo a uma função recursiva
		 */
		
		System.out.println("Insira um numero: ");
		int n = read.nextInt();
		int fat = 1;
		
		System.out.print(" " + n + "! = ");
		
		for(int i=n;i>0;i--){
			fat*=i;
			if(i>1){
			System.out.print(i + " x ");
			}
			else{
				System.out.print(i + " = ");
			}
		}
		
		System.out.print(fat);
	}

}
