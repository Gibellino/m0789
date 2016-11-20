package loja;

public class Artigo{
	
	private double preco;
	private String nome;
	
	protected double getPreco() {
		return preco;
	}

	protected void setPreco(double preco) {
		this.preco = preco;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public Artigo() {
		// TODO Auto-generated constructor stub
	}

}
