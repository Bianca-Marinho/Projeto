package br.jean.estudos;
import java.util.ArrayList;

public class Software {
	private ArrayList <String> nome = new ArrayList<String>(), dataCriacao = new ArrayList<String>(), dono = new ArrayList<String>();
	private ArrayList <String> equipe = new ArrayList<String>();
	private ArrayList <Integer> codigo = new ArrayList<Integer>();

	protected Software(String nome, String dataCriacao, String dono, String funcao, String equipe, int codigo){
		this.nome.add(nome);
		this.dataCriacao.add(dataCriacao);
		this.dono.add(dono);
		this.equipe.add(equipe);
		this.codigo.add(codigo);
	}

	protected Software(){

	}
	
	protected ArrayList<Integer> getCodigo() {
		return codigo;
	}

	protected void setCodigo(int codigo) {
		this.codigo.add(codigo);
	}

	protected ArrayList<String> getEquipe() {
		return equipe;
	}

	protected void setEquipe(String equipe) {
		this.equipe.add(equipe);
	}

	protected ArrayList<String> getNome() {
		return nome;
	}
	
	protected void setNome(String nome) {
		this.nome.add(nome);
	}
	
	protected ArrayList<String> getDataCriacao() {
		return dataCriacao;
	}
	
	protected void setDataCriacao(String dataCriacao) {
		this.dataCriacao.add(dataCriacao);
	}
	
	protected ArrayList<String> getDono() {
		return dono;
	}
	
	protected void setDono(String dono) {
		this.dono.add(dono);
	}
		
}
