package dia091116;

public class ExeArray {

	public ExeArray() {

		// Declarar um array com valores 2, 5, 4
		
		int[] pSoma = {2, 5, 4};
		int soma = 0;
		
		// Recorrer a um ciclo para somar os valores
		
		for(int i=0; i < pSoma.length;i++){
			soma+=pSoma[i];
		}
		
		// Mostrar a soma obtida
		
		System.out.println("O resultado da soma e " + soma);
	}

}
