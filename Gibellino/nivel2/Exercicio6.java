package nivel2;

import java.util.Scanner;

public class Exercicio6 {

	Scanner read = new Scanner(System.in);
	
	public Exercicio6() {
		// TODO Auto-generated constructor stub
		
		/*
		 * 6. Dificuldade [2]
		 * 
		 * Declare duas variaveis do tipo inteiro
		 * Peça ao utilizador para introduzir dois números diferentes
		 * Mostre todos os números pares entre os números introduzidos
		*/
		
		System.out.print("Insira um numero: ");
		int n = read.nextInt();
		
		System.out.print("Insira outro numero: ");
		int n2 = read.nextInt();
		
		System.out.print("\nNúmeros pares:\n");
		
		if(n > n2){
			for(int i=n2;i<=n;i++){
				if((i%2) == 0){
					System.out.println(" " + i);
				}
			}
		}else if(n < n2){
			for(int i=n;i<=n2;i++){
				if((i%2) == 0){
					System.out.println(" " + i);
				}
			}
		}else{
			if((n%2) == 0){
				System.out.println(" " + n);
			}
			else{
				System.out.println("\n Não há!");
			}
		}
	}

}
