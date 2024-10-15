import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A seguir digite dois números para realizarmos a soma deles ");
		
		System.out.println("Digite o primeiro número: ");
		int numero_1 = input.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero_2 =  input.nextInt();
		
		int result = numero_1 + numero_2;
		
		System.out.println("SOMA = " + result);
		
		input.close();
	}

}
