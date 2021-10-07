package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/*
		 * if (...) sentença; ou {}
		 * while(...) sentença; ou {}
		 * for(...;...;...) sentença; ou {}
		 * do sentença; ou{} while(...);
		 */
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("Você precisa falar as palavras mágicas..");
			System.out.println("Você quer sair?");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("Por favor")); //única estrutura que aceita ; no final
		System.out.println("Obrigado!");
		entrada.close();
		
	}
}