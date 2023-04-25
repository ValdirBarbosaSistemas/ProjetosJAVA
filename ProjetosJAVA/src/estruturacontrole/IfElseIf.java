package estruturacontrole;

import javax.swing.JOptionPane;

public class IfElseIf {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Digite a nota informada");
		double nota = Double.parseDouble(valor);	
		if (nota >= 9) {
			System.out.println("Quadro de honra!!!");
		} else if (nota >= 7) {
			System.out.println("Aprovado!!!");
		} else if (nota >= 5.5) {
			System.out.println("Recuperacao!!!");
		} else if (nota >= 3.5) {
			System.out.println("Recuperacao + Trabalho!");
		} else {
			System.out.println("Reprovado!!!");
		}
		
	}
}
