package nivel3;

import java.util.Scanner;

public class Exercicio10 {

	Scanner read = new Scanner(System.in);
	
	public Exercicio10() {
		// TODO Auto-generated constructor stub
		
		/*
		 * 10. Dificuldade [3]
		 * Elabore um m�todo que visa representar uma calculadora infinita.
		 *
		 * A calculadora deve cumprir os seguintes requisitos
		 *
		 * A Calculadora Infinita come�a por pedir ao utilizador um n�mero e uma opera��o
		 * Pede ao utilizador um n�mero
		 * Pede ao utilizador uma opera��o
		 * '+' : soma os dois n�meros
		 * '-' : subtrai o segundo ao primeiro n�mero
		 * '*' : multiplica os dois n�meros
		 * '/' : divide o primeiro n�mero pelo segundo
		 * '0' : sai do programa
		 * Pede ao utilizador um n�mero, sobre o qual afectar� no resultado total 
		 * obtido na opera��o anterior
		 * Mostra na consola o resultado da opera��o
		 * O programa s� termina quando for introduzido 0, por parte do utilizador
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
				System.out.println("Escolha uma opera��o. (+,-,*,/)");
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
