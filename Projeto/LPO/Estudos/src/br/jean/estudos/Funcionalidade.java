package br.jean.estudos;
import java.util.ArrayList;

public class Funcionalidade {
	private ArrayList <String> funcao = new ArrayList<String>();
	private ArrayList <Integer> codigo = new ArrayList<Integer>();
	private ArrayList <Integer> codigoSoft = new ArrayList<Integer>();

	protected Funcionalidade(int codigoSoft, String funcao, int codigo){
		this.funcao.add(funcao);
		this.codigoSoft.add(codigoSoft);
		this.codigo.add(codigo);
	}
	protected Funcionalidade() {
		
	}
		
	protected ArrayList<Integer> getCodigoSoft() {
		return codigoSoft;
	}
	protected void setCodigoSoft(int codigoSoft) {
		this.codigoSoft.add(codigoSoft);
	}
	protected ArrayList<String> getFuncao() {
		return funcao;
	}
	protected void setFuncao(String funcao) {
		this.funcao.add(funcao);
	}
	protected ArrayList<Integer> getCodigo() {
		return codigo;
	}
	protected void setCodigo(int codigo) {
		this.codigo.add(codigo);
	}
}
