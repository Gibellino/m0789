package nivel1;

public class Exercicio13 {

	/*
	 * 13. Dificuldade [1]
	 * 
	 * Indique o código em que:
	 *
	 * Declare 4 variáveis do tipo inteiro correspondentes ao número de golos que um dado avançado marcou em 4 jogos
	 * Inicialize as 4 variáveis com valores a seu gosto
	 * Mostre na consola a média de golos que esse avançado tem por jogo
	 * 
	 */
	
	public Exercicio13() {
		// TODO Auto-generated constructor stub
		
		int jogo1 = 5, jogo2 = 2, jogo3 = 4, jogo4 = 0;
		float media = (float)(jogo1 + jogo2 + jogo3 + jogo4);
		
		System.out.println("A media de golos de um jogador em 4 jogos foi de: " + (media/4));
	}

}
