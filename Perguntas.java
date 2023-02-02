package Quizz;

import java.util.Scanner;

public class Perguntas {	
	
	String[] respostas = new String[2];
	String[] questoes = new String[2];
	int count = 1;
	int pontos = 0;
	Scanner sc = new Scanner(System.in);
	
	public int getPontos() {
		return pontos;
	}


	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	void questoes(String perguntas, String resposta) {
				
			System.out.println("[INSIRA AS PERGUNTAS]");
			
				for(int i = 0; i < questoes.length; i++) {
					System.out.println("Pergunta de número: [" + count++ + "]");
					questoes[i] = sc.nextLine();
					
					System.out.println("\n[RESPOSTA] ");
					respostas[i] = sc.nextLine();
					
					System.out.println();
				}
				
			count = 0;	
			
		}
	
	void quizz() {
		System.out.println("-----------------QUIZZ INICIADO-----------------");
		
		for(int i = 0; i < questoes.length; i++) {
			
			System.out.println(questoes[i]);
			String res = sc.nextLine();
			
				if(respostas[i].equalsIgnoreCase(res)) {
					System.out.println("ACERTOU!\n");
					pontos += 5;
				} else {
					System.out.println("ERROU!\n");
				}
		}
		
		System.out.println("\n[PONTUAÇÃO FINAL]: " + pontos);
		
			if(pontos <= 5) {
				System.out.println("\nAINDA DIZ QUE ME AMA :(");
				
			} else if(pontos > 5 && pontos < 8) {
				System.out.println("\nMUITO BOOOMMM!");
				
			} else {
				System.out.println("\nME CONHECE BEEEEM! DA PRA CASAR JÁ");
				
			}
			
		sc.close();
	}
	
}
