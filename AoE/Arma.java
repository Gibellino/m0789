
public class Arma {

	protected String nome;
	protected int poder;
	
	public Arma() {
		// TODO Auto-generated constructor stub
	}
	
	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getPoder() {
		return poder;
	}

	protected void setPoder(int poder) {
		this.poder = poder;
	}

	protected double especial(int ratio){
		
		double perc = (double)(poder*ratio)/100;
		double forca = (double)(poder + perc);
		
		return forca;
		
	}
}