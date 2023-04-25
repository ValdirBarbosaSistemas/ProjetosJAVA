package orientacaoObjeto.abstrato;

public abstract class Animal {

	/*
	 * O conceito de Classe abstrata refere-se que na classe NÃO SE PODE COLOCAR
	 * 'CORPO' NO MÉTODO, ou seja, só se coloca a assinatura do método. Só se é
	 * possível ter método abstrato em classe abstrata. Pode ser feito um método
	 * 'normal' em uma classe abstrata. Outra observação é que só se coloca
	 * classe/método abstrato quando 'não se sabe como colocar um tal método, como
	 * se faz etc, por isso que não se coloca o corpo em um método abstrato. ' Outra
	 * observação é que quando se tem uma herança de uma classe abstrata, para uma
	 * classe normal/concreta, obrigatoriamente tem que ser chamado o método
	 * abstrato dela(No caso da classe abstrata). NÃO SE PODE INSTANCIAR CLASSE
	 * ABSTRATA
	 */

	// Pode ser feito um método tradicional em classe abstrata
	public String respirar() {
		return "CO2";
	}

	public abstract String mover();
}
