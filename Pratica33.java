package faculdade;

import java.util.Arrays;

public class Pratica33 {

    public static void main(String[] args) {
        int maxNum = 30, cont = 0;
        int[] numeroFibo = new int[maxNum];
        int n1 = 0, n2 = 1, n3 = 0;
        int numerosFibonacci = 1;

        for (int i = 0; i < maxNum; i++){n3 = n1 + n2;
            numeroFibo[i] = n1;
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(Arrays.toString(numeroFibo));
    }
}
