package javafuncoes;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class DesafioBinaryOperator {
	public static void main(String[] args) {
		Produto p1 = new Produto("Ipad", 3235.89, 0.13);
		
		BinaryOperator<Double> precoComDesconto = 
				(x, y) -> x - (x * (y * 100) / 100 );
		Function<Double, Double> impostoMunicipal = 
				valor -> valor >= 2550 ?valor + ((valor *8.5) /100) : valor;
		Function<Double, Double> frete = 
				valor -> valor >= 3000 ? valor + 100 : valor + 50;
		System.out.println(precoComDesconto
				.andThen(impostoMunicipal)
				.andThen(frete).apply(p1.preco, p1.desconto));
			
	}

}