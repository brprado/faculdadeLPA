package avalicao2;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double eletro1, eletro2, total,valFinal;
		System.out.println("-=-=CARRO DE COMPRAS-=-=-\n");
		System.out.print("Informe o valor do primeiro eletrodoméstico: ");
		eletro1 = input.nextDouble();
		
		System.out.print("Informe o valor do segundo eletrodomestico: ");
		eletro2 = input.nextDouble();
		
		total = eletro1 + eletro2;
		if(total >= 200 && total < 1000){
			valFinal = total - (total * 0.2);
			System.out.println("O valor final da compra é "+valFinal);
		
		}else if(total > 1000) {
		valFinal = total - (total * 0.25);
		System.out.println("O valor final da compra é " + valFinal);
		
		}else {
			System.out.println("O valor final da compra é " + total);
		}
		input.close();
	}

}
