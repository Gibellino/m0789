import java.util.Scanner;

public class Infantry extends Warrior{

	Scanner read = new Scanner(System.in);
	
	Warrior[] tropa;
	
	public Infantry() {
		// TODO Auto-generated constructor stub
	}

	public void addT(){
		
		int c=0;
		
		System.out.print("Quantos tropas quer adicionar: ");
		tropa = new Warrior[read.nextInt()];
		
		for(int i=0;i< tropa.length; i++){
			tropa[i] = new Warrior();
			
			System.out.print("Insira o ataque do Tropa " + (i+1) + ": ");
			tropa[i].setAttack(read.nextInt());
			
			System.out.print("Insira a defesa do Tropa " + (i+1) + ": ");
			tropa[i].setDefense(read.nextInt());
			
			System.out.print("Insira o HP do Tropa " + (i+1) + ": ");
			tropa[i].setHp(read.nextInt());
			
			do{
			
			System.out.print("Arma do Tropa:\n 1 - Espada;\n 2 - Lança;\nInsira a arma do Tropa " + (i+1) + ": ");
			c = read.nextInt();
			
			switch(c){
			
			case 1: tropa[i].setNome("Espada"); c = 0; break;
			case 2: tropa[i].setNome("Lança"); c = 0; break;
			
			default: c = 1; System.out.println("\nOpção Inválida!");
			
			}
			
			}while(c == 1);
			
			System.out.print("Insira o poder do " + tropa[i].getNome() + "do Tropa " + (i+1) + ": ");
			tropa[i].setPoder(read.nextInt());
			
			System.out.println("");
		}
	}
	
	public void listarT(){
		if(tropa == null){
			System.out.println("Não há arqueiros!\n");
		}
		else{
			for(int i=0;i<tropa.length;i++){
				System.out.println("Tropa " + (i+1) + ": ");
				
				System.out.println(" Ataque: " + tropa[i].getAttack());
				System.out.println(" Defesa: " + tropa[i].getDefense());
				System.out.println(" Vida: " + tropa[i].getHp());
				System.out.println(" Arma: " + tropa[i].getNome());
				System.out.println(" Ataque da arma: " + tropa[i].getPoder());
			}
		}
	}
}
