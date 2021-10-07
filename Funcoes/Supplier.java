package javafuncoes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class InterfaceSupplier {
	public static void main(String[] args) {
		Supplier<List<String>> lista = 
				() -> Arrays.asList("Lucas", "Cirleane", "marcos");
				
	System.out.println(lista.get());
				
	}

}