package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word){
        for(char u : word.toCharArray()){
            if(isVowel(u))
                return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        return character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i' || character == 'I' || character == 'o' || character == 'O' || character == 'u'  || character == 'U';
    }
}
