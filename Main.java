package Quizz;

public class Main {

	public static void main(String[] args) {
		
		Perguntas perguntas = new Perguntas();
		String pergunta = "", jogador = "", resposta = "";
		
		Jogador player = new Jogador();
		
		player.player(jogador);		
		perguntas.questoes(pergunta, resposta);
		perguntas.quizz();
		
	}

}
