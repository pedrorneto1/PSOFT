package mercado;

public class Lote {
	
	String id;
	Produto produto;
	int quantidade;
	
	public Lote(String id, Produto produto, int quantidade) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return id + " - " + produto.getNome() + " - " + quantidade;
	}

}