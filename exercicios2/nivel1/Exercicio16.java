package nivel1;

import java.util.Scanner;

public class Exercicio16 {

	/*
	 * 16. Dificuldade [1]
	 * 
	 * Indique o código em que:
	 *
	 * Um utilizador introduz uma mensagem
	 * A mensagem é mostrada na consola repetida 5x
	 * Deve utilizar 2 Metodos.
	 * Ler a mensagem
	 * Imprimir a mensagem 
	 * 
	 */

	Scanner read = new Scanner(System.in);
	
	String msg;
	
	public void ler(){
		
		System.out.println("Insira uma mensagem: ");
		msg = read.nextLine();
	}
	
	public void print(){
		
		for(int i=0;i<5;i++){
			System.out.println(msg);
		}
	}
	
	public Exercicio16() {
		// TODO Auto-generated constructor stub
		
		ler();
		System.out.println("");
		print();
	}

}
