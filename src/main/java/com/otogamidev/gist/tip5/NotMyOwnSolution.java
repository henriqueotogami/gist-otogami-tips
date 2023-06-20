package tip5;

import java.util.HashMap;
import java.util.Map;

class NotMyOwnSolution {
    public static int oneRomanToInt(String s) {
        int number = 0;
        int answer = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                number = 1;
            } else if (s.charAt(i) == 'V') {
                number = 5;
            } else if (s.charAt(i) == 'X') {
                number = 10;
            } else if (s.charAt(i) == 'L') {
                number = 50;
            } else if (s.charAt(i) == 'C') {
                number = 100;
            } else if (s.charAt(i) == 'D') {
                number = 500;
            } else if (s.charAt(i) == 'M') {
                number = 1000;
            }
            if (number < prev) {
                answer -= number;
                System.out.println("prev is bigger than number - answer = " + answer);
                System.out.println("prev is bigger than number - number = " + number);
            } else {
                answer += number;
                System.out.println("prev is not bigger than number - answer = " + answer);
                System.out.println("prev is not bigger than number - number = " + number);
            }
            prev = number;
        }
        return answer;
    }

    private static int twoRomanToInt(final String numberToConvert) {

        final Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I',1);
        romanNumbers.put('V',5);
        romanNumbers.put('X',10);
        romanNumbers.put('L',50);
        romanNumbers.put('C',100);
        romanNumbers.put('D',500);
        romanNumbers.put('M',1000);
        int lastHandleInt = 0;
        int resultInDecimal = 0;
        final int numberToConvertSize = numberToConvert.length();
        for(int index = (numberToConvertSize-1); index >= 0; index--) {
            final char charToConvert = numberToConvert.charAt(index);
            int handleInt = romanNumbers.get(charToConvert).intValue();
            if(lastHandleInt > handleInt) {
                resultInDecimal -= handleInt;
            } else {
                resultInDecimal += handleInt;
            }
            lastHandleInt = handleInt;
            System.out.println("resultInDecimal" + resultInDecimal);
        }
        return resultInDecimal;
    }

    public static void main(String[] args) {
        twoRomanToInt("MCMXCIV");
    }
}
