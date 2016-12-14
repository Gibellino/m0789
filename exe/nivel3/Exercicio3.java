package nivel3;

import java.util.Random;

public class Exercicio3 {

	Random r = new Random();
	
	public int r(){
		return r.nextInt((9-1)+1)+1;
	}
	
	public Exercicio3() {
		// TODO Auto-generated constructor stub
		
		/*	
		 * 	3. Dificuldade [3]
		 * 
		 *	Sabendo � partida que o c�digo que gera um c�digo aleat�rio � o seguinte:
		 *	Random rand = new Random(); 
		 *
		 *	(Exemplo atribui � vari�vel numAleatorio um n�mero aleat�rio entre 0 e 19.) 
		 *
		 *	int numAleatorio = rand.nextInt(20);
		 *	
		 *	Crie um array com 20 espa�os
		 *
		 *	Crie um array com 20 espa�os
		 *	Preencha-o com n�meros aleat�rios entre 1 a 9
		 *	Mostre na consola quantas vezes cada n�mero (1-9) se repete.
		 *
		 *	N�mero de repeti��es: 1 - 2x 2 - 3x 3 - 2x 4 - 5x 5 - 1x 6 - 2x 7 - 1x 8 - 3x 9 - 1x
		 */	
		
		int[] n = new int[20];
		int[] soma = new int[9];
		
		for(int i=0;i<20;i++){
			n[i] = r();
			if(i<9){
				soma[i] = 0;
			}
		}
		
		for(int i=0;i<20;i++){
			System.out.println(n[i]);
			switch(n[i]){
				case 1: soma[0]++; break;
				case 2: soma[1]++; break;
				case 3: soma[2]++; break;
				case 4: soma[3]++; break;
				case 5: soma[4]++; break;
				case 6: soma[5]++; break;
				case 7: soma[6]++; break;
				case 8: soma[7]++; break;
				case 9: soma[8]++; break;
			}
		}
		
		System.out.println("");
		
		for(int i=0;i<9;i++){
			System.out.println(" " + (i+1) + " ( " + soma[i] + "x )");
		}
}

}
