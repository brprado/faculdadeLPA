package br.ucsal;

import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		double n1 =  input.nextDouble();

		System.out.print("Informe um numero: ");
		double n2 =  input.nextDouble();

		System.out.println("Informe a operação que deseja realizar");
		System.out.println("SOMA[1] SUBTRAÇÃO[2] DIVISÃO[3] MULTIPLICAÇÃO[4]: ");
		int operacao = input.nextInt();

		if(n1 > 0 && n2 > 0) {

			switch (operacao) {
			case 1:
				System.out.println("soma = " + (n1 + n2));
				break;
			case 2:
				System.out.println("subtração = " + (n1 - n2));
				break;
			case 3:
				System.out.println("divisão = " + (n1 / n2));
				break;
			case 4:
				System.out.println("multiplicação = " + (n1 * n2));
				break;
			default:
				System.out.println("OPERAÇÃO INVÁLIDA");
				break;
			}


		}else {
			System.out.println("Informes valores maiores do que 1");
		}
		input.close();
	}
}
