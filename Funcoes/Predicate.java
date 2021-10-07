package javafuncoes;

import java.util.function.Predicate;

public class InterfacePredicate {
	public static void main(String[] args) {
		
	}
	
	Predicate<Produto> isCaro = prod -> prod.preco >= 2000;
	
	Produto produto = new Produto("Notebook", 3800.54, 0.15);
	
	

}