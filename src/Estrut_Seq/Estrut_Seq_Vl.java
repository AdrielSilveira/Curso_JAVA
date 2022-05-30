package Estrut_Seq;

import java.util.Locale;
import java.util.Scanner;

public class Estrut_Seq_Vl {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C, pi = 3.14159; 
		double Raio, Trapz, quad, retang, trianRet;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		trianRet = A * C / 2;
		Raio = pi * C * C;
		Trapz = (A + B) / 2 * C;
		quad = B * B;
		retang = A * B;
		
		System.out.printf("TRAINGULO : %.3f%n", trianRet);
		System.out.printf("CIRCULO :  %.3f%n", Raio);
		System.out.printf("TRAPEZIO :  %.3f%n", Trapz);
		System.out.printf("QUADRADO :  %.3f%n", quad);
		System.out.printf("RETANGULO :  %.3f%n", retang);
		
		sc.close();
	}

}
