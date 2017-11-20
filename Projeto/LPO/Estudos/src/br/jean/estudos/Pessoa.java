package br.jean.estudos;

import java.util.ArrayList;

public abstract class Pessoa {
	private ArrayList <String> nome = new ArrayList<String>(), sobrenome = new ArrayList<String>(), dataNascimento = new ArrayList<String>();
	private ArrayList <Integer> codigo = new ArrayList<Integer>();
	
	protected ArrayList<Integer> getCodigo() {
		return codigo;
	}

	protected void setCodigo(int codigo) {
		this.codigo.add(codigo);
	}

	protected ArrayList<String> getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome.add(nome);
	}

	protected ArrayList<String> getSobrenome() {
		return sobrenome;
	}

	protected void setSobrenome(String sobrenome) {
		this.sobrenome.add(sobrenome);
	}

	protected ArrayList<String> getDataNascimento() {
		return dataNascimento;
	}

	protected void setDataNascimento(String dataNascimento) {
		this.dataNascimento.add(dataNascimento);
	}
}
