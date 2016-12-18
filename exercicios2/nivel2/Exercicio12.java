package nivel2;

import java.util.Random;

public class Exercicio12 {

	Random r = new Random();
	
	/*
	 * 12. Dificuldade [2]
	 *
	 * Indique o código em que:
	 *
	 * Declare um array de inteiros, com dimensão de 10
	 * Inicialize esse array com valores entre 0 e 20
	 * Percorra esse array e, por cada valor igual ou superior a 10, some ao número de positivas na turma
	 * Mostre na consola o nr. de positivas na turma
	 * 
	 */
	
	public int rand(){
		
		int ran = r.nextInt(((20-0)+1))+0;
		
		return ran;
	}
	
	public Exercicio12() {
		// TODO Auto-generated constructor stub
		
		int[] notas = new int[10];
		int soma=0;
		
		for(int i=0;i<10;i++){
			
			notas[i] = rand();
			
			System.out.println("Nota " + (i+1) + " - " + notas[i]);
			
			if(notas[i] >= 10){
				soma++;
			}
		}
		
		System.out.println("\nHouve " + soma + " positivas!");
	}

}
