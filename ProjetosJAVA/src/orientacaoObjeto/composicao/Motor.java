package orientacaoObjeto.composicao;

public class Motor {
	double fatorInjecao = 1;
	boolean ligado = false;

	int giro() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		// Aqui ele ta arredondando o valor (ex. se for 2.995 ele arredonda pra os 3000) e fazendo o cast pra int
		}
	}
}
