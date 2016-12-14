package nivel3;

import java.util.Scanner;

public class Exercicio15 {

	Scanner read = new Scanner(System.in);
	
	public Exercicio15() {
		// TODO Auto-generated constructor stub
		
		/*
		 * 15. Dificuldade [3]
		 * 
		 * Na pastelaria Vila�a, pretende-se conhecer se o investimento na 
		 * nova receita de past�is de nata est� a resultar e em que dia se vende mais;
		 *
		 * Crie um programa que :
		 *
		 * Recebe o n�mero de past�is de nata vendidos - um por cada dia �til da semana;
		 * Ordene o array recebido do maior para o mais pequeno;
		 * Mostre no ecr� quantos pasteis de nata se vendem em m�dia por dia;
		 * Mostre no ecr� uma tabela ordenada do dia que se vendeu mais 
		 * para o dia que se vendeu menos
		*/
		
		String[] semana = new String[]{"Segunda-feira","Ter�a-feira","Quarta-feira","Quinta-feira","Sexta-feira"};
		
		int[] n = new int[5];
		float media = 0;
		
		for(int i=0; i<5; i++){
			System.out.println("Quantos past�is de nata foram vendidos na " + semana[i]);
			n[i] = read.nextInt();
			media+=(float)n[i];
		}
		
		for(int j=0; j<5; j++){
			for(int i=0; i<5; i++){
				if(i < 4){
					if(n[i] < n[i+1]){
						int num = n[i];
						n[i] = n[i+1];
						n[i+1] = num;
						String sem = semana[i];
						semana[i] = semana[i+1];
						semana[i+1] = sem;
						
					}
				}
			}
		}
		
		System.out.println("");
		
		for(int i=0; i<5; i++){
			System.out.println(" " + semana[i] + " - " + n[i] + " past�is de nata");
		}
		
		System.out.println("\nEm m�dia foram vendidos " + (media/5) + " past�is de nata");
		
	}

}
