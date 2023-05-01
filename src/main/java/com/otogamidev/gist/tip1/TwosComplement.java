package tip1;

public class TwosComplement {
    final static int BINARY_INDICATOR = 2;
    final static int BYTE_SIZE = 8;
    final static int MINUS_ONE = ((int) -1);
    public static int calculate(final int decimal) {
//        secondComplement = [(2 ^ n) - |decimalToParser|]
        int decimalToParser = decimal;
        if(0 > decimalToParser) {
            decimalToParser = Math.multiplyExact(decimalToParser, MINUS_ONE);
        }
        int secondComplement = (((int) Math.pow(BINARY_INDICATOR, BYTE_SIZE)) - decimalToParser);
        secondComplement = Math.multiplyExact(secondComplement, MINUS_ONE);
        return secondComplement;
    }
}