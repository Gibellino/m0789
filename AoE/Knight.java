import java.util.Scanner;

public class Knight extends Warrior{

	Scanner read = new Scanner(System.in);
	
	Warrior[] knight;
	
	public Knight() {
		// TODO Auto-generated constructor stub
	}

	public void addK(){
		
int c=0;
		
		System.out.print("Quantos cavaleiros quer adicionar: ");
		knight = new Warrior[read.nextInt()];
		
		for(int i=0;i< knight.length; i++){
			knight[i] = new Warrior();
			
			System.out.print("Insira o ataque do Cavaleiro " + (i+1) + ": ");
			knight[i].setAttack(read.nextInt());
			
			System.out.print("Insira a defesa do Cavaleiro " + (i+1) + ": ");
			knight[i].setDefense(read.nextInt());
			
			System.out.print("Insira o HP do Cavaleiro " + (i+1) + ": ");
			knight[i].setHp(read.nextInt());
			
			do{
			
			System.out.print("Arma do Cavaleiro:\n 1 - Espada;\n 2 - Lança;\nInsira a arma do Cavaleiro " + (i+1) + ": ");
			c = read.nextInt();
			
			switch(c){
			
			case 1: knight[i].setNome("Espada"); c = 0; break;
			case 2: knight[i].setNome("Lança"); c = 0; break;
			
			default: c = 1; System.out.println("\nOpção Inválida!");
			
			}
			
			}while(c == 1);
			
			System.out.print("Insira o poder da " + knight[i].getNome() + "do Cavaleiro " + (i+1) + ": ");
			knight[i].setPoder(read.nextInt());
			
			System.out.println("");
		}
	}
	
	public void listarK(){
		if(knight == null){
			System.out.println("Não há Cavaleiros!\n");
		}
		else{
			for(int i=0;i<knight.length;i++){
				System.out.println("Cavaleiro " + (i+1) + ": ");
				
				System.out.println(" Ataque: " + knight[i].getAttack());
				System.out.println(" Defesa: " + knight[i].getDefense());
				System.out.println(" Vida: " + knight[i].getHp());
				System.out.println(" Arma: " + knight[i].getNome());
				System.out.println(" Ataque da arma: " + knight[i].getPoder());
			}
		}
	}
}
