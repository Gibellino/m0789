import java.util.Scanner;

public class CalculadoraGastos {

	public CalculadoraGastos() {
		// TODO Auto-generated constructor stub
		
		Scanner read = new Scanner(System.in);
		
		int agua, luz, gas, tlm, soma=0;
		
		System.out.println("\tDespesas:");
		
		System.out.printf("\n Insira as despesas mensais de água: ");
		agua = read.nextInt();
		
		System.out.printf(" Insira as despesas mensais de luz: ");
		luz = read.nextInt();
		
		System.out.printf(" Insira as despesas mensais de gás: ");
		gas = read.nextInt();
		
		System.out.printf(" Insira as despesas mensais de telecomunicações: ");
		tlm = read.nextInt();
		
		soma = agua + luz + gas + tlm;
		
		System.out.println("\nA média das despesas é de " + (soma/4) + " €");
		
	}

}
