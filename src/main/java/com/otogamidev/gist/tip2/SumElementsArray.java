package tip2;

import java.util.Arrays;

/**
 * Primeiro desafio do https://leetcode.com/henriqueotogami/
 */

public class SumElementsArray {

    public static int[] runningSum(final int[] arrayInput) {
        final int sizeArrayInput = arrayInput.length;
        final int[] arrayOutput = new int[sizeArrayInput];
        for(int index=0; sizeArrayInput > index;index++) {
            if(index == 0){
                arrayOutput[0] = arrayInput[0];
            } else {
                arrayOutput[index] = sumBeforeElements(index, arrayInput);
            }
        }
        return arrayOutput;
    }

    public static int sumBeforeElements(final int actualOutIndex, final int[] arrayInput) {
        int sumOutput = 0;
        for(int index = 0; actualOutIndex >= index; index++) {
            sumOutput += arrayInput[index];
        }
        return sumOutput;
    }

    public static void main(String[] args) {
        final int[] input = new int[]{1,2,3,4};
        final int[] output = runningSum(input);
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(output));
    }
}
