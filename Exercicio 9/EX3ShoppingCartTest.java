import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EX3ShoppingCartTest {

	@BeforeEach
	public void init() {
		/*
		EX3Book HarryPotter= new EX3Book();
		HarryPotter.setBook("Harry Potter", 1, 10.50);
		
		EX3Book OGuarani= new EX3Book();
		OGuarani.setBook("O Guarani", 2, 12);
		
		EX3ShoppingCart testCart= new EX3ShoppingCart();
		*/
	}
	
	@Test
	void testeAdicionarLivro() {
		EX3Book HarryPotter= new EX3Book();
		HarryPotter.setBook("Harry Potter", 1, 10.50);
		
		EX3Book OGuarani= new EX3Book();
		OGuarani.setBook("O Guarani", 2, 12);
		
		EX3ShoppingCart testCart= new EX3ShoppingCart();
		testCart.adicionarLivro(HarryPotter);
		
		assertTrue(testCart.shCart.contains(HarryPotter));
	}
	
	public void testeRemoverLivro() {
		EX3Book HarryPotter= new EX3Book();
		HarryPotter.setBook("Harry Potter", 1, 10.50);
		
		EX3Book OGuarani= new EX3Book();
		OGuarani.setBook("O Guarani", 2, 12);
		
		EX3ShoppingCart testCart= new EX3ShoppingCart();
		
		testCart.adicionarLivro(HarryPotter);
		testCart.removerLivro(HarryPotter);
		
		assertFalse(testCart.shCart.contains(HarryPotter));
	}
	
	public void testeEsvaziarCarrinho() {
		EX3Book HarryPotter= new EX3Book();
		HarryPotter.setBook("Harry Potter", 1, 10.50);
		
		EX3Book OGuarani= new EX3Book();
		OGuarani.setBook("O Guarani", 2, 12);
		
		EX3ShoppingCart testCart= new EX3ShoppingCart();
		
		testCart.adicionarLivro(HarryPotter);
		testCart.adicionarLivro(OGuarani);
		
		testCart.esvaziarCarrinho();
		
		assertEquals(testCart.shCart.size(), 0);
	}
	
	public void testeNumeroItens() {
		EX3Book HarryPotter= new EX3Book();
		HarryPotter.setBook("Harry Potter", 1, 10.50);
		
		EX3Book OGuarani= new EX3Book();
		OGuarani.setBook("O Guarani", 2, 12);
		
		EX3ShoppingCart testCart= new EX3ShoppingCart();
		
		testCart.adicionarLivro(HarryPotter);
		testCart.adicionarLivro(OGuarani);
		
		assertEquals(testCart.shCart.size(), 2);
	}
	
	public void testePrecoTotal() {
		EX3Book HarryPotter= new EX3Book();
		HarryPotter.setBook("Harry Potter", 1, 10.50);
		
		EX3Book OGuarani= new EX3Book();
		OGuarani.setBook("O Guarani", 2, 12);
		
		EX3ShoppingCart testCart= new EX3ShoppingCart();
		
		testCart.adicionarLivro(HarryPotter);
		testCart.adicionarLivro(OGuarani);
		
		assertEquals(testCart.precoTotal(), 22.50);
	}

}
