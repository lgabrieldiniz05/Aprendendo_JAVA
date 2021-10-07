package controle;

import java.util.Scanner;

public class aulaIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a média");
		String media = entrada.next().replace(",", ".");
		double media1 = Double.parseDouble(media);
		
		if(media1 <= 10 && media1 >= 7.0 ) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		if(media1 <= 7 && media1 >= 4.5) {
			System.out.println("Recuperação!");
		}	
		if(media1 < 4.5 && media1 >= 0) {
			System.out.println("Reprovado!!");
		}	
		entrada.close();	
	}

}