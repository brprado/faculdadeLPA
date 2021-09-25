package br.ucsal;

import java.util.Scanner;

public class Prática013 {

	public static void main(String[] args) {
		double valor1, valor2, resultado;
		char operacao;
		
		System.out.println("CALCULADORA JAVA");
		System.out.println("_________________");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Infome o 1° valor: ");
		valor1 = input.nextDouble();
		
		System.out.println("Infome o 2° valor: ");
		valor2 = input.nextDouble();
		
		System.out.println("ESCOLHA A SUA OPERAÇÃO");
		System.out.println("____________________________________");
		
		input.nextLine();
		
		System.out.println("Escreva: (a)somar, (b)subtrair, (c)dividir ou (d)multiplicar");
		operacao = input.next().charAt(0);
		
		if (operacao == 'a') {
			resultado = valor1 + valor2;
			System.out.println("Você escolheu a operação de SOMA, o resultado é: " + resultado);
		
		}else if(operacao == 'b'){
			resultado = valor1 - valor2;
			System.out.println("Você escolheu a operação de SUBTRAÇÃO, o resultado é: " + resultado);
		
		}else if(operacao == 'c'){
			resultado = valor1 / valor2;
			System.out.println("Você escolheu a operação de DIVISÃO, o resultado é: " + resultado);	
		
		}else if (operacao == 'd'){
			resultado = valor1 * valor2;
			System.out.println("Você escolheu a operação de MULTIPLICAÇÃO, o resultado é: " + resultado);	
		
		}else{
			System.out.println("A operação " + operacao + " não é uma operação válida. Tente novamente!");
		}
		input.close();

	}

}
