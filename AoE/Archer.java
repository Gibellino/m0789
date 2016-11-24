import java.util.Scanner;

public class Archer extends Warrior{

	Scanner read = new Scanner(System.in);
	
	Warrior[] archer;
	
	public Archer() {
		// TODO Auto-generated constructor stub
		
	}

	public void addA(){
		
		int c=0;
		
		System.out.print("Quantos arqueiros quer adicionar: ");
		archer = new Warrior[read.nextInt()];
		
		for(int i=0;i< archer.length; i++){
			archer[i] = new Warrior();
			
			System.out.print("Insira o ataque do Arqueiro " + (i+1) + ": ");
			archer[i].setAttack(read.nextInt());
			
			System.out.print("Insira a defesa do Arqueiro " + (i+1) + ": ");
			archer[i].setDefense(read.nextInt());
			
			System.out.print("Insira o HP do Arqueiro " + (i+1) + ": ");
			archer[i].setHp(read.nextInt());
			
			do{
			
			System.out.print("Arma do Arqueiro:\n 1 - Arco;\n 2 - Besta;\nInsira a arma do Arqueiro " + (i+1) + ": ");
			c = read.nextInt();
			
			switch(c){
			
			case 1: archer[i].setNome("Arco"); c = 0; break;
			case 2: archer[i].setNome("Besta"); c = 0; break;
			
			default: c = 1; System.out.println("\nOpção Inválida!");
			
			}
			
			}while(c == 1);
			
			if(archer[i].getNome() == "Arco"){
			System.out.print("Insira o poder do " + archer[i].getNome() + "do Arqueiro " + (i+1) + ": ");
			archer[i].setPoder(read.nextInt());
			}
			else{
				System.out.print("Insira o poder da " + archer[i].getNome() + "do Arqueiro " + (i+1) + ": ");
				archer[i].setPoder(read.nextInt());
			}
			
			System.out.println("");
		}
	}
	
	public void listarA(){
		if(archer == null){
			System.out.println("Não há arqueiros!\n");
		}
		else{
			for(int i=0;i<archer.length;i++){
				System.out.println("Arqueiro " + (i+1) + ": ");
				
				System.out.println(" Ataque: " + archer[i].getAttack());
				System.out.println(" Defesa: " + archer[i].getDefense());
				System.out.println(" Vida: " + archer[i].getHp());
				System.out.println(" Arma: " + archer[i].getNome());
				System.out.println(" Ataque da arma: " + archer[i].getPoder());
			}
		}
	}
	
}
