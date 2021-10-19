package br.ucsal;

public class Repeticao {

	public static void main(String[] args) {

		int anoFinal = 2032;

		System.out.println("os seguintes anos são bissextos: ");
		for(int i = 1900; i <= anoFinal; i++) {

			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.print(i + " ");

			}else {
				continue;
			}
		}

	}
}
