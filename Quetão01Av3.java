package prova3;

import java.util.Scanner;

public class Questao01 {

	static double mediaPrimeiraUnidade;
	static double valor,v1,v2,v3;
	static Scanner input = new Scanner(System.in);

	public static double mediaUnidade1(double v1, double v2, double v3) {	
		return ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10;	
	}
	public static double mediaUnidade2(double v1, double v2, double v3) {	
		return ((v1 * 3) + (v2 * 3) + (v3 * 4)) / 10;	
	}
	public static double mediaFinal(double v1, double v2) {	
		return (v1 + v2) / 2;	
	}
	public static String resultadoFinal(double v1) {
		if(v1 >= 6) {
			return "APROVADO";
		}else {
			return "REPROVADO";
		}
	}
	public static void imprimir(String str) {
		System.out.println(resultadoFinal(7));
	}

	public static double obterValor(){
		do {			
			System.out.print("Informe um valor de 0 a 10: ");
			valor = input.nextDouble();
		}while(valor < 0 || valor > 10);

		return valor;
	}



	public static void main(String[] args) {
		v1 = obterValor();
		v2 = obterValor();
		v3 = obterValor();
		double media1 = mediaUnidade1(v1,v2,v3);

		v1 = obterValor();
		v2 = obterValor();
		v3 = obterValor();
		double media2 = mediaUnidade2(v1,v2,v3);

		System.out.printf("Média final: %.2f", mediaFinal(media1, media2));

		System.out.printf("\n" + resultadoFinal(mediaFinal(media1,media2)));
	}

}
