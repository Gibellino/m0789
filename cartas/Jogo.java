
public class Jogo {

	public Carta baralho;
	protected Jogador jogador;
	
	public Jogo() {
		// TODO Auto-generated constructor stub
	}
	
	public void distribuirPontuacao(int pont){
		baralho.setPontucao(pont);
	}

}
