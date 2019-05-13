import java.util.ArrayList;

public class EX3ShoppingCart {

	ArrayList<EX3Book> shCart = new ArrayList<>();
	
	public void adicionarLivro(EX3Book novoLivro) {
		shCart.remove(novoLivro);	//Pra esse exemplo mais simples, nao permite comprar dois do mesmo item
		shCart.add(novoLivro);
	}
	
	public void removerLivro(EX3Book livroRemover) {
		shCart.remove(livroRemover);
	}
	
	public void esvaziarCarrinho() {
		shCart.clear();
	}
	
	public int numeroItensCarrinho() {
		return shCart.size();
	}
	
	public double precoTotal() {
		double precoCarrinho= 0;
		
		for(int i=0; i<shCart.size();i++) {
			precoCarrinho+= shCart.get(i).getPreco();
		}
		
		return precoCarrinho;
	}
	
}
