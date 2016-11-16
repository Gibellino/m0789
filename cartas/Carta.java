
public class Carta {

	public int naipe;
	public String nome;
	public int pontucao;
	
	public Carta(String nome, int naipe, int pont) {
		// TODO Auto-generated constructor stub
		
		this.naipe = naipe;
		this.nome = nome;
		this.pontucao = pont;
	}

	public int getNaipe() {
		return naipe;
	}

	public String getNome() {
		return nome;
	}

	public int getPontucao() {
		return pontucao;
	}

	public void setPontucao(int pontucao) {
		this.pontucao = pontucao;
	}

}
