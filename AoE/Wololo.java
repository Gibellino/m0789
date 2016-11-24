import java.util.Scanner;

public class Wololo extends Personagem{

	Scanner read = new Scanner(System.in);
	Personagem[] wololo;
	
	public int[] conversion;
	
	public Wololo() {
		// TODO Auto-generated constructor stub
	}
	
	public void addW(){
		
		int n = 0;
		
		System.out.print("Quantos Wololos quer adicionar? ");
		n = read.nextInt();
		
		wololo = new Personagem[n];
		conversion = new int[n];
		
		System.out.println("");
		
		for(int i=0;i<wololo.length;i++){
			wololo[i] = new Personagem();
			System.out.print("Insira o ataque do Wololo " + (i+1) + ": ");
			wololo[i].setAttack(read.nextInt());
			
			System.out.print("Insira a defesa do Wololo " + (i+1) + ": ");
			wololo[i].setDefense(read.nextInt());
			
			System.out.print("Insira o HP do Wololo " + (i+1) + ": ");
			wololo[i].setHp(read.nextInt());
			
			System.out.print("Insira o ratio de conversão do Wololo " + (i+1) + ": ");
			conversion[i] = read.nextInt();
			
			System.out.println("");
		}
	}
	
	public void listarW(){
		
		for(int i=0;i<wololo.length;i++){
			System.out.print("\tWololo " + (i+1));
			System.out.print("\n Ataque: " + wololo[i].getAttack());
			System.out.print("\n Defesa: " + wololo[i].getDefense());
			System.out.print("\n Vida: " + wololo[i].getHp());
			System.out.print("\n Ratio de Conversão: " + conversion[i]);
		}
	}

}
