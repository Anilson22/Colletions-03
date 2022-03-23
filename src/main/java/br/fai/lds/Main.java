package br.fai.lds;

import br.fai.models.Cachorro;
import br.fai.models.Gato;

public class Main {

	public static void main(String[] args) {
		Main App = new Main();
		App.start();

	}
	public static void start() {
		
		Cachorro cao = new Cachorro("Max", 0, "Azul");
		Cachorro cao2 = new Cachorro("Eren", 0, "Preto");
		
		Gato cat = new Gato("garfield", 0, "Branco");
		Gato cat2 = new Gato("Abigail ", 0, "Preto");
		
		cao.som();
		cao.dizerMeuNome();
		cao.oQueGostoDeFazer();
		System.out.println("Cor do cachorro: " + cao.getCor());
	    System.out.println("------"); 

		
		cao2.som();
		cao2.dizerMeuNome();
		cao2.oQueGostoDeFazer();
		System.out.println("Cor do cachorro: " + cao2.getCor());
	    System.out.println("------");
	    
	    
	    cat.som();
	    cat.dizerMeuNome();
	    cat.oQueFacoDuranteANoite();

	    System.out.println("Cor do gato: " + cat.getCor());
	    System.out.println("------");
	    
	    cat2.som();
	    cat2.dizerMeuNome();
	    cat2.oQueFacoDuranteANoite();

	    System.out.println("Cor do gato: " + cat.getCor());
	    System.out.println("------");


}

}