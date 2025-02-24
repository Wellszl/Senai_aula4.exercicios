package Aulaquatro;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade");
		idade= sc.nextInt();
		
		if (idade> 59) {
			System.out.println("Vocêé idoso");}
		else if (idade >= 18 && idade <60) {System.out.println("Você é adulto");}
		else {System.out.println("Você é criança");
		}
		

	}

	}
