package nivel1;

public class Exercicio13 {

	/*
	 * 13. Dificuldade [1]
	 * 
	 * Indique o c�digo em que:
	 *
	 * Declare 4 vari�veis do tipo inteiro correspondentes ao n�mero de golos que um dado avan�ado marcou em 4 jogos
	 * Inicialize as 4 vari�veis com valores a seu gosto
	 * Mostre na consola a m�dia de golos que esse avan�ado tem por jogo
	 * 
	 */
	
	public Exercicio13() {
		// TODO Auto-generated constructor stub
		
		int jogo1 = 5, jogo2 = 2, jogo3 = 4, jogo4 = 0;
		float media = (float)(jogo1 + jogo2 + jogo3 + jogo4);
		
		System.out.println("A media de golos de um jogador em 4 jogos foi de: " + (media/4));
	}

}
