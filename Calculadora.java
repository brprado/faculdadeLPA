package metodos;

import java.util.Scanner;

public class Calculadora {
	public static double somar(double a, double b) {
		return a + b;	
	}
	public static double subtrair(double a, double b) {
		return a - b;	
	}
	public static double dividir(double a, double b) {
		return a / b;	
	}
	public static double multiplicar(double a, double b) {
		return a * b;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int operacao;
		double a, b;

		System.out.println("Escolha a sua opera��o: [1] soma [2] subtra��o [3] divis�o"
				+ " [4 multiplica��o]");
		operacao = input.nextInt();

		System.out.println("Escolha o valor 1");
		a = input.nextDouble();
		System.out.println("Escolha o valor 2");
		b = input.nextDouble();

		System.out.println("O resultado da opera��o �: ");		

		switch (operacao) {
		case 1: {
			System.out.print(somar(a, b));
			break;
		}case 2:{
			System.out.print(subtrair(a, b));
			break;
		}case 3:{
			System.out.print(dividir(a, b));
			break;
		}case 4:{
			System.out.print(multiplicar(a, b));
			break;
		}default:
			System.out.print("OPERA��O INV�LIDA");
		}
		input.close();

	}

}
