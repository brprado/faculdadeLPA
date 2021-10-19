package br.ucsal;

public class Repeticao {

	public static void main(String[] args) {

		int valor = 2;
		int cont = 1;
		do {
			System.out.println(valor + " x " + cont 
					+ " = " + valor * cont);
			cont++;
		
		}while(cont < 13);

	}
}
