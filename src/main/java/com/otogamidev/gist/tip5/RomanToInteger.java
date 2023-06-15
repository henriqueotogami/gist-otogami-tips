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
        boolean changeByPredecessor = false;
        int romanIntoDecimal = 0;
        for(int index = 0; romanNumberSize > index; index++) {
            final String romanToParse = romanNumberSplited.get(index);
            changeByPredecessor = checkPredecessor(romanNumberSplited, index);
//            System.out.println("0 - changeByPredecessor = " + changeByPredecessor);
            System.out.println("0 - romanIntoDecimal = " + romanIntoDecimal);
            if(RomanNumber.I.toString().equals(romanToParse)) {
                countRomanNumberI = RomanNumber.I.getDecimalNumber();
                if(changeByPredecessor){
                    final String successor = romanNumberSplited.get(index+1);
                    if(successor.equals(RomanNumber.V.name())){ // 4
                       romanIntoDecimal += (RomanNumber.V.getDecimalNumber() - countRomanNumberI);
                    } else if(successor.equals(RomanNumber.X.name())){ // 9
                        romanIntoDecimal += (RomanNumber.X.getDecimalNumber() - countRomanNumberI);
                    }
                    index += 1;
                } else {
                    romanIntoDecimal += countRomanNumberI;
                }
                System.out.println("I - romanIntoDecimal = " + romanIntoDecimal);
            } else if(RomanNumber.V.toString().equals(romanToParse)) {
                countRomanNumberV = RomanNumber.V.getDecimalNumber();
                if(changeByPredecessor){
                    final String successor = romanNumberSplited.get(index+1);
                    countRomanNumberI = 0;
                    if(successor.equals(RomanNumber.I.name())){ // 6 a 8
                        for(int indexx = 0; 3 > indexx; index++) {
                            countRomanNumberI += (romanNumberSplited.get(index).toString().equals(RomanNumber.I.name()) ? 1 : 0);
                        }
                        romanIntoDecimal += (countRomanNumberV + countRomanNumberI);
                    }
                    index += countRomanNumberI;
                } else {
                    romanIntoDecimal += countRomanNumberV;
                }
                System.out.println("V - romanIntoDecimal = " + romanIntoDecimal);
            } else if(RomanNumber.X.toString().equals(romanToParse)) {
                countRomanNumberX = RomanNumber.X.getDecimalNumber();
                if(changeByPredecessor) {
                    final String successor = romanNumberSplited.get(index+1);
                    if(successor.equals(RomanNumber.L.name())) { // 40
                        romanIntoDecimal += (RomanNumber.L.getDecimalNumber() - countRomanNumberX);
                    } else if(successor.equals(RomanNumber.C.name())){ // 90
                        romanIntoDecimal += (RomanNumber.C.getDecimalNumber() - countRomanNumberX);
                    }
                    index += 1;
                } else {
                    romanIntoDecimal += countRomanNumberX;
                }
                System.out.println("X - romanIntoDecimal = " + romanIntoDecimal);
            } else if(RomanNumber.L.toString().equals(romanToParse)) {
                countRomanNumberL = RomanNumber.L.getDecimalNumber();
                if(changeByPredecessor){
                    final String successor = romanNumberSplited.get(index+1);
                    if(successor.equals(RomanNumber.X.name())){ // 60 a 80
                        countRomanNumberX = 0;
                        for(int indexx = 0; 3 > indexx; index++) {
                            countRomanNumberX += (romanNumberSplited.get(index).toString().equals(RomanNumber.X.name()) ? 10 : 0);
                        }
                        romanIntoDecimal += (countRomanNumberL + countRomanNumberX);
                    }
                    index += countRomanNumberX;
                } else {
                    romanIntoDecimal += countRomanNumberL;
                }
                System.out.println("L - romanIntoDecimal = " + romanIntoDecimal);
            } else if(RomanNumber.C.toString().equals(romanToParse)) {
                countRomanNumberC = RomanNumber.C.getDecimalNumber();
                if(changeByPredecessor) {
                    final String successor = romanNumberSplited.get(index+1);
                    if(successor.equals(RomanNumber.D.name())) { // 400
                        romanIntoDecimal += (RomanNumber.D.getDecimalNumber() - countRomanNumberC);
                    } else if(successor.equals(RomanNumber.M.name())){ // 900
                        romanIntoDecimal += (RomanNumber.M.getDecimalNumber() - countRomanNumberC);
                    }
                    index += 1;
                } else {
                    romanIntoDecimal += countRomanNumberC;
                }
                System.out.println("C - romanIntoDecimal = " + romanIntoDecimal);
            } else  if(RomanNumber.D.toString().equals(romanToParse)) {
                countRomanNumberD = RomanNumber.L.getDecimalNumber();
                if(changeByPredecessor){
                    final String successor = romanNumberSplited.get(index+1);
                    if(successor.equals(RomanNumber.C.name())){ // 600 a 800
                        for(int indexx = 0; 3 > indexx; index++) {
                            countRomanNumberC += (romanNumberSplited.get(index).toString().equals(RomanNumber.C.name()) ? 100 : 0);
                        }
                        romanIntoDecimal += (countRomanNumberD + countRomanNumberC);
                    }
                    index += countRomanNumberD;
                } else {
                    romanIntoDecimal += countRomanNumberD;
                }
                System.out.println("D - romanIntoDecimal = " + romanIntoDecimal);
            } else if(RomanNumber.M.toString().equals(romanToParse)) {
                romanIntoDecimal += RomanNumber.M.getDecimalNumber();
                System.out.println("M - romanIntoDecimal = " + romanIntoDecimal);
            }

        }


        System.out.println("romanIntoDecimal = " + romanIntoDecimal);
        return romanIntoDecimal;
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

    private static boolean checkPredecessor(final ArrayList<String> romanNumberSplit, final int index) {
        String romanPredecessor = romanNumberSplit.get(index).toString();
        String romanSuccessor = null;
        boolean isPredecessor = false;

        if(romanNumberSplit.size() > (index+1)) {
            romanSuccessor = romanNumberSplit.get(index + 1).toString();

            isPredecessor = (
                ((romanPredecessor.equals(RomanNumber.I.name())) && (romanSuccessor.equals(RomanNumber.V.name()))) ||
                ((romanPredecessor.equals(RomanNumber.I.name())) && (romanSuccessor.equals(RomanNumber.X.name()))) ||
                ((romanPredecessor.equals(RomanNumber.X.name())) && (romanSuccessor.equals(RomanNumber.L.name()))) ||
                ((romanPredecessor.equals(RomanNumber.X.name())) && (romanSuccessor.equals(RomanNumber.C.name()))) ||
                ((romanPredecessor.equals(RomanNumber.C.name())) && (romanSuccessor.equals(RomanNumber.D.name()))) ||
                ((romanPredecessor.equals(RomanNumber.C.name())) && (romanSuccessor.equals(RomanNumber.M.name())))
            );
        }
        return isPredecessor;
    }

    private static boolean checkSuccessor(final ArrayList<String> romanNumberSplit, final int index) {
        String romanPredecessor = romanNumberSplit.get(index).toString();
        String romanSuccessor = null;
        if(romanNumberSplit.size() > (index+1)) {
            romanSuccessor = romanNumberSplit.get(index+1).toString();
        }
        final boolean isPredecessor;
        try {
            isPredecessor = (
                ( (romanPredecessor.equals(RomanNumber.V.name())) && (romanSuccessor.equals(RomanNumber.I.name())) ) ||
                ( (romanPredecessor.equals(RomanNumber.X.name())) && (romanSuccessor.equals(RomanNumber.I.name())) ) ||
                ( (romanPredecessor.equals(RomanNumber.L.name())) && (romanSuccessor.equals(RomanNumber.X.name())) ) ||
                ( (romanPredecessor.equals(RomanNumber.C.name())) && (romanSuccessor.equals(RomanNumber.X.name())) ) ||
                ( (romanPredecessor.equals(RomanNumber.D.name())) && (romanSuccessor.equals(RomanNumber.C.name())) ) ||
                ( (romanPredecessor.equals(RomanNumber.M.name())) && (romanSuccessor.equals(RomanNumber.C.name())) )
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return isPredecessor;
    }


    public static void main(String[] args) {
        romanToInt("LVIII");
    }
}
