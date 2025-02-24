package Aulaquatro;

import java.util.Scanner;

public class AnoBisexto {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite o ano de preferencia: ");
		ano = sc.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {System.out.println("E bisexto!!");}
		else {System.out.println("Não é bisexto!!");}
	}

}
