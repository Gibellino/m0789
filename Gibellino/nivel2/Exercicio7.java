package nivel2;

import java.util.Scanner;

public class Exercicio7 {

	Scanner read = new Scanner(System.in);
	
	public Exercicio7() {
		// TODO Auto-generated constructor stub
	
		/*
		 * 7. Dificuldade [2]
		 * 
		 * Uma equipa de Formula 1 quer comparar os tempos de volta dos seus três pilotos.
		 *
		 * Indique o código em que:
		 *
		 * Pede os tempos de volta de cada um dos pilotos
		 * Compara os três tempos e indica qual dos 3 foi o mais rápido
		 * Qual dos 3 é desclassificado
		 * Mostra na consola
		 * Qual dos três pilotos foi o mais rápido
		 * Que piloto ficou desclassificado, com o pior tempo
		 * A soma dos 3 tempos
		 * 
		 */
		
		double[] tempo = new double[3];
		double soma= 0;
		
		for(int i=0; i<3; i++){
			System.out.println("Insira o tempo do piloto " + (i+1));
			tempo[i] = read.nextDouble();
			soma+=tempo[i];
		}
		
		double rapido = tempo[0], lento = tempo[0];
		int pilotoR = 0, pilotoL = 0;
		
		for(int i=0;i<3;i++){
			if(rapido > tempo[i]){
				rapido = tempo[i];
				pilotoR = i;
			}
			if(lento < tempo[i]){
				lento = tempo[i];
				pilotoL = i;
			}
		}
		
		System.out.println("\n O tempo mais rápido foi do piloto " + pilotoR + " de " + rapido);
		System.out.println(" O tempo mais lento foi do piloto " + pilotoL + " de " + lento);
		System.out.println(" A soma dos tempos é de " + soma);
	}

}
