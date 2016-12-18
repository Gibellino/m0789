package nivel1;

import java.util.Scanner;

public class Exercicio1 {

	/*
	 * 1. Dificuldade [1]
	 * 
	 * Indique o código em que:
	 * 	É pedido ao utilizador 5 valores entre 1 a 100 ao utilizador entre 1 e 100;
	 * 	Os valores são gravados num array;
	 * 	Através de um ciclo, determine qual é o maior valor e o menor.
	 * 
	 */
	
	public Exercicio1() {
		// TODO Auto-generated constructor stub
		
		Scanner read = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++){
			System.out.println("Insira um numero de 1 a 100: " + i);
			arr[i] = read.nextInt();
			
			if(arr[i] >= 1 && arr[i] <= 100){
				continue;
			}
			else{
				i--;
			}
		}
		
		int maior = 0, menor = arr[0];
		
		for(int i=0;i<5;i++){
			if(maior < arr[i]){
				maior = arr[i];
			}
			
			if(menor > arr[i]){
				menor = arr[i];
			}
		}
		
		System.out.println("\nO maior numero é " + maior);
		System.out.println("O menor numero é " + menor);
	}

}
