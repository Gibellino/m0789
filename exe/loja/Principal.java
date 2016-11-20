package loja;

import java.util.Scanner;

public class Principal extends Artigo{

	
	
	public Principal() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		Artigo artigo1 = new Artigo();
		Artigo artigo2 = new Artigo();
		Artigo artigo3 = new Artigo();
		
		double soma=0;
		
		//Artigo 1
		System.out.println("\nIntroduza o nome do artigo 1: ");
		artigo1.setNome(read.nextLine());
		System.out.println("Introduza o preço do artigo 1: ");
		artigo1.setPreco(read.nextDouble());
		
		read.nextLine();
		
		//Artigo 2
		System.out.println("\nIntroduza o nome do artigo 2: ");
		artigo2.setNome(read.nextLine());
		System.out.println("Introduza o preço do artigo 2: ");
		artigo2.setPreco(read.nextDouble());
		
		read.nextLine();
		
		//Artigo 3
		System.out.println("\nIntroduza o nome do artigo 3: ");
		artigo3.setNome(read.nextLine());
		System.out.println("Introduza o preço do artigo 3: ");
		artigo3.setPreco(read.nextDouble());
		
		soma = artigo1.getPreco() + artigo2.getPreco() + artigo3.getPreco();
		
		System.out.println("\n   Fatura\nArtigo 1:\n Nome: " + artigo1.getNome() + "\n Preço: " + artigo1.getPreco() + "€" +
				"\nArtigo 2:\n Nome: " + artigo2.getNome() + "\n Preço: " + artigo2.getPreco() + "€" +
				"\nArtigo 3:\n Nome: " + artigo3.getNome() + "\n Preço: " + artigo3.getPreco() + "€" +
				"\n\nTotal: " + soma);
		
	}

}
