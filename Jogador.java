package Quizz;

import java.util.Scanner;

public class Jogador {
	
	String nome;
	
	void player(String nome) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String name = sc.next();
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
