package br.fai.collections;

public class Animal {
	private String nome;
	private int idade;
	private String cor;
	
	
	
	public Animal(String nome, int idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public void som() {
		System.out.println("Este � o som padr�o de um animal:  zzz");
	}
	
	public void dizerMeuNome() {
		System.out.println("Nome do animal: ");
	}
	
	private void dizerMinhaIdade() {
		System.out.println("Minha idade �: ");
	}
	
	
	
	public int getIdade() {
		return 5;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = "N�o definido";
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = "Preto";
	}



//	public static void main(String[] args) {
		
		
//	}

}
