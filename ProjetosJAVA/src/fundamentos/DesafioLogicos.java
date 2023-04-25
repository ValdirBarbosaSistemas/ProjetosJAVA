package fundamentos;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
	
		boolean trabalho01 = true;
		boolean trabalho02 = false;
		
		boolean comprouTV50 = trabalho01 && trabalho02;
		boolean comprouTV32 = trabalho01 ^ trabalho02;
		boolean comprouSorvete = trabalho01 || trabalho02;
		
		// Operador Un�rio
		
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais Saudavel? " + maisSaudavel);
	}	
}
