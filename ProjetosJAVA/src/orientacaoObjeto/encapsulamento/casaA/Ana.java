package orientacaoObjeto.encapsulamento.casaA;

public class Ana {
	@SuppressWarnings("unused")
	private String segredo = "..."; // Nível de visibilidade PRIVATE
	String facoDentroDeCasa = "..."; // Nível de visibilidade PADRÃO (Package/Pacote)
	protected String formaDeFalar = "..."; // Transmitido por HERANÇA ou também no mesmo pacote
	public String todosSabem = "..."; // Nível de visibilidade PÚBLICA
}
