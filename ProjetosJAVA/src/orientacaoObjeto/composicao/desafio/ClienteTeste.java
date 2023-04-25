package orientacaoObjeto.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		Compras compra1 = new Compras();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000), 1);

		Compras compra2 = new Compras();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000), 1);

		Cliente cliente1 = new Cliente("Maria Julia Moraes");
		cliente1.compra.add(compra1);
		cliente1.compra.add(compra2);

		System.out.print(cliente1.obterValorTotal());
	}
}