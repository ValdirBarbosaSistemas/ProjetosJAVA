package lambdas;

@FunctionalInterface // A anottation serve para validar algo
public interface Calculo {
	double executar(double a, double b);
	// double teste(); vai dÃ¡ erro, pois jÃ¡ Ã© um segundo mÃ©todo e sÃ³ pode ser apenas UM

	/*
	 * A interface funcional (@FunctionalInterface) sÃ³ Ã© vÃ¡lida em apenas UMA
	 * EXPRESSÃƒO DE MÃ‰TODO. Se for mais de uma dÃ¡ erro. ISSO Ã‰, SE
	 * A @FunctionalInterface FOR CHAMADA. OBS 2 - CASO VOCE QUEIRA DEFINIR LAMBDAS
	 * NA INTERFACE Ã‰ NECESSÃ�RIO USAR O @FunctionalInterface, pois as lambdas sÃ³
	 * sÃ£o validadas atravÃ©s do @FunctionalInterface.
	 */
	// Ã‰ possÃ­vel colocar em uma interface um mÃ©todo do tipo DEFAUT e tambÃ©m STATIC
	
	default String legal () {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}
	
	/**
	 * Podemos utilizar métodos estáticos e do
	 * tipo default com o corpo do método por
	 * completo.
	 */
}
