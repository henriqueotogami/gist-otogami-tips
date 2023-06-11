package tip5;

import java.util.ArrayList;
import java.util.Arrays;

public class RomanToInteger {

    private static int countRomanNumberI = 0;
    private static int countRomanNumberV = 0;
    private static int countRomanNumberX = 0;
    private static int countRomanNumberL = 0;
    private static int countRomanNumberC = 0;
    private static int countRomanNumberD = 0;
    private static  int countRomanNumberM = 0;

    public static int romanToInt(final String romanNumber) {
        final int romanNumberSize = romanNumber.length();
        final ArrayList<String> romanNumberSplited = new ArrayList<>();
        checkRomanNumberType(romanNumber, romanNumberSize, romanNumberSplited);

        for(int index = 0; romanNumberSize > index; index++) {
            final String romanToParse = romanNumberSplited.get(index);
            final boolean isPredecessor = checkPredecessorNumber(romanNumberSplited, index);
            if(RomanNumber.I.toString().equals(romanToParse)) {
                romanNumberTypeI(isPredecessor);
            } else if(RomanNumber.V.toString().equals(romanToParse)) {
                romanNumberTypeV();
            } else if(RomanNumber.X.toString().equals(romanToParse)) {
                romanNumberTypeX(isPredecessor);
            } else if(RomanNumber.L.toString().equals(romanToParse)) {
                romanNumberTypeL();
            } else if(RomanNumber.C.toString().equals(romanToParse)) {
                romanNumberTypeC(isPredecessor);
            } else  if(RomanNumber.D.toString().equals(romanToParse)) {
                romanNumberTypeD();
            } else if(RomanNumber.M.toString().equals(romanToParse)) {
                romanNumberTypeM();
            }
        }

        int romanIntoDecimal = (
                countRomanNumberM +
                countRomanNumberD +
                countRomanNumberC +
                countRomanNumberL +
                countRomanNumberX +
                countRomanNumberV +
                countRomanNumberI
        );
        System.out.println("romanIntoDecimal = " + romanIntoDecimal);
        return romanIntoDecimal;
    }

    private static void romanNumberTypeM() {
        if(countRomanNumberC == RomanNumber.C.getDecimalNumber()) {
            countRomanNumberM = (RomanNumber.M.getDecimalNumber() - RomanNumber.C.getDecimalNumber());
            countRomanNumberC = 0;
        } else if(countRomanNumberM == 0) {
            countRomanNumberM = RomanNumber.M.getDecimalNumber();
        }
        System.out.println("M - countRomanNumberM = " + countRomanNumberM);
    }

    private static void romanNumberTypeD() {
        if(countRomanNumberC == RomanNumber.C.getDecimalNumber()) {
                countRomanNumberD = (RomanNumber.D.getDecimalNumber() - RomanNumber.C.getDecimalNumber());
        } else if(countRomanNumberD == 0) {
            countRomanNumberD = RomanNumber.D.getDecimalNumber();
        }
        System.out.println("D - countRomanNumberD = " + countRomanNumberD);
    }

    private static void romanNumberTypeC(final boolean isPredecessor) {
        if(countRomanNumberX == RomanNumber.X.getDecimalNumber()) {
            countRomanNumberC = (RomanNumber.C.getDecimalNumber() - RomanNumber.X.getDecimalNumber());
            countRomanNumberX = 0;
        } else if(countRomanNumberC == 0) {
            countRomanNumberC = RomanNumber.C.getDecimalNumber();
        }
        if(countRomanNumberD >= RomanNumber.D.getDecimalNumber()) {
            countRomanNumberD += RomanNumber.C.getDecimalNumber();
            countRomanNumberC = 0;
        }
        System.out.println("C - countRomanNumberC = " + countRomanNumberC);
    }

    private static void romanNumberTypeL() {
        if(countRomanNumberX == RomanNumber.X.getDecimalNumber()) {
            countRomanNumberL = (RomanNumber.L.getDecimalNumber() - RomanNumber.X.getDecimalNumber());
            countRomanNumberX = 0;
        } else if(countRomanNumberL == 0) {
            countRomanNumberL = RomanNumber.L.getDecimalNumber();
        }
        System.out.println("L - countRomanNumberL = " + countRomanNumberL);
    }

    private static void romanNumberTypeX(final boolean isPredecessor) {
        if(countRomanNumberI == RomanNumber.I.getDecimalNumber()) {
            countRomanNumberX = (RomanNumber.X.getDecimalNumber() - RomanNumber.I.getDecimalNumber());
            countRomanNumberI = 0;
        } else if (countRomanNumberX >= RomanNumber.X.getDecimalNumber()) {
            countRomanNumberX += RomanNumber.X.getDecimalNumber();
        } else if(countRomanNumberX == 0) {
            countRomanNumberX = RomanNumber.X.getDecimalNumber();
        }
        System.out.println("X - countRomanNumberX = " + countRomanNumberX);
        if(countRomanNumberL >= RomanNumber.L.getDecimalNumber()) {
            countRomanNumberL += RomanNumber.X.getDecimalNumber();
            countRomanNumberX = 0;
            System.out.println("X - countRomanNumberL = " + countRomanNumberL);
        }
    }

    private static void romanNumberTypeV() {
        if (countRomanNumberI == RomanNumber.I.getDecimalNumber()) {
            countRomanNumberV = (RomanNumber.V.getDecimalNumber() - RomanNumber.I.getDecimalNumber());
            countRomanNumberI = 0;
        } else if(countRomanNumberV == 0) {
            countRomanNumberV = RomanNumber.V.getDecimalNumber();
        }
        System.out.println("V - countRomanNumberV = " + countRomanNumberV);
        System.out.println("V - countRomanNumberI = " + countRomanNumberI);
    }

    private static void romanNumberTypeI(final boolean isPredecessor) {
        countRomanNumberI++;
        System.out.println("I - countRomanNumberI = " + countRomanNumberI);
        if(countRomanNumberV >= RomanNumber.V.getDecimalNumber()) {
            countRomanNumberV += RomanNumber.I.getDecimalNumber();
            countRomanNumberI = 0;
            System.out.println("I - countRomanNumberV = " + countRomanNumberV);
        }
        if(countRomanNumberX == RomanNumber.X.getDecimalNumber()) {
            countRomanNumberX += RomanNumber.I.getDecimalNumber();
            countRomanNumberI = 0;
            System.out.println("I - countRomanNumberX = " + countRomanNumberX);
        }
    }

    private static void checkRomanNumberType(final String romanNumber, final int romanNumberSize, final ArrayList<String> romanNumberSplited) {
        int spplitedIndex = 0;
        for(int index = 0; romanNumberSize > index; index++) {
            final String numberToStore = romanNumber.substring(index, index + 1);
            final boolean isRomanNumber = Arrays.stream(RomanNumber.values()).anyMatch(
                internalRomanNumber -> {
                    try {
                        return internalRomanNumber.toString().equals(numberToStore);
                    } catch (final Exception exception) {
                        return false;
                    }
                }
            );
            if(isRomanNumber) {
                romanNumberSplited.add(numberToStore);
                System.out.println("romanNumberSplited = " + romanNumberSplited.get(spplitedIndex));
                spplitedIndex++;
            }
        }
    }

    private static boolean checkPredecessorNumber(final ArrayList<String> romanNumberSplited, final int index) {
        String romanPredecessor = romanNumberSplited.get(index).toString();
        String romanSuccessor = null;
        if(romanNumberSplited.size() > (index+1)) {
            romanSuccessor = romanNumberSplited.get(index+1).toString();
        }
        final boolean isPredecessor =
                (
                    ( (romanPredecessor == RomanNumber.I.name()) && (romanSuccessor == RomanNumber.V.name()) ) ||
                    ( (romanPredecessor == RomanNumber.X.name()) && (romanSuccessor == RomanNumber.C.name()) ) ||
                    ( (romanPredecessor == RomanNumber.C.name()) && (romanSuccessor == RomanNumber.M.name()) )
                );
        return isPredecessor;
    }


    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }
}
