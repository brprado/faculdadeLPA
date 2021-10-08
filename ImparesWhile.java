package br.ucsal;

public class While {

	public static void main(String[] args) { //while(condição) {código}
		int var = 1;
		while (var < 50){
			var++;
			if(var % 2 == 1) {
				System.out.print(var);
			}
			
		}
		

	}

}
