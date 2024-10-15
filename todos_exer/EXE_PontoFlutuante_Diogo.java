/*Fazer um programa que leia três valores com ponto flutuante A, B e C e em seguida, calcule e mostre:

a) A área do triângulo retângulo que tem A por base e C por altura
Triângulo = (a * c)/2

b) a área do círculo de raio C.
Pi = 3.14159
Círculo = pi * (c * c)

C) a área do trapézio que tem A e B por bases e C por altura 

D) a área do quadrado que tem lado B
Quadrado = B * B 

E) a área do retângulo que tem lados A e B 
Retângulo = A * B

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
Retângulo = 12.000*/

import java.util.Scanner;
public class EXE_PontoFlutuante_Diogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o ponto A: ");
		double pontoA = sc.nextDouble();
		
		System.out.print("\nDigite o ponto B: ");
		double pontoB = sc.nextDouble();
		
		System.out.print("\nDigite o ponto C: ");
		double pontoC = sc.nextDouble();
		
		double triangulo = (pontoA *pontoC )/2;
		double circulo = 3.14159 * (pontoC * pontoC);
		double trapezio = (pontoA + pontoB) * pontoC / 2;
		double quadrado = pontoB * pontoB;
		double retangulo = pontoA * pontoB;
		
		System.out.printf("Triangulo %.3f%n" , triangulo , "\n");
		System.out.printf("Circulo %.3f%n" , circulo , "\n");
		System.out.printf("Trapezio %.3f%n" , trapezio , "\n");
		System.out.printf("Quadrado %.3f%n" , quadrado , "\n");
		System.out.printf("Retangulo %.3f%n" , retangulo , "\n");
		
		sc.close();
	}

}
