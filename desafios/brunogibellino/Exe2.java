package brunogibellino;

import java.util.Scanner;

public class Exe2 {

	public Exe2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pedir um numero N e inserir num array N n�meros
		 * Verificar e mostrar quais s�o primos e quais n�o s�o.
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
		
		for(int i=(n1[n]-1);i>=2;i-=1){
			if((n1[i] % i) == 1){
				b[i]=0;
			}
	        else{
	        	b[i]=1;
	        }
	    }
		
		
		
	}

}
