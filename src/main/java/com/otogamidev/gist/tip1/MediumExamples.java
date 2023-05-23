package tip1;

public class MediumExamples {
    static int decimalToParser = 10;
    public static void main(String[] args) {

        for (int index = 0; 300 > index; index++) {
            decimalToParser = index;
            System.out.println("MediumExamples - decimalToParser = " + decimalToParser);
            final byte byteDataType = ((byte) decimalToParser);
            System.out.println("MediumExamples - byteDataType = " + byteDataType);
//        MediumExamples - byteDataType = -49

            final int twosComplement = TwosComplement.calculate(decimalToParser);
            System.out.println("MediumExamples - twosComplement = " + twosComplement);
//        MediumExamples - twosComplement = -49

            final int twosComplementOnJava = TwosComplementOnJava.calculate(decimalToParser);
            System.out.println("MediumExamples - twosComplementOnJava = " + twosComplementOnJava);
//        MediumExamples - twosComplementOnJava = -49
        }
    }
}
