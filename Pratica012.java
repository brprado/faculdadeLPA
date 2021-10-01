package br.ucsal;

import java.util.Scanner;

public class Pratica012 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String nome, bairro, cidade, estado, rua, status;
		double altura, peso;
		int cep, numero;
		
		System.out.println("=====CADASTRO=====");
		
		System.out.println("Informe o seu nome");
		nome = input.nextLine();
		
		System.out.println("Informe a sua altura");
		altura = input.nextDouble();
		
		System.out.println("Informe o seu peso");
		peso = input.nextDouble();
		
		input.nextLine();
		
		System.out.println("Informe o nome da sua rua");
		rua = input.nextLine();
		
		System.out.println("Informe o numero da sua residencia");
		numero = input.nextInt();
		System.out.println("=====ENDEREÇO=====");
		input.nextLine();
	
		
		System.out.println("Informe o nome do seu bairro");
		bairro = input.nextLine();
		
		System.out.println("Informe o seu cep");
		cep = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Informe o nome da sua cidade");
		cidade = input.nextLine();
		
		System.out.println("Informe o nome do seu estado");
		estado = input.nextLine();
	
		System.out.println("Qual a sua situação de cadastro: [ATIVO] ou [INATIVO]");
		status = input.nextLine().toUpperCase();
		
		System.out.println("Seja bem vindo, " + nome + " seu status se encontra " + status);
		System.out.println("CONFIRME OS SEU DADOS DE ENDEREÇO");
		System.out.println("Você reside em: " + " rua: " + rua + ", bairro: " + bairro + " N° " + numero + " " + cidade +"-" + estado);
		System.out.println("cep: " + cep);
		System.out.println("Dados pessoais: altura " + altura + " peso " + peso);
		input.close();
		
		
		
	}

}
