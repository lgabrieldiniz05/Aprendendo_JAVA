package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("lucas", 10);
		Aluno a2= new Aluno("marcos", 9);
		Aluno a3 = new Aluno("cirleane", 7);
		Aluno a4 = new Aluno("joseani", 8);
		Aluno a5 = new Aluno("paulo", 2);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(aprovado));
	}

}