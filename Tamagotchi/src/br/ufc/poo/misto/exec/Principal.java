package br.ufc.poo.misto.exec;

import br.ufc.poo.misto.model.Tamagotchi;

public class Principal {

	public static void main(String[] args) {
		Tamagotchi pou = new Tamagotchi(20,15,10);
		pou.inicializar();
		System.out.println(pou);
		pou.jogar();
		System.out.println(pou);
		pou.comer();
		System.out.println(pou);
		pou.tomarBanho();
		System.out.println(pou);
		pou.dormir();
		System.out.println(pou);
		for(int i = 0; i<10; i++) {
			pou.jogar();
			System.out.println(pou);
		}

	}

}
