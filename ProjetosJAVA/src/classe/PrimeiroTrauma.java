package classe;

public class PrimeiroTrauma {

	int a = 3;
	static int b = 4; // outra maneira de ter acesso e criar uma variavel estatica

	public static void main(String[] args) {
		PrimeiroTrauma p = new PrimeiroTrauma();/*
											     * para se ter acesso atraves da variavel a, deve-se chamar 
												 * criando uma instancia.
												 */
		System.out.println(p.a);
		System.out.print(b); // tendo acesso devido a criacao do metodo estatico na variavel B

	}
}