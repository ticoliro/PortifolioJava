import java.util.Scanner;
public class Calc_IMC {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o seu nome: ");
		String Nome = scanner.nextLine();
		
		System.out.println("Digite o seu sexo: ");
		 char Sexo = scanner.nextLine().charAt(0);
		
		System.out.println("Digite o sua idade: ");
		int Idade = scanner.nextInt();
		
		System.out.println("Digite o seu peso: ");
		 double Peso = scanner.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		double Altura = scanner.nextDouble();
		
		double IMC = Peso / (Altura * Altura);
		
		System.out.println("o seu IMC é de: " + Altura + "*" + Altura + "/" + Peso );
		
		
		
		

	}

}
