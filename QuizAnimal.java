package br.ucsal;

import java.util.Scanner;

public class QuestionarioAnimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Indique entre as opções um animal invertebrado");
		System.out.println("QUESTÃO 01:\n(a)MINHOCA\n(b)ARANHA\n(c)GATO\n(d)CACHORRO\n\nSUA OPÇÃO: ");
		String animalEscolhido = input.nextLine().trim().toLowerCase();
		
		switch (animalEscolhido) {
		case "a": {
			System.out.println("VOCÊ ACERTOU!");
			System.out.println("+1 Ponto");
			break;
		}
		case "b": {
			System.out.println("VOCÊ ACERTOU!");
			System.out.println("+1 Ponto");
			break;
		}
		case "c": {
			System.out.println("VOCÊ ERROU");
			break;
		}
		case "d": {
			System.out.println("VOCÊ ERROU");
			break;
		}
		default:
			System.out.println("Alternativa não existe");
			break;
		}
		input.close();
		
	}

}
