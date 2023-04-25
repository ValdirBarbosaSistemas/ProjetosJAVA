package orientacaoObjeto.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Valdir Barbosa";
		c1.item.add(new Item("Feijão", 2, 3.50));
		c1.item.add(new Item("Macarrão", 1, 2.0));
		c1.item.add(new Item("Carne", 1, 10.0));
		
		System.out.println(c1.item.size());
		System.out.println(c1.obterValorTotal());
	}
}
