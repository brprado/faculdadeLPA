package metodos;

import java.util.Scanner;

public class ConversorTemperatura {

	//celsius -> outras
	public static double celsiusKelvin(double temperatura) {
		return temperatura + 273.15;
	}
	public static double celsiusFahrenheit(double temperatura) {
		return (temperatura * 9/5) + 32;
	}
	
	//kelvin -> outras
	public static double kelvinFahrenheit(double temperatura) {
		return (temperatura - 273.15) * 9/5 + 32; 
	}
	public static double kelvinCelsius(double temperatura) {
		return temperatura - 273.15; 
	}
	
	//fahrenheight -> outras
	public static double fahrenheitKelvin(double temperatura) {
		return (temperatura - 32) * 5/9 + 273.15;

	}
	public static double fahrenheitCelsius(double temperatura) {
		return (temperatura - 32) * 5/9; 
	}
	


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int escolha, escolha2;
		double valor;
		
		System.out.println("Qual temperatura voce quer converter: [1] celsius [2]kelvin "
				+ "[3] fahrenheight");
		escolha = input.nextInt();
		
		System.out.println("Informe o valor da temperatura");
		valor = input.nextDouble();
		
		if(escolha == 1) { //celsius
			System.out.println("Para qual voce quer converter [1] kelvin [2] fahrenheit");
			escolha2 = input.nextInt();
			
			System.out.println("A conversão dá: ");
			
			if (escolha2 == 1 || escolha2 == 2) {
				switch (escolha2) {
				case 1: {
					System.out.println(celsiusKelvin(valor));					
				}
				case 2:
					System.out.println(celsiusFahrenheit(valor));
				}
				
			}

		}
		
		if(escolha == 2) { //kelvin
			System.out.println("Para qual voce quer converter [1] celsius [2] fahrenheit");
			escolha2 = input.nextInt();
			
			System.out.println("A conversão dá: ");
			
			if (escolha2 == 1 || escolha2 == 2) {
				switch (escolha2) {
				case 1: {
					System.out.println(kelvinCelsius(valor));					
				}
				case 2:
					System.out.println(kelvinFahrenheit(valor));
				}
				
			}

		}
		
		if(escolha == 3) { //fah
			System.out.println("Para qual voce quer converter [1] celsius [2] kelvin");
			escolha2 = input.nextInt();
			
			System.out.println("A conversão dá: ");
			
			if (escolha2 == 1 || escolha2 == 2) {
				switch (escolha2) {
				case 1: {
					System.out.println(fahrenheitCelsius(valor));					
				}
				case 2:
					System.out.println(fahrenheitKelvin(valor));
				}
				
			}

		}
		
		
		
		input.close();


	}

}
