package stand;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Admin extends Carro{
	
	Scanner read = new Scanner(System.in);
	
	File fich = new File("stand.txt");
	PrintWriter esc;
	//new PrintWriter(new FileWriter(fich, true));
	
	Carro[] carro;
	
	public Admin() {
		// TODO Auto-generated constructor stub

	}
	
	public void criarTxt() throws FileNotFoundException{
		 try{
			 if(fich.exists()==false){
				 fich.createNewFile();
			 }
		}catch(IOException e){
			System.out.println("Ficheiro não encontrado/criado!");
		}
	}
	
	public void inserir(){
		int c;
		
		System.out.print("Insira quanto carros quer inserir: ");
		carro = new Carro[read.nextInt()];
		
		System.out.println("");
		
		for(int i=0;i<carro.length;i++){
			
			//Tem que se inicializar o array de objecto
			carro[i] = new Carro();
			
			System.out.print("Insira a marca do carro " + (i+1) + ": ");
			carro[i].setMarca(read.nextLine());
			
			read.nextLine();
			
			System.out.print("Insira o modelo do carro " + (i+1) + ": ");
			carro[i].setModelo(read.nextLine());
			
			System.out.print("Insira a cilindrada do carro " + (i+1) + ": ");
			carro[i].setCc(read.nextInt());
			
			System.out.print("Insira a cavalagem do carro " + (i+1) + ": ");
			carro[i].setCv(read.nextInt());
			
			do{
			
			System.out.print("Insira o combustível do carro " + (i+1) + " :\n 1 - Diesel;\n 2 - Gasolina;\n 3 - GPL;\n 4 - Elétrico;\n");
			c = read.nextInt();
			
			switch(c){
			
			case 1: carro[i].setComb("Diesel"); c = 0; break;
			case 2: carro[i].setComb("Gasolina"); c = 0; break;
			case 3: carro[i].setComb("GPL"); c = 0; break;
			case 4: carro[i].setComb("Elétrico"); c = 0; break;
			
			default: c = 1; System.out.println("\nOpção Inválida!");
			
			}
			
			}while(c == 1);
			
			System.out.print("Insira a cor do carro " + (i+1) + ": ");
			carro[i].setCor(read.nextLine());
			
			read.nextLine();
			
			System.out.print("Insira o preço do carro " + (i+1) + ": ");
			carro[i].setPreco(read.nextInt());
			
			System.out.println("");
			
		}	
	}
	
	public void mostrar(){
		if (carro == null) {
			System.out.println("\nNão há carros!");
		}
		else{
			for(int i=0;i<carro.length;i++){
				System.out.println("\n\tCarro " + (i+1) + "\n");
				System.out.println("Marca: " + carro[i].getMarca());
				System.out.println("Modelo: " + carro[i].getModelo());
				System.out.println("Cilindrada: " + carro[i].getCc());
				System.out.println("Cavalagem: " + carro[i].getCv());
				System.out.println("Combustível: " + carro[i].getComb());
				System.out.println("Cor: " + carro[i].getCor());
				System.out.println("Preço: " + carro[i].getPreco());
			}
		}
	}
}
