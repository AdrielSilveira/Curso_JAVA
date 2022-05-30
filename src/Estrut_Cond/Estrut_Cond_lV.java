package Estrut_Cond;

import java.util.Scanner;

public class Estrut_Cond_lV {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaIn, horaF, res;
		
		horaIn = sc.nextInt();
		horaF = sc.nextInt();
		
		if(horaIn < horaF) {
			res = horaIn - horaF;
			
		}else {
			res = 24 - horaIn + horaF;
		}
		System.out.println("O Jogos durou "+ res + " Hora(s) ");
		sc.close();
	}
		
		
}
