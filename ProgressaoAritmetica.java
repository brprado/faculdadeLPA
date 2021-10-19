package br.ucsal;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {

		int cont = 0, soma = 0, contPar = 0, contImpar = 0, contImparDiv = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("informe um valor de 50 a 100 para ser "
				+ "\no valor limite desta PA\n-->");
		int limitePa = input.nextInt();

		if (limitePa < 50 || limitePa > 100) { 
			
			while(limitePa < 50 || limitePa > 100) { //ENQUANTO O VALOR FOR INVÁLIDO ELE REPETE
				System.out.println("Informe um limite válido. entre 50 e 100:");
				limitePa = input.nextInt();

				if(( limitePa >= 50) && (limitePa <= 100) ) { //SEMPRE VALIDA O VALOR AQUI
					System.out.println("\nPA de razão 6 e limite " + limitePa + "\n");

					for(int i = 10; i <= limitePa; i+=6) {
						System.out.print(i + " ");
						cont++;
						soma+=i;
						if(i % 2 == 0) { //contando pares
							contPar++;
						}else if(i % 2 != 0 && i % 3 == 0) {
							contImparDiv++;
						}else {
							contImpar++;
						}
					}
					System.out.print("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
					System.out.println("\n\nA quantidade de termos foi: " + cont);
					System.out.println("A soma destes termos é: " + soma);

					double mediaAritmetica = ((10 + limitePa)/2); //dúvida
					System.out.println("A media do primeiro e do ultimo valor é: " + mediaAritmetica);

					System.out.println("A quantidade de números pares é: " + contPar);
					System.out.println("A quantidade de números impares é: " + contImpar);
					System.out.println("A quantidade de números impares divisiveis por 3 é: " + contImparDiv);

					if(limitePa >= 64) {
						double mediaPonderada = (20 * 4) + (64 * 6) / 10;
						System.out.println("A média ponderada entre o 4° e o 10° termo é: " + mediaPonderada);	
					}else {
						System.out.println("\ntemos o 4°, mas não há o 10° termo para calcularmos a média ponderada");
					}
				}
			}

		}else {
			System.out.println("\nPA de razão 6 e limite " + limitePa + "\n"); //PRIMEIRO VALOR CORRETO VEM P/ CA

			for(int i = 10; i <= limitePa; i+=6) {
				System.out.print(i + " ");
				cont++;
				soma+=i;
				if(i % 2 == 0) { //contando pares
					contPar++;
				}else if(i % 2 != 0 && i % 3 == 0) {
					contImparDiv++;
				}else {
					contImpar++;
				}
			}

			System.out.print("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("\n\nA quantidade de termos foi: " + cont);
			System.out.println("A soma destes termos é: " + soma);

			double mediaAritmetica = ((10 + limitePa)/2); //dúvida
			System.out.println("A media do primeiro e do ultimo valor é: " + mediaAritmetica);

			System.out.println("A quantidade de números pares é: " + contPar);
			System.out.println("A quantidade de números impares é: " + contImpar);
			System.out.println("A quantidade de números impares divisiveis por 3 é: " + contImparDiv);

			if(limitePa >= 64) {
				double mediaPonderada = (20 * 4) + (64 * 6) / 10;
				System.out.println("A média ponderada entre o 4° e o 10° termo é: " + mediaPonderada);	
			}else {
				System.out.println("\ntemos o 4°, mas não há o 10° termo para calcularmos a média ponderada");
			}
			input.close();
		}
	}
}
