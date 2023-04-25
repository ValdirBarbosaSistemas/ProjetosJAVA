package fundamentos;

public class VariaveiseConstantes {
	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		/*
		 * para se criar constantes, usa-se a palavra 'FINAL' no in�cio e logo a vari�vel
		 * TODA MAIUSCULA. VARI�VEIS S�O COM LETRAS MIN�SCULAS LEMBRAR DE 'CAMEOCASE'
		 */
		double area = PI * raio * raio;

		System.out.println("A area e: " + area + "M2"); // concatena��o
		System.out.printf("A area e: %fM2 \n", area); // print formatado
		/*
		 * Neste caso usa-se o '%f' para calcular o float, ou seja, substituir dentro do
		 * texto onde tem pela vari�vel que voc� passou, ou seja, 'area' O 'PRINTF'
		 * GERALMENTE � PARA USAR COM FORMATA��O LEMBRANDO QUE O SINAL '\N' SERVE PARA
		 * QUEBRAR A LINHA DEVIDO AO 'PRINTF' N�O QUEBRAR A LINHA COMO O 'PRINTLN'
		 */
		System.out.printf("A area e: %.2fM2", area);
		// Neste caso '%.2f' Serve para deixar com 2 casas decimais o c�lculo

	}
}
