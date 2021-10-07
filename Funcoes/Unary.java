package javafuncoes;

import java.util.function.UnaryOperator;

public class InterfaceUnaryOperator {
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = 
				valor -> valor + 2;
		UnaryOperator<Integer> vezesDois = 
				valor -> valor * 2;
		UnaryOperator<Integer> vezesTres = 
				valor -> valor * 3;
		System.out.println(maisDois.apply(10));		
		System.out.println(vezesDois.apply(10));		
		System.out.println(vezesTres.apply(10));		
		System.out.println(maisDois.andThen(vezesDois).andThen(vezesTres).apply(10));
						
				
	}

}