package exercicios;

public class Questao03 {

	public static void main(String[] args) {
		int valor1 = 0; int valor2 = 1; int contador = 0; int soma = 0;
		do {
			System.out.print(valor1 + " ");
			soma = valor1 + valor2;
			valor1 = valor2;
			valor2 = soma;
			contador++;
		} while (contador < 30);
	}

}
