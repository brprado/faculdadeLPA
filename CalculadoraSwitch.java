package br.ucsal;

import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		double n1 =  input.nextDouble();

		System.out.print("Informe um numero: ");
		double n2 =  input.nextDouble();

		System.out.println("Informe a operação que deseja realizar\n");
		System.out.print("SOMA[1] \nSUBTRAÇÃO[2] \nDIVISÃO[3] \nMULTIPLICAÇÃO[4]\n\nSUA ESCOLHA: ");
		int operacao = input.nextInt();

		if(n1 > 0 && n2 > 0) {

			switch (operacao) { //chave (voce pega uma chave)
			case 1: //porta (você abre uma porta)
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
			default: //else
				System.out.println("OPERAÇÃO INVÁLIDA");
				break;
			}


		}else {
			System.out.println("Informes valores maiores ou iguais a 1");
		}
		input.close();
	}
}
