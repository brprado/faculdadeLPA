package prova2;

public class Questao04 {

	public static void main(String[] args) {

		int valorInicial=24,
				quociente=3,
				gn=valorInicial,
				valorMax=100000;

		System.out.printf("Elementos da PG, com primeiro valor %d,razão %d, menores que %d\n", valorInicial, quociente, valorMax );
		while(gn<=valorMax){
			System.out.println(gn);
			gn *= quociente;
		}
	}


}
