package fundamentos;

public class OperadoresBinariosRelacionais {
	public static void main(String[] args) {
		//Operadores usados: == != >= > <= <
		int num1 = 97;
		int num2 = 'a'; //TABELA UNICODE
		System.out.println(num1 == num2);//vai dar 'true' porque na regra implícita o caracter 'a' dá 97
		System.out.println(3 != 2);
		System.out.println(3 >= 2);
		System.out.println(3 > 2);
		System.out.println(3 <= 3);
		System.out.println(3 < 4);
	}
}
