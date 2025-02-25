package AulaUm;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double altura;
		double peso;
		int idade;
		double IMC;
		
		System.out.println("Bom dia!!");
		System.out.println("bem vindo a calculadora de IMC");
		System.out.println("Insira aqui a sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Otimo!! insira agora a sua altura: ");
		altura = sc.nextDouble();
		
		System.out.println("Muito bem!! agora pra finalizar me diga seu peso: ");
		peso = sc.nextDouble();
		
		IMC = peso / (altura * altura);
		System.out.println(String.format("o valor do seu IMC é: %.2f", IMC));
		
		if (IMC <= 18.5) {System.out.println("Você está abixo do seu IMC normal!");}
		else if (IMC <= 24.9) {System.out.println("Você está no seu IMC ideal!!");}
		else if (IMC <= 29.9) {System.out.println("Você está com seu IMC um pouco acima");}
		else if (IMC <= 34.9) {System.out.println("Você está com obesidade grau 1");}
		else if (IMC <= 39.9) {System.out.println("Você está com obesidade grau 2");}
		else {System.out.println("Você está com obesidade grau 3");}
	}

}
