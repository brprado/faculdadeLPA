package avalicao2;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v1, v2, v3, menor, maior, meio;
		
		System.out.println("INFORME VALORES ENTRE 1 E 20");
		
		System.out.print("Insira o primeiro valor: ");
		v1 = input.nextInt();
		meio = 0;
		menor = 0;
		maior = 0;
		
		System.out.print("Insira o primeiro valor: ");
		v2 = input.nextInt();
		
		System.out.print("Insira o primeiro valor: ");
		v3 = input.nextInt();
		
		if (v3 > v1 && v3 > v2) {
			maior = v3;
		}else if (v3 < v2 && v3 > v1 || v3 < v1 && v3 > v2) {
			meio = v3;
		}else {
			menor = v3;
		}
		
		if (v2 > v1 && v2 > v3) {
			maior = v2;
		}else if (v2 < v1 && v2 > v3 || v2 < v1 && v2 > v3) {
			meio = v2;
		}else {
			menor = v2;
		}
		
		if (v1 > v2 && v1 > v3) {
			maior = v1;
		}else if (v1 < v2 && v1 > v3 || v1 < v2 && v1 > v3) {
			meio = v1;
		}else {
			menor = v1;
		} 
		input.close();
		
		System.out.print("A sequenncia decrescente dos numeros escolhidos é ");
		System.out.printf("%d %d %d", maior, meio, menor);

	}

}
