package prova2;

public class Questao05 {

	public static void main(String[] args) {
		int valorInicial = 200;
		int cont = 100;
		
		while(cont >= 0) {
			if(valorInicial % 2 == 0) {
				System.out.println(valorInicial);
				valorInicial--;
				cont--;
			}else {
				valorInicial--;
				cont--;
				continue;
			}
		}

	}

}
