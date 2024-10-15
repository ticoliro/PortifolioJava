import java.util.Scanner;
public class funcionario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A seguir entre com os dados para calcularmos o salário do funcionario ");
		
		System.out.println("Número funcionario: ");
		int num_func = input.nextInt();
		
		System.out.println("Horas trabalhadas pelo funcionário: ");
		int horas_trabalhadas = input.nextInt();
		
		System.out.println("Salário por hora do funcionário: ");
		double salario_hora = input.nextInt();
		
		double salario = horas_trabalhadas * salario_hora;
		
		System.out.println("Número: " + num_func);
		
		System.out.println("Salário: " + salario);
		
		input.close();
	}

}
