import java.util.Scanner;

public class CalculadoraGastos {

	public CalculadoraGastos() {
		// TODO Auto-generated constructor stub
		
		Scanner read = new Scanner(System.in);
		
		int agua, luz, gas, tlm, soma=0;
		
		System.out.println("\tDespesas:");
		
		System.out.printf("\n Insira as despesas mensais de �gua: ");
		agua = read.nextInt();
		
		System.out.printf(" Insira as despesas mensais de luz: ");
		luz = read.nextInt();
		
		System.out.printf(" Insira as despesas mensais de g�s: ");
		gas = read.nextInt();
		
		System.out.printf(" Insira as despesas mensais de telecomunica��es: ");
		tlm = read.nextInt();
		
		soma = agua + luz + gas + tlm;
		
		System.out.println("\nA m�dia das despesas � de " + (soma/4) + " �");
		
	}

}
