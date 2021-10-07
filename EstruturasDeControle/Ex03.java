package controle;
import java.util.Scanner;

public class ExercicioEstruturaDeControle4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua primeira nota: ");
		double nota1 = entrada.nextInt();
		System.out.println("Digite sua segunda nota: ");
		double nota2 = entrada.nextInt();
		double media = (nota1 + nota2) / 2;
		if(media <= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Recuperação");
		}
		entrada.close();
	}
}