package tip1;

public class ComparingPrimitiveTypes {

    private static byte resultByteDataType = 0;
    private static int resultTwoComplementOnJava = 0;
    public static void main(String[] args) {
        try {
            for (int index = 0; -127 < index; index++) {
                final int decimalToParser = index;
                System.out.println("ComparingPrimitiveTypes - main(): decimalToParser           = " + decimalToParser);
//        Primitive Data Types | Tipos de dados primitivos
                resultByteDataType = byteDataType(decimalToParser);
                resultTwoComplementOnJava = TwosComplementOnJava.calculate(decimalToParser);
                if (resultByteDataType != resultTwoComplementOnJava)
                    throw new Exception("TWO COMPLEMENT IS FAILED");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        shortDataType(decimalToParser);
//        longDataType(decimalToParser);
//        floatDataType(decimalToParser);
//        doubleDataType(decimalToParser);
    }

    private static byte byteDataType(final int decimalToParser) {
        final byte byteDataType = ((byte) decimalToParser);
        System.out.println("ComparingPrimitiveTypes - byteDataType(): byteDataType      = " + byteDataType);
        return byteDataType;
    }

    private static void shortDataType(final int decimalToParser) {
        final short shortDataType = ((short) decimalToParser);
        System.out.println("ComparingPrimitiveTypes - shortDataType(): shortDataType    = " + shortDataType);
//        ComparingPrimitiveTypes - shortDataType(): shortDataType = 207
    }

    private static void longDataType(final int decimalToParser) {
        final long longDataType = ((long) decimalToParser);
        System.out.println("ComparingPrimitiveTypes - longDataType(): longDataType      = " + longDataType);
//        ComparingPrimitiveTypes - longDataType(): longDataType = 207
    }

    private static void floatDataType(final int decimalToParser) {
        final float longDataType = ((float) decimalToParser);
        System.out.println("ComparingPrimitiveTypes - floatDataType(): floatDataType    = " + longDataType);
//        ComparingPrimitiveTypes - floatDataType(): longDataType = 207.0
    }

    private static void doubleDataType(final int decimalToParser) {
        final float doubleDataType = ((float) decimalToParser);
        System.out.println("ComparingPrimitiveTypes - doubleDataType(): doubleDataType  = " + doubleDataType);
//        ComparingPrimitiveTypes - doubleDataType(): doubleDataType = 207.0
    }
}