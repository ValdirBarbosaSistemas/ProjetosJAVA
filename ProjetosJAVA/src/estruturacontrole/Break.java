package estruturacontrole;

public class Break {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
/* Lembrando que o BREAK só serve para WHILE, FOR, SWITCH. Ele não serve para o IF. Quando ocorrer isso
 * deve ser porque ele está associado a um WHILE, FOR, SWITCH */