package avalicao2;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valor;
		char escolha;
		char escolha2;
		double realDol, realEur, dolEur;
		System.out.print("Informe o valor que voce quer converter: ");
		valor = input.nextInt();
		System.out.println("Qual moeda você possui? REAL(R) DOLAR(D) EURO(E)");
		escolha = input.next().charAt(0);
		
		
		//REAL -> DOL OU EUR
		if (escolha == 'R') {
			System.out.println("Para qual moeda você quer converter? DOLAR(D) EURO(E)");
			escolha2 = input.next().charAt(0);
			
			if(escolha2 == 'D') {
				realDol = valor * 0.19;
				System.out.println("O seu valor convertido do REAL para o DOLAR é igual a " + realDol);
				
			}else if(escolha2 == 'E') {
				realEur = valor * 0.16;
				System.out.println("O seu valor convertido do REAL para o EURO é igual a " + realEur);
		}
		
	
   
	}if (escolha == 'D') {
		System.out.println("Para qual moeda você quer converter? REAL(D) EURO(E)");
		escolha2 = input.next().charAt(0);
		
		if(escolha2 == 'R') {
			realDol = valor * 5.39;
			System.out.println("O seu valor convertido do DOLAR para REAL é igual a " + realDol);
			
		}else if(escolha2 == 'E') {
			dolEur = valor * 0.86;
			System.out.println("O seu valor convertido do DOLAR para o EURO é igual a " + dolEur);
	}
	

   
}	if (escolha == 'E') {
		System.out.println("Para qual moeda você quer converter? REAL(D) DOLAR(E)");
		escolha2 = input.next().charAt(0);
		
		if(escolha2 == 'R') {
			realEur = valor * 6.30;
			System.out.println("O seu valor convertido do EURO para REAL é igual a " + realEur);
			
		}else if(escolha2 == 'D') {
			dolEur = valor * 1.17;
			System.out.println("O seu valor convertido do EURO para o DOLAR é igual a " + dolEur);
}



}
input.close();
		

	}
	}

