package faculdade;

import java.util.Arrays;

public class Pratica32 {

    public static String printarArray(){
        int[] minhaArray = new int[30];
        for (int i = 0, num = 1; i < minhaArray.length; i++, num++){
            minhaArray[i] = num;
        }
        return Arrays.toString(minhaArray);
    }

    public static void main(String[] args) {
        System.out.println(printarArray());

    }
}
