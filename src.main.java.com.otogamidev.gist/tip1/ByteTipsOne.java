package tip1;

public class ByteTipsOne {

    private static byte resultByteDataType = 0;
    private static int resultTwoComplement = 0;
    public static void main(String[] args) {
        try {
            for (int index = 0; 256 > index; index++) {
                final int decimalToParser = index;
                System.out.println("ByteTipsOne - main(): decimalToParser           = " + decimalToParser);
//        Primitive Data Types | Tipos de dados primitivos
                resultByteDataType = byteDataType(decimalToParser);
//        shortDataType(decimalToParser);
//        longDataType(decimalToParser);
//        floatDataType(decimalToParser);
//        doubleDataType(decimalToParser);
                resultTwoComplement = twoComplement(decimalToParser);
                if (resultByteDataType != resultTwoComplement)
                    throw new Exception("TWO COMPLEMENT IS FAILED");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static byte byteDataType(final int decimalToParser) {
        final byte byteDataType = ((byte) decimalToParser);
        System.out.println("ByteTipsOne - byteDataType(): byteDataType      = " + byteDataType);
        return byteDataType;
    }

    private static void shortDataType(final int decimalToParser) {
        final short shortDataType = ((short) decimalToParser);
        System.out.println("ByteTipsOne - shortDataType(): shortDataType    = " + shortDataType);
//        ByteTipsOne - shortDataType(): shortDataType = 207
    }

    private static void longDataType(final int decimalToParser) {
        final long longDataType = ((long) decimalToParser);
        System.out.println("ByteTipsOne - longDataType(): longDataType      = " + longDataType);
//        ByteTipsOne - longDataType(): longDataType = 207
    }

    private static void floatDataType(final int decimalToParser) {
        final float longDataType = ((float) decimalToParser);
        System.out.println("ByteTipsOne - floatDataType(): floatDataType    = " + longDataType);
//        ByteTipsOne - floatDataType(): longDataType = 207.0
    }

    private static void doubleDataType(final int decimalToParser) {
        final float doubleDataType = ((float) decimalToParser);
        System.out.println("ByteTipsOne - doubleDataType(): doubleDataType  = " + doubleDataType);
//        ByteTipsOne - doubleDataType(): doubleDataType = 207.0
    }

    private static int twoComplement(final int decimalToParser) {
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
        System.out.println("ByteTipsOne - twoComplement(): BEGIN ");
        System.out.println("ByteTipsOne - twoComplement(): Decimal converted in binary      = " + decimanlConvertedInBinary);

        final String binaryReverse = convertedBinaryReverse.reverse().toString();
        System.out.println("ByteTipsOne - twoComplement(): Binary reverse                    = " + binaryReverse);
        int integerFirstComplement = 0;

        if((BYTE_MIN_VALUE > decimalToParser) || (decimalToParser > BYTE_MAX_VALUE)) {
            integerFirstComplement = (((int) Math.pow(BINARY_INDICATOR, BYTE_SIZE)) - decimalToParser);

            System.out.println("ByteTipsOne - twoComplement(): Integer first Complement          = " + integerFirstComplement);
            String binaryFirstComplement = Integer.toBinaryString(integerFirstComplement);

            final int binaryFirstComplementSize = binaryFirstComplement.length();
            if (binaryFirstComplementSize > BYTE_SIZE) {
                final int indexBegin = binaryFirstComplementSize - BYTE_SIZE;
                final int beginEnd = binaryFirstComplementSize;
                binaryFirstComplement = binaryFirstComplement.substring(indexBegin, beginEnd);
            }

            System.out.println("ByteTipsOne - twoComplement(): Binary first complement           = " + binaryFirstComplement);

            if (BYTE_MIN_VALUE > integerFirstComplement) {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("ByteTipsOne - twoComplement(): Integer first complement is smaller than the Byte Minimun Value");
                System.out.println("ByteTipsOne - twoComplement(): Integer first complement          = " + integerFirstComplement);
                System.out.println("-------------------------------------------------------------------------");
            } else if (BYTE_MAX_VALUE > integerFirstComplement) {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("ByteTipsOne - twoComplement(): Integer first complement is smaller than the Byte Maximum Value");
                System.out.println("ByteTipsOne - twoComplement(): Integer first complement          = " + integerFirstComplement);
                System.out.println("-------------------------------------------------------------------------");
            } else {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("ByteTipsOne - twoComplement(): Integer first complement is outside the range");
                System.out.println("ByteTipsOne - twoComplement(): Integer first complement          = " + integerFirstComplement);

                final StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(binaryFirstComplement);
                final String binaryReversedFirstComplement = stringBuilder.reverse().toString();
                System.out.println("ByteTipsOne - twoComplement(): Binary reversed first complement  = " + binaryReversedFirstComplement);

                final int integerReversedFirstComplemet = Integer.parseInt(binaryReversedFirstComplement, BINARY_INDICATOR);
                System.out.println("ByteTipsOne - twoComplement(): Integer reversed first complemet  = " + integerReversedFirstComplemet);

                final int reversedSecondComplement = integerReversedFirstComplemet + PLUS_ONE;
                stringBuilder.setLength(CLEAR_STRING_BUILDER);
                final String binaryReversedSecondComplement = Integer.toBinaryString(reversedSecondComplement);
                System.out.println("ByteTipsOne - twoComplement(): Binary reversed second complement = " + binaryReversedSecondComplement);

                final String binarySecondComplement = stringBuilder.append(binaryReversedSecondComplement).reverse().toString();
                System.out.println("ByteTipsOne - twoComplement(): Binary second complement          = " + binarySecondComplement);

                final int integerSecondComplement = Integer.parseInt(binarySecondComplement, BINARY_INDICATOR);
                System.out.println("ByteTipsOne - twoComplement(): Integer second complement         = " + integerSecondComplement);
                System.out.println("-------------------------------------------------------------------------");
            }

            final String mostSignificantBit = binaryReverse.substring(INDEX_BEGIN_ONE_BIT, INDEX_END_ONE_BIT);
            System.out.println("ByteTipsOne - twoComplement(): Most significant bit              = " + mostSignificantBit);


            System.out.println("ByteTipsOne - twoComplement(): Most significant bit is negative");
            integerFirstComplement = Math.multiplyExact(integerFirstComplement, MINUS_ONE);

        } else {
            integerFirstComplement = decimalToParser;
        }

        System.out.println("ByteTipsOne - twoComplement(): Final integer first complement    = " + integerFirstComplement);
        System.out.println("ByteTipsOne - twoComplement(): END ");
        System.out.println("-------------------------------------------------------------------------");

        return integerFirstComplement;
    }
}