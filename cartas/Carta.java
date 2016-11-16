
public class Carta {

	public int naipe;
	public String nome;
	public int pontuacao;
	
	public Carta(String nome, int naipe, int pont) {
		// TODO Auto-generated constructor stub
		
		this.naipe = naipe;
		this.nome = nome;
		this.pontuacao = pont;
	}

	public int getNaipe() {
		return naipe;
	}

	public String getNome() {
		return nome;
	}

	public int getPontucao() {
		return pontuacao;
	}

	public void setPontucao(int pont) {
		this.pontuacao = pont;
	}

}
