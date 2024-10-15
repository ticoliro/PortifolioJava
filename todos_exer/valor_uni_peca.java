import java.util.Scanner;
public class valor_uni_peca {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A seguir digite as respectivas informações a respeito de cada peça ");
		
		System.out.println("Código da peça 1: ");
		int cod_1 = input.nextInt();
		
		System.out.println("Código da peça 2: ");
		int cod_2 = input.nextInt();
		
		System.out.println("Quantidade peça 1: ");
		int quant_1 = input.nextInt();
		
		System.out.println("Quantidade peça 2: ");
		int quant_2 = input.nextInt();
		
		System.out.println("Valor peça 1: ");
		int valor_1 = input.nextInt();
		
		System.out.println("Valor peça 2: ");
		int valor_2 = input.nextInt();
		
		double total_peca_1 = quant_1 * valor_1;
		
		double total_peca_2 = quant_2 * valor_2;
		
		double total_final = total_peca_1 + total_peca_2;
		
		System.out.println("Total: " + total_final);
		
		input.close();
	}

}
