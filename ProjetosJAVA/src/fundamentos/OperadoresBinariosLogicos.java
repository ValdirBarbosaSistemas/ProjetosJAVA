package fundamentos;

public class OperadoresBinariosLogicos {
	public static void main(String[] args) {
		boolean executouTrabalho01 = false;
		boolean executouTrabalho02 = true;
		
		boolean comprouSorvete = executouTrabalho01 || executouTrabalho02; // OU
		boolean comprouTv50 = executouTrabalho01 && executouTrabalho02; // E
		boolean comprouTv32 = executouTrabalho01 ^ executouTrabalho02; // OUExclusivo
		
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("Tv50 = " + comprouTv50);
		System.out.println("Tv32 = " + comprouTv32);
		//Operador UNÁRIO intruso kkk...
		System.out.println("Fome = " + !comprouSorvete); //NEGAÇÃO
	}
}
