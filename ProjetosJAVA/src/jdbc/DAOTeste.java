package jdbc;

public class DAOTeste {
	public static void main(String[] args) {
		/*
		 * Uma vez criado o DAO, ele nao vai mais precisar de lançar excecões do tipo
		 * 'SQLException', pois já foi tratado no DAO visto anteriormente.
		 */
		DAO dao = new DAO();

		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "João da Silva")); // No caso aqui como o atributo não foi passado
																// acima, ele é jogado aqui
		System.out.println(dao.incluir(sql, "Ana Júlia"));
		System.out.println(dao.incluir(sql, "Djalma Pereira"));// Aqui no caso ele vai mostrar os 'ids' criados

		/*
		 * A idéia do padrão de projeto DAO é mostrar que ele serve para tirar os
		 * códigos de banco e 'encapsular' em uma outra classe para usar de maneira mais
		 * 'enxuta' no código.
		 */
	}
}
