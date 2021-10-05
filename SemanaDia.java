package br.ucsal;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o número do dia da semana \ne veja o nome correspondente");
		int diaSemana = input.nextInt();
			
		switch (diaSemana) {
			case 1:
				System.out.println("DOMINGO");
				break;
			case 2:
				System.out.println("SEGUNDA");
				break;
			case 3:
				System.out.println("TERÇA");
				break;
			case 4:
				System.out.println("QUARTA");
				break;
			case 5:
				System.out.println("QUINTA");
				break;
			case 6:
				System.out.println("SEXTA");
				break;
			case 7:
				System.out.println("SÁBADO");
				break;
			default:
				System.out.println("Dia inválido. Tente novamente");
				break;
				
			}
		input.close();
		}
		
		}
