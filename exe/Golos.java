import java.util.Scanner;

public class Golos {

	public Golos() {
		
		Scanner read = new Scanner(System.in);
		
		String[] equipas = {"Panda","Caricas","Bob","Pocoyo"};
		
		int[][] golos = new int[4][3];
		
		
		// equipa 0 vs equipa 1
		System.out.println("Equipa " + equipas[0] + " vs Equipa " + equipas[1]);
		System.out.println("Insira o resultado do jogo equipa " + equipas[0]);
		golos[0][0] = read.nextInt();
		System.out.println("Insira o resultado do jogo equipa " + equipas[1]);
		golos[1][0] = read.nextInt();
		
		// equipa 0 vs equipa 2
		System.out.println("Equipa " + equipas[0] + " vs Equipa " + equipas[2]);
		System.out.println("Insira o resultado do jogo equipa " + equipas[0]);
		golos[0][1] = read.nextInt();
		System.out.println("Insira o resultado do jogo equipa " + equipas[2]);
		golos[2][0] = read.nextInt();
		
		// equipa 0 vs equipa 3
		System.out.println("Equipa " + equipas[0] + " vs Equipa " + equipas[3]);
		System.out.println("Insira o resultado do jogo equipa " + equipas[0]);
		golos[0][2] = read.nextInt();
		System.out.println("Insira o resultado do jogo equipa " + equipas[3]);
		golos[3][0] = read.nextInt();
		
		// equipa 1 vs equipa 2
		System.out.println("Equipa " + equipas[0] + " vs Equipa " + equipas[1]);
		System.out.println("Insira o resultado do jogo equipa " + equipas[0]);
		golos[0][0] = read.nextInt();
		System.out.println("Insira o resultado do jogo equipa " + equipas[1]);
		golos[1][0] = read.nextInt();
		
		// equipa 1 vs equipa 2
		System.out.println("Equipa " + equipas[0] + " vs Equipa " + equipas[1]);
		System.out.println("Insira o resultado do jogo equipa " + equipas[0]);
		golos[0][0] = read.nextInt();
		System.out.println("Insira o resultado do jogo equipa " + equipas[1]);
		golos[1][0] = read.nextInt();
	}

}
