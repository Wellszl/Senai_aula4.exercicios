package AulaUm;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner (System.in);
		
		int NA = rd.nextInt(100) + 1;
		int CHUTE = 0;
		
		System.out.println("tente adivinhar o numero: ");
		
		while (CHUTE != NA) {CHUTE = sc.nextInt();
		
		if (CHUTE < NA) {System.out.println("O numero é maior!");}
		else if (CHUTE > NA) {System.out.println("O numero é menor!");}
		else {System.out.println("Parabens!! vc acertou");}
		
		}
	}

}
