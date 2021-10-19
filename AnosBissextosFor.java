package br.ucsal;

public class Repeticao {

	public static void main(String[] args) {

		int anoFinal = 2032;

		System.out.println("os seguintes anos são bissextos: ");
		for(int ano = 1900; ano <= anoFinal; ano++) {

			if(ano % 4 == 0 && ano % 100 != 0) {
				System.out.print(ano + " ");

			}else {
				continue;
			}
		}

	}
}
