package getter.setters;

public class Pessoa1 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Lucas");
		pessoa1.setIdade(27);
		
		System.out.println("Seu nome é " + pessoa1.getNome() + 
				" e você tem "+ (pessoa1.getIdade()));
		
	}

}