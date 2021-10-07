package colecoes;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Lucas"); //adicionou
		usuarios.put(1, "Cirleane"); //alterou o primeiro item adicionado.
		usuarios.put(2, "Marocs"); 
		usuarios.put(3, "Rafaela"); 
		usuarios.put(4, "Rebeca"); 
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.containsKey(1));
		System.out.println(usuarios.get(1));  //Pega a partir da chave.
		
		//METODO PARA PERCORRER AS CHAVES
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
			
		}
		//METODO PARA PERCORRER VALORES
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey() + "-->>");
			System.out.println(registro.getValue());
			
		}
	}
