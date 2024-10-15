import java.util.Scanner;
public class Exe_array_teste_ansiedade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pontuacao = 0;
		
		System.out.println("A seguir você vai responder o teste de ansiedade - responda com (sim) ou (não) ");
		
		String[] perguntas_ansi = {
		
		"Você se sente com dificuldade de concentração ?",
		"Você se sente cansado frequentemente",
		"Tem dificuldade de adormecer ou permanecer a dormir ?",
		 "Você se preucupa muito com o futuro ?",
		"Tem dificuldade em relaxar ? ",
		"Sentiu - se tão preocupado que foi dificil ficar parado ? ",
		"Sentiu - se facilmente irritável ou chateado ?",
		"Sentiu medo como se algo muito ruim fosse acontecer ?",
		"Você se preucupa com a opinião dos outros ? ",
		"Você tem dificuldade em lembrar os detalhes ? ",
		};
		String[] respostas = new String[perguntas_ansi.length];
		
		for (int i = 0; i < perguntas_ansi.length; i++) {
			
			System.out.println(perguntas_ansi[i] + "(sim) / (não)");
			
			respostas[i] = input.nextLine();
			
			if (respostas[i].equalsIgnoreCase("sim")) {
				pontuacao++;
			}
		}
		System.out.println("\n Pontuação: " + pontuacao);
		
		if (pontuacao >= 3) {
			System.out.println("Seu nivel de ansiedade é baixo ");
		}
		else if (pontuacao >= 6) {
			System.out.println("Seu nivel de ansiedade é medio");
		}
		else if (pontuacao >= 8) {
			System.out.println("Seu nivel de ansiedade é alto - procure ajuda ");
		}
		input.close();
	}
}
// lenght deve determinar até onde o laço vai rodar - percorrendo de forma eficiente os elementos