package brunogibellino;

import java.util.Scanner;

public class Exe2 {

	public Exe2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Desafio nivel 2
		 * 
		 * 1) Pedir um numero N e inserir num array N n�meros
		 * 2) Verificar e mostrar quais s�o primos e quais n�o s�o.
		 */
		
		int n;
		int[] n1;
		int[] b;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Quantos n�meros quer?");
		n = read.nextInt();
		
		n1 = new int[n];
		b = new int[n];
		
		for(int i=0;i<n;i++){
			System.out.println("Insira um n�mero " + (i+1));
			n1[i] = read.nextInt();
		}
		
		for(int j=0; j<n;j++){
			for(int i=(n1[j]-1);i>=2;i-=1){
				if((n1[j] % i) == 1){
					b[j]=0;
				}
		        else{
		        	b[j]=1;
		        }
		    }
		}
		for(int i=0;i<n;i++){
			if(b[i] == 0){
				System.out.println("O n�mero " + n1[i] + " � primo!");
			}
			else{
				System.out.println("O n�mero " + n1[i] + " n�o � primo!");
			}
		}
		
	}

}
