package br.fai.models;

public class Gato extends Animal {

	public Gato(String nome, int idade, String cor) {
		super(nome, idade, "Branco");
	
	}
	
	
   public void oQueFacoDuranteANoite() {
	   System.out.println("Gosto de pular a cerca toda noite");
   }
   public void som() {
	System.out.println("Eu gosto de Miar");
}
}
