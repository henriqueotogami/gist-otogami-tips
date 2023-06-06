package tip3;
/**
 * Segundo desafio do https://leetcode.com/henriqueotogami/
 */
public class PalindromeNumber {
    public static boolean isPalindrome(final int numberToReverse) {
        if(numberToReverse >= 0) {
            final StringBuilder stringBuilder = new StringBuilder().append(numberToReverse);
            final String reversed = stringBuilder.reverse().toString();
            System.out.println("stringBuilder = " + String.valueOf(numberToReverse) + " | stringBuilderReversed = " + reversed);
            if (reversed.equals(String.valueOf(numberToReverse))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        final int minimumValue = (int) Math.pow(-2,31);
        final int maximumValue = (int) (Math.pow(2,31)-1d);
        int index = 10;
//        for(int index = 0; maximumValue > index; index++) {
            boolean isPalindrome = isPalindrome((int) index);
            System.out.println("index: " + index + " isPalindrome: " + isPalindrome);
//        }
    }
}
