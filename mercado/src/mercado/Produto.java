package mercado;

public class Produto {
	
	String id;
	String nome;
	String fabricante;
	
	public Produto(String id, String nome, String fabricante) {
		this.id = id;
		this.nome = nome;
		this.fabricante = fabricante;
	}
	
	public String toString() {
		return id + " - " + nome + " - " + fabricante;
	}
	public String getNome() {
		return this.nome;
	}

}