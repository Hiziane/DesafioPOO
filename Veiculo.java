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
	
	public int getPassageiros() {// metodos get e set para captura e retorno de informações
		return passageiros;
	}
	
	public void setPassageiros(int passageiros) { // o parametro não precisa do this, só o atributo
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
		return "\nO veículo comporta "+passageiros
				+" pessoas,\n tem uma capacidade de "+capacidade
				+" litros de combustível,\n e faz "+consumo
				+" quilômetros por litro.\n";
	}

}
