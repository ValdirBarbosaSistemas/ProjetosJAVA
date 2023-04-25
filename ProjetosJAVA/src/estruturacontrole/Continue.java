package estruturacontrole;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("FIM!");
	}
}
/* o 'Continue' não vai imprimir o valor ditado, ou seja, ele não vai imprimir o valor 2 no caso do i,
 * ele passa direto e imprime o resto. ou seja Ex: 0,1,3,4... 
 */