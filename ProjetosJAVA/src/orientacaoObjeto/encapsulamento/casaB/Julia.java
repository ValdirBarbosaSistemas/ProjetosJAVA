package orientacaoObjeto.encapsulamento.casaB;

import orientacaoObjeto.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();

	void testeAcesso() {
		System.out.println(sogra.todosSabem); // Teve acesso pois é PUBLIC

		/*
		 * O único que não teve acesso foi o PRIVATE, o PACKAGE e o PROTECTED, pois o
		 * private só tem acesso na mesma classe, o package só se tem acesso ao mesmo
		 * pacote e o protected só tem acesso na mesma classe, ou seja, devido a JULIA
		 * não HERDAR os atributos de ANA, só se teve acesso ao PUBLIC.
		 */
	}
}
