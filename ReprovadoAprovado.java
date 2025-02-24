package Aulaquatro;

import java.util.Scanner;

public class ReprovadoAprovado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nota;
		
		System.out.println("---NOTA DOS ALUNOS---");
		System.out.println("Nota do aluno 1");
		nota = sc.nextInt();
		
		if (nota >= 6) {System.out.println("Aluno aprovado!!");}
		else {System.out.println("Aluno reprovado!!");}
		
		
		
	}

}
