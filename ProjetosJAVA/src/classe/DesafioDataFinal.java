package classe;

public class DesafioDataFinal {
	public static void main(String[] args) {
		DesafioData d1 = new DesafioData();
		// d1.dia = 7;
		// d1.mes = 11;
		// d1.ano = 2021;

		DesafioData d2 = new DesafioData(31, 12, 2020);
		// d2.dia = 2;
		// d2.mes = 3;
		// d2.ano = 1987;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}