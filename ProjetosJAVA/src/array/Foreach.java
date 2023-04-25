package array;

public class Foreach {
	public static void main(String[] args) {
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };

		// cria-se o nome FOR e depois o nome da variavel... ':' e o nome do array colocado
		for (double nota : notas) { //para cada elemento ele vai fazer um incremento
			System.out.println(nota);
		}
	}
}
