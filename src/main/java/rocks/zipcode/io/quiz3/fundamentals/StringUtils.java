package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char toCap = (char) str.indexOf(indexToCapitalize);


        String answer = String.valueOf(Character.toUpperCase(indexToCapitalize));
        return answer;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        int inOfChar = baseString.indexOf(characterToCheckFor);
        for(int i = 0; i < baseString.length(); i++){
            if( i == inOfChar);
            return true;
        }
            return false;

    }

    public static String[] getAllSubStrings(String string) {
        List<String> allSubString;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String subs = string.substring(i, j);

                allSubString = Arrays.asList(subs);
                String[] answer = (String[]) allSubString.toArray();
                return answer;
            }
        }
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        int answer = input.length();

        return answer * (answer + 1) / 2 -1;
    }
}
