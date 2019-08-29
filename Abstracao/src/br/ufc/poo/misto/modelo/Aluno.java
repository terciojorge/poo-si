package br.ufc.poo.misto.modelo;

public class Aluno {
	private String nome;
	private int idade;
	private String curso;
	private double ira;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
    public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getIra() {
		return ira;
	}
	public void setIra(double ira) {
		this.ira = ira;
	}
	public void estudar(String materia) {
    	System.out.println("Estou estudando");
    	System.out.println(materia);
    	System.out.println("----------------");
    }
    
    public void matricular(String disciplina) {
    	System.out.println("Me matriculei: ");
    	System.out.println(disciplina);
    	System.out.println("=================");
    }
    
    @Override
    public String toString() {
    	String informacao;
    	informacao = "O nome do aluno é: "
    	+this.nome+"\n";
    	informacao += "O curso do aluno é: "
    	+this.curso+"\n";
    	informacao += "O ira do aluno é: "
    	+this.ira+"\n";
    	informacao += "A idade do aluno é: "
    	+this.idade;
    	return informacao;
    	
    	//idade > 0 
    	// ira > 0
    	// curso (SI, ES, CC, EC, DD, RC )
    	// toString só mostra se o ira > 8
    	
    	
    	
    }


}
