package nivel3;

import java.util.Scanner;

public class Exercicio10 {

	Scanner read = new Scanner(System.in);
	
	public Exercicio10() {
		// TODO Auto-generated constructor stub
		
		/*
		 * 10. Dificuldade [3]
		 * Elabore um método que visa representar uma calculadora infinita.
		 *
		 * A calculadora deve cumprir os seguintes requisitos
		 *
		 * A Calculadora Infinita começa por pedir ao utilizador um número e uma operação
		 * Pede ao utilizador um número
		 * Pede ao utilizador uma operação
		 * '+' : soma os dois números
		 * '-' : subtrai o segundo ao primeiro número
		 * '*' : multiplica os dois números
		 * '/' : divide o primeiro número pelo segundo
		 * '0' : sai do programa
		 * Pede ao utilizador um número, sobre o qual afectará no resultado total 
		 * obtido na operação anterior
		 * Mostra na consola o resultado da operação
		 * O programa só termina quando for introduzido 0, por parte do utilizador
		 */
		
		float total = 0;
		int n = 0;
		char simb;
		
		System.out.println(" Calculadora Infinita:"
				+ "\nInsira um numero: ");
		total = read.nextInt();
		
		do{
			
			System.out.println("\nInsira um numero: ");
			n = read.nextInt();
			
			if(n != 0){
				System.out.println("Escolha uma operação. (+,-,*,/)");
				simb = read.next().charAt(0);
				
				switch(simb){
				
				case '+': 
					System.out.println(" " + total + " + " + n + " = " + (total+n));
					total+=n;
					break;
					
				case '-': 
					System.out.println(" " + total + " - " + n + " = " + (total-n));
					total-=n;
					break;
					
				case '*': 
					System.out.println(" " + total + " x " + n + " = " + (total*n));
					total*=n;
					break;
					
				case '/': 
					System.out.println(" " + total + " / " + n + " = " + (total/n));
					total/=n;
					break;
				}
			}
			else{
				System.out.println("\nVai Sair!");
			}
		}while(n != 0);
	}

}
