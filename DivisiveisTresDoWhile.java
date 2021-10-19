package br.ucsal;

public class Repeticao {

	public static void main(String[] args) {

		int valor = 99;
		int cont = 0;
		System.out.println("Menores de 99 divisiveis por 3: ");
		
		do {
			
			if(valor % 3 == 0) {
				cont++;
				System.out.println(valor);
			}
			
			valor--;
			

		}while(cont < 15);

	}
}
