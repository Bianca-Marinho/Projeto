package br.jean.estudos;
import java.util.ArrayList;

public class Desenvolvedor extends Pessoa{
	private ArrayList <String> linguagem = new ArrayList<String>();

	protected ArrayList<String> getLinguagem() {
		return linguagem;
	}

	protected void setLinguagem(String linguagem) {
		this.linguagem.add(linguagem);
	}
}
