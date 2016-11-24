import java.util.Scanner;

public class Peasant extends Character{

	Character[] peasant;
	
	Scanner read = new Scanner(System.in);
	
	public Peasant() {
		// TODO Auto-generated constructor stub
		
	}

	public void addP(){
		
		System.out.print("Quantos Peasants quer adicionar? ");
		peasant = new Character[read.nextInt()];
		
		System.out.println("");
		
		for(int i=0;i<peasant.length;i++){
			peasant[i] = new Character();
			System.out.print("Insira o ataque do Peasant " + (i+1) + ": ");
			peasant[i].setAttack(read.nextInt());
			
			System.out.print("Insira a defesa do Peasant " + (i+1) + ": ");
			peasant[i].setDefense(read.nextInt());
			
			System.out.print("Insira o HP do Peasant " + (i+1) + ": ");
			peasant[i].setHp(read.nextInt());
			
			System.out.println("");
		}
	}
	
	public void listarP(){
		
		for(int i=0;i<peasant.length;i++){
			System.out.print("\tPeasant " + (i+1));
			System.out.print("\n Ataque: " + peasant[i].getAttack());
			System.out.print("\n Defesa: " + peasant[i].getDefense());
			System.out.print("\n Vida: " + peasant[i].getHp());
		}
	}
}
