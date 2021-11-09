package metodos;

public class Sequencia {

	public static void main(String[] args) {
		sequencia(); //como esta na mesma classe, pode ser chamado direto
		soma(100, 500);
	}
	public static void sequencia() { //sem parametro
		for(int i= 0 ; i< 10; i++) {
			System.out.println(i+ " ");
		}
	}
	public static int soma(int a, int b) { //com parametro
		return a + b;
	}

}
