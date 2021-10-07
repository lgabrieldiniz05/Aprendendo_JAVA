package javafuncoes;

import java.util.function.Function;

public class InterfaceFunction {
	public static void main(String[] args) {
		
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "par" : "ímpar";
				System.out.println(parOuImpar.apply(32));
			//o resultado da primeiro passa para a segunda	
				
		Function<String, String> oResultadoE = 
				valor -> "O resultado é: " + valor;
			//o resultado da segunda passa para terceira

		Function<String, String> empolgado = 
				valor -> valor + "!!!";
				
				
		String resultadoFinal = 
				parOuImpar.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal);
	
	
	}
	

}