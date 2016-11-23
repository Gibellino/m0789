package stand;

import java.util.Scanner;

public class Stand {

	static Scanner read = new Scanner(System.in);
	
	static Admin admin = new Admin();
	
	public Stand() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int op;
		
		do{
		
		System.out.println("\tMenu:\n 1 - Inserir Carros;\n 2 - Listar Carros\n 0 - Sair;\nInsira a opção desejada!");
		op = read.nextInt();
		
		System.out.println("");
		
		switch(op){
		
		case 1: admin.inserir(); break;
		case 2: admin.mostrar(); break;
		case 0: System.out.println("Vai Sair!!!\n");
		
		default: System.out.println("Opção Inválida!\n");
		}
		
		if(op != 0){
		pausa();
		}
		
		System.out.println("");
		
		}while(op != 0);
	}
	
	public static void pausa(){
		System.out.println("\nPressione ENTER para continuar");
		Scanner keyboard = new Scanner(System.in);
		keyboard.nextLine();
	}
}
