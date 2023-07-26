package tip6;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesSequence {

    final static String[] openChars = new String[]{ "(", "[", "{" };
    final static String[] closeChars = new String[]{ ")", "]", "}" };

    public static boolean isValid(final String fullSequence) {
        boolean isValidSequence = false;
        final int sequenceSize = fullSequence.length();
        final boolean isPairSize = ((sequenceSize%2) == 0);
        List<Integer> closeSequence = new ArrayList<>();
        if(isPairSize) {
            for (int index = 0; sequenceSize > index; index++) {
                final char charFromSequence = fullSequence.charAt(index);
                switch (charFromSequence) {
                    case '(' -> {
                        closeSequence.add(0);
                    }
                    case '[' -> {
                        closeSequence.add(1);
                    }
                    case '{' -> {
                        closeSequence.add(2);
                    }
                    case ')', ']', '}' -> {
                        isValidSequence = extracted(closeSequence, charFromSequence);
                        if(isValidSequence == false) return false;
                    }
                }

            }
        }
        return isValidSequence;
    }

    private static boolean extracted(final List<Integer> closeSequence, final char charFromSequence) {
        int indexSequence = 0;
        final int closeSequenceSize = closeSequence.size();
        if(closeSequenceSize > 1) {
            indexSequence = closeSequenceSize-1;
        }
        int indexToClose = closeSequence.get(indexSequence).intValue();
        char charFromClose = new String(closeChars[indexToClose]).charAt(0);
        if(charFromSequence == charFromClose) {
            closeSequence.remove(indexSequence);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(" 1 = " + isValid("()"));
        System.out.println(" 2 = " + isValid("()[]{}"));
        System.out.println(" 3 = " + isValid("(]"));
        System.out.println(" 4 = " + isValid("{[]}"));
        System.out.println(" 5 = " + isValid("({[]})"));
        System.out.println(" 6 = " + isValid("(){[]}"));
        System.out.println(" 7 = " + isValid("([)]"));
    }
}
