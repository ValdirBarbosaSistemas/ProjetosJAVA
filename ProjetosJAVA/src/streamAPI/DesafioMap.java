package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		/*
		 * 1 - Número para String binária: 6 => "110" 
		 * 2 - Inverter a String "110" para "011" 
		 * 3 - Converter de volta para inteiro: "011" para '3'
		 */

		// 2 - Inverter a String "110" para "011"
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		// O StringBuilder é uma classe que serve para manipular strings em java.
		
		// 3 - Converter de volta para inteiro: "011" para '3'
		
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
				
		nums.stream() // Criação da Stream
		.map(Integer::toBinaryString) // Operação intermediária (Converter Inteiro para Binário)
		.map(inverter) // Operação intermediária
		.map(binarioParaInt) // Operação intermediária
		.forEach(System.out::println); // Operação de terminação
	}
}
