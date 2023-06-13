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
        boolean changeBySuccessor = false;
        int romanIntoDecimal = 0;
        for(int index = 0; romanNumberSize > index; index++) {
            final String romanToParse = romanNumberSplited.get(index);
            changeByPredecessor = checkPredecessor(romanNumberSplited, index);
            if(changeByPredecessor == false) {
                changeBySuccessor = checkSuccessor(romanNumberSplited, index);
            }
            if(RomanNumber.I.toString().equals(romanToParse)) {
                countRomanNumberI += RomanNumber.I.getDecimalNumber();
                if(changeByPredecessor){
                    final String successor = romanNumberSplited.get(index+1);
                    if(successor.equals(RomanNumber.V.name())){ // 4
                       romanIntoDecimal += (RomanNumber.V.getDecimalNumber() - countRomanNumberI);
                    } else if(successor.equals(RomanNumber.X.name())){ // 9
                        romanIntoDecimal += (RomanNumber.X.getDecimalNumber() - countRomanNumberI);
                    }
                    index += 2;
                } else {
                    romanIntoDecimal += countRomanNumberI;
                }
            } else if(RomanNumber.V.toString().equals(romanToParse)) {
                countRomanNumberV = RomanNumber.V.getDecimalNumber();
                if(changeByPredecessor){
                    final String successor = romanNumberSplited.get(index+1);
                    if(successor.equals(RomanNumber.I.name())){ // 6 a 8
                        for(int indexx = 0; 3 > indexx; index++) {
                            countRomanNumberI += (romanNumberSplited.get(index).toString().equals(RomanNumber.I.name()) ? 1 : 0);
                        }
                        romanIntoDecimal += (RomanNumber.V.getDecimalNumber() + countRomanNumberI);
                    }
                    index += countRomanNumberI;
                } else {
                    romanIntoDecimal += countRomanNumberV;
                }
            } else if(RomanNumber.X.toString().equals(romanToParse)) {
                if(changeByPredecessor) {
                    countRomanNumberV = (RomanNumber.I.getDecimalNumber() - RomanNumber.V.getDecimalNumber());
                    index += 2;
                } else {
                    countRomanNumberX += RomanNumber.X.getDecimalNumber();
                }
            } else if(RomanNumber.L.toString().equals(romanToParse)) {
                countRomanNumberL = RomanNumber.L.getDecimalNumber();
            } else if(RomanNumber.C.toString().equals(romanToParse)) {
                countRomanNumberC += RomanNumber.C.getDecimalNumber();
            } else  if(RomanNumber.D.toString().equals(romanToParse)) {
                countRomanNumberD = RomanNumber.D.getDecimalNumber();
            } else if(RomanNumber.M.toString().equals(romanToParse)) {
                countRomanNumberM += RomanNumber.M.getDecimalNumber();
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
        if(romanNumberSplit.size() > (index+1)) {
            romanSuccessor = romanNumberSplit.get(index+1).toString();
        }
        final boolean isPredecessor;
        try {
            isPredecessor = (
                ( (romanPredecessor.equals(RomanNumber.I.name())) && (romanSuccessor.equals(RomanNumber.V.name())) ) ||
                ( (romanPredecessor.equals(RomanNumber.I.name())) && (romanSuccessor.equals(RomanNumber.X.name())) ) ||
                ( (romanPredecessor.equals(RomanNumber.X.name())) && (romanSuccessor.equals(RomanNumber.L.name())) ) ||
                ( (romanPredecessor.equals(RomanNumber.X.name())) && (romanSuccessor.equals(RomanNumber.C.name())) ) ||
                ( (romanPredecessor.equals(RomanNumber.C.name())) && (romanSuccessor.equals(RomanNumber.D.name())) ) ||
                ( (romanPredecessor.equals(RomanNumber.C.name())) && (romanSuccessor.equals(RomanNumber.M.name())) )
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
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
        romanToInt("IIII");
    }
}
