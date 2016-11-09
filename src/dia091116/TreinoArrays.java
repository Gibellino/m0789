package dia091116;

import java.util.Random;

public class TreinoArrays {

	final int MAX = 10;
	
	Random r = new Random();
	
	public TreinoArrays() {

		// Porto - Benfica
	
		int[] porBen = {1, 1};
		
		int[] spoAro = {3, 0};
		
		int[] marBra = {1, 0};
		
		// Coluna, linha
		
		int[][] jogosG = new int[2][3]; 
		
		/*
		 * Atribuição de variaveis:
		 * 
		 * 	int[] portoBenfica = {1, 1};
		 * 
		 * 	ou
		 * 
		 *	for(int i=0;i<golos.length;i++){
		 *		int n = random();
		 *		golos[i] = n;
		 *	}
		*/
			
		/*
		 * Verificação do vencedor
		 * 
		 * if(golos[0] > golos[1]){
		 *	System.out.println("\nO Porto ganhou!");
		 * 	}
		 *	else 
		 *		if(golos[0] < golos[1]){
		 *			System.out.println("\nO Benfica ganhou!");
		 *		}
		 *	else{
		 *		System.out.println("\nEmpate!");
		 *	}
		*/
		
		// Atribuição de arrays multidimensionais
		
		jogosG[0][0] = porBen[0];
		jogosG[1][0] = porBen[1];
		
		jogosG[0][1] = spoAro[0];
		jogosG[1][1] = spoAro[1];
		
		jogosG[0][2] = marBra[0];
		jogosG[1][2] = marBra[1];
		
		System.out.println("\nPorto " + jogosG[0][0] + " - " + jogosG[1][0] + " Benfica");		
		
		System.out.println("\nSporting " + jogosG[0][1] + " - " + jogosG[1][1] + " Arouca");
		
		System.out.println("\nMaritimo " + jogosG[0][2] + " - " + jogosG[1][2] + " Braga");
	}
	
	public int random(){
	
		int n = r.nextInt(MAX);
		
		return n;
	}

}
