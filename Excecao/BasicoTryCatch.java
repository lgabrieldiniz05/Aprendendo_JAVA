package excecao;

public class BasicoTryCatch {
	public static void main(String[] args) {
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("Erro na execução");
		}
		System.out.println("Aprendendo Try / Catch");
	}

}