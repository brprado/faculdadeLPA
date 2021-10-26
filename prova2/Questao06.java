package prova2;

public class Questao06 {

	public static void main(String[] args) {
		 int inicial=19, razao=4, an=inicial, cont = 0, valorMax=500;
		        while(an<=valorMax){
		            System.out.println(an);
		            an += razao;
		            cont++;
		        }
		        System.out.println("A soma dos termos é "+ (inicial + an) * cont/2);
	}//valor incial + valor final * numero de termos/2

}
