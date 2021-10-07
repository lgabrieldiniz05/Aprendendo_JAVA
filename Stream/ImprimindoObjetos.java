package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;




public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovado =  
				Arrays.asList("Lucas", "gui", "ana", "amanda");
		
		for(String nome: aprovado) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator...");
		
		Iterator<String> lista = aprovado.iterator();
		while(lista.hasNext()) {
			System.out.println(lista.next());
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String> lista2 = aprovado.stream();
		lista2.forEach(System.out::println);
	}

}