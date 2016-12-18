package nivel1;

public class Exercicio14 {

	/*
	 * 
	 * 14. Dificuldade [1]
	 * 
	 * Indique o código em que:
	 *
	 * Declare um array de inteiros com os valores 5, 2 e 7
	 * Declare a variável produto
	 * Com um ciclo 'for', obtenha o valor de 5*2*7 e armazene esse valor na variável produto
	 * Mostre no ecrã o resultado de 'produto'
	 * 
	 */
	
	public Exercicio14() {
		// TODO Auto-generated constructor stub
		
		int[] n = new int[]{5,2,7};
		int produto = 1;
		
		for(int i=0; i<n.length; i++){
			produto *= n[i];
		}
		
		System.out.println("O produto da multiplicação dos numeros é de: " + produto);
	}

}
