package Estrut_Seq;

import java.util.Locale;
import java.util.Scanner;

public class Estrut_Seq_lll {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,Resp;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Resp = (A * B - C * D);
		
		System.out.printf("DIFERENCA = " + Resp);
		
		sc.close();
	}
}
