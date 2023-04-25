package fundamentos;

public class VariaveiseConstantes {
	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		/*
		 * para se criar constantes, usa-se a palavra 'FINAL' no início e logo a variável
		 * TODA MAIUSCULA. VARIÁVEIS SÃO COM LETRAS MINÚSCULAS LEMBRAR DE 'CAMEOCASE'
		 */
		double area = PI * raio * raio;

		System.out.println("A area e: " + area + "M2"); // concatenação
		System.out.printf("A area e: %fM2 \n", area); // print formatado
		/*
		 * Neste caso usa-se o '%f' para calcular o float, ou seja, substituir dentro do
		 * texto onde tem pela variável que você passou, ou seja, 'area' O 'PRINTF'
		 * GERALMENTE É PARA USAR COM FORMATAÇÃO LEMBRANDO QUE O SINAL '\N' SERVE PARA
		 * QUEBRAR A LINHA DEVIDO AO 'PRINTF' NÃO QUEBRAR A LINHA COMO O 'PRINTLN'
		 */
		System.out.printf("A area e: %.2fM2", area);
		// Neste caso '%.2f' Serve para deixar com 2 casas decimais o cálculo

	}
}
