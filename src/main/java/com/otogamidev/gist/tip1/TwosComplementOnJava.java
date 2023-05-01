package tip1;

public class TwosComplementOnJava {
    static int calculate(final int decimalToParser) {
        final int BYTE_MIN_VALUE = -127;
        final int BYTE_MAX_VALUE = 127;
        final int BINARY_INDICATOR = 2;
        final int BYTE_SIZE = 8;
        final int PLUS_ONE = 1;
        final int CLEAR_STRING_BUILDER = 0;
        final int INDEX_BEGIN_ONE_BIT = 0;
        final int INDEX_END_ONE_BIT = 1;
        final int MINUS_ONE = ((int) -1);
        final String POSITIVE_NUMBER_INDICATOR_BIT = "0";

        final String decimanlConvertedInBinary = Integer.toBinaryString(decimalToParser);
        final StringBuilder convertedBinaryReverse = new StringBuilder();
        convertedBinaryReverse.append(decimanlConvertedInBinary);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("twoComplementOnJava - calculate(): BEGIN ");
        System.out.println("twoComplementOnJava - calculate(): Decimal converted in binary      = " + decimanlConvertedInBinary);

        final String binaryReverse = convertedBinaryReverse.reverse().toString();
        System.out.println("twoComplementOnJava - calculate(): Binary reverse                    = " + binaryReverse);
        int integerFirstComplement = 0;

        if((BYTE_MIN_VALUE > decimalToParser) || (decimalToParser > BYTE_MAX_VALUE)) {
            integerFirstComplement = (((int) Math.pow(BINARY_INDICATOR, BYTE_SIZE)) - decimalToParser);

            System.out.println("twoComplementOnJava - calculate(): Integer first Complement          = " + integerFirstComplement);
            String binaryFirstComplement = Integer.toBinaryString(integerFirstComplement);

            final int binaryFirstComplementSize = binaryFirstComplement.length();
            if (binaryFirstComplementSize > BYTE_SIZE) {
                final int indexBegin = binaryFirstComplementSize - BYTE_SIZE;
                final int beginEnd = binaryFirstComplementSize;
                binaryFirstComplement = binaryFirstComplement.substring(indexBegin, beginEnd);
            }

            System.out.println("twoComplementOnJava - calculate(): Binary first complement           = " + binaryFirstComplement);

            if (BYTE_MIN_VALUE > integerFirstComplement) {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("twoComplementOnJava - calculate(): Integer first complement is smaller than the Byte Minimun Value");
                System.out.println("twoComplementOnJava - calculate():Integer first complement          = " + integerFirstComplement);
                System.out.println("-------------------------------------------------------------------------");
            } else if (BYTE_MAX_VALUE > integerFirstComplement) {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("twoComplementOnJava - calculate(): Integer first complement is smaller than the Byte Maximum Value");
                System.out.println("twoComplementOnJava - calculate(): Integer first complement          = " + integerFirstComplement);
                System.out.println("-------------------------------------------------------------------------");
            } else {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("twoComplementOnJava - calculate(): Integer first complement is outside the range");
                System.out.println("twoComplementOnJava - calculate(): Integer first complement          = " + integerFirstComplement);

                final StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(binaryFirstComplement);
                final String binaryReversedFirstComplement = stringBuilder.reverse().toString();
                System.out.println("ComparingPrimitiveTypes - twoComplementOnJava(): Binary reversed first complement  = " + binaryReversedFirstComplement);

                final int integerReversedFirstComplemet = Integer.parseInt(binaryReversedFirstComplement, BINARY_INDICATOR);
                System.out.println("ComparingPrimitiveTypes - twoComplementOnJava(): Integer reversed first complemet  = " + integerReversedFirstComplemet);

                final int reversedSecondComplement = integerReversedFirstComplemet + PLUS_ONE;
                stringBuilder.setLength(CLEAR_STRING_BUILDER);
                final String binaryReversedSecondComplement = Integer.toBinaryString(reversedSecondComplement);
                System.out.println("ComparingPrimitiveTypes - twoComplementOnJava(): Binary reversed second complement = " + binaryReversedSecondComplement);

                final String binarySecondComplement = stringBuilder.append(binaryReversedSecondComplement).reverse().toString();
                System.out.println("ComparingPrimitiveTypes - twoComplementOnJava(): Binary second complement          = " + binarySecondComplement);

                final int integerSecondComplement = Integer.parseInt(binarySecondComplement, BINARY_INDICATOR);
                System.out.println("ComparingPrimitiveTypes - twoComplementOnJava(): Integer second complement         = " + integerSecondComplement);
                System.out.println("-------------------------------------------------------------------------");
            }

            final String mostSignificantBit = binaryReverse.substring(INDEX_BEGIN_ONE_BIT, INDEX_END_ONE_BIT);
            System.out.println("ComparingPrimitiveTypes - twoComplementOnJava(): Most significant bit              = " + mostSignificantBit);


            System.out.println("ComparingPrimitiveTypes - twoComplementOnJava(): Most significant bit is negative");
            integerFirstComplement = Math.multiplyExact(integerFirstComplement, MINUS_ONE);

        } else {
            integerFirstComplement = decimalToParser;
        }

        System.out.println("ComparingPrimitiveTypes - twoComplementOnJava(): Final integer first complement    = " + integerFirstComplement);
        System.out.println("ComparingPrimitiveTypes - twoComplementOnJava(): END ");
        System.out.println("-------------------------------------------------------------------------");

        return integerFirstComplement;
    }
}
