package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] c = str.toCharArray();
        c[indexToCapitalize] = Character.toUpperCase(c[indexToCapitalize]);
        return new String(c);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(baseString.indexOf(indexOfString) == characterToCheckFor){
            return true;
        }
            return false;

    }

    public static String[] getAllSubStrings(String string) {
        List<String> allSubString = new ArrayList<String>();
        int length = string.length();
        for (int i = 0; i < length; i++) {
            for(int j =1; j <= length - i; j++){
                allSubString.add(string.substring(i, i +j));
            }
        }
        return allSubString.toArray(new String[allSubString.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        int answer = input.length();

        return answer * (answer + 1) / 2 -1;
    }
}
