package br.fai.collections;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade, String cor) {
		super(nome, idade, cor);
		
	}

	public void oQueGostoDeFazer() {
		System.out.println("Morder carteiros");
	}
}
