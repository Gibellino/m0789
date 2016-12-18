package exe2;

import java.util.Scanner;

public class Multa {

	public Multa() {
		// TODO Auto-generated constructor stub
		
		/*
		 * Fábio Antunes
		 * 
		 * Programa de multas:
		 * Pede ao utilizador a que velocidade o condutor ia e qual é a velocidade permitida
		 * Caso o condutor vá a mais velocidade que o permitido:
		 * Se for entre 1 km/h a 20 km/h a mais paga 200 €
		 * Se for entre 21 km/h a 30 km/h a mais paga 500 €
		 * Se for entre +81 km/h a mais paga 1000 €
		 */
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nInsira a velocidade em que o condutor vai: ");
		int kmC = read.nextInt();
		System.out.println("\nInsira a velocidade permitida: ");
		int kmP = read.nextInt();
		
		if(kmC < kmP){
			System.out.print("\nO condutor ia dentro da velocidade permitida!\n");
		}
		else if(kmC <= (kmP+20)){
			System.out.println("\nO Condutor ia " + (kmC-kmP) + 
					" km/h a mais que o permitido! Paga 200 €");
		}
		else if(kmC <= (kmP+30)){
			System.out.println("\nO Condutor ia " + (kmC-kmP) + 
					" km/h a mais que o permitido! Paga 500 €");
		}
		else{
			System.out.println("\nO Condutor ia " + (kmC-kmP) + 
					" km/h a mais que o permitido! Paga 1000 € e vai para a cadeia");
		}
	}

}
