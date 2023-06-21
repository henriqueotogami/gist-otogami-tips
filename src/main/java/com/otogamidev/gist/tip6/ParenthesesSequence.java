package tip6;

public class ParenthesesSequence {

    public static boolean isValid(final String fullSequence) {
        final int sequenceSize = fullSequence.length();
        boolean isValidSequence = false;
        for(int index = 0; sequenceSize > index; index++) {
            char openChar = fullSequence.charAt(index);
            System.out.println(openChar);
            switch (openChar) {
                case '(':
                    isValidSequence = (fullSequence.charAt(index+1) == ')');
                    break;
                case '[':
                    isValidSequence = (fullSequence.charAt(index+1) == ']');
                    break;
                case '{':
                    isValidSequence = (fullSequence.charAt(index+1) == '}');
                    break;
            }
            index++;
            if(isValidSequence == false) break;
        }
        return isValidSequence;
    }

    public static void main(String[] args) {
        isValid("()[]{}");
    }
}
