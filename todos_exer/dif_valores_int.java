import java.util.Scanner;
public class dif_valores_int {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A seguir entre com quatro números inteiros para calclularmos a diferença de seu produto ");
		
		System.out.println("Digite o primeiro número: ");
		int num_1 = input.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num_2 = input.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int num_3= input.nextInt();
		
		System.out.println("Digite o quarto número: ");
		int num_4 = input.nextInt();
		
		int dif_prod = ((num_1 * num_2) - (num_3 * num_4));
		
		System.out.println("Diferença: " + dif_prod);
		
		input.close();
	}

}
