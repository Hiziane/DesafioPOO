package entidades;

public class Departamento {
	private String nome;// tem o sinal de menos no diagrama
	
	public Departamento() { // metodo construtor padrao, � vazio
		
	}

	public Departamento(String nome) {	//nome que ser� informado na hora da execu��o da aplica��o	
		this.nome = nome;
	}

	public String getNome() { // buscar informa��es
		return nome;
	}

	public void setNome(String nome) { //incluir informa��es
		this.nome = nome;
	}
	
	
	
}
