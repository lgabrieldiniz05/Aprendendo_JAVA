package javafuncoes;

import java.util.Arrays;
import java.util.List;

public class ForeachFuncional {
	public static void main(String[] args) {
		
	
	List<String> aprovados = Arrays
			.asList("ana", "bia", "lia", "gui");
	
	//METODO TRADICIONAL PARA PERCORRER A LIST	
		for(String nome: aprovados) {
				System.out.println(nome);
		}
		
			//PERCORRER USANDO LAMBDA
			System.out.println("\nLambda #01");
			aprovados.forEach(nome ->  System.out.println(nome + "!!"));
			
			System.out.println("\nMethod Reference... #1");
			aprovados.forEach(System.out::println);
			
			System.out.println("\nLambda #02");
			aprovados.forEach(nome ->  meuImprimir(nome));
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("oi! meu nome é" + nome);
	}
}