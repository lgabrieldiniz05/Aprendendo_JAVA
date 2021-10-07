package javafuncoes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InterfaceConsumer {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = 
				p -> System.out.println(p.nome);
		
				Produto p1 = new Produto("Imac", 22000, 0.15);
				Produto p2 = new Produto("Tablet", 1900, 0.15);
				Produto p3 = new Produto("Mesa", 2000, 0.15);
				Produto p4 = new Produto("Monitor", 2000, 0.15);
				Produto p5 = new Produto("Fone", 300, 0.15);
		imprimir.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}