package orientacaoObjeto.testeFinalHeranca;

import orientacaoObjeto.heranca.Heroi;
import orientacaoObjeto.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Heroi jogador1 = new Heroi(10, 10);
		// jogador1.x = 10; variável inicial
		// jogador1.y = 10; variável inicial

		Monstro jogador2 = new Monstro();
		jogador2.x = 10; // variável inicial
		jogador2.y = 11; // variável inicial

		System.out.println("Heroi tem =>" + jogador1.vida);
		System.out.println("Monstro tem =>" + jogador2.vida);

		jogador1.atacar(jogador2);
		jogador2.atacar(jogador1);

		System.out.println("Heroi tem =>" + jogador1.vida);
		System.out.println("Monstro tem =>" + jogador2.vida); // Neste caso o jogador 2 perdeu a vida e fica com 90

		/*
		 * jogador1.andar(Direcao.NORTE); jogador1.andar(Direcao.LESTE);
		 * jogador1.andar(Direcao.SUL); jogador1.andar(Direcao.OESTE);
		 */
	}
}
