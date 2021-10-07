package javafuncoes;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryUnary {
	public static void main(String[] args) {
		BinaryOperator<Integer> soma =
				(x, y) -> x + y;
				
		UnaryOperator<Integer> multiplicar = 
				valor -> valor *2 ;
		
		System.out.println(soma.apply(10, 10));
		System.out.println(multiplicar.apply(10));
		System.out.println(soma.andThen(multiplicar).apply(10, 10));
	}

}