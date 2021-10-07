package javafuncoes;

import java.util.function.BiFunction;

// Bom para condicionais


public class InterfaceBiFunction {
	public static void main(String[] args) {
		BiFunction<Double, Double, String> resultado =
				(n1 , n2) -> ((n1 + n2) / 2) >= 7 ? "aprovado" : "Reprovado";
				
	System.out.println(resultado.apply(9.5, 6.1));
	}
}