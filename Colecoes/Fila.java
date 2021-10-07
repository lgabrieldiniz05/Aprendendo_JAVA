package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		//primeira maneira de adicionar
		Usuario u1 = new Usuario ("Ana");
		lista.add(u1);
		//segunda maneira
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Cirleane"));
		lista.add(new Usuario("Marcos"));
		
		System.out.println(lista.get(0).nome);//acessar pelo índice.
		for(Usuario user: lista) {
			System.out.println(user.nome);
		}
		
		
	}

}