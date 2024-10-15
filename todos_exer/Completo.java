
public class Completo {

	public static void main(String[] args) {
	
	 double x = 10.1546;
	 int idade = 17;
	 String nome = "Giovanna";
	 char texto = 'a';
	 boolean valor = true;
	 
	 System.out.println(x);
	 System.out.printf("Texto teste: %.2f, %s, %S, %d, %c, %b%n", x, nome, nome, idade, texto, valor);
	 
	 //o 2 eh relacionado a casa decimal e o %n pula linha como o \n
	 
	 System.out.printf("%.2f%n", x);

	}

}
