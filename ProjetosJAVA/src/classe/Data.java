package classe;

public class Data {
	int dia;
	int mes;
	int ano;

	// Construtor Padrão
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	// Construtor
	Data(int diaInicial, int mesInicial, int anoInicial) {
		this.dia = diaInicial;
		this.mes = mesInicial;
		this.ano = anoInicial;

	}

	// Método
	String obterDataFormatada() {
		return String.format("%d%d%d\n ", dia, mes, ano);
	}
}
