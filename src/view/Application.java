package view;

public class Application {

	public static void main(String[] args) {
		//um vetor com 3 videos
		Video videos[] = new Video[3];
		videos[0] = new Video("Aula 1 de POO");
		videos[1] = new Video("Aula 12 de PHP");
		videos[2] = new Video("Aula 10 de HTML5");
		
		//dois usuarios gafanhotos para assistir aos videos disponiveis
		Gafanhoto gafanhoto[] = new Gafanhoto[2];
		gafanhoto[0] = new Gafanhoto("Lili", 10, "F", "Liloca");
		gafanhoto[1] = new Gafanhoto("Lola", 11, "F", "Lola");

		Visualizacao visualizacao[] = new Visualizacao[5];
		visualizacao[0] = new Visualizacao(gafanhoto[0], videos[0]); //lili assiste ao video de POO
		visualizacao[0].avaliar();
		videos[0].like();
		
		System.out.println(visualizacao[0].toString());
		
		visualizacao[1] = new Visualizacao(gafanhoto[1], videos[2] ); //lola assiste ao video de PHP]
		visualizacao[1].avaliar(90);
		
		System.out.println(visualizacao[1].toString());
	}

}
