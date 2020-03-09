package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word){
        for (int i = 0; i < word.length(); i++){
         // if(word.charAt(i) == 'a'|| (word.charAt(i) == 'e')|| (word.charAt(i) == 'i') || word.charAt(i) == 'o' || (word.charAt(i) == 'u');


        }
        return true;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return null;
    }

    public static Boolean isVowel(Character character) {
        return character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i' || character == 'I' || character == 'o' || character == 'O' || character == 'u'  || character == 'U';
    }
}
