package tip1;

public class TwosComplement {
    final static int BYTE_MIN_VALUE = -127;
    final static int BYTE_MAX_VALUE = 127;
    final static int BINARY_INDICATOR = 2;
    final static int BYTE_SIZE = 8;
    final static int PLUS_ONE = 1;
    final static int CLEAR_STRING_BUILDER = 0;
    final static int INDEX_BEGIN_ONE_BIT = 0;
    final static int INDEX_END_ONE_BIT = 1;
    final static int MINUS_ONE = ((int) -1);
    public static int calculate(final int decimalToParser) {
        final String decimanlConvertedInBinary = Integer.toBinaryString(decimalToParser);
        final StringBuilder convertedBinaryReverse = new StringBuilder();
        convertedBinaryReverse.append(decimanlConvertedInBinary);
        final String binaryReverse = convertedBinaryReverse.reverse().toString();

        int integerFirstComplement = 0;

        if ((BYTE_MIN_VALUE > decimalToParser) || (decimalToParser > BYTE_MAX_VALUE)) {
            integerFirstComplement = (((int) Math.pow(BINARY_INDICATOR, BYTE_SIZE)) - decimalToParser);
            String binaryFirstComplement = Integer.toBinaryString(integerFirstComplement);
            final int binaryFirstComplementSize = binaryFirstComplement.length();
            if (binaryFirstComplementSize > BYTE_SIZE) {
                final int indexBegin = binaryFirstComplementSize - BYTE_SIZE;
                final int beginEnd = binaryFirstComplementSize;
                binaryFirstComplement = binaryFirstComplement.substring(indexBegin, beginEnd);
            }

            if (BYTE_MIN_VALUE > integerFirstComplement) {
                System.out.println("ByteTipsOne - twoComplement(): Integer first complement is smaller than the Byte Minimun Value");
            } else if (BYTE_MAX_VALUE > integerFirstComplement) {
                System.out.println("ByteTipsOne - twoComplement(): Integer first complement is smaller than the Byte Maximum Value");
            } else {
                System.out.println("ByteTipsOne - twoComplement(): Integer first complement is outside the range");

                final StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(binaryFirstComplement);
                final String binaryReversedFirstComplement = stringBuilder.reverse().toString();
                final int integerReversedFirstComplemet = Integer.parseInt(binaryReversedFirstComplement, BINARY_INDICATOR);

                final int reversedSecondComplement = integerReversedFirstComplemet + PLUS_ONE;
                stringBuilder.setLength(CLEAR_STRING_BUILDER);
                final String binaryReversedSecondComplement = Integer.toBinaryString(reversedSecondComplement);

                final String binarySecondComplement = stringBuilder.append(binaryReversedSecondComplement).reverse().toString();

                final int integerSecondComplement = Integer.parseInt(binarySecondComplement, BINARY_INDICATOR);
            }
            final String mostSignificantBit = binaryReverse.substring(INDEX_BEGIN_ONE_BIT, INDEX_END_ONE_BIT);
            integerFirstComplement = Math.multiplyExact(integerFirstComplement, MINUS_ONE);
        } else {
            integerFirstComplement = decimalToParser;
        }
        return integerFirstComplement;
    }
}