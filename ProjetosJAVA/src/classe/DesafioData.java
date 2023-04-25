package classe;

public class DesafioData {
	int dia;
	int mes;
	int ano;

	// CONSTRUTOR padrao
	DesafioData() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	// outro construtor
	DesafioData(int diaInicial, int mesInicial, int anoInicial) {
		this.dia = diaInicial;
		this.mes = mesInicial;
		this.ano = anoInicial;
	}

	String obterDataFormatada() {
		return String.format("%d%d%d", dia, mes, ano);
	}
}