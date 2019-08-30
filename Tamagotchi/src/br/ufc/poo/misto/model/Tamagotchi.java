package br.ufc.poo.misto.model;

public class Tamagotchi {
	
	private int energiaMax, saciedadeMax, limpezaMax;
	private int energia, saciedade, limpeza;
	private int diamantes, idade;
	private boolean vivo;
	
	public Tamagotchi(int energiaMax, int limpezaMax, int saciedadeMax) {
		this.energiaMax = energiaMax;
		this.limpezaMax = limpezaMax;
		this.saciedadeMax = saciedadeMax;
		this.diamantes = 0;
		this.vivo = true;
		this.idade = 0;
	}
	
	public void inicializar() {
		this.energia = this.energiaMax;
		this.limpeza = this.limpezaMax;
		this.saciedade = this.saciedadeMax;
		System.out.println("Começando o jogo!");
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}	
	public void setSaciedade(int saciedade) {
		this.saciedade = saciedade;
	}
	public void setLimpeza(int limpeza) {
		this.limpeza = limpeza;
	}
	
	public int getEnergia() {
		return this.energia;
	}	
	public int getLimpeza() {
		return this.limpeza;
	}
	public int getSaciedade() {
		return this.saciedade;
	}
	public int getEnergiaMax() {
		return this.energiaMax;
	}	
	public int getLimpezaMax() {
		return this.limpezaMax;
	}
	public int getSaciedadeMax() {
		return this.saciedadeMax;
	}
	
	public void jogar() {
		if(vivo) {
			if(this.energia-2>0 && this.limpeza-3>0 && this.saciedade-1>0) {
				this.energia -= 2;
				this.limpeza -= 3;
				this.saciedade--;
				System.out.println("To jogando e ganhando !");
			}else {
				this.energia -= 2;
				this.limpeza -= 3;
				this.saciedade--;
				this.vivo = false;
				System.out.println("Morri X.X");
			}
			this.idade++;
			this.diamantes++;
		}else {
			System.out.println("To morto X.X !!!! ");
		}
	}
	
	public void comer() {
		if(vivo) {
			if(energia-1>0 && limpeza-2>0) {
				this.energia--;
				this.limpeza -=2;
				System.out.println("To comendo no RU");
			}else {
				this.energia--;
				this.limpeza -=2;
				this.vivo = false;
				System.out.println("Morri X.X");
			}
			if(this.saciedade+4<this.saciedadeMax) {
				this.saciedade += 4;
			}
					
			this.idade++;
		}else {
			System.out.println("To morto não da pra comer!");
		}
	}
	
	public void dormir() {
		if(vivo) {
			int difEnergia = this.energiaMax - this.energia;
			System.out.println("Dormi por "+difEnergia);
			System.out.println("Envelheci "+difEnergia+" anos");
			this.energia = this.energia + difEnergia;
			this.idade = this.idade + difEnergia;
		}else {
			System.out.println("Já estou dormindo X.X");
		}
	}
	
	public void tomarBanho() {
		if(vivo) {
			if(this.energia-3>0 && this.saciedade-1 >0) {
				this.energia -= 3;
				this.saciedade--;
			}else {
				this.energia -= 3;
				this.saciedade--;
				this.vivo = false;
				System.out.println("Morri X.X");
			}
			this.limpeza = this.limpezaMax;
			this.idade+=2;
		}else {
			System.out.println("Nem é sabado, to morto não importa mais");
		}
	}
	
	
	@Override
	public String toString() {
		String informacao = "";		
		informacao += "Idade :"+this.idade+"\n";
		informacao += "Diamantes: "+this.diamantes+"\n";
		informacao += "Energia / EnergiaMax :"+this.energia+"/"+
		this.energiaMax+"\n";
		informacao += "Saciedade / SaciedadeMax :"+this.saciedade+"/"+
				this.saciedadeMax+"\n";
		informacao += "Limpeza / LimpezaMax :"+this.limpeza+"/"+
				this.limpezaMax+"\n";
		return informacao;
	}
	
	
	
	

}
