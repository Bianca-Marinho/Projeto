package br.jean.estudos;
import java.util.ArrayList;

public class Testador extends Pessoa{	
	private ArrayList <String> dataInicio = new ArrayList<String>(), dataFim = new ArrayList<String>();

	protected ArrayList<String> getDataInicio() {
		return dataInicio;
	}

	protected void setDataInicio(String dataInicio) {
		this.dataInicio.add(dataInicio);
	}

	protected ArrayList<String> getDataFim() {
		return dataFim;
	}

	protected void setDataFim(String dataFim) {
		this.dataFim.add(dataFim);
	}
	
}
