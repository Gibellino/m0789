package exe2;

import java.util.Scanner;

public class ArrayPhone {

	Scanner read = new Scanner(System.in);
	
	int[] tlm;
	String[] nome;
	
	public void insert(int n){
		
		tlm = new int[n];
		nome = new String[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Insira o nome da pessoa " + (i+1) + ": ");
			nome[i] = read.nextLine();
			System.out.println("Insira o numero de telefone de " + nome[i] + ": ");
			tlm[i] = read.nextInt();
		}
	}
	
	public void search(int n, String nome2){
		
		int ver = 0;
		
		for(int i=0;i<n;i++){
			if(nome2 == nome[i]){
				ver = 1;
			}
			else{
				ver = 2;
			}
			if(ver == 1){
				System.out.println("\nO numero de telefone de " + nome[i] + " é " + tlm[i] + ".");
			}
			else{
				continue;
			}
		}
		if(ver == 2){
			System.out.println("\nPessoa não inserida!");
		}
	}
	
	public ArrayPhone() {
		// TODO Auto-generated constructor stub
		
		/*
		 * Fábio Antunes
		 * 
		 * Faça um programa de consulta de telefones a partir de um nome inserido pelo utilizador: 
		 * Que primeiro seja inserido o nome e telefone de quantas pessoas o utilizador insere
		 * Em seguida pergunte ao usuário qual o nome que ele deseja consultar o telefone. 
		 * Após sua resposta, exiba o telefone da pessoa procurada.
		 * Informe também se o nome é inexistente no banco de dados
		 */
		
		int op = 0, n = 0;
		
		do{
			
		System.out.println(" Menu:\n"
				+ "1- Inserir pessoas;\n"
				+ "2- Pesquisar pessoas;\n"
				+ "0- Sair;\n");
		System.out.println("Insira a opção que quer: ");
		op = read.nextInt();
		
		switch(op){
		case 1: 
			System.out.println("\nQuantas pessoas que inserir? ");
			n = read.nextInt();
			insert(n);
			break;
		
		case 2:
			System.out.println("\nInsira o nome da pessoa que quer: ");
			String nome = read.nextLine();
			search(n,nome);
			break;
			
		case 0: System.out.print("\nVai Sair!\n"); break;
		
		default: System.out.print("\nOpção Inválida!\n");
		}
	}while(op != 0);
}

}
