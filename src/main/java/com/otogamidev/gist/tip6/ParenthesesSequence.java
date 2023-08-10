package tip6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ParenthesesSequence {

    final static String[] openChars = new String[]{ "(", "[", "{" };
    final static String[] closeChars = new String[]{ ")", "]", "}" };

    public static boolean isValid(final String fullSequence) {
        boolean isValidSequence = false;
        List<Integer> closeSequence = new ArrayList<>();
        final int sequenceSize = fullSequence.length();
        final boolean isPairSize = ((sequenceSize%2) == 0);
        try {
            if(isPairSize) {
                for (int index = 0; sequenceSize > index; index++) {
                    final char eachCharInput = fullSequence.charAt(index);
                    final boolean isOpenCharSequence = Arrays.stream(openChars).anyMatch(openChar -> (eachCharInput == openChar.charAt(0)));
                    if(isOpenCharSequence) {
                        final int closeCharIndex = Arrays.stream(openChars).toList().indexOf(String.valueOf(eachCharInput));
                        closeSequence.add(closeCharIndex);
                    } else {
                        final int indexToClose = closeSequence.get((closeSequence.size() - 1));
                        final char charClosing = closeChars[indexToClose].charAt(0);
                        final int removeCharIndex = (closeSequence.size() - 1);
                        isValidSequence = (charClosing == eachCharInput);
                        if(isValidSequence == false) break;
                        closeSequence.remove(removeCharIndex);
                    }
                }
            }
        } catch(final Exception exception) {
            isValidSequence =  false;
        } finally {
            if (isValidSequence) isValidSequence = (closeSequence.size() == 0);
        }
        return isValidSequence;
    }

    public static void main(String[] args) {
        System.out.println(" Teste 01 = " + isValid("()")           + " | Esperado = true");
        System.out.println(" Teste 02 = " + isValid("()[]{}")       + " | Esperado = true");
        System.out.println(" Teste 03 = " + isValid("(]")           + " | Esperado = false");
        System.out.println(" Teste 04 = " + isValid("{[]}")         + " | Esperado = true");
        System.out.println(" Teste 05 = " + isValid("({[]})")       + " | Esperado = true");
        System.out.println(" Teste 06 = " + isValid("(){[]}")       + " | Esperado = true");
        System.out.println(" Teste 07 = " + isValid("([)]")         + " | Esperado = false");
        System.out.println(" Teste 08 = " + isValid("}{")           + " | Esperado = false");
        System.out.println(" Teste 09 = " + isValid("(){}}{")       + " | Esperado = false");
        System.out.println(" Teste 10 = " + isValid("[[[]")         + " | Esperado = false");
        System.out.println(" Teste 11 = " + isValid("(([]){})")     + " | Esperado = true");
        System.out.println(" Teste 12 = " + isValid("({{{{}}}))")   + " | Esperado = false");
        System.out.println(" Teste 13 = " + isValid("()))")         + " | Esperado = false");
    }
}
