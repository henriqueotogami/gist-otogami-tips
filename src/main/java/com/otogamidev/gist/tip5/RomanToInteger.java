package tip5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RomanToInteger {

    public static int romanToInt(final String romanNumber) {
        final int romanNumberSize = romanNumber.length();
        final ArrayList<String> romanNumberSplited = new ArrayList<>();
        for(int index = 0; romanNumberSize > index; index++) {
            romanNumberSplited.add(romanNumber.substring(index, index+1));
            System.out.println("romanNumberSplited = " + romanNumberSplited.get(index));
        }
        
        return 0;
    }

    public static void main(String[] args) {
        romanToInt("VTEDOWJODI");
    }
}
