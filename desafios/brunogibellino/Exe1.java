package brunogibellino;

import java.util.Random;
import java.util.Scanner;

public class Exe1 {
	
	/* 
	 * Desafio nivel 3
	 *
	 * 1) Cria um array multidimensional para guardar um número do random como resultado dos jogos, 
     * 	mostrar os resultados dos jogos (1º equipa introduzida joga com a 2º equipa ...);
	 *
	 * 2) Criar um método para pedir 6 equipas para 3 jogos e guardar as equipas num array;
	 *
	 * 3) Criar um método para devolver um número random de 0 a 10.
	*/ 
	
	 Exe1 me = new Exe1();
	
	static Scanner read = new Scanner(System.in);
	static Random r = new Random();
	
	static String[] equipas = new String[6];
	
	public Exe1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		equipas();
		
		int[][] jogos = new int[3][2];
		
		int count=0;
		
		for(int i=0;i<3;i++){
			for(int j=0; j<2;j++){
				int n = numero();
				jogos[i][j] = n;
			}
		}
		
		System.out.println("\n");
		
		for(int k=0;k<equipas.length;k+=2){
			for(int i=count;i<3;i++){
				System.out.print(" " + equipas[k] + " ");
					for(int j=0; j<2;j++){
						
						System.out.print(jogos[i][j]);
						
						if(j<1){
							System.out.print(" - ");
						}
						else{
							System.out.printf(" ");
						}
						
					}
					System.out.print(" " + equipas[k+1] + " \n");
					i=3;
					count++;
				}
			}
			
		}

	public static void equipas(){
		for(int i=0;i<equipas.length;i++){
			System.out.println("Insira o nome da " + (i+1) + "º equipa: ");
			equipas[i] = read.nextLine();
		}
	}
	
	public static int numero(){
		
		return r.nextInt(10);
		
	}
	
}
