package controle;

public class desafioFor {
	
	public static void main(String[] args) {
		String valor = "#";
		for (String i = "#"; !i.equalsIgnoreCase("########") ; i += "#") {
			valor += "#";
			System.out.println(valor);
		}
	}
}