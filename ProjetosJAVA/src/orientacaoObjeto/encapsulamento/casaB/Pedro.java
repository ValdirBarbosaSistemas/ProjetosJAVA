package orientacaoObjeto.encapsulamento.casaB;

import orientacaoObjeto.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	// Ana mae = new Ana(); EM HERANÇA NÃO É NECESSÁRIO INSTANCIAR A CLASSE 'ANA'

	void testeAcesso() {
		System.out.println(todosSabem); // Teve acesso pois é PUBLIC
		System.out.println(formaDeFalar); // Teve acesso pois é PROTECTED
		/*
		 * O único que não teve acesso foi o PRIVATE e o PACKAGE, pois o private só tem
		 * acesso na mesma classe e o package só tem acesso no mesmo pacote.
		 */

		/*
		 * OBS: Em HERANÇA não é necessário voce ter acesso aos atributos pelo sinal
		 * '.', ou seja, (Ex: Ana.todosSabem). Com herança é só colocar o nome do
		 * atributo para se ter o acesso DIRETAMENTE, já que PEDRO herdou de ANA os seus
		 * atributos.
		 */
	}
}