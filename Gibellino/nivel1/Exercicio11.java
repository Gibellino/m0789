package nivel1;

import java.util.Scanner;

public class Exercicio11 {

	Scanner read = new Scanner(System.in);
	
	public Exercicio11() {
		// TODO Auto-generated constructor stub
		
		/* 
		 * 11. Dificuldade [1]
		 *
		 *M�dia Curso
		 * Elabore um m�todo devolve a m�dia de um curso de curta dura��o composto por 5 m�dulos.
		 *
		 * Certifique-se que o seu programa cumpre os seguintes requisitos
		 *
		 * Declara um array do tipo double com a dimens�o 5
		 * Pede ao utilizador as 5 notas que lhe foram atribu�das
		 * Cada nota � armazenada na respectiva posi��o do array
		 * Mostre na consola a m�dia de curso obtida
		 * 
		 */
		
		double[] notas = new double[5];
		double media = 0;
		
		for(int i=0; i<5; i++){
			System.out.println("Insira a nota que obteve no m�dulo " + (i+1));
			notas[i] = read.nextDouble();
			media+=notas[i];
		}
		
		System.out.println("A m�dia de curso � " + (media/5));
	}

}
