package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

// LAST IN FIRST OUT
public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno Prícipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); //olhar 
		System.out.println(livros.element()); //olhar
		System.out.println(livros.contains("Don Quixote")); //contém?
		System.out.println(livros.poll());// remover
		System.out.println(livros.size()); // comprimento
		
		for(String n: livros) {
			System.out.println(n);
		}
	}

}