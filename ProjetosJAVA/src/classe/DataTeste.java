package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data(); // Acesso ao construtor padrão

		System.out.printf(d1.obterDataFormatada());

		var d2 = new Data(31, 01, 2020); // Acesso ao construtor criado

		System.out.printf(d2.obterDataFormatada());
	}
}
