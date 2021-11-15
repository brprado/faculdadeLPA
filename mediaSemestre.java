package metodos;

import java.util.Scanner;

public class mediaSemestre {
	
	static double primeiraUnidade1, primeiraUnidade2,primeiraUnidade3,
	mediaPrimeiraUnidade, segundaUnidade1, segundaUnidade2, segundaUnidade3, 
	mediaSegundaUnidade, mediaFinal;
	public static Scanner input = new Scanner(System.in);
	
	//NOTAS PRIMEIRA UNIDADE
	public static void primeiraUnidade() {
		System.out.print("primeira nota 1° unidade: ");
		primeiraUnidade1 = input.nextDouble();
		
		System.out.print("segunda nota 1° unidade: ");
		primeiraUnidade2 = input.nextDouble();
		
		System.out.print("terceira nota 1° unidade: ");
		primeiraUnidade3 = input.nextDouble();
		
		mediaPrimeiraUnidade = ((primeiraUnidade1 * 2) + (primeiraUnidade2 * 3) 
				+ (primeiraUnidade3 * 5)) / 10;
		
		System.out.println("A media da primeira unidade é: " + mediaPrimeiraUnidade);
	}
	
	//NOTAS SEGUNDA UNIDADE
	public static void segundaUnidade() {
		System.out.print("primeira nota 2° unidade: ");
		segundaUnidade1 = input.nextDouble();
		
		System.out.print("segunda nota 2° unidade: ");
		segundaUnidade2 = input.nextDouble();
		
		System.out.print("terceira nota 2° unidade: ");
		segundaUnidade3 = input.nextDouble();
		
		mediaSegundaUnidade = ((segundaUnidade1 * 3) + (segundaUnidade2 * 3) 
				+ (segundaUnidade3 * 4)) / 10;
		
		System.out.println("A media da segunda unidade é: " + mediaSegundaUnidade+"\n");
		
	
	}
	
	public static void resultadoFinal() {
		mediaFinal = (mediaPrimeiraUnidade + mediaSegundaUnidade) / 2;
		System.out.print("Média final: "+mediaFinal+"\n");
		if (mediaFinal >= 6) {
			System.out.print("Parabens! voce foi APROVADO!");
		}else {
			System.out.print("Você foi REPROVADO");
		}
	}
	
	public static void main(String[] args) {	
		primeiraUnidade();
		segundaUnidade();	
		resultadoFinal();

	}

}
