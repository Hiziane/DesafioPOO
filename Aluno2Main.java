package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Aluno2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Data de Nascimento(dd/mm/yyyy): ");
		String nascimento = sc.next();
		sc.nextLine();
        System.out.println("Data de Matricula(dd/mm/yyyy): ");
		String matricula = sc.next();
		
		Aluno aluno = new Aluno(nome, nascimento, matricula);
		System.out.println(aluno);
		
		sc.close();

	}

}
