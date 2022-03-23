package br.fai.models;

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

}
