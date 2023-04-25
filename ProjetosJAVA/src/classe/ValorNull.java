package classe;

public class ValorNull {
	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.concat("!!!"));
		String s2 = null; 
		// O valor nunca sera acessado devido ao valor null. Voce nao pode acessar nem atributo ou metodo que esta NULO
		// System.out.println(s2.concat("????"));
		System.out.println(s2);
	}
}
