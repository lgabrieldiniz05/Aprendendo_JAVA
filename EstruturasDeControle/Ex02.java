package controle;

import java.util.Scanner;

public class ExercicioEstruturaDeControle2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um ano "
				+ "para saber se é bissexto:");
		int num = entrada.nextInt();
		if(num / 4 ==0) {
			System.out.println("O ano é bissexto!!");
		}else {
			System.out.println("O ano informado não é bissexto");
		}
		System.out.println("Fim");
		entrada.close();
		
	}

}