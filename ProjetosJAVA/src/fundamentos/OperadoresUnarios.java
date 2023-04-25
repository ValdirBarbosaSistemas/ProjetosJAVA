package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		//incremento e decremento   // OBS: NUM1++ É A MESMA COISA QUE ++NUM1
		num1++; // num = num + 1
		System.out.println(num1);
		--num1; // num = num - 1
		System.out.println(num1);
		
		System.out.println(++num1 == num2--);
		System.out.println(num1 == num2);
		//Complemento binário
		System.out.println(Integer.toBinaryString(50));
		//Negação
		System.out.println(!true);
	}
}
