package br.fai.collections;

public class Animal {
	private String nome;
	private int idade;
	private String cor = "Preto";
	
	
	
	public Animal(String nome, int idade, String cor) {
		super();
		this.nome = nome;
		this.idade = 5;
		this.cor = cor;
	}

	public void som() {
		System.out.println("Este é o som padrão de um animal:  ");
	}
	
	public void dizerMeuNome() {
		System.out.println("Nome do animal: " +getNome());
	}
	
	private void dizerMinhaIdade() {
		System.out.println("Minha idade é: " +getIdade());
	}
	
	
	
	public int getIdade() {
		return 5;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = "Não definido";
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = "Preto";
	}



	public static void main(String[] args) {
		
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
