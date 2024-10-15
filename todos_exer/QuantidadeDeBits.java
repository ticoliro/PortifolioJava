//Giovanna Castilho Prado Meyer 19/09/24

import java.util.Scanner;

public class QuantidadeDeBits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a quantidade de bits: "); // para o usuario digitar
		long bits = scanner.nextLong();

		long bytes = bits / 8; // para transformar os bits digitados para bytes

		long BitsRestantes = bits % 8; //resto dos bits

		System.out.println("Número de Bytes: " + bytes + "\n" + "Número de Bits restantes: " + BitsRestantes); //resultado final
		
		scanner.close();
	}

}
