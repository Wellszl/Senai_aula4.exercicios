package Aulaquatro;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		
		System.out.println("Digite aqui o primeiro numero");
		n1 = sc.nextInt();
		System.out.println("Digite aqui o segundo numero");
		n2 = sc.nextInt();
		
		if (n1 >= n2) {System.out.println("O maior numeroé o: " + n1);}
		else {System.out.println("O maior numeroé o: " + n2);}
	}

}
