package dia091116;

import java.util.Scanner;

public class Exe1 {

	Scanner read = new Scanner(System.in);
	
	public Exe1() {
		// TODO Auto-generated constructor stub
		
		int[][] array = new int[9][2];
		float mediaC = 0, mediaF = 0;
		int count=0;
		
		for(int i=0;i<9;i++){
			for(int j=0;j<2;j++){
				System.out.println("Insira o resultado " + (j+1) + " da equipa " + (count+1) + ": ");
				array[i][j] = read.nextInt();
				count++;
			}
		}
		
		count=1;
		
		for(int i=0;i<9;i++){
			if(count < 10){
				System.out.printf("Equipa 0" + count);
			}
			else{
				System.out.printf("Equipa " + count);
			}
			
			count++;
			
			for(int j=0;j<2;j++){
				
				if(j == 0){
					System.out.print("\t" + array[i][j] + " - ");
					mediaC+=array[i][j];
				}
				else{
					System.out.print(array[i][j] + "\t");
					mediaF+=array[i][j];
				}
			}
			
			if(count < 10){
				System.out.printf("Equipa 0" + count + " \n");
			}
			else{
				System.out.printf("Equipa " + count + " \n");
			}
			
			count++;
		}
		
		System.out.printf("\nMedia de Golos em casa: " + (mediaC/9) + "\nMedia de Golos fora: " + (mediaF/9));
		
	}

}
