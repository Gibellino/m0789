package nivel3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {

	Random r = new Random();
	Scanner read = new Scanner(System.in);
	
	public int r(){
		return r.nextInt((10-0)+1)+0;
	}
	
	public Exercicio8() {
		// TODO Auto-generated constructor stub
		
		/* 
		 * 8. Dificuldade [3]
		 * 
		 * Sabendo � partida que o c�digo que gera um c�digo aleat�rio � o seguinte
		 *
		 * Random rand = new Random(); 
		 * Exemplo atribui � vari�vel numAleatorio um n�mero aleat�rio entre 0 e 19. 
		 * int numAleatorio = rand.nextInt(20);
		 * Crie um m�todo com as instru��es necess�rias para:
		 * O utilizador jogar um jogo tipo Sobe e Desce.
		 * Mostra um n�mero ao utilizador
		 * O utilizador introduz 'c' para indicar que o pr�ximo n�mero ser� maior que o mostrado
		 * O utilizador introduz 'b' para indicar que o pr�ximo n�mero ser� menor que o mostrado
		 * Quando o jogador perder, mostra no ecr� quantas vezes acertou
		*/
		
		int n = 0, ac = 0;
		char op;
		int ran = r();
		
		do{

			System.out.println("\nN�mero: " + ran
					+ "\n\nO pr�ximo n�mero � maior ou menor que este? (c/b)");
			op = read.next().charAt(0);
			
			int rand;
			
			do{
				rand = r();
			}while(ran == rand);
			
			switch(op){
			case 'c':
				if(ran < rand){
					System.out.println("\nParabens! Acertou");
					ac++;
					n = 1;
				}
				else{
					System.out.println("\nErrou o numero era mais baixo!");
					n = 0;
				} break;
				
			case 'b':
				if(ran > rand){
					System.out.println("\nParabens! Acertou");
					ac++;
					n = 1;
				}
				else{
					System.out.println("\nErrou o numero era mais alto!");
					n = 0;
				} break;
				
			default: System.out.println("\nOp��o Inv�lida!");
			}
			
		ran = rand;
			
		}while(n != 0);
		
		System.out.println("\nAcertou " + ac + " vezes!");
	}

}
