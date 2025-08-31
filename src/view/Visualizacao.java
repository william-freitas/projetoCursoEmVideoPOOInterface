package view;

public class Visualizacao {

	private Gafanhoto espectador;
	private Video filme;
	
	
	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}


	public Gafanhoto getEspectador() {
		return espectador;
	}


	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}


	public Video getFilme() {
		return filme;
	}


	public void setFilme(Video filme) {
		this.filme = filme;
	}


	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porcentagem) {
		int nota = 0;
		if (porcentagem <= 20) {
			nota = 3;
		}else if (porcentagem <= 50) {
			nota = 5;
		}else if (porcentagem <= 80) {
			nota = 8;
		}else {
			nota = 10;
		}
		this.filme.setAvaliacao(nota);
	}
	
}
