package nivel1;

import java.util.Scanner;

public class Exercicio11 {

	Scanner read = new Scanner(System.in);
	
	public Exercicio11() {
		// TODO Auto-generated constructor stub
		
		/* 
		 * 11. Dificuldade [1]
		 *
		 *Média Curso
		 * Elabore um método devolve a média de um curso de curta duração composto por 5 módulos.
		 *
		 * Certifique-se que o seu programa cumpre os seguintes requisitos
		 *
		 * Declara um array do tipo double com a dimensão 5
		 * Pede ao utilizador as 5 notas que lhe foram atribuídas
		 * Cada nota é armazenada na respectiva posição do array
		 * Mostre na consola a média de curso obtida
		 * 
		 */
		
		double[] notas = new double[5];
		double media = 0;
		
		for(int i=0; i<5; i++){
			System.out.println("Insira a nota que obteve no módulo " + (i+1));
			notas[i] = read.nextDouble();
			media+=notas[i];
		}
		
		System.out.println("A média de curso é " + (media/5));
	}

}
