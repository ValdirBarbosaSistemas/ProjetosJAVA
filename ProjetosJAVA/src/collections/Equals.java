package collections;

public class Equals {
	public static void main(String[] args) {
		UsuarioEquals u1 = new UsuarioEquals();
		u1.nome = "Pedro Silva";
		u1.email = "valdir.barbosasistemas@gmail.com";

		UsuarioEquals u2 = new UsuarioEquals();
		u2.nome = "Pedro Silva";
		u2.email = "valdir.barbosasistemas@gmail.com";

		System.out.println(u1 == u2); // FALSE

		System.out.println(u1.equals(u2)); // FALSE (agora implementado com o equals na outra classe (UsuarioEquals) ira ser TRUE 
		System.out.println(u2.equals(u1)); //TRUE
		
		/* O metodo EQUALS ira fazer comparacao entre objetos. Ele tem que ser criado/implementado 
		 * para depois ser utilizado na comparacao. No caso do HASH, ele faz comparacao tambem, porem
		 * ele retorna um numero inteiro. No caso do EQUALS retorna true ou false 
		 */
	}
}
