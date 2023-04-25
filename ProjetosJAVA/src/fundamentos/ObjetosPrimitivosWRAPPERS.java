package fundamentos;
// Wrappers são a versão OBJETO dos tipos primitivos!
public class ObjetosPrimitivosWRAPPERS {
	public static void main(String[] args) {
		Character c = 'a'; 
		Boolean bo = true;
		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4L;
		Float f = 5.1f;
		Double d = 6.1;
		System.out.println(bo.toString().length());
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		/*bo.toString (Serve para transformar o caracter 'bo' para STRING) e
		 * retorna o tamanho com o '.length'
		 */
		
		/*Objetos Primitivos em java só haverá mudança na declaração do 'char' e
		 * no 'int', que serão 'Character' e 'Integer'. Os demais só a primeira 
		 * letra que será MAIÚSCULA.
		 */
	}
}
