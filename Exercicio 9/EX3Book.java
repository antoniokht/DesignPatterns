
public class EX3Book {
	private String titulo;
	private int isbn;
	private double preco;
	
	
	public String getTitulo(){
		return this.titulo;
	}

	public int getIsbn() {
		return this.isbn;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	
	
	public void setTitulo(String novoTitulo) {
		this.titulo= novoTitulo;
	}
	
	public void setIsbn(int novoIsbn) {
		this.isbn= novoIsbn;
	}
	
	public void setPreco(double novoPreco) {
		this.preco= novoPreco;
	}
	
	public void setBook(String novoTitulo, int novoIsbn, double novoPreco){
		this.titulo= novoTitulo;
		this.isbn= novoIsbn;
		this.preco= novoPreco;
	}
}
