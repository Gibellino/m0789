import java.util.Scanner;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		String mensagem = "Olá turma.";
		
		System.out.println(mensagem + "\n");
		
		int agua;
		int luz;
		int gas;
		int fibra;
		
		System.out.println("Quantos euros gasta de agua?");
		agua = read.nextInt();
		System.out.println("\nQuantos euros gasta de luz?");
		luz = read.nextInt();
		System.out.println("\nQuantos euros gasta de gas?");
		gas = read.nextInt();
		System.out.println("\nQuantos euros gasta de fibra?");
		fibra = read.nextInt();
		
		/*agua = 40;
		luz = 20;
		gas = 20;
		fibra = 60;*/
		
		int despesas = agua + luz + gas + fibra;
		
		System.out.println("\nGastos:\n\n 1 - Agua: " 
				+ agua + " €\n 2 - Luz: " 
				+ luz + " €\n 3 - Gás: " 
				+ gas + " €\n 4 - Fibra: " 
				+ fibra + " €\n\n Despesas totais (mensal): " 
				+ despesas + " €\n Despesas totais (anual): " + despesas*12 + " €");
	}

}
