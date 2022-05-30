package Estrut_Cond;
import java.util.Scanner;

public class Estrut_Cond {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in); 
		
		int num;
		
		System.out.println("Digite um valor!");
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("NEGATIVO");
		}else{
			System.out.println("NAO NEGATIVO");
		}
		sc.close();
	}
}
