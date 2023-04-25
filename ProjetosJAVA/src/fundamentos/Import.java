package fundamentos;

import java.util.Date;

public class Import {
	public static void main(String[] args) {
		Date d = new Date(); // Os imports são colocados fora da classe
		Double a = 2.0;
		// Ele nao vai funcionar devido ao import dele nao ter sido chamado
		System.out.println(a); // import embutido do proprio Java (java.lang)
		System.out.println(d);
	}
	/*
	 * Existem 'imports' que ja estao embutidos no sistema JAVA. Como sabemos o
	 * 'System' e um deles e o Double tambem (Java.lang). Para chamarmos os imports
	 * (que sao muitos e nao tem como decora-los basta ir no teclado pelo atalho
	 * 'Control' + a tecla 'Espaco' e tambem temos o 'Control' + 'Shift' + (Letra
	 * 'O')
	 */

}
