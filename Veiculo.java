package entidades;

public class Veiculo {
	private int passageiros;
	private double capacidade;
	private double consumo;
	
	
	public Veiculo(int p, double ca, double co ) {
		passageiros = p;
		capacidade = ca;
		consumo = co;
		
	}
	//quilometro/(consumo*capacidade);
	public double tanqueViagem(double quilometro) {
		return (capacidade * quilometro)/(capacidade * consumo);
	}
	
	//(quilometro/capacidade * combustivel)/passageiros;

	public double dividirDespesas(double quilometro, 
			double combustivel, int pas) {
		return (((capacidade * quilometro)/(capacidade * consumo)*combustivel)/pas);
	}
	
	public int getPassageiros() {// metodos get e set para captura e retorno de informa��es
		return passageiros;
	}
	
	public void setPassageiros(int passageiros) { // o parametro n�o precisa do this, s� o atributo
		this.passageiros = passageiros; //uso o this sempre que tiver dois nomes iguais
	}
	
	public double getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
	public double getConsumo() {
		return consumo;
	}
	
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	public String toString() {
		return "\nO ve�culo comporta "+passageiros
				+" pessoas,\n tem uma capacidade de "+capacidade
				+" litros de combust�vel,\n e faz "+consumo
				+" quil�metros por litro.\n";
	}

}
