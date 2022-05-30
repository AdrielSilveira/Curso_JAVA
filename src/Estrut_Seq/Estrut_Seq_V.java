package Estrut_Seq;

import java.util.Locale;
import java.util.Scanner;

public class Estrut_Seq_V {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int pc1, pc2, qt1, qt2;
		double vl1, vl2, total;
		
		pc1 = sc.nextInt();
		qt1 = sc.nextInt();
		vl1 = sc.nextDouble();
		
		pc2 = sc.nextInt();
		qt2 = sc.nextInt();
		vl2 = sc.nextDouble();
		
		total = qt1 * vl1 + qt2 * vl2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
