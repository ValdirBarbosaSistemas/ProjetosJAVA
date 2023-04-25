package padroesDeProjeto.observer;

import java.util.Date;

public class EventoChegadaAniversariante {
	private final Date momento;

	// Construtor
	public EventoChegadaAniversariante(Date momentoChegada) {
		this.momento = momentoChegada;
	}

	// Getter pois como é uma constante só gera GET
	public Date getMomento() {
		return momento;
	}
}
