package nivel0;

public class Exercicio4 {

	
	/*
	 * 4. Dificuldade [0]
	 * 
	 * Indique o código que resolve o seguinte
	 *
	 * Declarar um array com valores 3, 5, 6, 1
	 * Crie um ciclo que soma os valores do array que criou
	 * Mostre na consola o valor da soma do array
	 * O valor da soma dos valores declarados no array é de: 15.
	 *  
	 */
	
	public Exercicio4() {
		// TODO Auto-generated constructor stub
		
		int[] n = new int[]{3,5,6,1};
		int soma=0;
		
		for(int i=0; i<n.length;i++){
			soma+=n[i];
		}
		
		System.out.println("O valor da soma dos valores declarados no array é de: " + soma);
	}

}
