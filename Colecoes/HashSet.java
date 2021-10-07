package colecoes;

import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//HashSet<String> listaAprovados = new HashSet<String>(); <- NÃO MANTÉM A ORDEM
		TreeSet<String> listaAprovados = new TreeSet<>(); //PARA MANTER A ORDEM DE INSERÇÃO
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		HashSet<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		for(int numero: nums) {
			System.out.println(numero);
		}
	}

}