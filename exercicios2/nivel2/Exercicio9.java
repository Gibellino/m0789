package nivel2;

import java.util.Scanner;

public class Exercicio9 {

	/*
	 * 9. Dificuldade [2]
	 * 
	 * Elabore um m�todo que visa representar uma calculadora.
	 *
	 * A calculadora deve cumprir os seguintes requisitos
	 *
	 * Pede ao utilizador um n�mero 1
	 * Pede ao utilizador uma opera��o
	 * '+' : soma os dois n�meros
	 * '-' : subtrai o segundo ao primeiro n�mero
	 * '*' : multiplica os dois n�meros
	 * '/' : divide o primeiro n�mero pelo segundo
	 * '0' : sai do programa
	 * Pede ao utilizador um n�mero 2
	 * Mostra na consola o resultado da opera��o
	 * 
	 */
	
	
	public Exercicio9() {
		// TODO Auto-generated constructor stub
		
		Scanner read = new Scanner(System.in);
		
		int n,n2;
		char o;
		
		System.out.println("Insira um numero: ");
		n = read.nextInt();
		
		System.out.println("Insira um opera��o (+,-,*,/)");
		o = read.next().charAt(0);
		
		System.out.println("Insira um numero: ");
		n2 = read.nextInt();
		
		switch(o){
			
		case '+': System.out.println("\nA soma dos numeros � de: " + (n+n2)); break;
		case '-': System.out.println("\nA subtra��o dos numeros � de: " + (n-n2)); break;
		case '*': System.out.println("\nA multiplica��o dos numeros � de: " + (n*n2)); break;
		case '/': System.out.println("\nA divis�o dos numeros � de: " + (n/n2)); break;
		}
	}

}
