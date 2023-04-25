package orientacaoObjeto.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();

	void testeAcesso() {
		System.out.println(esposa.facoDentroDeCasa); // Teve acesso pois é PACKAGE/padrão
		System.out.println(esposa.formaDeFalar); // Teve acesso pois é PROTECTED
		System.out.println(esposa.todosSabem); // Teve acesso pois é PUBLIC
// O único que não teve acesso foi o PRIVATE, pois o private só tem acesso na mesma classe
	}
}