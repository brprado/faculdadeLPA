package faculdade;

import java.util.*;


public class Pratica34 {
    public static int indiceNome = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static final int QTDE_ALUNOS = 6;
    public static String[] nomes = new String[QTDE_ALUNOS];

    public static String obterNomes(int tam) {
        for (int i = 0; i < tam; i++){
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.next();
        }
        return Arrays.toString(nomes);
    }

    public static String obterNomePeloIndice(int indice, String[] nomes){
        return nomes[indice];
    }

    public static Integer obterIndicePeloNome(String nome, String[] vet){
        for(int index = 0; index < vet.length; index++){ //ira simular os indices ded uma array
            if (nomes[index].equalsIgnoreCase(nome)){
                    indiceNome = index;
            }else{
                indiceNome = -1;
            }
        }
        return indiceNome;
    }
    public static void imprimir(String s){
        System.out.print(s);
    }
    public static void imprimir(int n){
        System.out.print(n);
    }
    public static void imprimir(String[] s){
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        imprimir("Informe o nome dos ");
        imprimir(QTDE_ALUNOS);
        imprimir(" alunos\n");
        System.out.println(obterNomes(QTDE_ALUNOS));
        imprimir(nomes);
        System.out.println("Obter nome pelo índice: " + obterNomePeloIndice(1, nomes));
        System.out.println("Obter índice pelo nome: " + obterIndicePeloNome("Pedro", nomes));

    }
}


