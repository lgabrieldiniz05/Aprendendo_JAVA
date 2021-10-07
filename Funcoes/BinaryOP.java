package javafuncoes;

import java.util.function.BinaryOperator;

public class BinaryOp {
	public static void main(String[] args) {
		BinaryOperator<Double> soma = (x, y) -> x + y;
		
		System.out.print(soma.apply(2.0, 3.0) + "\n");
		
		
		
		BinaryOperator<Double> multiplicacao = (x, y) -> x * y;
		
		System.out.print(multiplicacao.apply(2.0, 3.0));
	}

}