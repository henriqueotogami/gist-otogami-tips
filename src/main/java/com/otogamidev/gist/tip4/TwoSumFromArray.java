package tip4;

import java.util.Arrays;

/**
 * Terceiro desafio do Leetcode
 *
 * Dada uma matriz de números inteiros nums e um alvo inteiro, devolva os índices dos dois números de modo a que somem o alvo.
 * Pode assumir que cada entrada tem exatamente uma solução e não pode utilizar o mesmo elemento duas vezes.
 * Pode devolver a resposta em qualquer ordem.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * @author henriqueotogami
 */
public class TwoSumFromArray {
    public static int[] twoSum(final int[] originNumbers, final int targetSum) {
        final int originNumbersSize = originNumbers.length;
        int[] rangeNumbers = new int[2];
        for(int firstIndex = 0; (originNumbersSize-1) > firstIndex; firstIndex++) {
            for(int secondIndex = 0; originNumbersSize > secondIndex; secondIndex++) {
                final int numberOne = originNumbers[firstIndex];
                if(firstIndex != secondIndex) {
                    final int numberTwo = originNumbers[secondIndex];
                    final int sumTwoNumbers = numberOne + numberTwo;
                    if (sumTwoNumbers == targetSum) {
                        rangeNumbers[0] = firstIndex;
                        rangeNumbers[1] = secondIndex;
                        break;
                    }
//                    System.out.println("numberOne = " + numberOne + " | numberTwo = " + numberTwo);
                }
            }
        }
        return rangeNumbers;
    }

    public static void main(String[] args) {
        final int[] input = new int[] {3,2,3};
        final int target = 6;
        final int[] rangeFound = twoSum(input, target);
        System.out.println("rangeFound = " + Arrays.toString(rangeFound));
    }
}
