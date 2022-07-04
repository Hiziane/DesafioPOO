package entidades;

public class Departamento {
	private String nome;// tem o sinal de menos no diagrama
	
	public Departamento() { // metodo construtor padrao, é vazio
		
	}

	public Departamento(String nome) {	//nome que será informado na hora da execução da aplicação	
		this.nome = nome;
	}

	public String getNome() { // buscar informações
		return nome;
	}

	public void setNome(String nome) { //incluir informações
		this.nome = nome;
	}
	
	
	
}
