package javafuncoes;

import java.util.function.Predicate;

public class InterfacePredicate2 {
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = valor -> valor % 2 == 0;
		Predicate<Integer> temTresDigitos = 
				valor -> valor >= 100 && valor <= 999;
		
		System.out.println(isPar.and(temTresDigitos).test(124));
		System.out.println(isPar.or(temTresDigitos).test(125));
	}

}