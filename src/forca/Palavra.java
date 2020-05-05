package forca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palavra {
	private Tipo tipo;
	private List<String> nome = new ArrayList<>();
	
	public Palavra(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public void nome (String nome) {
		this.nome.add(nome);
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String sorteioNome(){
		Collections.shuffle(nome) ;
		return nome.get((int)Math.random() * nome.size());
	}

	public String toString() {
		return ("-> " + tipo + ": " + this.nome);
	}

		
	
	
}
