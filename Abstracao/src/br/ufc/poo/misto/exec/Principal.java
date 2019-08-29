package br.ufc.poo.misto.exec;

import br.ufc.poo.misto.modelo.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("aluno");
		aluno.setIra(6.1);
		aluno.setCurso("ES");
		aluno.setIdade(18);
		System.out.println("O nome do aluno:");
		System.out.println(aluno.getNome());
		System.out.println(aluno);
		System.out.println(aluno.toString());
	}

}
