package metodos;
import java.util.Scanner;

public class ConversaoMoedas2 {
	
	static double valorConverter = 0;
	static Scanner input = new Scanner(System.in);
	static int moedaConvertida = 0;
	static int moedaDestino = 0;
	
	public static void obterDados() {
		System.out.print("Informe o valor que será convertido: ");
		valorConverter = input.nextDouble();
		
		System.out.println("Informe a moeda que quer converter [1]real [2]euro [3]dolar [4]libra-esterlina");
		moedaConvertida = input.nextInt(); 
		
		if(moedaConvertida == 1) {
			System.out.println("Voce quer converter do real para qual moeda?\n"
					+ " [1]dolar [2]euro [3]libra-esterlina");
			moedaDestino = input.nextInt();
		
			if(moedaDestino == 1) {
				System.out.print("A cconversão real-dolar é: ");
				realDolar();
			}
			if(moedaDestino == 2) {
				System.out.print("A cconversão real-euro é: ");
				realEuro();
			}
			if(moedaDestino == 3) {
				System.out.print("A cconversão real-libra é: ");
				realLibra();
			}
		}
		if(moedaConvertida == 2) {
			System.out.println("Voce quer converter do euro para qual moeda?\n"
					+ " [1]dolar [2]real [3]libra-esterlina");
			moedaDestino = input.nextInt();
			
			if(moedaDestino == 1) {
				System.out.print("A cconversão euro-dolar é: ");
				euroDolar();
			}
			if(moedaDestino == 2) {
				System.out.print("A cconversão euro-real é: ");
				euroReal();
			}
			if(moedaDestino == 3) {
				System.out.print("A conversão euro-libra é: ");
				euroLibra();
			}
		}
		if(moedaConvertida == 3) {
			System.out.println("Voce quer converter do dolar para qual moeda?\n"
					+ " [1]euro [2]real [3]libra-esterlina");
			moedaDestino = input.nextInt();
			
			if(moedaDestino == 1) {
				System.out.print("A conversão dolar-euro é: ");
				dolarEuro();
			}
			if(moedaDestino == 2) {
				System.out.print("A cconversão dolar-real é: ");
				dolarReal();
			}
			if(moedaDestino == 3) {
				System.out.print("A conversão dolar-libra é: ");
				dolarLibra();
			}
		}
		if(moedaConvertida == 4) {
			System.out.println("Voce quer converter da libra-esterlina para qual moeda?\n"
					+ " [1]euro [2]real [3]dolar");
			moedaDestino = input.nextInt();
			
			if(moedaDestino == 1) {
				System.out.print("A conversão libra-euro é: ");
				libraEuro();
			}
			if(moedaDestino == 2) {
				System.out.print("A cconversão libra-real é: ");
				libraReal();
			}
			if(moedaDestino == 3) {
				System.out.print("A conversão libra-dolar é: ");
				libraDolar();
			}
		}
		
		
	}
	
	//REAL
	public static void realDolar() {
		System.out.println(valorConverter * 0.18);
	}
	public static void realLibra() {
		System.out.println(valorConverter * 0.14);
	}
	public static void realEuro() {
		System.out.println(valorConverter * 0.16);
	}
	
	//EURO
	public static void euroReal(){
		System.out.println(valorConverter * 6.25);
	}
	public static void euroDolar(){
		System.out.println(valorConverter * 1.14);
	}
	public static void euroLibra(){
		System.out.println(valorConverter * 0.85);
	}
	
	//DOLAR
	public static void dolarReal(){
		System.out.println(valorConverter * 5.46);
	}
	public static void dolarEuro(){
		System.out.println(valorConverter * 0.87);
	}
	public static void dolarLibra(){
		System.out.println(valorConverter * 0.74);
	}
	
	//LIBRA-ESTERLINA
	public static void libraReal(){
		System.out.println(valorConverter * 7.33);
	}
	public static void libraEuro(){
		System.out.println(valorConverter * 1.17);
	}
	public static void libraDolar(){
		System.out.println(valorConverter * 1.34);
	}
	

	public static void main(String[] args) {
		obterDados();
		
	}

}
