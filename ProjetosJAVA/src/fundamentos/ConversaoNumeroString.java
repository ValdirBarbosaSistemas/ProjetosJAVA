package fundamentos;

import javax.swing.JOptionPane;

//CONVERSÃO STRING EM NÚMERO
public class ConversaoNumeroString {
	public static void main(String[] args) {
		String resposta01 = JOptionPane.showInputDialog("Qual é a primeira nota?"); 
		String resposta02 = JOptionPane.showInputDialog("Qual é a segunda nota?"); 
		/*
		 * A classe 'JOptionPane' serve para criar uma janela de perguntas, ou seja, não vai aparecer
		 * no console e sim é uma classe do tipo 'visual' OBS. TEM QUE USAR O IMPORT
		 * 
		 * OBS: o JOptionPane recebe valores STRINGS por padrão
		 */
		System.out.println(resposta01 + resposta02);

		// Converter String em double

		double nota1 = Double.parseDouble(resposta01);
		double nota2 = Double.parseDouble(resposta02);
		double total = nota1 + nota2;

		System.out.println(total / 2);
		/* Os tipos de conversão são: 
		 * 
		 * 		INTEIROS 
		 * Byte.parseByte("1");
		 * Short.parseShort("2"); 
		 * Integer.parseInt("3"); 
		 * Long.parseLong("4");
		 * 
		 * 		REAIS 
		 * Float.parseFloat("1,2"); 
		 * Double.parseDouble("2.4");
		 * 
		 * BOOLEANO = Boolean.parseBoolean("false");
		 */

// CONVERSÃO NÚMERO EM STRING
		
			Integer num1 = 10000; // WRAPPER
			System.out.println(num1.toString().length());
	// Sabemos que quando criamos a classe 'Integer' para inteiros, através do ponto que temos
	// o acesso as funcionalidades dela.
			int num2 = 100000;
			System.out.println(Integer.toString(num2).length());
			// VOCE CONSEGUE FAZER A CONVERSÃO USANDO O WRAPPER
		//Outra forma de voce fazer a conversão é utilizando diretamente o 'Integer'
			 
	}
}
