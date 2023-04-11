package tip1;

import java.math.BigInteger;

public class ByteTipsOne {
    public static void main(String[] args) {

        final int decimalToParser = 700;
        System.out.println("ByteTipsOne - main(): decimalToParser           = " + decimalToParser);

//        Primitive Data Types | Tipos de dados primitivos
        byteDataType(decimalToParser);
        shortDataType(decimalToParser);
        longDataType(decimalToParser);
        floatDataType(decimalToParser);
        doubleDataType(decimalToParser);
        twoComplement(decimalToParser);
    }

    private static void byteDataType(final int decimalToParser) {
        final byte byteDataType = ((byte) decimalToParser);
        System.out.println("ByteTipsOne - byteDataType(): byteDataType      = " + byteDataType);
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

    private static void twoComplement(final int decimalToParser) {
        final String decimanlConvertedInBinary = Integer.toBinaryString(decimalToParser);
        final StringBuilder convertedBinaryReverse = new StringBuilder();
        convertedBinaryReverse.append(decimanlConvertedInBinary);
        System.out.println("ByteTipsOne - twoComplement(): decimanlConvertedInBinary  = " + decimanlConvertedInBinary);

        final String binaryReverse = convertedBinaryReverse.reverse().toString();
        System.out.println("ByteTipsOne - twoComplement(): binaryReverse              = " + binaryReverse);
        int integerFirstComplement = 0;

        System.out.println("ByteTipsOne - twoComplement(): binaryReverse.length() = 8");
        integerFirstComplement = (((int) Math.pow(2,8)) - decimalToParser);
        System.out.println("ByteTipsOne - twoComplement(): integerFirstComplement = " + integerFirstComplement);
        String binaryFirstComplement = Integer.toBinaryString(integerFirstComplement);
        System.out.println("ByteTipsOne - twoComplement(): binaryFirstComplement = " + binaryFirstComplement);
        if((-127 <= integerFirstComplement)) {
            System.out.println("ByteTipsOne - twoComplement(): integerFirstComplement is within the range");
        } else {
            System.out.println("ByteTipsOne - twoComplement(): integerFirstComplement is outside the range");
            final StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(binaryFirstComplement);
            final String reversedBinaryFirstComplement = stringBuilder.reverse().toString();
            System.out.println("ByteTipsOne - twoComplement(): reversedBinaryFirstComplement = " + reversedBinaryFirstComplement);
            final int integerReversedFirstComplemet = Integer.parseInt(reversedBinaryFirstComplement,2);
            System.out.println("ByteTipsOne - twoComplement(): integerReversedFirstComplemet = " + integerReversedFirstComplemet);
            final int reversedSecondComplement = integerReversedFirstComplemet + 1;
            stringBuilder.setLength(0);
            final String reversedBinarySecondComplement = Integer.toBinaryString(reversedSecondComplement);
            System.out.println("ByteTipsOne - twoComplement(): binarySecondComplement = " + reversedBinarySecondComplement);
            final String binarySecondComplement  = stringBuilder.append(reversedBinarySecondComplement).reverse().toString();
            System.out.println("ByteTipsOne - twoComplement(): binarySecondComplement = " + binarySecondComplement);
            final int integerSecondComplement = Integer.parseInt(binarySecondComplement,2);
            System.out.println("ByteTipsOne - twoComplement(): integerSecondComplement = " + integerSecondComplement);
        }
        final String mostSignificantBit = binaryReverse.substring(0,1);
        System.out.println("ByteTipsOne - twoComplement(): mostSignificantBit = " + mostSignificantBit);
        if(mostSignificantBit.equals("0")){
            System.out.println("ByteTipsOne - twoComplement(): Most significant bit is positive");
        } else {
            System.out.println("ByteTipsOne - twoComplement(): Most significant bit is negative");
            integerFirstComplement = Math.multiplyExact(integerFirstComplement, (int) -1);
        }
        System.out.println("ByteTipsOne - twoComplement(): integerFirstComplement = " + integerFirstComplement);




    }

}