package br.ufc.poo.misto.modelo;

public class Carro {
	public String modelo;
	public String cor;
	public int ano;
	public int velocidade;

	public Carro() {
		this.modelo = "Celta";
		this.cor = "Preto com Branco";
		this.ano = 2018;
		this.velocidade = 0;
	}
	
	public Carro(int ano, String modelo) {
		this.modelo = modelo;
		this.ano = ano;
		this.velocidade = 0;
		this.cor = "Sou o outro construtor";
	}
	
	
	public void acelerar() {
		this.velocidade += 10;
	}
		public void buzinar() {
		System.out.println("Fon fon");
	}
		public void frear() {
		this.velocidade -= 10;
	}
	
	public void darPartida() {
		System.out.println("O carro ligou !!!");
	}
	
	public void desligar() {
		System.out.println("O carro desligou!!");
		this.velocidade = 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
