package classe.desafio;

public class DesafioProgramaJantar {
	public static void main(String[] args) {
		DesafioComida c1 = new DesafioComida("Arroz", 2); 
		DesafioComida c2 = new DesafioComida("Feijão", 3);
		
		DesafioPessoa p1 = new DesafioPessoa("João", 70);
		
		System.out.println(p1.apresentacao());
		p1.comer(c1);
		p1.comer(c2);
		System.out.println(p1.apresentacao());
	}
}
