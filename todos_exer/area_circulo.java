import java.util.Scanner;
public class area_circulo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A seguir entre com o valor do raio para calcularmos a área ");
		
		System.out.println("Valor da área: ");
		double raio = input.nextDouble();
		
		double pi = 3.14159;
		
		double area = pi * (raio * raio);
		
		System.out.println("A= " + area);
		
		input.close();
	}

}
