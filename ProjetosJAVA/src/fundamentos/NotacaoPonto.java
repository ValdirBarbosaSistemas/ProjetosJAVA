package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia ?".toUpperCase().replace("?", "Bia").concat("!");
		/*
		 * Neste caso '.toUpperCase' serve para deixar a palavra MAIUSCULA e '.replace'
		 * serve para 'trocar' a palavra pela a inserida pelo usuario '.concat' serve
		 * para concatenar. PODERIA SER ASSIM TAMBEM: s = "Bom dia ?".toUpperCase(); s =
		 * s.replace ("?","Bia"); s = s.concat("!");
		 */
		System.out.println(s);
	}
}
