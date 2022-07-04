package aplicacao;

import java.util.Scanner;

import entidades.Veiculo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pas;
		double tanque, consumo, km, valor;
		
		System.out.println("Qtde passageiros: ");
		pas = sc.nextInt();
		System.out.println("Capacidade do tanque:");
		tanque = sc.nextDouble();
		System.out.println("O consumo por litro:");
		consumo = sc.nextDouble();
		System.out.println("Dist�ncia em Km:");
		km = sc.nextDouble();
		System.out.println("Valor do combust�vel:");
		valor = sc.nextDouble();
		
		Veiculo gurgel = new Veiculo(pas, tanque, consumo);
		System.out.println(gurgel.toString());
		
		double tanques = gurgel.tanqueViagem(km);
		double rateio = gurgel.dividirDespesas(km, valor,pas); // lembrar que vamos passar isso pra fun��o, precisa estar na ordem
		System.out.printf("Para a viagem vamos precisar de "
				+ "%.1f litros(s) e cada passageiro contribuir� com "
				+ "R$ %.2f.\n", tanques, rateio);
		
		sc.close();

	}

}
