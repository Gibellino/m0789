package nivel1;

import java.util.Scanner;

public class Exercicio20 {

	/*
	 * 20. SDificuldade [1]
	 * 
	 * Crie um programa que
	 *	
	 * Pede ao utilizador que idade tem
	 * Mostra na consola em que ano nasceu
	 * Pede ao utilizador um ano futuro
	 * Mostra ao utilizador que idade terá nesse ano
	 * 
	 */
	
	public Exercicio20() {
		// TODO Auto-generated constructor stub
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira a sua idade: ");
		int idd = read.nextInt();
		
		System.out.println("Nasceu em " + (2016-idd));
		
		System.out.println("\nInsira um ano futuro: ");
		int ano = read.nextInt();
		
		System.out.println("\nEm " + ano + " terá " + (ano - (2016-idd)) + " anos.");
	}

}
