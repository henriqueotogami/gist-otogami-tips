package tip1;

public class TwosComplementOnJava {
    static int calculate(final int decimalToParser) {
        final int BYTE_MIN_VALUE = -127;
        final int BYTE_MAX_VALUE = 127;
//        System.out.println("-------------------------------------------------------------------------");
//        System.out.println("twoComplementOnJava - calculate(): BEGIN ");
        int integerFirstComplement = 0;

        if((BYTE_MIN_VALUE > decimalToParser) || (decimalToParser > BYTE_MAX_VALUE)) {
//            System.out.println("twoComplementOnJava - calculate(): starting");
            integerFirstComplement = TwosComplement.calculate(decimalToParser);
        } else {
//            System.out.println("twoComplementOnJava - calculate(): continues");
            integerFirstComplement = decimalToParser;
        }
//        System.out.println("ComparingPrimitiveTypes - twoComplementOnJava(): END ");
//        System.out.println("-------------------------------------------------------------------------");

        return integerFirstComplement;
    }
}
