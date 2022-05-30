package Estrut_Seq;

import java.util.Locale;
import java.util.Scanner;

public class Estrut_Seq_ll {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a, resp, pi = 3.14159;
		
		a = sc.nextDouble();
		
		resp = pi * a *a;
		
		System.out.printf("A = %.4f%n", resp);
		
		sc.close();
	}
	
}
