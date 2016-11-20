import java.util.Scanner;

public class Golos {

	public Golos() {
		
		Scanner read = new Scanner(System.in);
		
		String[] equipas = {"Panda","Caricas","Bob","Pocoyo"};
		
		int[][] golos = new int[4][3];
		
		
		// equipa 0 (0,0) vs equipa 1 (1,0)
		System.out.println("Equipa " + equipas[0] + " vs Equipa " + equipas[1]);
		System.out.println("Insira o resultado do jogo equipa " + equipas[0]);
		golos[0][0] = read.nextInt();
		System.out.println("Insira o resultado do jogo equipa " + equipas[1]);
		golos[1][0] = read.nextInt();
		
		// equipa 0 (0,1) vs equipa 2 (2,0)
		System.out.println("\nEquipa " + equipas[0] + " vs Equipa " + equipas[2]);
		System.out.println("Insira o resultado do jogo equipa " + equipas[0]);
		golos[0][1] = read.nextInt();
		System.out.println("Insira o resultado do jogo equipa " + equipas[2]);
		golos[2][0] = read.nextInt();
		
		// equipa 0 (0,2) vs equipa 3 (3,0)
		System.out.println("\nEquipa " + equipas[0] + " vs Equipa " + equipas[3]);
		System.out.println("Insira o resultado do jogo equipa " + equipas[0]);
		golos[0][2] = read.nextInt();
		System.out.println("Insira o resultado do jogo equipa " + equipas[3]);
		golos[3][0] = read.nextInt();
		
		// equipa 1 (1,1) vs equipa 2 (2,1)
		System.out.println("\nEquipa " + equipas[1] + " vs Equipa " + equipas[2]);
		System.out.println("Insira o resultado do jogo equipa " + equipas[1]);
		golos[1][1] = read.nextInt();
		System.out.println("Insira o resultado do jogo equipa " + equipas[2]);
		golos[2][1] = read.nextInt();
		
		// equipa 1 (1,2) vs equipa 3 (3,1)
		System.out.println("\nEquipa " + equipas[1] + " vs Equipa " + equipas[3]);
		System.out.println("Insira o resultado do jogo equipa " + equipas[1]);
		golos[1][2] = read.nextInt();
		System.out.println("Insira o resultado do jogo equipa " + equipas[3]);
		golos[3][1] = read.nextInt();
		
		// equipa 2 (2,2) vs equipa 3 (3,2)
		System.out.println("\nEquipa " + equipas[2] + " vs Equipa " + equipas[3]);
		System.out.println("Insira o resultado do jogo equipa " + equipas[2]);
		golos[2][2] = read.nextInt();
		System.out.println("Insira o resultado do jogo equipa " + equipas[3]);
		golos[3][2] = read.nextInt();
		
		System.out.println("\n " + equipas[0] + " " + golos[0][0] + " - " + golos[1][0] + " " + equipas[1]);
		System.out.println(" " + equipas[0] + " " + golos[0][1] + " - " + golos[2][0] + " " + equipas[2]);
		System.out.println(" " + equipas[0] + " " + golos[0][2] + " - " + golos[3][0] + " " + equipas[3]);
		System.out.println(" " + equipas[1] + " " + golos[1][1] + " - " + golos[2][1] + " " + equipas[2]);
		System.out.println(" " + equipas[1] + " " + golos[1][2] + " - " + golos[3][1] + " " + equipas[3]);
		System.out.println(" " + equipas[2] + " " + golos[2][2] + " - " + golos[3][2] + " " + equipas[3]);
		
		float media1 = (float)(golos[0][0] + golos[0][1] + golos[0][2])/3,
				media2 = (float)(golos[1][0] + golos[1][1] + golos[1][2])/3,
				media3 = (float)(golos[2][0] + golos[2][1] + golos[2][2])/3,
				media4 = (float)(golos[3][0] + golos[3][1] + golos[3][2])/3;
		
		System.out.println("\n A media de golos da equipa " + equipas[0] + " é " + media1);
		System.out.println(" A media de golos da equipa " + equipas[1] + " é " + media2);
		System.out.println(" A media de golos da equipa " + equipas[2] + " é " + media3);
		System.out.println(" A media de golos da equipa " + equipas[3] + " é " + media4);
	}

}
