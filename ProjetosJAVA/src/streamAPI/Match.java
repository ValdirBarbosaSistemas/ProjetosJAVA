package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {
		/*
		 * O Match serve para se ter uma 'comparação' ou pra ver se ta 'batendo as
		 * informações' para ver se tá tudo certo. Ele retorna verdadeiro ou falso para
		 * o resultado e também usa um PREDICATE como interface funcional. Outra coisa
		 * também é que o Match é uma função TERMINAL.
		 */
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 7; // Função para filtro
		System.out.println(alunos.stream().allMatch(aprovado)); // O resultado será false
		System.out.println(alunos.stream().anyMatch(aprovado)); // Algum foi aprovado?
		System.out.println(alunos.stream().noneMatch(aprovado)); // Nenhum foi aprovado?
	}
}
