package br.ucsal;

public class Repeticao {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3 = 0;
		int numerosFibonacci = 1;
		
		do {
		
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			numerosFibonacci++;
			System.out.println(n3);
			

		}while(numerosFibonacci < 20);

	}
}
