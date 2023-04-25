package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2"); //true
		
		String s1 = new String("2");
		System.out.println("2" == s1); // vai dar falso pois o sinal de '==' não serve para comparar STRING
		System.out.println("2".equals(s1)); // vai dar true devido ao 'equals' que serve para comprarar 
											// o conteúdo da STRING
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		System.out.println("2" == s2); // vai dar falso devido a explicação anterior. PARA STRING O USO CORRETO � O 'EQUALS'
		System.out.println("2".equals(s2)); // vai dar TRUE devido a comparação com o 'EQUALS'
		entrada.close();
	
		/* RESUMINDO
		 *  Para comparações com STRING o uso CORRETO não é com o '==' e sim o uso correto seria
		 *  com o 'EQUALS' que é o comparador de STRINGS
		 */
	}
}
