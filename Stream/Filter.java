package stream;

import java.util.Arrays;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Lucas", 10);
		Aluno a2 = new Aluno("Cirleane", 6);
		Aluno a3 = new Aluno("Marcos", 5);
		Aluno a4 = new Aluno("Pedro", 7);
		Aluno a5 = new Aluno("Luiz", 5);
		Aluno a6 = new Aluno("Gustavo", 9);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		alunos.stream()
		.filter(a -> a.nota >=7)
		.map(a -> "Parabéns " + a.nome + " Você foi aprovado \n")
		.forEach(System.out::print);
		
	}

}