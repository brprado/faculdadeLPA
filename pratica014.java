package br.ucsal;

import java.util.Scanner;

public class Pratica014 {

	public static void main(String[] args) {
		double n1, n2, n3, maior, menor;
		Scanner input = new Scanner(System.in);
		System.out.println("MAIOR E MENOR VALOR");
		System.out.println("Os valores devem estar entre 10 e 90");
		
		System.out.println("Informe o primeiro valor");
		n1 = input.nextDouble();
		maior = n1;
		menor = n1;
		
		System.out.println("Informe o segundo valor");
		n2 = input.nextDouble();
		
		if (n2 > maior) {
			maior = n2;
		
		}else if (n2 < menor) {
			n2 = menor;
		}
		
		System.out.println("Informe o terceiro valor");
		n3 = input.nextDouble();
		
		if (n3 > maior) {
			maior = n3;
		
		}else if(n3 < menor){
			menor = n3;
		}
		
		if (n1 < 10 || n1 > 90 || n2 < 10 || n2 > 90 || n3 < 10 || n3 > 90){
			System.out.println("VALORES INCORRETOS");
			if (n1 < 10 || n1 > 90) {
				System.out.println("O numero " + n1 + " não está no intervalo entre 10 e 90");
			
			}else if (n2 < 10 || n2 > 90) {
				System.out.println("O numero " + n2 + " não está no intervalo entre 10 e 90");
			
			}else{
				System.out.println("O numero " + n3 + "não está no intervalo entre 10 e 90");
			}
			
		}else{
			System.out.println("Voce escolheu os numeros " + n1 + " " + n2 + " " + n3 );
			System.out.println("O maior número é " + maior);
			System.out.println("O menor número é " + menor);
		}
		input.close();
	}

}
