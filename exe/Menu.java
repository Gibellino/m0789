import java.util.Scanner;

public class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		int op;

		do{
			System.out.print("\n\tMenu:\n 1- Calculadora gastos;\n 2 - M�dia de golos;\n 0 - Sair.\n\n "
					+ "Escolha uma op��o: "); 
			op = read.nextInt();
			
			System.out.println("");
			
			switch(op){
			
			case 1: new CalculadoraGastos(); break;
			
			case 2: new Golos(); break;
			
			case 0: System.out.println("Vai Sair!"); break;
			
			default: System.out.println("Op��o Inv�lida!");
			
			}
		}while(op!=0);
	}

}