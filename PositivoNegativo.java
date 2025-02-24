package Aulaquatro;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n;
	
	System.out.println("Digite aqui o numero");
	n = sc.nextInt();
	
	if (n <= 0) {System.out.println("O numero é igual a zero, ou e negativo");}
	else {System.out.println("o numero é positivo");}
	}

}
