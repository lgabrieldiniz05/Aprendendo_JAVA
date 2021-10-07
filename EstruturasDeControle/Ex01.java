package controle;

import java.util.Scanner;

public class ExercicioEstruturaDeControle {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um Número entra 0 e 10: ");
		int valor = entrada.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é ímpar");
		entrada.close();
		}
	}
}