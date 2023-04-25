package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 7; // Função para filtro
		Function<Aluno, Double> apenasNota = a -> a.nota; // Função para mapeamento

		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);

		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

		Media media = alunos.stream() // Criação da stream
				.filter(aprovado) // Operação intermediária
				.map(apenasNota) // Operação intermediária
				.reduce(new Media(), calcularMedia, combinarMedia); // Operação Terminal
		/*
		 * Nós temos 3 funções em REDUCE, que no caso é OPTIONALINTEGER, O segundo é
		 * passar o valor inicial que é o identity e o binariOperator, e o terceiro é
		 * receber um valor inicial, um acumulador, e o combinador, que no caso ele é um
		 * BinaryOperator e serve para combinar os valores. Para este tipo de assinatura
		 * é OBRIGATÓRIO passar os 3 atributos.
		 */
		System.out.println("A média dos alunos é: " + media.getValor());
	}
}
