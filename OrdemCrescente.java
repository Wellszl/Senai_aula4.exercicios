package Aulaquatro;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		
		System.out.println("Digite o preimeio numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		n3 = sc.nextInt();
		
		if (n1 <= n2 && n1 <= n3 && n2 <= n3) {System.out.println("Ordem crescente: " + n1 + ", " + n2 + ", " + n3);}
		else if (n2 <= n1 && n2 <= n3 && n1 <= n3) {System.out.println("Ordem crescente: " + n2 + ", " + n1 + ", " + n3);}
		else if (n3 <= n1 && n3 <= n2 && n2 <= n1) {System.out.println("Ordem crescente: " + n3 + ", " + n2 + ", " + n1);}
		else {System.out.println("Ordem crescente: " + n2 + ", " + n3 + ", " + n1);}
	}

}
