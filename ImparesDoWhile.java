package br.ucsal;

public class Repeticao {

	public static void main(String[] args) {

		int valorSequencia = 1;
		int cont = 0;
		do {

			System.out.println(valorSequencia);
			valorSequencia += 2;
			cont++;

		}while(cont < 20);

	}
}
