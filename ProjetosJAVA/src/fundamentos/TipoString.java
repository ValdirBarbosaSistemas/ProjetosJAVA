package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));// serve para ter a localização/Mostrar a letra
		String s = "Boa tarde";
		System.out.println(s.concat("!!!")); // concatenar 
		System.out.println(s + "!!!"); // concatenar
		System.out.println(s.startsWith("Boa")); // começar com...
		System.out.println(s.toLowerCase().startsWith("boa")); // deixar minuscula e começar com...
		// O 'startsWith' na realidade é para uma comparação se é verdadeiro ou falso
		System.out.println(s.toUpperCase().endsWith("TARDE")); // deixar maiuscula e terminar com...
		// O 'endsWith' na realidade é para uma comparação se é verdadeiro ou falso
		System.out.println(s.length()); // ver o tamanho da frase/letra
		//A String é IMUTÁVEL, ou seja, voce não pode mudar o valor da String
		System.out.println(s.equals("Boa tarde")); // serve para comparação de igualdade
		System.out.println(s.equalsIgnoreCase("boa tarde")); //mesma coisa da anterior diferenciando apenas o case das letras
		
		var nome = "Pedro";// Lembrar de Inferência de tipos
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		//Para não ficar muito extenso, vamos fazer de uma outra maneira conforme abaixo...
		
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		// Usando o print FORMATADO. Ainda tem como 'enxugar' mais...
		
		String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		//Neste caso criou-se uma variável 'frase' para se usar o '.format'... LEMBRAR DO PYTHON...
	}
}
