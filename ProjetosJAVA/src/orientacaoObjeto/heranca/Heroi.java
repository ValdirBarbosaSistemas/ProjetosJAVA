package orientacaoObjeto.heranca;

public class Heroi extends Jogador {

	// Dessa forma chamamos o construtor da classe SUPER
	public Heroi(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
		// O método SUPER ele serve para chamar o método da superclasse
	}
}
/*
 * boolean atacar(Jogador oponente) { int deltaX = Math.abs(x - oponente.x);
 * //Math.abs 'ele ta fazendo o valor absoluto (Ex. -1 ele vai dar 1)' int
 * deltaY = Math.abs(y - oponente.y);
 * 
 * if (deltaX == 0 && deltaY == 1) { oponente.vida -= 20; return true; } else if
 * (deltaX == 1 && deltaY == 0) { oponente.vida -= 20; } else { return true; }
 * return false; } POSSO SOBRESCREVER DESSE MODO, OU SEJA, COPIAR O MÉTODO DO
 * JOGADOR E ALTERAR ALGO A MAIS
 */
