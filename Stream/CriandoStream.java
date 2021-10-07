package stream;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
	public static void main(String[] args) {
		
	
	Consumer<String> print = System.out::print;
	
	Stream<String> langs = Stream.of("java ", "lua ", "JS\n");
	langs.forEach(print);
	
	
	String[] maisLangs = {"python ", "Lisp ", "Perl ", "Go\n"};
	Stream.of(maisLangs).forEach(print);
	System.out.println("\nUSANDO Arrays...");
	Arrays.stream(maisLangs).forEach(print);
	Arrays.stream(maisLangs, 1, 3 ).forEach(print);
	
	System.out.println("\nUSANDO LISTAS...");
	List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
	outrasLangs.stream().forEach(print);
	
	
	}

}