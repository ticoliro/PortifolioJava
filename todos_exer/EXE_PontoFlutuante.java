/* Fazer um programa que leia três valores com ponto flutuante A, B e C e em seguida, calcule e mostre:
Exemplo:

Entrada: 
a = 3.0
b = 4.0
c = 5.2

Saída:
Triângulo = 7. 800
Círculo = 84.949
Trapézio = 18.200
Quadrado = 16.000
Retângulo = 12.000 */

import java.util.Scanner;
public class EXE_PontoFlutuante {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite ponto A: ");
		double pontoA = scanner.nextDouble();
		
		System.out.println("Digite ponto B: ");
		double pontoB = scanner.nextDouble();
		
		System.out.println("Digite ponto C:");
		double pontoC = scanner.nextDouble();
		
		//a) A área do triângulo retângulo que tem A por base e C por altura Triângulo = (a * c)/2:

		double triangulo = (pontoA * pontoC)/2;
		
		/*b) a área do círculo de raio C.
		Pi = 3.14159

		Círculo = pi * (c * c): */
		
		double circulo = 3.14159 * ( pontoC * pontoC);
		/* C) a área do trapézio que tem A e B por bases e C por altura 

		Trapezio = (a + b) * c / 2: */
		
		double trapezio = (pontoA + pontoB) * pontoC/2;
		/* D) a área do quadrado que tem lado B
		 Quadrado = B * B:  */
		
		double quadrado = pontoB * pontoB;
		
		/* E) a área do retângulo que tem lados A e B 

		Retângulo = A * B: */
		
		double retangulo = pontoA * pontoB;
		
		System.out.println("Resultados: ");
		System.out.printf("%.3f%n", triangulo , "\n"); 
		System.out.printf("%.3f%n", circulo , "\n"); 
		System.out.printf("%.3f%n", trapezio , "\n"); 
		System.out.printf("%.3f%n", quadrado , "\n"); 
		System.out.printf("%.3f%n", retangulo , "\n"); 
		
		
		
	}

}
