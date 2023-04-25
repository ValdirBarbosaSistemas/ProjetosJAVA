package fundamentos;
// Wrappers s�o a vers�o OBJETO dos tipos primitivos!
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
		
		/*Objetos Primitivos em java s� haver� mudan�a na declara��o do 'char' e
		 * no 'int', que ser�o 'Character' e 'Integer'. Os demais s� a primeira 
		 * letra que ser� MAI�SCULA.
		 */
	}
}
