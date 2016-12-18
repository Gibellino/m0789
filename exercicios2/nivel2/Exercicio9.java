package nivel2;

import java.util.Scanner;

public class Exercicio9 {

	/*
	 * 9. Dificuldade [2]
	 * 
	 * Elabore um método que visa representar uma calculadora.
	 *
	 * A calculadora deve cumprir os seguintes requisitos
	 *
	 * Pede ao utilizador um número 1
	 * Pede ao utilizador uma operação
	 * '+' : soma os dois números
	 * '-' : subtrai o segundo ao primeiro número
	 * '*' : multiplica os dois números
	 * '/' : divide o primeiro número pelo segundo
	 * '0' : sai do programa
	 * Pede ao utilizador um número 2
	 * Mostra na consola o resultado da operação
	 * 
	 */
	
	
	public Exercicio9() {
		// TODO Auto-generated constructor stub
		
		Scanner read = new Scanner(System.in);
		
		int n,n2;
		char o;
		
		System.out.println("Insira um numero: ");
		n = read.nextInt();
		
		System.out.println("Insira um operação (+,-,*,/)");
		o = read.next().charAt(0);
		
		System.out.println("Insira um numero: ");
		n2 = read.nextInt();
		
		switch(o){
			
		case '+': System.out.println("\nA soma dos numeros é de: " + (n+n2)); break;
		case '-': System.out.println("\nA subtração dos numeros é de: " + (n-n2)); break;
		case '*': System.out.println("\nA multiplicação dos numeros é de: " + (n*n2)); break;
		case '/': System.out.println("\nA divisão dos numeros é de: " + (n/n2)); break;
		}
	}

}
