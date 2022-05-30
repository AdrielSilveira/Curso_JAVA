package Estrut_Seq;

import java.util.Locale;
import java.util.Scanner;

public class Estrut_Seq_lV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int func;
		double hora, valor, total;
		
		func = sc.nextInt();
		hora = sc.nextDouble();
		valor = sc.nextDouble();
		
		total = hora * valor;

		
		System.out.println("NUMBER = "+ func);
		System.out.printf("SALARY = U$ %.2f%n", total);
		
		sc.close();
	}

}
