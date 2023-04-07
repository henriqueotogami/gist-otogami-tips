package tip1;

import java.math.BigInteger;

public class ByteTipsOne {
    public static void main(String[] args) {

        final int decimalToParser = 207;
        System.out.println("ByteTipsOne - main(): decimalToParser   = " + decimalToParser);

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
        System.out.println("ByteTipsOne - byteDataType(): --------------------------------------");
        System.out.println("ByteTipsOne - byteDataType(): byteDataType      = " + byteDataType);
//        ByteTipsOne - byteDataType(): byteDataType = -49
        final int binaryData = Integer.parseInt(Integer.toBinaryString(decimalToParser));
        System.out.println("ByteTipsOne - byteDataType(): binaryData      = " + binaryData);
        final int decimalInverted = ~decimalToParser;
        System.out.println("ByteTipsOne - byteDataType(): decimalInverted      = " + decimalInverted);
        final String binaryInverted = Integer.toBinaryString(decimalInverted);
        System.out.println("ByteTipsOne - byteDataType(): binaryInverted      = " + binaryInverted);
        final int binaryOne = Integer.parseInt("00000001");
        final BigInteger bigIntegerOne = new BigInteger("00000001");
        final BigInteger bigIntegerInverted = new BigInteger(binaryInverted);
        final BigInteger subtraction = (bigIntegerInverted);
        System.out.println("ByteTipsOne - byteDataType(): subtraction      = " + subtraction);
        System.out.println("ByteTipsOne - byteDataType(): --------------------------------------");

        int i = ((2 ^ 3) - 3);
        System.out.println("ByteTipsOne - byteDataType(): i      = " + i);
    }

    private static void shortDataType(final int decimalToParser) {
        final short shortDataType = ((short) decimalToParser);
        System.out.println("ByteTipsOne - shortDataType(): shortDataType     = " + shortDataType);
//        ByteTipsOne - shortDataType(): shortDataType = 207
    }

    private static void longDataType(final int decimalToParser) {
        final long longDataType = ((long) decimalToParser);
        System.out.println("ByteTipsOne - longDataType(): longDataType      = " + longDataType);
//        ByteTipsOne - longDataType(): longDataType = 207
    }

    private static void floatDataType(final int decimalToParser) {
        final float longDataType = ((float) decimalToParser);
        System.out.println("ByteTipsOne - floatDataType(): floatDataType     = " + longDataType);
//        ByteTipsOne - floatDataType(): longDataType = 207.0
    }

    private static void doubleDataType(final int decimalToParser) {
        final float doubleDataType = ((float) decimalToParser);
        System.out.println("ByteTipsOne - doubleDataType(): doubleDataType    = " + doubleDataType);
//        ByteTipsOne - doubleDataType(): doubleDataType = 207.0
    }

    private static void twoComplement(final int decimalToParser) {
        final String decimanlConvertedInBinary = Integer.toBinaryString(decimalToParser);
        final StringBuilder convertedBinaryReverse = new StringBuilder();
        convertedBinaryReverse.append(decimanlConvertedInBinary);
        final String binaryReverse = convertedBinaryReverse.reverse().toString();
        final short binaryReverseConvertedShort = Short.valueOf(binaryReverse,2);
        final BigInteger bigInteger = new BigInteger(binaryReverse);
        final byte binaryReverseConvertedByte = bigInteger.byteValue();
        final byte byteRightShift = (byte) (binaryReverseConvertedByte << 1);
        final String byteRightShiftString = Integer.toBinaryString((int) byteRightShift);
        System.out.println("ByteTipsOne - doubleDataType(): decimanlConvertedInBinary    = " + decimanlConvertedInBinary);
        System.out.println("ByteTipsOne - doubleDataType(): binaryReverse    = " + binaryReverse);
        System.out.println("ByteTipsOne - doubleDataType(): binaryReverseConvertedShort    = " + binaryReverseConvertedShort);
        System.out.println("ByteTipsOne - doubleDataType(): binaryReverseConvertedByte    = " + binaryReverseConvertedByte);
        System.out.println("ByteTipsOne - doubleDataType(): byteRightShift    = " + byteRightShift);
        System.out.println("ByteTipsOne - doubleDataType(): byteRightShiftString    = " + byteRightShiftString);
    }

}