package tip1;

public class MediumExamples {
    final static int decimalToParser = 207;
    public static void main(String[] args) {

        final byte byteDataType = ((byte) decimalToParser);
        System.out.println("MediumExamples - byteDataType = " + byteDataType);
//        MediumExamples - byteDataType = -49

        final int twosComplement = TwosComplement.calculate(decimalToParser);
        System.out.println("MediumExamples - twosComplement = " + twosComplement);
//        MediumExamples - twosComplement = -49
    }
}
