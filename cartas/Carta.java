
public class Carta {

	public int naipe;
	public String nome;
	public int pontuacao;
	
	public Carta(int naipe, String nome, int pont) {
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
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNaipe(int naipe) {
		this.naipe = naipe;
	}

	public void setPontucao(int pont) {
		this.pontuacao = pont;
	}

}
