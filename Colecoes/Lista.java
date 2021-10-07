package colecoes;
// first in first out
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila =new LinkedList<String>();
		// add e offer ambos adicionam elemesnto na fila
		// a diferença é o comportamento quando a fila está cheia add retorna erro 
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Rafael");
		fila.offer("Maria");
		/*
		 * Peek e Element -> obter o próximo elemento da 
		 * fila (sem remover)
		 * fila.size() tamanho da fila
		 * fila.claer() limpar
		 * fila.isEmpty está ou não vazia
		 * fila.poll() retorna o primeiro elemento da fila já removendo.
		 */
		
		System.out.println(fila.peek()); //vazio retorna null
		System.out.println(fila.element()); //vazio retorna erro
		for(String l: fila) {
			System.out.println(l);
		}
		
		
	}

}