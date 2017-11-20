package br.jean.estudos;
import java.util.ArrayList;

public class Teste {
	private ArrayList <String> area = new ArrayList<String>(), ocorrencia = new ArrayList<String>(), tipo = new ArrayList<String>();
	private ArrayList <String> prioridade = new ArrayList<String>(), situacao = new ArrayList<String>(), observacao = new ArrayList<String>();
	private ArrayList <Integer> codigo = new ArrayList<Integer>();
	protected ArrayList<String> getArea() {
		return area;
	}
	protected void setArea(String area) {
		this.area.add(area);
	}
	protected ArrayList<String> getOcorrencia() {
		return ocorrencia;
	}
	protected void setOcorrencia(String ocorrencia) {
		this.ocorrencia.add(ocorrencia);
	}
	protected ArrayList<String> getTipo() {
		return tipo;
	}
	protected void setTipo(String tipo) {
		this.tipo.add(tipo);
	}
	protected ArrayList<String> getPrioridade() {
		return prioridade;
	}
	protected void setPrioridade(String prioridade) {
		this.prioridade.add(prioridade);
	}
	protected ArrayList<String> getSituacao() {
		return situacao;
	}
	protected void setSituacao(String situacao) {
		this.situacao.add(situacao);
	}
	protected ArrayList<String> getObservacao() {
		return observacao;
	}
	protected void setObservacao(String observacao) {
		this.observacao.add(observacao);
	}
	protected ArrayList<Integer> getCodigo() {
		return codigo;
	}
	protected void setCodigo(int codigo) {
		this.codigo.add(codigo);
	}
}
